class Teacher extends Person {

    public Teacher(String name, String email) {
        super(name, email);


    }
    public static void main(String[] args) {
        Person p2 = new Person("dorin ", "dorin@yahoo.com");
        System.out.println(p2.getName());
        System.out.println(p2.getEmail());

    }
}

