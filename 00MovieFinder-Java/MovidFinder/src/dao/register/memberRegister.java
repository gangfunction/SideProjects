package dao.register;


import dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class memberRegister {
    public memberRegister() {
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,true,?)";
        try {
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setString(1, User.getId());
            stmt.setString(2, User.getPwd());
            stmt.setBoolean(3, User.getAdmin());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
