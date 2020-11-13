public class HZPass {

    private Student student;

    public HZPass(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        String pass = "Studentnaam: " + this.student.getName() + " Studentnummer: " + this.student.getStudentId() + " Leeftijd: " + this.student.getAge();
        return pass;
    }
}
