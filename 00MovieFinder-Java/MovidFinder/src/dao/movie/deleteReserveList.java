package dao.movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class deleteReserveList{
    public deleteReserveList() {
        try {
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt;
            String sql = "truncate reservation";
            stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.execute(sql);
            String sql2 = "select * from reservation";
            ResultSet rs = stmt.executeQuery(sql2);
            rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
