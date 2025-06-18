import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Vol {
    private String villeDepart;
    private String paysDepart;
    private String villeArrivee;
    private String paysArrivee;
    private LocalDateTime dateHeureDepart;
    private int heuresVol;
    private int minutesVol;
    private int nbPlaces;
    private double prixInitial;

    public Vol(String villeDepart, String paysDepart, 
               String villeArrivee, String paysArrivee, 
               LocalDateTime dateHeureDepart, 
               int heuresVol, int minutesVol, 
               int nbPlaces, double prixInitial) {
        this.villeDepart = villeDepart;
        this.paysDepart = paysDepart;
        this.villeArrivee = villeArrivee;
        this.paysArrivee = paysArrivee;
        this.dateHeureDepart = dateHeureDepart;
        this.heuresVol = heuresVol;
        this.minutesVol = minutesVol;
        this.nbPlaces = nbPlaces;
        this.prixInitial = prixInitial;
    }

    public LocalDateTime getDateHeureArrivee() {
        return dateHeureDepart.plusHours(heuresVol).plusMinutes(minutesVol);
    }

    public double getPrixAjuste() {
        double prixAjuste = prixInitial;
        
        // Ajustement selon la date
        long joursAvantDepart = ChronoUnit.DAYS.between(LocalDateTime.now(), dateHeureDepart);
        
        if (joursAvantDepart < 7) {
            // Moins d'une semaine -> +40%
            prixAjuste *= 1.4;
        } else if (joursAvantDepart > 180) {
            // Plus de 6 mois -> -40%
            prixAjuste *= 0.6;
        }
        
        // Ajustement selon le nombre de places
        if (nbPlaces >= 150) {
            // Réduction de 10%
            prixAjuste *= 0.9;
        } else if (nbPlaces < 100) {
            // Augmentation de 10%
            prixAjuste *= 1.1;
        }
        
        return Math.round(prixAjuste * 100.0) / 100.0; // Arrondi à 2 décimales
    }

    // Getters
    public String getVilleDepart() { return villeDepart; }
    public String getPaysDepart() { return paysDepart; }
    public String getVilleArrivee() { return villeArrivee; }
    public String getPaysArrivee() { return paysArrivee; }
    public LocalDateTime getDateHeureDepart() { return dateHeureDepart; }
    public int getHeuresVol() { return heuresVol; }
    public int getMinutesVol() { return minutesVol; }
    public int getNbPlaces() { return nbPlaces; }
    public double getPrixInitial() { return prixInitial; }
} Vol1 {
    
}
