public final class GradesBook {
    private final Student student;
    private final int course;
    private final double averageMark;

    public GradesBook(Student student, int course, double averageMark) {
        this.student = student;
        this.course = course;
        this.averageMark = averageMark;
    }

    public Student getStudent() {
        return (Student) student.clone();
    }

    public int getCourse() {
        return course;
    }

    public double getAverageMark() {
        return averageMark;
    }
}
