package dao.member;

import dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class memberWatched {
    public memberWatched() {
        System.out.println("회원님이 시청하셨던 영화는 다음과 같습니다.");
        Connection conn = MysqlDao.getConnection();
        String sql = "select * from reservation where id = ?";
        PreparedStatement stmt;
        try {
            stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setString(1, User.getId());
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                System.out.println("시청하신 영화가 없으시군요? 프로그램을 종료하겠습니다.");
                System.exit(0);
            }
            rs=stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("num") + " 번째 예약하셨던 " + rs.getString("movie_name") + " 영화입니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
