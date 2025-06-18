


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/* Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true
 * 
 * (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)
 * Votre steak vous le voulez saignant (true) ou à poing (false) ? 
 * false
 * 
 * 
 * Frites (true) ou riz (false)
 * true
 * 
 * 
 * Soda (true) ou eau gazeuse (false)
 * false
 * 
 * 
 * Merci pour votre commande, ça sera près dans 20min,
 * 
 * 
 * 
 */


public class exo1Eudes {

    public static void main(String[]args) {


        boolean response=true;
        boolean isVegetarian=false;
        String question="";
        String commande="";
        Scanner clavier = new Scanner(System.in);
        LocalTime time = LocalTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            
        for(int i=1;i<=4;i++){

            switch(i){

                case 1:
                question="Bonjour, votre commande est avec viande (true) ou vegetarien (false) ?:";
                break;

                case 2:

                commande+="-Menu Viande\n";
               question="Votre steak vous le voulez saignant (true) ou à poing (false) ? :";
                break;

                case 3:

                if(response==true && isVegetarian==false){

                    commande+="-Steak Saignant\n";

                }
                
                else if (response==false && isVegetarian==false){
                    commande+="-Steak à point\n";
                }
                
                question="Frites (true) ou riz (false) ?:";
                break;

                case 4:

                if(response==true){

                    commande+="-Frite\n";


                }else{

                    commande+="-Riz\n";

                }

                question="Soda (true) ou eau gazeuse (false):";
                break;

                default:
                question="Aucune question !";
                break;


            }



            System.out.println(question+":"+i);
            response = clavier.nextBoolean();

            if(response==false && i==1){

                i++;
                commande+="-Menu Vegetarien\n";
                isVegetarian=true;
            }

        }

                  if(response==true){

                    commande+="-Soda\n";


                }else{

                    commande+="-Eau gazeuse\n";

                }
                System.out.println(time+"Récapitulatif de votre commande :\n"+commande+"\n\"Merci pour votre commande, ça sera près dans 20min!");


        clavier.close();


    }



    
}