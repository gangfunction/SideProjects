import dao.movie.Setting;
import service.serviceMenu;

import java.sql.SQLException;
public class Main{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //싱글턴으로 초기 프로세스 처리
        Setting init = Setting.getInstance();

        new serviceMenu();
    }

}


