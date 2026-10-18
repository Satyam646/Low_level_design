import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public void printProfessors() {
        System.out.println("Professors in " + name + " Department:");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        List<Professor> profs = List.of(p1, p2);

        Department csDept = new Department("Computer Science", profs);
        csDept.printProfessors();

        // csDept can be deleted or go out of scope...
        // but p1 and p2 still exist and can be used elsewhere.
    }
}
//so aggregation works on a "has-a" relationship where the lifetime of the contained objects (Professor) is independent of the container object (Department).