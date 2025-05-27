import java.util.Scanner;
public class boucle3{


    public static void main(String[] args) {

          /***--------  Votre code ici  -------------------****/
          Scanner sc = new Scanner(System.in);
          int i = 30 ;
        
          do {
              i-- ;
              
          System.out.println(i);
      
          } while(i>0){
            if (i>0) {
                System.out.println("bonne reponse");
            }else {
                System.out.println("mauvaise reponse");
            }
          }Scanner close;
    }
}