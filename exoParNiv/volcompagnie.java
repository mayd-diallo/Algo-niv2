/*Vous êtes l’agence « Les Avengers du Dev », vous avez un client qui aimerait avoir pour son site de réservation d’avion, un outil lui permettant de lister tous ses vols avec les informations demandées. Voici sa demande pour plus d’informations

Demande du client :

Bonjour les Avengers,
Nous sommes la compagnie aérienne AIRMESS, et nous aimerions disposer d’un outil qui nous permette de lister nous-mêmes nos propres vols avec les informations suivantes :

•	Départ : Ville / Pays
•	Arrivée : Ville / Pays
•	Date et heure de départ : heures et minutes. Si la date de départ du vol est très proche d’aujourd’hui (moins d’une semaine), le prix devra automatiquement augmenter de 40 %. En revanche, si la date du vol est très éloignée (plus de 6 mois avant la date de départ), le prix devra diminuer de 40 %.
•	Durée du vol : heures et minutes
•	Date et heure d’arrivée : calculées automatiquement à partir de la durée du vol.
•	Nombre de places : minimum 80 places, maximum 200 places. Si le nombre de places est égal ou supérieur à 150, une réduction de 10 % sera appliquée sur le prix initial. Si le nombre de places est inférieur à 100, le prix augmentera de 10 %.
•	Prix initial du vol : défini à la création du vol et ajusté automatiquement en fonction de la date de départ et du nombre de places, comme décrit précédemment.

Une fois les informations saisies, j’aimerais que tous les vols soient affichés. Nous devrions pouvoir créer autant de vols que nécessaire.
Enfin, nous aimerions surtout avoir un système d’authentification pour accéder à cette application. Vous nous fournirez le login et le mot de passe.

 */


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jalon2.Vol;

public class volcompagnie {
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
        System.out.println("\nAJOUTER UN NOUVEAU VOL");

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
                System.out.println(); 
            }
        }
    }
}