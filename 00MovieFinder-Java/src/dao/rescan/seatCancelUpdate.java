package dao.rescan;

import dao.MysqlDao;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class seatCancelUpdate {
    //예약을 취소했을때 예약을 취소할떄 사용했던 좌석번호를 사용하여 취소했다는것을 업데이트해준다.
    public seatCancelUpdate() {
        String sql = "update reservation set reserved = ? where seatnumber=?";
        try{
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setInt(1, 0);
            stmt.setString(2, seatDto.getResult());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
