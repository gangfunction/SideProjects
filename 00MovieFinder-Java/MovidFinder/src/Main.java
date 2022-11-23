import dao.movie.initialProcess;
import service.serviceMenu;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 어서오세요 메세지 출력
        ConnectionMaker connectionMaker =new DConnectionMaker();
        UserDao dao = new UserDao(new DConnectionMaker());

        new initialProcess();

        System.out.println("어서오세요");
        new serviceMenu();
    }

}


