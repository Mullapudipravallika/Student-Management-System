public class Main {
    public static void main(String[] args) {

        Student student = new Student(
            "Rahul Kumar",
            "rahul@gmail.com",
            "Computer Science"
        );

        StudentDAO dao = new StudentDAO();
        dao.addStudent(student);
    }
}