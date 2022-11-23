package dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import static dto.User.id;

public class logoutUpdate {
    protected logoutUpdate() {
        try{
        String sql= "update member set isin=? where id=?";
        Connection conn = MysqlDao.getConnection();
        PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
        stmt.setBoolean(1, false);
        stmt.setString(2, id);
        stmt.executeUpdate();}
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("로그아웃 완료");
    }
}
