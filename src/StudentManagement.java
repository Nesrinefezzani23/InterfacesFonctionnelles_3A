import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.function.*;
import java.util.stream.*;

public class StudentManagement implements Management {

    @Override
    public void displayEtudiants(List<Etudiant> Etudiants, Consumer<Etudiant> con) {
        Etudiants.forEach(con);
    }

    @Override
    public void displayEtudiantsByFilter(List<Etudiant> Etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        Etudiants.stream().filter(pre).forEach(con);
    }

    @Override
    public String returnEtudiantsNames(List<Etudiant> Etudiants, Function<Etudiant, String> fun) {
        return Etudiants.stream().map(fun).collect(Collectors.joining(", "));
    }

    @Override
    public Etudiant createEtudiant(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortEtudiantsById(List<Etudiant> Etudiants, Comparator<Etudiant> com) {
        return Etudiants.stream().sorted(com).collect(Collectors.toList());
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> Etudiants) {
        return Etudiants.stream();
    }
}
