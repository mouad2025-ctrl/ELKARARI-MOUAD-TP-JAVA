public class Livre {

    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.prix = -1; // prix pas encore donné
        this.prixFixe = false;
    }

    public Livre(String titre, String auteur, int nbPages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.prix = prix;
        this.prixFixe = true;
    }


    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }


    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public void setPrix(double prix) {

        if (prixFixe) {
            System.out.println("Erreur : le prix est déjà fixé !");
        } else {
            this.prix = prix;
            this.prixFixe = true;
        }
    }

    public boolean prixFixe() {
        return prixFixe;
    }

    public int compare(Livre l) {

        if (this.nbPages == l.nbPages) {
            return 0;
        }

        if (this.nbPages > l.nbPages) {
            return 1;
        }

        return -1;
    }

    public String toString() {

        if (prix == -1) {
            return "Titre : " + titre +
                    ", Auteur : " + auteur +
                    ", Pages : " + nbPages +
                    ", Prix : Prix pas encore donné";
        }

        return "Titre : " + titre +
                ", Auteur : " + auteur +
                ", Pages : " + nbPages +
                ", Prix : " + prix;
    }
}