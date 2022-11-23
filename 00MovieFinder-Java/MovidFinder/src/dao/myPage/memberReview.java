package dao.myPage;

import dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class memberReview {
    protected memberReview(){
        System.out.println("작성자가 만든 리뷰입니다.");
        String sql= "select * from review where id= ?";
        try{
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setString(1, User.getId());
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("num") + "   " + rs.getString("id") + " " + rs.getString("movie_name") + " " + rs.getString("title") + " " + rs.getString("content"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
