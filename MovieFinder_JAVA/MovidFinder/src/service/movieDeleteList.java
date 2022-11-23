package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class movieDeleteList{
    public movieDeleteList() {
        try {
            PreparedStatement stmt;
            Connection conn = MysqlDao.getConnection();
            String sql = "truncate movie";
            stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.executeUpdate();
            String sql2 = "select * from movie";
            ResultSet rs = stmt.executeQuery(sql2);
            if (!rs.next()) {
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
