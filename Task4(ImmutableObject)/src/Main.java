public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dasha", 18, "AM");
        GradesBook gradesBook = new GradesBook(student, 2, 99.56);

        System.out.println(gradesBook.getStudent());
        System.out.println(student);
    }
}
