package dao.reviewPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class reviewShow {
    protected reviewShow() throws SQLException, ClassNotFoundException {
        System.out.println("영화리뷰 출력");
        Connection conn = MysqlDao.getConnection();
        String sql = "select * from review";
        PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("num") + "   " + rs.getString("id") + " " + rs.getString("movie_name") + " " + rs.getString("title") + " " + rs.getString("content"));
        }
    }
}
