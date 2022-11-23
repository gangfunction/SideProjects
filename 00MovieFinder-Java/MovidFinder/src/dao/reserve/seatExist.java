package dao.reserve;

import dto.movieDTO;
import dto.seatDto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class seatExist {
    protected seatExist() {
        System.out.println("이미 예약이 되었는지 확인합니다.");
        String sql = "select * from reservation where seatnumber=? and pointer=?";
        try{
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setString(1, seatDto.getResult());
            stmt.setInt(2, movieDTO.getPointer());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                System.out.println("이미 예약이 되었습니다.");
                System.out.println("메뉴로 돌아갑니다.");
                new serviceMenu();
            }else{
                System.out.println("예약이 가능합니다.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
