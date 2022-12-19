 class PrivateTeacher extends Teacher{

    private PrivateTeacher(String name, String email) {
         super(name, email);

    }
     public static void main(String[] args) {
         PrivateTeacher pvt1 = new PrivateTeacher("Sorin","sorin@yahoo.com");
         System.out.println(pvt1.getName());
         System.out.println(pvt1.getEmail());
     }
 }

