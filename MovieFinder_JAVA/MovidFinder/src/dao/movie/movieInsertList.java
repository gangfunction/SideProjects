package dao.movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class movieInsertList {
    public movieInsertList() {
        try {
            String sql = "insert into movie(movie_name, ranks) select movie_name, ranks FROM box_office order by rand()LIMIT 9";
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
