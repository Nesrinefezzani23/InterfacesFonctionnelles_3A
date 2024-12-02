import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(5,"Nesrine",23);
        System.out.println(etudiant1.toString());

        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(new Etudiant(1, "Yassmine", 21));
        etudiants.add(new Etudiant(3, "Eya", 22));
        etudiants.add(new Etudiant(2, "Amira", 24));

        StudentManagement management = new StudentManagement();

        System.out.println("Liste de tous les étudiants :");
        management.displayEtudiants(etudiants, etudiant -> System.out.println(etudiant));

        System.out.println("\nÉtudiants ayant un âge >= 22 :");
        management.displayEtudiantsByFilter(etudiants, etudiant -> etudiant.getAge() >= 22, etudiant -> System.out.println(etudiant));

        System.out.println("\nNoms des étudiants :");
        String studentNames = management.returnEtudiantsNames(etudiants, Etudiant::getNom);
        System.out.println(studentNames);

        System.out.println("\nCréer un nouvel étudiant :");
        Etudiant nouveauEtudiant = management.createEtudiant(() -> new Etudiant(8, "Cuizina", 27));
        System.out.println(nouveauEtudiant);

        System.out.println("\nListe des étudiants triés par ID :");
        List<Etudiant> sortedEtudiants = management.sortEtudiantsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        sortedEtudiants.forEach(etudiant -> System.out.println(etudiant));

        System.out.println("\nListe des étudiants sous forme de flux :");
        Stream<Etudiant> etudiantStream = management.convertToStream(etudiants);
        etudiantStream.forEach(etudiant -> System.out.println(etudiant));
    }
}
