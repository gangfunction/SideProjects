package dao.rescan;

import dao.reserve.Chair;
import dto.seatDto;

public class seatReplaceCheck {
    protected seatReplaceCheck(Chair movie1) {
        String[] tmpArray= seatDto.getResult().split("");
        String tmpColumn = tmpArray[0];
        int tmpRow = Integer.parseInt(tmpArray[1])-1;
        //변경전
        switch (tmpColumn) {
            case "A" -> movie1.setArr(tmpRow, seatDto.getResult());
            case "B" -> movie1.setBrr(tmpRow, seatDto.getResult());
            case "C" -> movie1.setCrr(tmpRow, seatDto.getResult());
            case "D" -> movie1.setDrr(tmpRow, seatDto.getResult());
            case "E" -> movie1.setErr(tmpRow, seatDto.getResult());
            default -> System.out.println("잘못 입력하셨습니다.");

        }
        //변경 후
        System.out.println("취소가 완료되었습니다.");
        movie1.showing();
    }
}
