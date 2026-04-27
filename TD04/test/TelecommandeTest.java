import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Classe de test pour Telecommande
 */
public class TelecommandeTest {

    /**
     * Test de la méthode ajouterLampe
     * Cas : ajout d’une lampe à une télécommande vide
     */
    @Test
    void testAjouterLampeTelecommandeVide() {
        // 1. Bloc de préparation des données
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("Salon");

        // 2. Bloc exécutant la méthode de test
        telecommande.ajouterPeripherique(lampe);

        // 3. Bloc vérifiant les résultats obtenus
        String resultat = telecommande.toString();
        assertTrue(resultat.contains("Salon"));
    }

    /**
     * Test de la méthode ajouterLampe
     * Cas : ajout d’une lampe à une télécommande avec 1 élément
     */
    @Test
    void testAjouterLampeTelecommandeUnElement() {
        // 1. Bloc de préparation des données
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterPeripherique(new Lampe("Cuisine"));
        Lampe lampe = new Lampe("Chambre");

        // 2. Bloc exécutant la méthode de test
        telecommande.ajouterPeripherique(lampe);

        // 3. Bloc vérifiant les résultats obtenus
        String resultat = telecommande.toString();
        assertTrue(resultat.contains("Cuisine"));
        assertTrue(resultat.contains("Chambre"));
    }

    /**
     * Test de la méthode activerLampe
     * Cas : activation d’une lampe existante en position 0
     */
    @Test
    void testActiverLampePosition0() {
        // 1. Bloc de préparation des données
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("Salon");
        telecommande.ajouterPeripherique(lampe);

        // 2. Bloc exécutant la méthode de test
        telecommande.activerPeripherique(0);

        // 3. Bloc vérifiant les résultats obtenus
        String resultat = telecommande.toString();
        assertTrue(resultat.contains("Salon: On"));
    }

    /**
     * Test de la méthode activerLampe
     * Cas : activation d’une lampe existante en position 1
     */
    @Test
    void testActiverLampePosition1() {
        // 1. Bloc de préparation des données
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterPeripherique(new Lampe("Entrée"));
        telecommande.ajouterPeripherique(new Lampe("Bureau"));

        // 2. Bloc exécutant la méthode de test
        telecommande.activerPeripherique(1);

        // 3. Bloc vérifiant les résultats obtenus
        String resultat = telecommande.toString();
        assertTrue(resultat.contains("Bureau: On"));
    }

    /**
     * Test de la méthode activerLampe
     * Cas : activation d’une lampe inexistante
     */
    @Test
    void testActiverLampeInexistante() {
        // 1. Bloc de préparation des données
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterPeripherique(new Lampe("Garage"));

        // 2. Bloc exécutant la méthode de test

        // 3. Bloc vérifiant les résultats obtenus
        assertDoesNotThrow(() -> {
            telecommande.activerPeripherique(99);
        });
    }

    @Test
    void testAllumerCheminee() {
        Telecommande telecommande = new Telecommande();
        Cheminee cheminee = new Cheminee();
        Chemineeadaptateur adaptateur = new Chemineeadaptateur(cheminee);

        telecommande.ajouterPeripherique(adaptateur);
        telecommande.activerPeripherique(0);

        assertEquals(10, cheminee.getLumiere());
    }

    @Test
    void testAllumerChemineeDeuxFois() {
        Telecommande telecommande = new Telecommande();
        Cheminee cheminee = new Cheminee();
        Chemineeadaptateur adaptateur = new Chemineeadaptateur(cheminee);

        telecommande.ajouterPeripherique(adaptateur);
        telecommande.activerPeripherique(0);
        telecommande.activerPeripherique(0);

        assertEquals(20, cheminee.getLumiere());
    }

    @Test
    void testEteindreCheminee() {
        Telecommande telecommande = new Telecommande();
        Cheminee cheminee = new Cheminee();
        Chemineeadaptateur adaptateur = new Chemineeadaptateur(cheminee);

        telecommande.ajouterPeripherique(adaptateur);
        telecommande.activerPeripherique(0);
        telecommande.desactiverPeripherique(0);

        assertEquals(0, cheminee.getLumiere());
    }
}