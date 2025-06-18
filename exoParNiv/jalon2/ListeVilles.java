package jalon2;

public class ListeVilles {
    public static void main(String[] args) {
        String[] villes = {"Paris", "Londres", "Madrid", "Berlin", "Lisbonne"};
        
        System.out.println("Liste des villes:");
        for (String ville : villes) {
            System.out.println("- " + ville);
        }
    }
}