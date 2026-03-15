public class Personne {
    String CIN;
    String nom;
    String prenom;
    String email;
    int age;
    public void initialiser(String CIN,String nom,String prenom,String email,int age){
    this.CIN = CIN;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.age = age;
    }
    public void afficher(){
        System.out.println(this.CIN);
        System.out.println(this.nom);
        System.out.println(this.prenom);
        System.out.println(this.email);
        System.out.println(this.age);
    }
}
public void main(String[] args){
    Personne per1 = new Personne();
    per1.initialiser("HH90505", "Saad", "Hossainy", "hosss@gmail.com", 20);
    per1.afficher();
}
