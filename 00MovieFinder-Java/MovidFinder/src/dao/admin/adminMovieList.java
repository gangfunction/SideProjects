package dao.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;


public class adminMovieList {
    protected adminMovieList(){
        try{
            Connection conn= MysqlDao.getConnection();
            String sql = "select * from box_office";
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println("----------------------------------------------------");
                System.out.println("영화이름: " + rs.getString("movie_name") + "\n" + "년도: " + rs.getString("years") + "\n" + "순위: " + rs.getString("ranks") + "\n" + "장르: " + rs.getString("genre") + "\n" + "감독: " + rs.getString("director") + "\n");
                System.out.println("----------------------------------------------------");
            }
            new adminMenu();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
