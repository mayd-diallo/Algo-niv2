package exoParNiv;


/* Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true
 * 
 * (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)
 * Votre steak vous le voulez saignant (true) ou à poing (false) ? 
 * false
 * 
 * 
 * Frites (true) ou riz (false)
 * true
 * 
 * 
 * Soda (true) ou eau gazeuse (false)
 * false
 * 
 * 
 * Merci pour votre commande, ça sera près dans 20min,
 * 
 * 
 * 
 */
import java.util.Scanner;

public class exoNiv1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;
        
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
      