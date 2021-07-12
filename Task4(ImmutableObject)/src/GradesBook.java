public final class GradesBook {
    private final Student student;
    private final int course;
    private final double averageMark;

    public GradesBook(Student student, int course, double averageMark) {
        this.student = new Student(student.getName(), student.getAge(), student.getGroup());
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

    public GradesBook setStudent(Student student) {
        return new GradesBook(student, this.course, this.averageMark);
    }

    public GradesBook setCourse(int course) {
        return new GradesBook(this.student, course, this.averageMark);
    }

    public GradesBook setAverageGrade(double avgMark) {
        return new GradesBook(this.student, this.course, avgMark);
    }
}
