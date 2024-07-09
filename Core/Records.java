//TODO : nested records!

record Alien(int id, String name){

    private static final String DEFAULT_NAME = "John Doe";

//    Alien(int id, String name) {
//        if(id <= 0)
//            throw new IllegalArgumentException("The id should be greater than one.");
//        if(name.isEmpty()) {
//            throw new IllegalArgumentException("The id should be greater than one.");
//        }
//        this.id = id;
//        this.name = name;
//    }

    //Compact constructor
    public Alien{
        if(id <= 0)
            throw new IllegalArgumentException("The id should be greater than one.");
        if(name.isEmpty())
            throw new IllegalArgumentException("The name should be Not Empty.");
    }

    //we can use name default value if the name is empty
    public Alien(int id){
         this(id, DEFAULT_NAME);
    }
}

record Address(String city, String state, int pin){}

//Nested records
record Employee(int id, String name, Address address){}


public class Records {
    public static void main(String[] args) {
        Alien a1 = new Alien(10, "Sourav");
        Alien a2 = new Alien(121);

        System.out.println(a2);

        System.out.println(a1.name());
        System.out.println(a1);

        System.out.println(a1.equals(a2));

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        System.out.println(a1.name()+", "+a1.id());

        //Employee

        Employee emp = new Employee(101, "Sourav", new Address("Angul", "Odisha", 123456));

        System.out.println(emp);

        System.out.println(emp.name());
        System.out.println(emp.address());
        System.out.println(emp.address().pin());
    }
}
