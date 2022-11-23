package dao.movie;

import service.movieDeleteList;

public class initialProcess {
    public initialProcess() {

    }
    static{
        new movieDeleteList();
        new deleteReserveList();
        new movieResetLogin();
        new movieInsertList();
    }
}
