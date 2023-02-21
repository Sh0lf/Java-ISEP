package Main;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        int height = 0;
        int width = 0;
        boolean verifInput = false;
        while (!verifInput) {
            try {
                SafeScanner sc = new SafeScanner(System.in);
                System.out.print("Enter cat height (min 3) : ");
                height = sc.getInt();
                System.out.print("Enter cat width (min 7) : ");
                width = sc.getInt();
                verifInput = true;
                sc.closeScanner();
            } catch (Exception e) {
                System.out.println("Please enter only integers");
                verifInput = false;
            }
        }

        if(height>=3 && width>=7)
        {
            ASCIArt cat = new ASCIArt();
            cat.drawCat(height,width);
        }

        else
        {
            System.out.println("Error : mininum dimensions for cat head are 3x7");
            System.exit(0);
        }



        /*SafeScanner safeScanner = new SafeScanner(Objects.requireNonNull(SafeScanner.class.getResourceAsStream("demo.txt")));
        System.out.println("What is your age?");
        int answer = safeScanner.getInt();
        System.out.printf("Your age is %d.%n", answer);
        safeScanner.closeScanner();*/
    }
}

