package Intro;
import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */


public class SwitchCase {

            public static void main(String[] args) {

                /* Afficher le mois correspondant à son numéro */

                int month;
                Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner */
               System.out.println("Veuillez choisir un nombre entre 1 et 12, pour afficher son mois :");
                month = clavier.nextInt();


               switch (month) {

                case 1:System.out.println("Janvier");break;

                case 2:System.out.println("Février");break; 

                case 3:System.out.println("Mars");break; 

                case 4:System.out.println("Avril");break; 

                case 5:System.out.println("Mai");break; 

                case 6:System.out.println("Juin");break;

                case 7:System.out.println("Juillet");break;

                case 8:System.out.println("Août");break;

                case 9:System.out.println("Septembre");break;

                case 10:System.out.println("Octobre");break;

                case 11:System.out.println("Novembre");break;

                case 12:System.out.println("Décembre");break;

                default:
                      System.out.println("Mois inconnu");                  
                    break;
               }

                

                                              



            }
    
}
