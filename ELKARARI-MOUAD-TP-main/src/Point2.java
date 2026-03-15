public class Point2 {
    char name;
    double absc;
    Point2(char nom, double abscisse){
        this.name = nom;
        this.absc = abscisse;
    }

    void afficher(){
        System.out.println(this.name);
        System.out.println(this.absc);
    }

    void translate(double a){
        this.absc += a;
    }

}
public void main(String[] args){
    Point2 p = new Point2('p', 2);
    p.afficher();
    p.translate(-1);
    p.afficher();

}
