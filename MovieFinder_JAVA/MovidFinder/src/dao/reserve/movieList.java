package dao.reserve;

import dto.movieDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class movieList {
    movieList() {
        try {
            String sql2 = "select movie_name, audience from movie";
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql2);
            ResultSet rs = stmt.executeQuery();
            int i = 1;
            while (rs.next()) {
                String movie_name = rs.getString("movie_name");
                String audience = rs.getString("audience");
                System.out.println(i++ + "번째 영화" + "  " + "현재남은 좌석수:" + audience + "명   " + "영화이름:" + movie_name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("보실 영화의 번호를 입력하세요");
        int movie_id = sc.nextInt();
        movieDTO.setPointer(movie_id);

    }
}
