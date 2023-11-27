package cl.duoc.hoytsmarkplanetapp.DAO;

/**
 *
 * @author Joseles Student
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionDB {
Connection connection;

    public ConexionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/moviesDB",
                    "root",
                    ""
            );

            System.out.println("Conectado con éxito!!");
        } catch (Exception ex) {
            System.out.println("Error en la base de datos: " + ex.getMessage());
        }
    }

    
    
    public void ejecutarUpdate(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

public Connection getConnection() {
    return connection;
}

public ResultSet EjecutarQuery(String sql) throws SQLException {
    Statement statement = connection.createStatement();
    return statement.executeQuery(sql);
    
    }


public int EjecutarUpdate(String sql) throws SQLException {
    Statement statement = connection.createStatement();
    return statement.executeUpdate(sql);
}

}

 
