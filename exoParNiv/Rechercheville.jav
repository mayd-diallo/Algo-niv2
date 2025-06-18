import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RechercheVille {

    public static void main(String[] args) {
        // Exemple d'utilisation
        List<String> villes = new ArrayList<>();
        villes.add("Paris");
        villes.add("Lyon");
        villes.add("Marseille");
        villes.add("Toulouse");

        chercherVille(villes);
    }

    public static void chercherVille(List<String> listeVilles) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom d'une ville à rechercher : ");
        String villeRecherchee = scanner.nextLine();

        boolean trouve = false;
        for (String ville : listeVilles) {
            if (ville.equalsIgnoreCase(villeRecherchee)) {
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("Cette ville ne figure pas sur la liste");
        } else {
            System.out.println("La ville " + villeRecherchee + " est dans la liste !");
        }
    }
}