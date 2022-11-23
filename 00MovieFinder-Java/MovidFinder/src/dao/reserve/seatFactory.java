package dao.reserve;

import dto.movieDTO;

public class seatFactory {
    static final String[] seat = {"1관", "2관", "3관", "4관", "5관", "6관", "7관", "8관", "9관"};
    static  Chair movie1= new Chair();
    static Chair movie2= new Chair();
    static Chair movie3= new Chair();
    static Chair movie4= new Chair();
    static Chair movie5= new Chair();
    static Chair movie6= new Chair();
    static Chair movie7= new Chair();
    static Chair movie8= new Chair();
    static Chair movie9= new Chair();
    public static void seatAction() {
        switch (movieDTO.getPointer()) {
            case 1 -> {
                if (movie1 == null) {
                    movie1 = new Chair();
                }
                System.out.println(seat[0]);
                new seatEdit(movie1);

            }
            case 2 -> {
                if (movie2 == null) {
                    movie2 = new Chair();
                }
                System.out.println(seat[1]);
                new seatEdit(movie2);

            }
            case 3 -> {
                if (movie3 == null) {
                    movie3 = new Chair();
                }
                System.out.println(seat[2]);
                new seatEdit(movie3);

            }
            case 4 -> {
                if (movie4 == null) {
                    movie4 = new Chair();
                }
                System.out.println(seat[3]);
                new seatEdit(movie4);

            }
            case 5 -> {
                if (movie5 == null) {
                    movie5 = new Chair();
                }
                System.out.println(seat[4]);
                new seatEdit(movie5);

            }
            case 6 -> {
                if (movie6 == null) {
                    movie6 = new Chair();
                }
                System.out.println(seat[5]);
                new seatEdit(movie6);

            }
            case 7 -> {
                if (movie7 == null) {
                    movie7 = new Chair();
                }
                System.out.println(seat[6]);
                new seatEdit(movie7);

            }
            case 8 -> {
                if (movie8 == null) {
                    movie8 = new Chair();
                }
                System.out.println(seat[7]);
                new seatEdit(movie8);

            }
            case 9 -> {
                if (movie9 == null) {
                    movie9 = new Chair();
                }
                System.out.println(seat[8]);
                new seatEdit(movie9);

            }
            default -> System.out.println("예약할 좌석이 없습니다.");
        }
        new seatShowing();
    }
    //getter and setter
    public static Chair getMovie1() {
        return movie1;
    }
    public static Chair getMovie2() {
        return movie2;
    }
    public static Chair getMovie3() {
        return movie3;
    }
    public static Chair getMovie4() {
        return movie4;
    }
    public static Chair getMovie5() {
        return movie5;
    }
    public static Chair getMovie6() {
        return movie6;
    }
    public static Chair getMovie7() {
        return movie7;
    }
    public static Chair getMovie8() {
        return movie8;
    }
    public static Chair getMovie9() {
        return movie9;
    }
}
