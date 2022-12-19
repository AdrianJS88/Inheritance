public class Student extends Person {

    public Student(String name, String email) {
        super(name, email);

    }
    public static void main(String[] args) {
        Person p4 = new Person("marius ", "marius@yahoo.com");
        System.out.println(p4.getName());
    }
}
