public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dasha", 18, "AM");
        GradesBook gradesBook = new GradesBook(student, 2, 99.56);

        System.out.println(gradesBook.getStudent());
        System.out.println(student);

        System.out.println("----------------------");

        gradesBook.setCourse(3);
        gradesBook.setStudent(new Student("Galya", 24, "IPZ34"));
        System.out.println(gradesBook.getStudent());

        System.out.println("----------------------");

        student.setAge(23);
        System.out.println(gradesBook.getStudent());
    }
}
