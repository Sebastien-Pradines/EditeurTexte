package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }
    public void executer() {
        if (parameters.length < 2) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        this.document.majuscules(start, end);
        super.executer();
    }
}