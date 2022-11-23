package dao.register;

import service.serviceMenu;

import java.sql.SQLException;

public class regProcess {
    public regProcess() throws SQLException, ClassNotFoundException {
        new memberInput();
        new adminCode();
        new memberRegister();
        System.out.println("회원가입이 완료되었습니다.");
        new serviceMenu();
    }
}

