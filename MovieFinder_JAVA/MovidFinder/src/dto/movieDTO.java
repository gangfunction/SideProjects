package dto;

public class movieDTO {
    private static int pointer;

    public static String movie_name;
    public static boolean reserved = false;


    private static int useAudience= 30;
    public static int getAudience(){
        return useAudience;
    }

    static int reservation = 0;
    static int audience1 = 30;
    static int audience2 = 30;
    static int audience3 = 30;
    static int audience4 = 30;
    static int audience5 = 30;
    static int audience6 = 30;
    static int audience7 = 30;
    static int audience8 = 30;
    static int audience9 = 30;

    //getter and setter
    public static int getPointer() {
        return pointer;
    }

    public static void setPointer(int num) {
        movieDTO.pointer = num;
    }



    //getter and setter
    public static String getMovieName() {
        return movie_name;
    }

    public static void setMovieName(String movie_name) {
        movieDTO.movie_name = movie_name;
    }

    public static boolean getReserved() {
        return reserved;
    }

    public static void setReserved(boolean reserved) {
        movieDTO.reserved = reserved;
    }


    public static int getReservation() {
        return reservation;
    }

    public static void setReservation() {
        reservation ++;
    }

    public static void canAudience() {
        useAudience ++;
    }

    public static void setAudience() { useAudience --;}

    public static void setForAudience(int audience) {
        useAudience = audience;
    }
    //getter and setter
    public static int getAudience1() {
        return audience1;
    }
    public static void setAudience1(int audience) {
        movieDTO.audience1 = audience;
    }
    public static int getAudience2() {
        return audience2;
    }
    public static void setAudience2(int audience) {
        movieDTO.audience2 = audience;
    }
    public static int getAudience3() {
        return audience3;
    }
    public static void setAudience3(int audience) {
        movieDTO.audience3 = audience;
    }
    public static int getAudience4() {
        return audience4;
    }
    public static void setAudience4(int audience) {
        movieDTO.audience4 = audience;
    }
    public static int getAudience5() {
        return audience5;
    }
    public static void setAudience5(int audience) {
        movieDTO.audience5 = audience;
    }
    public static int getAudience6() {
        return audience6;
    }
    public static void setAudience6(int audience) {
        movieDTO.audience6 = audience;
    }
    public static int getAudience7() {
        return audience7;
    }
    public static void setAudience7(int audience) {
        movieDTO.audience7 = audience;
    }
    public static int getAudience8() {
        return audience8;
    }
    public static void setAudience8(int audience) {
        movieDTO.audience8 = audience;
    }
    public static int getAudience9() {
        return audience9;
    }
    public static void setAudience9(int audience) {
        movieDTO.audience9 = audience;
    }


}

