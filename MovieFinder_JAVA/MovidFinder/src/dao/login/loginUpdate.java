package dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import static dto.User.id;

public class loginUpdate{
    protected loginUpdate() throws SQLException {
        String sql = "update member set isin=? where id=?";
        Connection conn = MysqlDao.getConnection();
        PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
        stmt.setBoolean(1, true);
        stmt.setString(2, id);
        stmt.executeUpdate();
    }


}
