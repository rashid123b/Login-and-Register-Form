/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log.in;

import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ra$h
 */
public class sql_connector {
    
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "user_db";
    private static Integer portNumber = 3306;
    private static String password = "";




    
    public static Connection getSqlConnection()
    {
    
        Connection connect = null;
        
        MysqlDataSource  sqlDataSource = new MysqlDataSource ();
        
        sqlDataSource.setServerName(serverName);
        sqlDataSource.setUser(userName);
        sqlDataSource.setDatabaseName(dbName);
        sqlDataSource.setPortNumber(portNumber);
        sqlDataSource.setPassword(password);
        
        
        
        try {
         connect = sqlDataSource.getConnection();
                 System.out.print("Hello World !");

        }
        
        catch (SQLException ex) {
            
         Logger.getLogger(" Geting Connection -> " + sql_connector.class.getName()).log(Level.SEVERE, null, ex);
                   System.out.print("Can`t connect to database");

        }

        
        
        
        
        
        
        return connect;
    }
    
    
}
