package Controller.Database;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connexion {

//    private static String url = "jdbc:mysql://localhost:3306/chatsystem";
//    private static String username = "root";
//    private static String pwd = "";


    public static Connection getConnection()  throws Exception{

        Connection cnx = null;

        try {
            //cnx = DriverManager.getConnection(url, username, pwd);
            Class.forName("org.sqlite.JDBC");
            cnx = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return cnx;
    }

}