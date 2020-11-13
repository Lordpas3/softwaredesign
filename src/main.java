class main {
    public static void main(String[] args) {

        Console console = new Console();

        Student passie = new Student("Pascal", 22, 81189, "CIN :)");
        Student martin = new Student("Martin", 19, 42069, "CIN 24/7");




        School school = new School("HZ");
        school.entrance(martin);
        school.entrance(passie);

        console.print("Het is nu 6 uur");
        console.print("We hebben " + school.getStudents().size() + " studenten");

        console.print(school.getStudentPass());
    }
}