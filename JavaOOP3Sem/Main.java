//package seminar3;

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
//----------------------------------------------------------------------
        controller.addStudent(new Student(4L, "Maria Kozlova"));
        controller.addStudent(new Student(6L, "Ivan Ivanov"));
        controller.addStudent(new Student(2L, "Mikhail Petrov"));
        controller.addStudent(new Student(1L, "Natalia Sidorova"));
        controller.addStudent(new Student(8L, "Alina Borg"));
        controller.printAll();

        controller.sortByFirstName();
        controller.printAll();

        
        controller.sortByLastName();
        controller.printAll();
    }
}
