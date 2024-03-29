package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDao {
    public MysqlDao(){

    };
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/finalwork", "root", "12341234");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn == null) {
                try {
                    conn.close();
                    System.out.println("closed");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("closed");
            }
        }
        return conn;
    }
}
