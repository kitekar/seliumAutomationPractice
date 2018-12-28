package com.QA.Gibsons_Connect.DataBaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.QA.Gibsons_Connect.Config.Constant;



public class Data_Base_connection implements Constant
{

private static  String dbusername = Constant.dbusername;
private static	String dbpassword = Constant.dbpassword;
private static	String databaseURLQA = Constant.databaseURLQA;
private static	String databaseURLSTAGE = Constant.databaseURLSTAGE;
private static  String databaseURLPRODUCTION= Constant.databaseURLPRODUCTION;


    public static String executeSQLQuery(String testEnv, String sqlQuery)
    {
        String connectionUrl="";
        Connection connection;
        String resultValue = "";
        ResultSet rs;


        if(testEnv.equalsIgnoreCase("QA"))
        {
            connectionUrl =Constant.databaseURLQA;
            dbusername = Constant.dbusername;
            dbpassword = Constant.dbpassword;
        }
      
        else if(testEnv.equalsIgnoreCase("STAGE")) 
        {
            connectionUrl = databaseURLSTAGE;
            dbusername =Constant.dbusername;
            dbpassword = Constant.dbusername;
        }

     
        else if(testEnv.equalsIgnoreCase("PRODUCTION")) 
        {
            connectionUrl = databaseURLPRODUCTION;
            dbusername = Constant.dbusername;
            dbpassword = Constant.dbusername;
        }
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch(ClassNotFoundException e) 
        {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
            if(connection!=null)
            {
                System.out.println("Connected to the database...");
            }else 
            {
                System.out.println("Database connection failed to "+testEnv+" Environment");
            }
            
            Statement stmt = connection.createStatement();
            rs=stmt.executeQuery(sqlQuery);

            try {
                while(rs.next()){
                    resultValue = rs.getString(1).toString();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException err)
            {
                System.out.println("No Records obtained for this specific query");
                err.printStackTrace();
            }
            connection.close();

        }catch(SQLException sqlEx)
        {
            System.out.println( "postgre Exception:" +sqlEx.getStackTrace());
        }
        return resultValue;
    }


    public static ArrayList<String> executeSQLQuery_List(String testEnv, String sqlQuery)
    {
        String connectionUrl = Constant.databaseURLQA;
        Connection connection;
        ArrayList<String> resultValue = new ArrayList<String>();
        ResultSet resultSet;

       
        if(testEnv.equalsIgnoreCase("QA"))
        {
            connectionUrl =databaseURLQA;
            dbusername = Constant.dbusername;
            dbpassword = Constant.dbpassword;
        }

 
        else if(testEnv.equalsIgnoreCase("STAGE")) 
        {
            connectionUrl = databaseURLSTAGE;
            dbusername =Constant.dbusername;
            dbpassword = Constant.dbusername;
        }

        else if(testEnv.equalsIgnoreCase("PRODUCTION"))
        {
            connectionUrl = databaseURLPRODUCTION;
            dbusername = Constant.dbusername;
            dbpassword =Constant.dbusername;
        }

        try {
            Class.forName("org.postgresql.Driver");
        }
        catch(ClassNotFoundException e) 
        {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
            if(connection!=null)
            {
                System.out.println("Connected to the database");
            }else {
                System.out.println("Failed to connect to "+testEnv+" database");
            }
            Statement statement = connection.createStatement();
            resultSet=statement.executeQuery(sqlQuery);

            try {
                while(resultSet.next())
                
                {
                    int columnCount = resultSet.getMetaData().getColumnCount();
                    StringBuilder stringBuilder = new StringBuilder();
                    for(int iCounter=1;iCounter<=columnCount; iCounter++){
                        stringBuilder.append(resultSet.getString(iCounter).trim()+" ");
                    }
                    String reqValue = stringBuilder.substring(0, stringBuilder.length()-1);
                    resultValue.add(reqValue);
                }
            } 
            catch (SQLException e)
            
            {
                e.printStackTrace();
            }
            catch (NullPointerException ex)
            {
                System.out.println("No Records found for this specific query" +ex.getStackTrace());
            }
            finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        System.out.println("Postgre Exception:" +ex.getStackTrace());
                    }
                }
            }

        }catch(SQLException sqlEx) {
            System.out.println( "Postgre Exception:" +sqlEx.getStackTrace());
        }
        return resultValue;
    }
}

