package dao.reserve;

import dto.movieDTO;

public class audienceForMovie {
    public audienceForMovie() {
        switch (movieDTO.getPointer()) {
            case 1 -> movieDTO.setForAudience(movieDTO.getAudience1());
            case 2 -> movieDTO.setForAudience(movieDTO.getAudience2());
            case 3 -> movieDTO.setForAudience(movieDTO.getAudience3());
            case 4 -> movieDTO.setForAudience(movieDTO.getAudience4());
            case 5 -> movieDTO.setForAudience(movieDTO.getAudience5());
            case 6 -> movieDTO.setForAudience(movieDTO.getAudience6());
            case 7 -> movieDTO.setForAudience(movieDTO.getAudience7());
            case 8 -> movieDTO.setForAudience(movieDTO.getAudience8());
            case 9 -> movieDTO.setForAudience(movieDTO.getAudience9());
            default -> System.out.println("잘못된 입력");
        }
    }
}
