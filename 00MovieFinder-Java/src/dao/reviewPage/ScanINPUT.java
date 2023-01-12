package dao.reviewPage;
import java.io.InputStream;
import java.util.Scanner;

public class ScanINPUT {
    public ScanINPUT(InputStream in)
    {
        Scanner sc = new Scanner(in);
        getScanner(sc);
    }
    public String getScanner(Scanner sc)
    {
        return sc.toString();
    }
}
