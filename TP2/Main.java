import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //discriminant();
        //parite();
        //max();
        //min();
        egaliteStr();
    }
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            float racinereel = (float) (-b/2*a);
            float racine1im = (float) (-Math.sqrt(-delta)/2*a);
            float racine2im = (float) (Math.sqrt(-delta)/2*a);
            String racine1 = racinereel + "+ i" + racine1im;
            String racine2 = racinereel + "+ i" + racine2im;
            System.out.println("Ce polynome n’a pas de racine reelle, les deux racines imaginaires sont: x0 = "
                    + racine1 + " et x1 = " + racine2);
        } else if (delta == 0) {
            float racine = -b / 2 * a;
            System.out.println("Nous avons une racine double x0 = " + racine);
        } else if (delta > 0) {
            float racine1 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
            float racine2 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
            System.out.println("Les deux racines sont: x0 = " + racine1 + " et x1 = "+ racine2);
        }
    }
    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez un chiffre :");
        int a = scanner.nextInt();
        int parity = a % 2;
        if (parity == 0){
            System.out.println("Votre valeur " + a + "est paire");
        } else if (parity != 0){
            System.out.println("Votre valeur " + a + "est impaire");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez un chiffre :");
        int a = scanner.nextInt();
        System.out.println("Donnez un deuxième chiffre :");
        int b = scanner.nextInt();
        int diff = a - b;

        if (diff < 0) {
            System.out.println("Le plus gros chiffre est votre deuxième chiffre: " + b);
        } else if (diff > 0) {
            System.out.println("Le plus gros chiffre est votre premier chiffre: " + a);
        } else if (diff == 0) {
            System.out.println("Les deux chiffres sont identiques: " + a);
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez un chiffre :");
        int a = scanner.nextInt();
        System.out.println("Donnez un deuxième chiffre :");
        int b = scanner.nextInt();
        int diff = a - b;

        if (diff < 0) {
            System.out.println("Le plus petit chiffre est votre deuxième chiffre: " + a);
        } else if (diff > 0) {
            System.out.println("Le plus petit chiffre est votre premier chiffre: " + b);
        } else if (diff == 0) {
            System.out.println("Les deux chiffres sont identiques: " + a);
        }
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Écrivez un string");
        String str1 = scanner.nextLine();
        System.out.println("Écrivez un deuxième string");
        String str2 = scanner.nextLine();

        boolean isSame = str1.equals(str2);

        if (isSame == true){
            System.out.println("Ce sont les memes strings : " + str1);
        } else if (isSame == false) {
            System.out.println("Ce ne sont pas les memes strings : str1 = "+ str1 + " et str2 = " + str2);
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 0; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }
}


