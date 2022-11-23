package dao.member;

import dto.movieDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class memberWatchedSelect {
    public memberWatchedSelect() {
        System.out.println("표시된 순서중 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        movieDTO.setPointer(sc.nextInt());
        String sql = "select * from reservation where num = ?";
        try {
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setInt(1, movieDTO.getPointer());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("movie_name"));
                movieDTO.setMovieName(rs.getString("movie_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
