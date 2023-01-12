package service;

import dao.MysqlDao;

import java.sql.*;
import java.util.Objects;

public class movieDeleteList{
    public movieDeleteList() throws SQLException {
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
            throw e;
        }
    }
}
