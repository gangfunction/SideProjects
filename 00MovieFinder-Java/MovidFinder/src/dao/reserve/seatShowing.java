package dao.reserve;

import dto.movieDTO;

import static dao.reserve.seatFactory.*;

public class seatShowing  {
    public seatShowing() {
        System.out.println("현재 좌석의 상태입니다.");
        switch(movieDTO.getPointer()){
            case 1 -> movie1.showing();
            case 2 -> movie2.showing();
            case 3 -> movie3.showing();
            case 4 -> movie4.showing();
            case 5 -> movie5.showing();
            case 6 -> movie6.showing();
            case 7 -> movie7.showing();
            case 8 -> movie8.showing();
            case 9 -> movie9.showing();
            default -> System.out.println("잘못된 입력");
        }
    }

}
