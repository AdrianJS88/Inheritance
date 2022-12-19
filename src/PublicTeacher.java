public class PublicTeacher extends Teacher{

    public PublicTeacher(String name, String email) {
        super(name, email);

    }
    public static void main(String[] args) {
        PublicTeacher pbT = new PublicTeacher("daniel","dani@gmail.ed");
        PublicTeacher pbT1 = new PublicTeacher("Gabi","gabi@yahoo.com");
        System.out.println(pbT.getEmail());
        System.out.println(pbT.getName());



    }
}
