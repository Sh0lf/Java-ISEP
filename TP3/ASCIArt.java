package Main;

public class ASCIArt {

    private static int height, width;

    public static void drawCat(int height, int width){
        //top of the cat
        System.out.print("|\\");
        printChars(width-4, '-');
        System.out.println("/|");

        //middle cat
        for (int i = 1; i<=height-2; i++){
            System.out.print("|");
            if (i==height/2){
                System.out.print(" ");
                System.out.print("0");
                printChars(width-6, '_');
                System.out.print("0");
                System.out.print(" ");
                System.out.println("|");
            }
            else {
                printChars(width-2, ' ');
                System.out.println("|");
            }
        }

        //bottom cat
        System.out.print("\\");
        System.out.print("_");
        printChars(width-4, '^');
        System.out.print("_");
        System.out.print("/");
    }

    //function for loops prints
    public static void printChars(int input, char symbol){
        for (int i=0; i<input; i++){
            System.out.print(symbol);
        }
    }
}
