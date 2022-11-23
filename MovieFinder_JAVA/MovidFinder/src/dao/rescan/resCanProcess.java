package dao.rescan;

import dto.User;
import service.serviceMenu;

import java.sql.SQLException;


public class resCanProcess {
    public resCanProcess() throws SQLException, ClassNotFoundException {
        if(User.getIsin()){
            new resShow();
            new resCanSeat();
            new seatCancelUpdate();
            new moviePointer();
            new serviceMenu();
        }
    }
}
