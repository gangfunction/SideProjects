package dao.login;

import dto.User;

import java.sql.SQLException;

public class accessProcess {
    public accessProcess() throws SQLException, ClassNotFoundException {
        if (User.getIsin()) {
            new logoutProcess();
        } else {
            new loginProcess();
        }

    }
}
