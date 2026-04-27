public class MainGraphique {
    public static void main(String[] args) {

        Telecommande telecommande = new Telecommande();

        // Lampe
        Lampe lampe = new Lampe("Salon");

        // Hifi
        Hifi hifi = new Hifi();

        // Cheminee + adaptateur
        Cheminee cheminee = new Cheminee();
        Chemineeadaptateur adaptateur = new Chemineeadaptateur(cheminee);

        // Ajout à la télécommande
        telecommande.ajouterPeripherique(lampe);
        telecommande.ajouterPeripherique(hifi);
        telecommande.ajouterPeripherique(adaptateur);

        // Interface graphique
        new TelecommandeGraphique(telecommande);
    }
}