package dto;

public class User {
    public static String id;
    public static String pwd;
    private static boolean isin;
    private  static boolean admin;

    //getter and setter
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        User.id = id;
    }

    public static String getPwd() {
        return pwd;
    }

    public static void setPwd(String pwd) {
        User.pwd = pwd;
    }

    public static boolean getIsin() {
        return isin;
    }
    public static void setIsin(boolean isin) {
        User.isin = isin;
    }

    public static boolean getAdmin() {
        return admin;
    }
    public static void setAdmin(boolean b) {
        User.admin=b;
    }

}
