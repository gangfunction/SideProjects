package dao.movie;

import service.movieDeleteList;

import java.sql.SQLException;

public class Setting {

    private Setting() {
    }

    private static class initialProcessHolder {
        private static final Setting INSTANCE = new Setting();
    }

    /*
          private static final Setting instance = new Setting(); eager initialization
          public static synchronized Setting getINSTANCE() {
              if (INSTANCE == null) {
                  INSTANCE = new Setting();
              }
              return INSTANCE;
          }
      @return
     */
    /**
     * double-checked locking strategy
     * private static volatile Setting instance;
     * public static Setting getInstance() {
     * if(instance == null) {
     * synchronized (Setting.class){
     * if(instance == null) {
     * instance = new Setting();
     * }
     * }
     * }
     * return instance;
     * }
     *
     * @return
     */

    public static Setting getInstance() {
        return initialProcessHolder.INSTANCE;
    }

    static {
        try {
            new movieDeleteList();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        new deleteReserveList();
        new movieResetLogin();
        new movieInsertList();
    }
}
