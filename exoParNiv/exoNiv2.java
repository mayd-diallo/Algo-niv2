package exoParNiv;


/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing pour de vos courses alimentaires
Les afficher à la fin avec le coût total de vos courses et faire supprimer une course de ma liste de course
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * 
 * Combien, ça côute ?:
 * 1.45
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * 
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Lait
 * 
 * Combien, ça côute ?:
 * 1.30
 * 
    * Voulez-vous acheter autre choses (true/false)?
 * false
 * 
 * 
 * Récapitulatif de vos courses :
 * 
 * -Oeufs , 1.45 euros
 * -Farine , 2.54 euros
 * -Lait , 1.30 euros
 * 
 * Total de vos courses : 5,29€
 * 
 * 
 * 
 */


import java.util.Scanner;

public class exoNiv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articles;
        Double prix ;
        boolean continuer = true;
        double total = 0.0;

        System.out.println("Bonjour, que voulez-vous acheter ? :");
        
        while (continuer) {
            
            String article = scanner.nextLine();
            
            
            
            System.out.println("Combien ça coûte ? :");
            double prixArticle = scanner.nextDouble();
            
            total += prixArticle;
            
            
            System.out.println("Voulez-vous acheter autre chose (true/false)?");
            continuer = scanner.nextBoolean();
            scanner.nextLine(); 
            
            if (continuer) {
                System.out.println("Que voulez-vous acheter ?");
            }
        }
        
        
        System.out.println("Récapitulatif de vos courses :");
        
        for (int i = 0; i <=3 ; i++) {
            System.out.println(i);
        }
        
        System.out.printf("Total de vos courses : %.2f€%", total);
        
        scanner.close();
    }
}



