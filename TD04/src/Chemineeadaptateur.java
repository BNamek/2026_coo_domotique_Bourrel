/**
 * classe qui permet de faire un adaptateur entre une cheminee et un peripherique
 */

 class Chemineeadaptateur implements Peripherique {
    /**
     * attributs
     */
    private Cheminee cheminee;

    /**
     * constructeur avec parametre
     * @param c qui permet de cree un adaptateur de cheminee selon celle en parametre
     */
    public Chemineeadaptateur(Cheminee c) {
        this.cheminee = c;
    }

    /**
     * methode qui permet d'allumer une cheminee ou d'ajouter +10 de d'intensité a la cheminee
     */
    public void allumer() {
        int intensite = cheminee.getLumiere();
        cheminee.changerIntensite(intensite + 10);
    }

    /**
     * methode qui permet d'eteindre une cheminee en metant 0 d'intensite
     */
    public void eteindre() {
        cheminee.changerIntensite(0);
    }

    /**
     * methode toString qui affiche "cheminee : intensité"
     * @return
     */
    public String toString() {
        return cheminee.toString();
    }
}
