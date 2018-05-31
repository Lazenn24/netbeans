/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctest;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author horabaixa2
 */
public class JDBCTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Connection conn = null;
        final String url = "jdbc:mysql://localhost:3306/";
        final String schema = "world";
        final String user = "alumne";
        final String password = "12345678";

        try {
            conn = (Connection) DriverManager.getConnection(url + schema, user, password);

            if (!conn.isClosed()) {
                System.out.println("Conexión establecida.");
            } else {
                System.out.println("Conexión no establecida");
            }

            PreparedStatement queryStatement = null;

            String query = "select * from country;";

            queryStatement = (PreparedStatement) conn.prepareStatement(query);

            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBCTest.class.getName()).log(Level.SEVERE, null, ex);

        } finally {

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {

            }
        }
    }

}
