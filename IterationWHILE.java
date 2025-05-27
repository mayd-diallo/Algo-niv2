package Intro;
import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */


public class IterationWHILE {


        public static void main(String[] args) {

            int i=0;
            boolean response=true;

            Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
                                                                    */

            /*Compteur while */ 
            while(i<=10){


                System.out.println(i);
                i++;
  

            }

            while(response==false){

                System.out.println("Voulez-vous apprendre le développement ?(true/false)");
               response = clavier.nextBoolean(); 
               System.out.println("Tu es obligé désolé XD !");

            }

            System.out.println("Bienvenu en ABC Dev !");

            clavier.close();


        }

}
