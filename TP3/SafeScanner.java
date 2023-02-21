package Main;
import java.util.Scanner;
import java.io.InputStream;

public class SafeScanner {
    private Scanner sc;
    public SafeScanner(InputStream is){
        this.sc = new Scanner(is);
    }

    public int getInt(){
        return this.sc.nextInt();
    }

    public void closeScanner(){
        this.sc.close();
    }
}