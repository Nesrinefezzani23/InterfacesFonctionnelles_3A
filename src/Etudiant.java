public class Etudiant {
    int id;
    String nom;
    int age;

    Etudiant(){}
    Etudiant(int id, String nom, int age){
        this.id = id;
        this.nom = nom;
        this.age = age;
    }
    //Getters
    int getId(){
        return id;
    }
    String getNom(){
        return nom;
    }
    int getAge(){
        return age;
    }
    //Setters
    void setId(int id){
        this.id = id;
    }
    void setNom(String nom){
        this.nom = nom;
    }
    void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Id: " + id + ", Nom: " + nom + ", Age: " + age;
    }
}
