package dao.reserve;

import dto.User;
import dto.movieDTO;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class seatReserve {
    protected seatReserve() {
        try {
            Connection conn = MysqlDao.getConnection();
            String sql = "update reservation set reserved=? ,seatnumber=?, id=?, pointer=? where num =? ";
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setBoolean(1, true);
            stmt.setString(2, seatDto.getResult());
            stmt.setString(3, User.getId());
            stmt.setInt(4, movieDTO.getPointer());
            stmt.setInt(5, movieDTO.getReservation());
            stmt.executeUpdate();
            movieDTO.setReserved(true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
