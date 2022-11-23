package dao.reserve;

import dto.seatDto;

import java.util.Arrays;


/**
 * 클래스의 형태를 제작하고나서 인스턴스를 생성하면서 생성한 인스턴스의 형태를 각자 구별해서 사용하고싶지만
 * 사용할수 없는 문제가 발생함.
 *
 */
public class seatEdit{

    seatEdit(Chair movie) {
        switch (seatDto.getColumn()) {
            case "A" -> {
                int tmp = Arrays.asList(movie.getArr()).indexOf(seatDto.getResult());
                movie.setArr(tmp, "NO");
            }
            case "B" -> {
                int tmp = Arrays.asList(movie.getBrr()).indexOf(seatDto.getResult());
                movie.setBrr(tmp, "NO");
            }
            case "C" -> {
                int tmp = Arrays.asList(movie.getCrr()).indexOf(seatDto.getResult());
                movie.setCrr(tmp, "NO");
            }
            case "D" -> {
                int tmp = Arrays.asList(movie.getDrr()).indexOf(seatDto.getResult());
                movie.setDrr(tmp, "NO");
            }
            case "E" -> {
                int tmp = Arrays.asList(movie.getErr()).indexOf(seatDto.getResult());
                movie.setErr(tmp, "NO");
            }
            default -> {
                System.out.println("잘못 입력하셨습니다.");
                new seatSelectPosition();
            }
        }
    }

}
