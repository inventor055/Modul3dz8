public class Main {
    public static void printStudentInfo(Student student) {
        System.out.println("Имя студента: " + student.getName());
        if (student.getAddress() != null) System.out.println("Адрес студента: " + student.getAddress().get().getCity() +
                student.getAddress().get().getRegion());
    }
    public static void main(String[] args) {
        Student student = new Student("Alisher", new Address("Dun, ", "Pan"));
        Student student1 = new Student("Alex");

        printStudentInfo(student);
        System.out.println();
        printStudentInfo(student1);
    }
}