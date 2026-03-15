public class Point {
    char nom;
    double abscisse;

    public void initialiser(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void initialiser(Point p){
        this.nom = p.nom;
        this.abscisse = p.abscisse;
    }

    public void afficher(){
        System.out.println(this.nom);
        System.out.println(this.abscisse);
    }

    public void translate(double a){
        this.abscisse += a;
    }
}

public void main(String[] args){
    Point p = new Point();
    Point b = new Point();
    p.initialiser('q',5);
    b.initialiser(p);
    p.translate(1);
    p.afficher();
    b.afficher();
}