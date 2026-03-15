public class Etagere {

    private Livre[] livres;
    private int nbLivres;

    public Etagere(int capacite) {
        livres = new Livre[capacite];
        nbLivres = 0;
    }

    public int getCapacite() {
        return livres.length;
    }

    public int getNbLivres() {
        return nbLivres;
    }

    public void ajouter(Livre l) {

        if (nbLivres == livres.length) {
            System.out.println("Etagère pleine !");
            return;
        }

        livres[nbLivres] = l;
        nbLivres++;
    }

    public Livre getLivre(int position) {

        if (position < 1 || position > nbLivres) {
            return null;
        }

        return livres[position - 1];
    }

    public int chercher(String titre, String auteur) {

        for (int i = 0; i < nbLivres; i++) {

            if (livres[i].getTitre().equals(titre) &&
                    livres[i].getAuteur().equals(auteur)) {

                return i + 1;
            }
        }

        return 0;
    }

    public void supprimer(int position) {

        if (position < 1 || position > nbLivres) {
            System.out.println("Position invalide");
            return;
        }

        for (int i = position - 1; i < nbLivres - 1; i++) {
            livres[i] = livres[i + 1];
        }

        livres[nbLivres - 1] = null;
        nbLivres--;
    }
}