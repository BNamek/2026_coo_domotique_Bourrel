import java.util.ArrayList;

class Telecommande {
    /**
     * Attributs
     */
    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;

    /**
     * Constructeur vide qui crée une telecommande associée à aucune lampe et aucune chaine Hifis
     */
    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.hifis = new ArrayList<>();
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
    public void activerToutLampe() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }

    /**
     * Methode qui permet d'ajouter une chaine Hifi si elle est pas null
     * @param h
     */
    public void ajouterHifi(Hifi h){
        if (h!=null){
            hifis.add(h);
        }
    }

    /**
     * Méthode qui permet d'activer une chaine hifi dans la liste hifis
     * @param indiceHifi indice de la chaine hifi que l'on souhaite allumer
     */
    public void activerHifi(int indiceHifi){
        if (indiceHifi >= 0 && indiceHifi < hifis.size()) {
            hifis.get(indiceHifi).allumer();
        }
    }

    /**
     * Méthode qui permet desactiver une chaine hifi dans la liste hifis
     * @param indiceHifi indice de la chaine hifi que l'on souhaite eteindre
     */
    public void desactiverHifi(int indiceHifi) {
        if (indiceHifi >= 0 && indiceHifi < hifis.size()) {
            hifis.get(indiceHifi).eteindre();
        }
    }

    /**
     * Methode qui permet d'activer toutes les Hifis de la telecommande
     */
    public void activerTouthifis() {
        for (Hifi hifi : hifis) {
            hifi.allumer();
        }
    }

    /**
     * Méthode toString
     * @return une description de la telecommande, des lampes et des hifis
     */
    public String toString() {
        String resultat = "Telecommande :\n";

        resultat += "Lampes :\n";
        for (int i = 0; i < lampes.size(); i++) {
            resultat += i + " -> " + lampes.get(i).toString() + "\n";
        }

        resultat += "Hifis :\n";
        for (int i = 0; i < hifis.size(); i++) {
            resultat += i + " -> " + hifis.get(i).toString() + "\n";
        }

        return resultat;
    }
}