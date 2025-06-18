import java.util.ArrayList;
import java.util.Scanner;

public class GestionVols {
    
    // Classe pour représenter un vol
    static class Vol {
        String numeroVol;
        String origine;
        String destination;
        String dateDepart;
        String heureDepart;
        int placesDisponibles;
        double prix;
    
        }
    }
    // Liste pour stocker tous les vols
    static ArrayList<Vol> listeVols = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        initialiserVolsExemples();
        afficherMenuPrincipal();
    }
    



