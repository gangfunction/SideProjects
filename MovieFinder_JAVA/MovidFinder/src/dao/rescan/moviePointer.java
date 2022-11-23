package dao.rescan;

import dao.reserve.seatFactory;
import dto.movieDTO;



public class moviePointer {
    public moviePointer(){
        switch(movieDTO.getPointer()){
            case 1 -> {
                new seatReplaceCheck(seatFactory.getMovie1());
                System.out.println("상영관 1 선택 완료");
            }
            case 2 -> new seatReplaceCheck(seatFactory.getMovie2());
            case 3 -> new seatReplaceCheck(seatFactory.getMovie3());
            case 4 -> new seatReplaceCheck(seatFactory.getMovie4());
            case 5 -> new seatReplaceCheck(seatFactory.getMovie5());
            case 6 -> new seatReplaceCheck(seatFactory.getMovie6());
            case 7 -> new seatReplaceCheck(seatFactory.getMovie7());
            case 8 -> new seatReplaceCheck(seatFactory.getMovie8());
            case 9 -> new seatReplaceCheck(seatFactory.getMovie9());
            default -> System.out.println("잘못 입력하셨습니다.getmovie");
        }
    }
}
