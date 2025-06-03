package exoParNiv;

import java.util.ArrayList;
import java.util.Scanner;

public class exoNiv22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> articles = new ArrayList<>();
        ArrayList<Double> prix = new ArrayList<>();
        boolean continuer = true ;
         
        System.out.println("Bonjour, que voulez-vous acheter ? :");
        
        while (continuer) {
            // Saisie de l'article
            String article = scanner.nextLine();
            articles.add(article);
            
            // Saisie du prix
            System.out.println("\nCombien ça coûte ? :");
            double prixArticle = scanner.nextDouble();
            prix.add(prixArticle);
            scanner.nextLine(); // Pour consommer le retour à la ligne
            
            // Demande si l'utilisateur veut continuer
            System.out.println("\nVoulez-vous acheter autre chose (true/false)?");
            continuer = scanner.nextBoolean();
            scanner.nextLine(); // Pour consommer le retour à la ligne
            
            if (continuer) {
                System.out.println("\nQue voulez-vous acheter ? :");
            }
        }
        
        // Affichage du récapitulatif
        System.out.println("\nRécapitulatif de vos courses :\n");
        
        double total = 0;
        for (int i = 0; i < articles.size(); i++) {
            System.out.printf("- %s , %.2f euros%n", articles.get(i), prix.get(i));
            total += prix.get(i);
        }
        
        System.out.printf("\nTotal de vos courses : %.2f€%n", total);
        
        // Option pour supprimer un article
        System.out.println("\nVoulez-vous supprimer un article de la liste (true/false)?");
        boolean supprimer = scanner.nextBoolean();
        scanner.nextLine(); // Pour consommer le retour à la ligne
        
        if (supprimer) {
            System.out.println("\nQuel article voulez-vous supprimer ?");
            String articleASupprimer = scanner.nextLine();
            
            int index = articles.indexOf(articleASupprimer);
            if (index != -1) {
                articles.remove(index);
                total -= prix.remove(index);
                
                // Réaffichage de la liste mise à jour
                System.out.println("\nListe mise à jour :\n");
                for (int i = 0; i < articles.size(); i++) {
                    System.out.printf("- %s , %.2f euros%n", articles.get(i), prix.get(i));
                }
                System.out.printf("\nNouveau total : %.2f€%n", total);
            } else {
                System.out.println("Article non trouvé dans la liste.");
            }
        }
        
        scanner.close();
    }
}

