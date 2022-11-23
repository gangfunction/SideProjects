package dao.reserve;

public class Chair implements Seats {
    private final String[] arr = {"A1", "A2", "A3", "A4", "A5", "A6"};
    private final String[] brr = {"B1", "B2", "B3", "B4", "B5", "B6"};
    private final String[] crr = {"C1", "C2", "C3", "C4", "C5", "C6"};
    private final String[] drr = {"D1", "D2", "D3", "D4", "D5", "D6"};
    private final String[] err = {"E1", "E2", "E3", "E4", "E5", "E6"};
    public Chair() {
    }

    public String[] getArr() {
        return arr;
    }
    public String[] getBrr() {
        return brr;
    }
    public String[] getCrr() {
        return crr;
    }
    public String[] getDrr() {
        return drr;
    }
    public String[] getErr() {
        return err;
    }
    public void setArr(int j,String i){
        this.arr[j] = i;
    }
    public void setBrr(int j,String i){
        this.brr[j] = i;
    }
    public void setCrr(int j,String i){
        this.crr[j] = i;
    }
    public void setDrr(int j,String i){
        this.drr[j] = i;
    }
    public void setErr(int j,String i){
        this.err[j] = i;
    }
    public void showing(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" "+brr[i]+" "+crr[i]+" "+drr[i]+" "+err[i]);
        }

    }
}
