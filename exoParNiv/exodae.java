/*A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration M'afficher l'heure prévu du service (20 min Vegetarien, 40 min viande) + Try cach / 
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
 * Merci pour votre commande, ça sera près dans 20min, */
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exodae {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            // Demander l'heure de début
            System.out.print("Entrez l'heure de début du service (format HH:mm): ");
            String heureDebutStr = scanner.nextLine();
            
            // Parser l'heure de début
            LocalTime heureDebut = LocalTime.parse(heureDebutStr, formatter);
            
            // Demander le type de plat
            System.out.print("Type de plat (1 - Végétarien, 2 - Viande): ");
            int typePlat = scanner.nextInt();
            
            // Calculer l'heure de service en fonction du type de plat
            LocalTime heureService;
            if (typePlat == 1) {
                heureService = heureDebut.plusMinutes(20);
                System.out.println("Plat végétarien - Temps de préparation: 20 minutes");
            } else if (typePlat == 2) {
                heureService = heureDebut.plusMinutes(40);
                System.out.println("Plat viande - Temps de préparation: 40 minutes");
            } else {
                throw new IllegalArgumentException("Type de plat invalide. Choisissez 1 ou 2.");
            }
            
            // Afficher l'heure prévue du service
            System.out.println("Heure de début: " + heureDebut.format(formatter));
            System.out.println("Heure prévue du service: " + heureService.format(formatter));
            
        } catch (Exception e) {
            System.err.println("Erreur: " + e.getMessage());
            System.err.println("Veuillez entrer une heure valide au format HH:mm et un type de plat valide (1 ou 2).");
        } finally {
            scanner.close();
        }
    }
}
