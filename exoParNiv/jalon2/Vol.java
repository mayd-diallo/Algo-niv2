package jalon2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vol {
    private String villeDepart;
    private String paysDepart;
    private String villeArrivee;
    private String paysArrivee;
    private LocalDateTime dateDepart;
    private int dureeHeures;
    private int dureeMinutes;
    private int nbPlaces;
    private double prixInitial;
    private double prixFinal;

    public Vol(String villeDepart, String paysDepart, String villeArrivee, String paysArrivee, 
               LocalDateTime dateDepart, int dureeHeures, int dureeMinutes, int nbPlaces, double prixInitial) {
        this.villeDepart = villeDepart;
        this.paysDepart = paysDepart;
        this.villeArrivee = villeArrivee;
        this.paysArrivee = paysArrivee;
        this.dateDepart = dateDepart;
        this.dureeHeures = dureeHeures;
        this.dureeMinutes = dureeMinutes;
        this.nbPlaces = nbPlaces;
        this.prixInitial = prixInitial;
        this.prixFinal = calculerPrixFinal();
    }

    private double calculerPrixFinal() {
        double prix = prixInitial;
        LocalDateTime maintenant = LocalDateTime.now();
        
        // Application des règles de prix en fonction de la date
        long joursAvantDepart = ChronoUnit.DAYS.between(maintenant, dateDepart);
        
        if (joursAvantDepart < 7) {
            prix *= 1.4; // +40% si moins d'une semaine
        } else if (joursAvantDepart > 180) { // ~6 mois
            prix *= 0.6; // -40% si plus de 6 mois
        }
        
        // Application des règles de prix en fonction du nombre de places
        if (nbPlaces >= 150) {
            prix *= 0.9; // -10% si 150 places ou plus
        } else if (nbPlaces < 100) {
            prix *= 1.1; // +10% si moins de 100 places
        }
        
        return prix;
    }

    public LocalDateTime getDateArrivee() {
        return dateDepart.plusHours(dureeHeures).plusMinutes(dureeMinutes);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Départ: " + villeDepart + " / " + paysDepart + "\n" +
               "Arrivée: " + villeArrivee + " / " + paysArrivee + "\n" +
               "Date et heure de départ: " + dateDepart.format(formatter) + "\n" +
               "Durée du vol: " + dureeHeures + "h " + dureeMinutes + "min\n" +
               "Date et heure d'arrivée: " + getDateArrivee().format(formatter) + "\n" +
               "Nombre de places: " + nbPlaces + "\n" +
               "Prix initial: " + String.format("%.2f", prixInitial) + " €\n" +
               "Prix final: " + String.format("%.2f", prixFinal) + " €";
    }

    // Getters et setters
    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getPaysDepart() {
        return paysDepart;
    }

    public void setPaysDepart(String paysDepart) {
        this.paysDepart = paysDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public String getPaysArrivee() {
        return paysArrivee;
    }

    public void setPaysArrivee(String paysArrivee) {
        this.paysArrivee = paysArrivee;
    }

    public LocalDateTime getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDateTime dateDepart) {
        this.dateDepart = dateDepart;
        this.prixFinal = calculerPrixFinal(); // Recalcul du prix si la date change
    }

    public int getDureeHeures() {
        return dureeHeures;
    }

    public void setDureeHeures(int dureeHeures) {
        this.dureeHeures = dureeHeures;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
        this.prixFinal = calculerPrixFinal(); // Recalcul du prix si le nombre de places change
    }

    public double getPrixInitial() {
        return prixInitial;
    }

    public void setPrixInitial(double prixInitial) {
        this.prixInitial = prixInitial;
        this.prixFinal = calculerPrixFinal(); // Recalcul du prix si le prix initial change
    }

    public double getPrixFinal() {
        return prixFinal;
    }
}
