import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jalon2.Vol;

public class cas1compagnie {
    private static final String ADMIN_USERNAME = "AIRMESS_ADMIN";
    private static final String ADMIN_PASSWORD = "Avengers123!";
    private static List<Vol> vols = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (authentifierUtilisateur()) {
            afficherMenuPrincipal();
        } else {
            System.out.println("Authentification échouée. Accès refusé.");
        }
    }

    private static boolean authentifierUtilisateur() {
        System.out.println("=== Connexion à AIRMESS Flight Manager ===");
        System.out.print("Nom d'utilisateur: ");
        String username = scanner.nextLine();
        System.out.print("Mot de passe: ");
        String password = scanner.nextLine();

        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    private static void afficherMenuPrincipal() {
        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Ajouter un nouveau vol");
            System.out.println("2. Lister tous les vols");
            System.out.println("3. Quitter");
            System.out.print("Choix: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le retour à la ligne

            switch (choix) {
                case 1:
                    ajouterVol();
                    break;
                case 2:
                    listerVols();
                    break;
                case 3:
                    System.out.println("Déconnexion...");
                    return;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }

    private static void ajouterVol() {
        System.out.println("\n=== AJOUTER UN NOUVEAU VOL ===");

        System.out.print("Ville de départ: ");
        String villeDepart = scanner.nextLine();
        System.out.print("Pays de départ: ");
        String paysDepart = scanner.nextLine();

        System.out.print("Ville d'arrivée: ");
        String villeArrivee = scanner.nextLine();
        System.out.print("Pays d'arrivée: ");
        String paysArrivee = scanner.nextLine();

        System.out.print("Année de départ (YYYY): ");
        int annee = scanner.nextInt();
        System.out.print("Mois de départ (1-12): ");
        int mois = scanner.nextInt();
        System.out.print("Jour de départ (1-31): ");
        int jour = scanner.nextInt();
        System.out.print("Heure de départ (0-23): ");
        int heure = scanner.nextInt();
        System.out.print("Minute de départ (0-59): ");
        int minute = scanner.nextInt();

        LocalDateTime dateDepart = LocalDateTime.of(annee, mois, jour, heure, minute);

        System.out.print("Durée du vol (heures): ");
        int heuresVol = scanner.nextInt();
        System.out.print("Durée du vol (minutes): ");
        int minutesVol = scanner.nextInt();

        System.out.print("Nombre de places (80-200): ");
        int nbPlaces = scanner.nextInt();
        if (nbPlaces < 80 || nbPlaces > 200) {
            System.out.println("Nombre de places invalide. Doit être entre 80 et 200.");
            return;
        }

        System.out.print("Prix initial du vol: ");
        double prixInitial = scanner.nextDouble();

        Vol nouveauVol = new Vol(villeDepart, paysDepart, villeArrivee, paysArrivee, 
                               dateDepart, heuresVol, minutesVol, nbPlaces, prixInitial);
        vols.add(nouveauVol);

        System.out.println("\nVol ajouté avec succès!");
    }

    private static void listerVols() {
        System.out.println("\n=== LISTE DES VOLS ===");
        if (vols.isEmpty()) {
            System.out.println("Aucun vol enregistré.");
        } else {
            for (Vol vol : vols) {
                System.out.println(vol);
                System.out.println("----------------------------------");
            }
        }
    }
}