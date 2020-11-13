public class FacebookPage {

    private Student student;

    public FacebookPage(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        String page = "Ik ben " + student.getName() + "en mijn favoriete course is " + student.getFavouriteCourse();
        return page;
    };
}
