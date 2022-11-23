package dao.reserve;

import dto.seatDto;

import java.util.Scanner;

public class seatSelectPosition {
    seatSelectPosition() {
        System.out.println("열을 선택하세요");
        new seatShowing();
        System.out.println("1. A열 2. B열 3. C열 4. D열 5. E열");
        Scanner sc = new Scanner(System.in);
        String columnSelect = sc.next();
        switch (columnSelect) {
            case "1" -> seatDto.setColumn("A");
            case "2" -> seatDto.setColumn("B");
            case "3" -> seatDto.setColumn("C");
            case "4" -> seatDto.setColumn("D");
            case "5" -> seatDto.setColumn("E");
            default -> {
                System.out.println("잘못 입력하셨습니다.");
                new seatSelectPosition();
            }
        }
        System.out.println("순서를 선택하세요");
        System.out.println("1. 첫번째 2. 두번째 3. 셋번째 4. 네번째 5. 다섯번째 6.여섯번째");
        //switch 문으로 순서를 선택할수 있는 메소드를 만들어야한다.
        sc = new Scanner(System.in);
        String rowSelect = sc.next();
        seatDto.setRow(rowSelect);
        seatDto.setResultsum(seatDto.getColumn(), seatDto.getRow());

    }
}
