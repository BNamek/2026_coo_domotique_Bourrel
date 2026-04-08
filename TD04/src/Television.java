/**
 * Classe representant une TeLevision qui impletemente Peripherique
 */
public class Television implements Peripherique{
    /**
     * la luminosite de l'ecran on suppose que la television est eteinte si
     * la luminosite vaut 0
     */
    private int luminosite = 0;

    public Television(){
        this.luminosite=0;
    }

    /**
     * permet d'allumer ou d'augmenter la luminosite de l'ecran
     */
    public void allumer(){
        this.luminosite += 50;
        // La luminosite maximum est 100
        if (this.luminosite > 100)
            this.luminosite = 100;
    }

    /**
     * permet d'eteindre la television est donc de mettre la luminosite a 0
     */
    public void eteindre(){
        this.luminosite=0;
    }

    /**
     * Methode toString qui affiche le contenu de la television
     * @return String de la forme : "Television{luminosiete=valeur}
     */
    @Override
    public String toString() {
        return "Television{" +
                "luminosite=" + luminosite +
                '}';
    }
}
