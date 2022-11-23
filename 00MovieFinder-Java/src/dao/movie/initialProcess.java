package dao.movie;

import service.movieDeleteList;

public class initialProcess {
    static initialProcess instance;
    private initialProcess() {}
    public static initialProcess getInstance() {
        if (instance == null) {
            instance = new initialProcess();
        }
        return instance;
    }
    static{
        new movieDeleteList();
        new deleteReserveList();
        new movieResetLogin();
        new movieInsertList();
    }
}
