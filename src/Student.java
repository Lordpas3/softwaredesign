public class Student {
    private String name;
    private int age;
    private int studentId;
    private String favouriteCourse;

    Student (String name, int age, int studentId, String favouriteCourse) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.favouriteCourse = favouriteCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFavouriteCourse() {
        return favouriteCourse;
    }

    public void setFavouriteCourse(String favouriteCourse) {
        this.favouriteCourse = favouriteCourse;
    }
}

