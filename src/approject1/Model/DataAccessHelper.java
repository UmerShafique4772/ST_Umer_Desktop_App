/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Farwa Malik
 */
public class DataAccessHelper {
        public static ResultSet executeQuery(String sql) throws SQLException
	{
		Connection conn = getConnection();
		ResultSet rs = null;
		
		try
		{
			Statement stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(sql);
		}
		catch (SQLException sqlEx)
		{
			throw sqlEx;
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			try {
//				conn.close();
			}
			catch(Exception ex)
			{
				
			}
		}
		
		return rs;		
	}

        public static ResultSet executeQuery(String sql,ArrayList<Object> params,ArrayList<String> paramTypes) throws SQLException
	{
		Connection conn = getConnection();
		ResultSet rs = null;

		try
		{
			PreparedStatement stmt = conn.prepareStatement(sql);
                        setParameters(stmt, params, paramTypes);
			rs = stmt.executeQuery();
		}
		catch (SQLException sqlEx)
		{
			throw sqlEx;
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			try {
//				conn.close();
			}
			catch(Exception ex)
			{

			}
		}

		return rs;
	}
	
	/*
	 * Method to execute DML statements
	 */
	public static int execute(String sql,ArrayList<Object> params,ArrayList<String> paramTypes)
	{
		Connection conn = getConnection();
		int recordsAffected = 0;
		
		try
		{
			PreparedStatement stmt = conn.prepareStatement(sql);                        
                        //setParameters(stmt, params, paramTypes);
			for(int i =0;i < paramTypes.size();i++){
                            if(paramTypes.get(i).equals("int")){
                                stmt.setInt(i+1, (int) params.get(i));
                            }
                            else if(paramTypes.get(i).equals("Date")){
                                stmt.setDate(i+1,(Date)  params.get(i));
                            }
                            else if(paramTypes.get(i).equals("String")){
                                stmt.setString(i+1, (String) params.get(i));
                            }       
                            else if(paramTypes.get(i).equals("Time")){
                                stmt.setTime(i+1, (Time) params.get(i));
                            }                          
                          
                        }
            
                        recordsAffected = stmt.executeUpdate();
                        System.out.println(recordsAffected);
                        
                }
		catch (SQLException sqlEx)
		{
			System.out.println(sqlEx.toString());
		}
		finally
		{
			try {
				conn.close();
			}
			catch(Exception ex)
			{
                            recordsAffected = -1;
			}
		}
		
		return recordsAffected;
	}
        
        private static void setParameters(PreparedStatement stmt, ArrayList<Object> params,ArrayList<String> paramTypes)
            throws SQLException
        {
            for(int i=0; i < params.size(); i++){
                if(paramTypes.get(i).equals("String")){
                    stmt.setString(i+1, (String) params.get(i));
                }
                else if (paramTypes.get(i).equals("Integer")) {
                    stmt.setInt(i+1, (Integer) params.get(i));
                }
                else if (paramTypes.get(i).equals("Double")){
                    stmt.setDouble(i+1, (Double) params.get(i));
                }
                else if (paramTypes.get(i).equals("Boolean")){
                    stmt.setBoolean(i+1, (Boolean) params.get(i));
                }
            }
        }
	

	/*
	 * Method to establish connection with the database
	 */
	private static Connection getConnection()
	{
		Connection conn = null;
		
                try{
                    String s = "jdbc:derby://localhost:1527/DonationMangementSystem";
                    conn = DriverManager.getConnection(s,"user12","abcde");
                }
                catch(Exception e){
//                    System.out.println(e);
                }
		
		return conn;
	}

}
