package dao.login;

import dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class loginSave {
    protected loginSave() {
        try{
        String sql = "select id, isin from member where isin=1";
        Connection conn = MysqlDao.getConnection();
        PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            if (rs.getString("id").equals(User.getId())) {
                User.setId(rs.getString("id"));
                User.setIsin(rs.getBoolean("isin"));
            }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
