import java.util.ArrayList;

class Telecommande {
    /**
     * Attributs
     */
    private ArrayList<Peripherique> peripheriques;

    /**
     * Constructeur vide qui crée une telecommande associée à aucun peripherique
     */
    public Telecommande() {
        this.peripheriques = new ArrayList<>();
    }

    /**
     * Methode qui permet d'ajouter un peripherique à la telecommande
     * @param p peripherique qui est ajoutée à la telecommande
     */
    public void ajouterPeripherique(Peripherique p) {
        if (p != null) {
            peripheriques.add(p);
        }
    }

    /**
     * Methode qui permet d'activer un peripjerique à un indice de la liste
     * @param indicePeripherique indice du peripherique que l'on souhaite allumer
     */
    public void activerPeripherique(int indicePeripherique){
        if (indicePeripherique >= 0 && indicePeripherique < peripheriques.size()) {
            peripheriques.get(indicePeripherique).allumer();
        }
    }

    /**
     * Methode qui permet de desactiver un peripherique à un indice de la liste
     * @param indicePeripherique indice du peripherique que l'on souhaite eteindre
     */
    public void desactiverPeripherique(int indicePeripherique) {
        if (indicePeripherique >= 0 && indicePeripherique < peripheriques.size()) {
            peripheriques.get(indicePeripherique).eteindre();
        }
    }

    /**
     * Methode qui permet d'activer tout les peripherique de la telecommande
     */
    public void activerToutPeripherique() {
        for (Peripherique peripherique : peripheriques) {
            peripherique.allumer();
        }
    }

    /**
     * Méthode toString
     * @return une description de la telecommande, des peripherique
     */
    public String toString() {
        String resultat = "Telecommande :\n";

        resultat += "Peripheriques :\n";
        for (int i = 0; i < peripheriques.size(); i++) {
            resultat += i + " -> " + peripheriques.get(i).toString() + "\n";
        }

        return resultat;
    }
}