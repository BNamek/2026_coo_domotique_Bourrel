import java.util.ArrayList;

class Telecommande {
    /**
     * Attributs
     */
    private ArrayList<Lampe> lampes;

    /**
     * Constructeur vide qui crée une telecommande associée à aucune lampe
     */
    public Telecommande() {
        this.lampes = new ArrayList<>();
    }

    /**
     * Methode qui permet d'ajouter une lampe à la telecommande
     * @param l lampe qui est ajoutée à la telecommande
     */
    public void ajouterLampe(Lampe l) {
        if (l != null) {
            lampes.add(l);
        }
    }

    /**
     * Methode qui permet d'activer une lampe à un indice de la liste
     * @param indiceLampe indice de la lampe que l'on souhaite allumer
     */
    public void activerLampe(int indiceLampe){
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).allumer();
        }
    }

    /**
     * Methode qui permet de desactiver une lampe à un indice de la liste
     * @param indiceLampe indice de la lampe que l'on souhaite eteindre
     */
    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).eteindre();
        }
    }

    /**
     * Methode qui permet d'activer toutes les lampes de la telecommande
     */
    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }

    /**
     * Méthode toString
     * @return une description de la telecommande et des lampes
     */
    public String toString() {
        String resultat = "Telecommande :\n";
        for (int i = 0; i < lampes.size(); i++) {
            resultat += i + " -> " + lampes.get(i).toString() + "\n";
        }
        return resultat;
    }
}