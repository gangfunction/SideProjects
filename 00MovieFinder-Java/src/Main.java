import dao.movie.initialProcess;
import service.serviceMenu;

import java.sql.SQLException;
public class Main{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //싱글턴으로 이니셜 프로세스 처리
        initialProcess init = initialProcess.getInstance();
        System.out.println(init);

        System.out.println("어서오세요");
        new serviceMenu();
    }

}


