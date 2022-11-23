package dao.movie;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class movieResetLogin {
    protected movieResetLogin() {
        try{
        String sql = "update member set isin = 0";
        PreparedStatement stmt = Objects.requireNonNull(MysqlDao.getConnection()).prepareStatement(sql);
        stmt.executeUpdate();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
