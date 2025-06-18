import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionVille {
    private static List<String> villes = new ArrayList<>();

    public static void main(String[] args) {
        // Initialisation de la liste des villes
        villes.add("Paris");
        villes.add("Londres");
        villes.add("Madrid");
        villes.add("Berlin");
        villes.add("Lisbonne");

        // Afficher la liste des villes
        afficherListeVilles();

        Scanner scanner = new Scanner(System.in);

        // Recherche d'une ville
        System.out.print("\nEntrez une ville à rechercher : ");
        String villeRecherchee = scanner.nextLine();
        rechercherVille(villeRecherchee);

        // Ajout d'une nouvelle ville
        System.out.print("\nEntrez une nouvelle ville à ajouter : ");
        String nouvelleVille = scanner.nextLine();
        ajouterVille(nouvelleVille);

        // Afficher la liste mise à jour
        afficherListeVilles();

        scanner.close();
    }

    // Méthode pour afficher la liste des villes
    public static void afficherListeVilles() {
        System.out.println("\nListe des villes :");
        for (String ville : villes) {
            System.out.println("- " + ville);
        }
    }

    // Méthode pour rechercher une ville
    public static void rechercherVille(String ville) {
        if (villes.contains(ville)) {
            System.out.println("La ville '" + ville + "' figure dans la liste.");
        } else {
            System.out.println("Cette ville ne figure pas sur la liste.");
        }
    }

    // Méthode pour ajouter une ville
    public static void ajouterVille(String ville) {
        if (!villes.contains(ville)) {
            villes.add(ville);
            System.out.println("La ville '" + ville + "' a été ajoutée à la liste.");
        } else {
            System.out.println("La ville '" + ville + "' est déjà dans la liste.");
        }
    }
}
