package dao.movie;

import service.movieDeleteList;

public class initialProcess {
    private static volatile initialProcess instance;
    // private static final initialProcess instance = new initialProcess(); eager initialization
    private initialProcess() {}

    /**
     *     public static synchronized initialProcess getINSTANCE() {
     *         if (INSTANCE == null) {
     *             INSTANCE = new initialProcess();
     *         }
     *         return INSTANCE;
     *     }
     * @return
     */

    //double checked locking strategy
    public static initialProcess getInstance() {
        if(instance == null) {
            synchronized (initialProcess.class){
                if(instance == null) {
                    instance = new initialProcess();
                }
            }
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
