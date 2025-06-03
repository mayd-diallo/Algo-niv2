package exoParNiv;

import java.util.Scanner;

/* Niveau 3 : A l'aide d'une boucle, PRINT & SCANNER 
*Imiter un distributeur de banque qui s'arrête uniquement 
quand vous appuyez, terminer(0). Voici les commandes suivantes

0 - Terminer
1 - Retirer
2 - Afficher compte
3 - Déposer

vous avez droit à un découvert de maximum 500€
Vous ne pouvez déposer minimum 5€ et une somme divisible par 5 (vu que c'est des billets)
Vous pouvez retirer qu'en multiple de 10


 * Vous avez 2000€ sur votre compte
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bienvenu sur votre compte bancaire, que puis-je faire pour vous :
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 1
 * 
 * Combien voulez-vous retirer ?:
 * 500€
 * 
 * Opération acceptée : 500€ ont été retiré,
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 2
 * 
 * Vous avez actuellement 1500€ sur votre solde
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 3
 * 
 * Combien voulez-vous retirer ?:
 * 577€
 * 
 * Désolé vous ne pouvez déposer que des billets
 * Voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 0
 * 
 * Merci de votre visite, au revoir :) !
 * 
 * 
 * 
 * 
 */


public class exoNiv3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int solde = 2000;
        final int DECOUVERT_MAX = -500;
        int choix;
        
        System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous ");
          do {
            afficherMenu();
            choix = scanner.nextInt();
            
            switch (choix) {
                case 0:
                    System.out.println("\nMerci de votre visite, au revoir :) !");
                    break;
                case 1:
                    retirerArgent(scanner, solde, DECOUVERT_MAX);
                    solde = retirerArgent(scanner, solde, DECOUVERT_MAX);
                    break;
                case 2:
                    afficherSolde(solde);
                    break;
                case 3:
                    deposerArgent(scanner, solde);
                    solde = deposerArgent(scanner, solde);
                    break;
                default:
                    System.out.println("\nOption invalide, veuillez réessayer.");
            }
            
            if (choix != 0) {
                System.out.println(" voulez-vous autres-choses ?");
            }
        } while (choix != 0);
        
        scanner.close();
    }
    
    private static void afficherMenu() {
        System.out.println("(0)Quitter");
        System.out.println("(1)Retirer de l'argent");
        System.out.println("(2)Consulter votre solde");
        System.out.println("(3)Déposer de l'argent");
        System.out.print("\n");
    }
    
    private static int retirerArgent(Scanner scanner, int solde, int decouvertMax) {
        System.out.println("\nCombien voulez-vous retirer ?:");
        int montant = scanner.nextInt();
        
        if (montant % 10 != 0) {
            System.out.println("\nDésolé, vous ne pouvez retirer que des multiples de 10€");
        } else if (solde - montant < decouvertMax) {
            System.out.println("\nOpération refusée : découvert maximum autorisé dépassé");
        } else {
            solde -= montant;
            System.out.println("\nOpération acceptée : " + montant + "€ ont été retiré,");
        }
        
        return solde;
    }
    
    private static void afficherSolde(int solde) {
        System.out.println("\nVous avez actuellement " + solde + "€ sur votre solde");
    }
    
    private static int deposerArgent(Scanner scanner, int solde) {
        System.out.println("\nCombien voulez-vous déposer ?:");
        int montant = scanner.nextInt();
        
        if (montant < 5) {
            System.out.println("\nDésolé, le dépôt minimum est de 5€");
        } else if (montant % 5 != 0) {
            System.out.println("\nDésolé vous ne pouvez déposer que des billets");
        } else {
            solde += montant;
            System.out.println("\nOpération acceptée : " + montant + "€ ont été déposés,");
        }
        
        return solde;

  
    }
     
    }


 