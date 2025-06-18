package jalon;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Vol {

        public static void main(String[]args) {


            String departure,arrival;
            int seats=0;
            double price;
            LocalDateTime departureDate,arrivalDate;
            LocalTime duration;
            Scanner clavier = new Scanner(System.in);
            String password="J6l0n2";
            String login="airmess";
            String vols="";
            boolean end = false;



            System.out.println("Connexion à l'application de gestion des vols ");
             String userLogin ="";
             String userPassword="";
            boolean connection = false;

            while(connection==false){
            System.out.println("Veuillez entrer votre login : ");
            userLogin = clavier.nextLine();
            System.out.println("Veuillez entrer votre mot de passe : ");
            userPassword = clavier.nextLine();

            connection = userLogin.equals(login) && userPassword.equals(password);

            if(connection==true){ {
                System.out.println("Connexion réussie !");
                int i=0;

                while(end==false){
                
                if(i>0){

                    System.out.println("Veuillez ajouter un vol:");
                }else{
                      System.out.println("Bienvenue dans l'application de gestion des vols, veuillez ajouter un vol:");
                }
              
                System.out.println("Ville/Pays de départ :");
                departure = clavier.nextLine(); 
                System.out.println("Ville/Pays d'arrivée :"); 
                arrival = clavier.nextLine();



                System.out.println("Nombres de places (entre 80 et 200) :");



                do{
                    seats = clavier.nextInt();


                    if(!(seats >= 80 && seats <= 200)) {
                        System.out.println("Le nombre de places doit être compris entre 80 et 200. Veuillez réessayer :");
                    }

                }while(!(seats >= 80 && seats <= 200));

                System.out.println("Prix du vol :");   
                price = clavier.nextDouble();   

                i++;



                // Date d'arrivée calculée
                    String arrivalDateString = "";
                     String departureDateString="";
                     String durationString ="";
                    boolean errorDate = true;
                    int errorCount = 0;

                while(errorDate==true){
                System.out.println("Date et heure de départ :");

                if(errorCount==0){
                clavier.nextLine();
                }

                departureDateString = clavier.nextLine();
                System.out.println("Durée du vol :");
                durationString = clavier.nextLine();



                    try{

                        duration = LocalTime.parse(durationString);
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                        departureDate = LocalDateTime.parse(departureDateString, formatter);
                        arrivalDate = departureDate.plusHours(duration.getHour()).plusMinutes(duration.getMinute());


                    arrivalDateString = arrivalDate.format(formatter);
                                    //Calculer le prix en fonction de la date de départ et d'aujourd'hui
                LocalDateTime today = LocalDateTime.now();
                long daysUntilDeparture = java.time.Duration.between(today, departureDate).toDays();
                if (daysUntilDeparture <= 7) {
                    price *= 1.4; // Augmenter le prix de 40% si le vol est dans moins d'une semaine
                } else if (daysUntilDeparture >= 180) {
                    price *= 0.6; // Diminuer le prix de 40% si le vol est plus de 6 mois
                }
                                    errorDate = false;


                } catch (Exception e) {
                    System.out.println("Erreur lors de la saisie des dates : ");
                    System.out.println("Veuillez entrer la date de départ au format 'dd/MM/yyyy HH:mm:ss' et la durée au format 'HH:mm'.");
                    errorDate = true;
                    errorCount++;
                }

            }





                /* minimum 80 places, maximum 200 places. Si le nombre de places est supérieur ou égal à 150, une réduction de 10 % sera appliquée sur le prix initial. Si le nombre de places est inférieur ou égal à 100, le prix augmentera de 10 %.  */

                if (seats >= 150) {
                    price *= 0.9; // Réduction de 10% si le nombre de places est supérieur ou égal à 150
                } else if (seats <= 100) {
                    price *= 1.1; // Augmentation de 10% si le nombre de places est inférieur ou égal à 100
                }

                // Ajouter le vol à la liste des vols
                vols += "vol n°" + i + " : " + departure + " à " + arrival + " du " + departureDateString + " au " + arrivalDateString + " d'une durée de " + durationString + " avec " + seats + " places , prix total : " + String.format("%.2f", price) + "euros\n";

                // Demander si l'utilisateur souhaite ajouter un autre vol
                System.out.println("Souhaitez-vous ajouter un autre vol ? (oui/non)");
                String response = clavier.nextLine();

                


                if (response.equalsIgnoreCase("non")) {
                    end = true;
                }

            // Afficher la liste des vols
            System.out.println("Liste des vols :");
            System.out.println(vols);   
        }

    }
        

            } else {

                System.out.println("Identifiants incorrects, veuillez réessayer.");

            }

        }




        
            clavier.close();

        }


    }


    

