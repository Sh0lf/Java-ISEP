import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr();
        //factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //division();
        //regle();
        //nombrePremier();
        //initialisationTableau();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel exercice ? Saisissez le numéro:\n" +
                "1. Discriminant\n" +
                "2. Parité d’un nombre\n" +
                "3. Calcul d’extremum\n" +
                "4. Égalité entre chaînes de caractères\n" +
                "5. Factorielle\n" +
                "6. Compte à rebous\n" +
                "7. Valeurs de carrés\n" +
                "8. Table de multiplication\n" +
                "9. Division d’entiers\n" +
                "10. Règle graduée\n" +
                "11. Nombres premiers\n" +
                "12. Manipulations sur un tableau");
        int res = scanner.nextInt();

        switch(res)
        {
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                max();
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                initialisationTableau();
                break;
        }
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
        int entier;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul");
            entier = scanner.nextInt();
        } while (entier < 0);
        int factorielle = 1;
        for (int i = 0; i <= entier; i++) {
            factorielle *= i;
        }
        System.out.println(entier + "! = " + factorielle);
    }

    public static void countdown(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int n = scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            if (i==0) {
                System.out.println("BOOM");
                break;
            }
            System.out.println(i);
        }
    }

    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int n = scanner.nextInt();
        int nSquared = n*n;
        System.out.println(n + "  " + nSquared);
    }

    public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <=10; j++){
                System.out.print(j*i + "  ");
            }
            System.out.print("\n");
        }

    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        int entier1;
        int entier2;
        do {
            System.out.println("Veuillez saisir un entier non nul");
            entier1 = scanner.nextInt();
            System.out.println("Veuillez saisir un deuxième entier non nul");
            entier2 = scanner.nextInt();
        } while (entier1 == 0 || entier2 == 0) ;
        int div = entier1/entier2;
        System.out.println(div);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Veuillez saisir un entier positif non nul");
            n = scanner.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++){
            if (i%10 == 0){
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }
    public static void nombrePremier(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Veuillez saisir un entier positif non nul");
            n = scanner.nextInt();
        } while (n <= 0);
        for (int i = 2; i < n; i++){
            if (n%i == 0){
                System.out.println("Le nombre n'est pas un nombre premier, il est divisible par: " + i);
                break;
            }
        }
    }

    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;

        }
        for (int i = 0; i < tableau.length; i++){
            System.out.print(tableau[i] + "  ");
        }


        int max = tableau[0];
        int min = tableau[0];

        for (int i = 0; i < tableau.length; i++){
            if (tableau[i] > max){
                max = tableau[i];
            } else if (tableau[i] < min){
                min = tableau[i];
            }
        }

        System.out.println("Valeur maximale = " + max);
        System.out.println("Valeur minimale = " + min);

        int sum = 0;

        for (int i = 0; i < tableau.length; i++){
            if(tableau[i]%2 == 0){
                System.out.println("Valeur paire: " + tableau[i]);
            }

            sum += tableau[i];
        }

        System.out.println("Somme des valeurs du tableau = " + sum);

        for (int i = 0; i < tableau.length; i+=2){
            System.out.println("Élement indice paire numéro "+ i + " = " + tableau[i]);
        }

        inverseTableau(tableau);
    }

    public static void inverseTableau(int[] tableau){
        int[] tableauInverse = new int[20];
        for (int i = 0; i < tableau.length; i++){
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        for (int i = 0; i < tableau.length; i++){
            System.out.print(tableau[i] + "  ");
        }

        for (int i = 0; i < tableauInverse.length; i++){
            System.out.print(tableauInverse[i] + "  ");
        }

    }
}
