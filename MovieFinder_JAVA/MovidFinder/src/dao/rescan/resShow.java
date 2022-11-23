package dao.rescan;

import dto.User;
import dto.movieDTO;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class resShow {
    //todo: 첫번쨰 예약한것은 보이지 않는 문제가 있다.
    public resShow() {
        //예약자의 아이디를 입력받아서,  표시해준다.
        String sql = "select * from reservation where id = ? and reserved = 1";
        try{
        Connection conn = MysqlDao.getConnection();
        PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
        stmt.setString(1, User.getId());
        ResultSet rs = stmt.executeQuery();
        if (movieDTO.getReserved()) {
            System.out.println("예약하신 영화의 시간과 이름은 다음과 같습니다.");
        } else {
            System.out.println("예약된 영화가 없습니다.");
            new serviceMenu();
        }
        while (rs.next()) {
            System.out.println(rs.getString("num") + " " + rs.getString("movie_name") + " " + rs.getString("seatnumber"));
        }
        }
        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
