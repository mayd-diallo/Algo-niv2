package Intro;
import java.time.LocalTime;
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;
        LocalTime time = LocalTime.now();
        
        while (continuer) {
            System.out.println("\nNouvelle commande:");
            System.out.println("Bonjour, votre commande est avec viande (true) ou vegetarien (false)");
            boolean avecViande = scanner.nextBoolean();
            
            boolean steakSaignant = false;
            if (avecViande) {
                System.out.println("Votre steak vous le voulez saignant (true) ou à point (false) ?");
                steakSaignant = scanner.nextBoolean();
            }
            
            System.out.println("Frites (true) ou riz (false)");
            boolean frites = scanner.nextBoolean();
            
            System.out.println("Soda (true) ou eau gazeuse (false)");
            boolean soda = scanner.nextBoolean();
            
            System.out.println("\nMerci pour votre commande, ça sera prêt dans 20min.");
            
            
            System.out.println("\nVoulez-vous prendre une autre commande? (true/false)");
            continuer = scanner.nextBoolean();
        }
        
        System.out.println("Merci, à bientôt!");
        scanner.close();
    }
}
