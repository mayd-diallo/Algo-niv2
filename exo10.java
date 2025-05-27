
import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */


public class exo10{ /* Nom de la classe */

    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

        /***--------  Début du code  -------------------****/
            Scanner clavier = new Scanner(System.in); 

       
       for (int i = 1; i <=5 ; i++){
        System.out.println("question"+ i+);
       }
           boolean response1,response2,response3,response4,response5; //  Déclaration d'une variable a de Type Entier */
          // Déclaration du scanner Instance de l'Objet Scanner 
            while (response1) {
                response1 =false ;
            }
          System.out.println("Question 1 : Le Portugal a t-elle déjà été envahi par l'Espagne ? (Y/N)"); /* Afficher votre instruction */
             
          response1 = clavier.nextBoolean();

          if(!response1){

            score++; // Incrémentation c'est la même chose que score = score + 1
            System.out.println(" Bonne réponse : +1 point :) "); /* Afficher votre instruction */

             }else{

                System.out.println(" Mauvaise réponse :  0 point :( "); /* Afficher votre instruction */
             
            }

            System.out.println("Question 2 : Est ce que Louis XVI est le dernier roi de France ? (Y/N)"); /* Afficher votre instruction */
            response2 = clavier.nextBoolean();

            if(!response2){
                score++; // Incrémentation c'est la même chose que score = score + 1
                System.out.println(" Bonne réponse : +1 point :) "); /* Afficher votre instruction */
    
                 }else{
    
                    System.out.println(" Mauvaise réponse :  0 point :( "); /* Afficher votre instruction */
                 
                }


                System.out.println("Question 3 : la 5e république de France a été fondé en 1958 ? (Y/N)"); /* Afficher votre instruction */
                response3 = clavier.nextBoolean();
                do{
                     
                } while(response5){
                        response5 = true ;
                }
                if(response3){
                    score++; // Incrémentation c'est la même chose que score = score + 1
                    System.out.println(" Bonne réponse : +1 point :) "); /* Afficher votre instruction */
        
                     }else{
        
                        System.out.println(" Mauvaise réponse :  0 point :( "); /* Afficher votre instruction */
                     
                    }

                /**** Ca se Répète */



          System.out.println("Score total :"+score+"/3"); /* Afficher votre instruction */
             



        clavier.close();

      /***--------  Fin du code  -------------------****/

  }

}



