package testTp;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Salle salle1 = new Salle("B", 1);
        System.out.println(salle1);

        FonctionnalitesReser fonctionnalitesReser = new FonctionnalitesReser();
        fonctionnalitesReser.ajouterRes(1, "Yacine ", 2, LocalDateTime.now(), salle1.toString());
        fonctionnalitesReser.afficherRes();
    }
}
