package Intro;
import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */


public class IterationDOWHILE {


        public static void main(String[] args) {

            boolean response = true;

            Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
                   
            */
            
            do{
                
                if(response==false){ /** Message de la première tentative */ 
                System.out.println("Vous êtes obligé désolé, choisissez (true)");
                }else{ /** Message de la nièeme tentative */
             
              
                             System.out.println("Voulez-vous apprendre le développement ?(true/false)");     

                }

               response = clavier.nextBoolean(); 
               
            }
            
            while(response==false); /* Tant que c'est VRAI ça ne s'arrête */


            System.out.println("Bienvenu en ABC Dev !");

                        clavier.close();


        }

}
