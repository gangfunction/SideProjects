package dto;

public class seatDto {

    private static String Row="";
    static String Column="" ;
    static String Result="";




    public static String getRow() {
        return Row;
    }

    public static void setRow(String row) {
        seatDto.Row = row;
    }

    public static String getColumn() {
        return Column;
    }

    public static void setColumn(String column) {
        seatDto.Column = column;
    }
    public static String getResult(){
        return Result;
    }

    public static void setResult(String row){
        Result = row;
    }

    public static void setResultsum(String column, String row) {
        Result = column + row;
    }
}
