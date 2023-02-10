import java.util.Scanner;

public class Main {
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier");
        int unEntier = scanner.nextInt();
        System.out.println("Maintenant, entrez un float");
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
    }*/

    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est votre prenom ?");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour " + prenom);
    }*/

    public static void main(String[] args) {
        //somme();
        //division();
        volume();
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + somme);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + division);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur du pavé:");
        float longueur = scanner.nextInt();
        System.out.println("Veuillez saisir la largeur du pavé:");
        float largeur = scanner.nextInt();
        System.out.println("Veuillez saisir la hauteur du pavé:");
        float hauteur = scanner.nextInt();
        float volume = longueur * largeur * hauteur;
        System.out.println("Le volume du pavé droit est égale à: " + volume);
    }

}
