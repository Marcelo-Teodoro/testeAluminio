package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Connection conn = null;

        String STR_DRIVER = "org.gjt.mm.mysql.Driver";
//        String STR_CONEX = "jdbc:mysql://localhost:3306/calendariodb";
//        String USER = "root";
//        String PASSWORD = "root";

        String STR_CONEX = "jdbc:mysql://databases-auth.000webhost.com/db_structure.php?server=1&db=id2890822_testealuminio&token=4e1239693c0820065ce9856179fdc96c";
        String USER = "id2890822_marcelo_adonis";
        String PASSWORD = "teste";


        Class.forName(STR_DRIVER);
        conn = DriverManager.getConnection(STR_CONEX, USER, PASSWORD);


        return conn;
    }
}