/**
 * Classe qui represente une Lampe qui impletemente Peripherique
 */
public class Lampe implements Peripherique{
    /**
     * Attributs
     */
    private String nom; // Chaine de caracteres qui est le nom de la lampe
    private boolean allumee; // Booleen permettant de savoir si la lampe est allume(true) ou eteinte(false)

    /**
     * Constructeur avec parametre
     * @param n chaine de caractere qui correspond au nom de la lampe
     */
    public Lampe(String n){
        this.nom=n;
        this.allumee=false;
    }

    /**
     * méthode allumer qui permet d'allumer la lampe
     */
    public void allumer(){
        this.allumee=true;
    }

    /**
     * méthode eteindre qui permet d'eteindre la lampe
     */
    public void eteindre(){
        this.allumee=false;
    }

    /**
     * getter pour savoir si la lampe est allume
     * @return Allumee
     */
    public boolean isAllume() {
        return allumee;
    }

    /**
     * Methode to string sous la forme nom + "On/Off"
     * @return
     */
    public String toString() {
        String r = "";
        if (this.allumee) {
            r = "On";
        } else {
            r = "Off";
        }
        return (nom + ": " + r);
    }
}