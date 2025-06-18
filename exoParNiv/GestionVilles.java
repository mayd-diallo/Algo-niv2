import java.util.ArrayList;
import java.util.List;

public class GestionVilles {
    private List<String> listeVilles;

    public GestionVilles() {
        this.listeVilles = new ArrayList<>();
    }

    // Méthode pour ajouter une ville à la liste
    public void ajouterVille(String ville) {
        if (ville != null && !ville.trim().isEmpty()) {
            listeVilles.add(ville);
            System.out.println("Ville ajoutée : " + ville);
        } else {
            System.out.println("Erreur : Le nom de la ville ne peut pas être vide.");
        }
    }

    // Méthode pour afficher toutes les villes
    public void afficherVilles() {
        System.out.println("Liste des villes :");
        for (String ville : listeVilles) {
            System.out.println("- " + ville);
        }
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        GestionVilles gestion = new GestionVilles();
        
        gestion.ajouterVille("Paris");
        gestion.ajouterVille("Lyon");
        gestion.ajouterVille(""); // Ne sera pas ajoutée
        gestion.ajouterVille("Marseille");
        
        gestion.afficherVilles();
    }
}
