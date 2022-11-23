package dao.reserve;

import dto.User;
import service.*;

import java.sql.SQLException;


public class resProcess {
    public resProcess() {
        if (User.getIsin()) {
            try {
                new movieList();
                new seatSelectPosition();
                new seatExist();
                new seatResult();
                new movieReserve();
                new seatReserve();
                seatFactory.seatAction();
                System.out.println("좌석 예약되었습니다.");
                new serviceMenu();
            } catch (SQLException e) {
                System.out.println("예매에 실패하였습니다.");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

