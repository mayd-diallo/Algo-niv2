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

    public static void main(String[]args) {

        boolean response=true;
        double price;
        double asset=2000.0;
        String error="";

        int count=0;
        Scanner clavier = new Scanner(System.in);

        while (response) {

            if(count == 0) {
                System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous :");
            } else {
                System.out.println("Voulez-vous autres-choses ?");
            }

            System.out.println("(0)Quitter");
            System.out.println("(1)Retirer de l'argent");
            System.out.println("(2)Consulter votre solde");
            System.out.println("(3)Déposer de l'argent");

            count = clavier.nextInt();

            switch (count) {
                case 0:
                    response = false;
                    break;
                case 1:
                    System.out.println("Combien voulez-vous retirer ?:");
                    price = clavier.nextDouble();
                    if (price % 10 == 0 && price <= asset + 500) {
                        asset -= price;
                        System.out.println("Opération acceptée : " + price + "€ ont été retiré,");
                    } 
                    
                    else if (price % 10 != 0) {
                        error="Désolé, vous ne pouvez retirer qu'en multiple de 10.";
                    } 
                    else if (price > asset + 500) {

                        error="Désolé, vous ne pouvez pas retirer plus que votre solde + 500€ de découvert autorisé.";
                    }
                    else {
                        System.out.println("Opération refusée."+error);
                    }
                    break;
                case 2:
                    System.out.println("Vous avez actuellement " + asset + "€ sur votre solde");
                    break;
                case 3:
                    System.out.println("Combien voulez-vous déposer ?:");
                    price = clavier.nextDouble();
                    if (price >= 5 && price % 5 == 0) {
                        asset += price;
                        System.out.println("Opération acceptée : " + price + "€ ont été déposé,");
                    } else {
                        System.out.println("Désolé vous ne pouvez déposer que des billets");
                    }
                    break;
                default:
                    System.out.println("Commande inconnue");
            }

            count++;
        }
        System.out.println("Merci de votre visite, au revoir :) !");
    }


}
