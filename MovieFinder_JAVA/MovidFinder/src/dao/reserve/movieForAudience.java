package dao.reserve;

import dto.movieDTO;

public class movieForAudience {
    public movieForAudience() {
        switch (movieDTO.getPointer()) {
            case 1 -> movieDTO.setAudience1(movieDTO.getAudience());
            case 2 -> movieDTO.setAudience2(movieDTO.getAudience());
            case 3 -> movieDTO.setAudience3(movieDTO.getAudience());
            case 4 -> movieDTO.setAudience4(movieDTO.getAudience());
            case 5 -> movieDTO.setAudience5(movieDTO.getAudience());
            case 6 -> movieDTO.setAudience6(movieDTO.getAudience());
            case 7 -> movieDTO.setAudience7(movieDTO.getAudience());
            case 8 -> movieDTO.setAudience8(movieDTO.getAudience());
            case 9 -> movieDTO.setAudience9(movieDTO.getAudience());
            default -> System.out.println("잘못된 입력");
        }
    }
}
