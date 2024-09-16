 public class main{


    public static void main(String[] args){
        Person p = new Person("Asif",28,"M");
        System.out.println(p.getName() +" : "+p.getAge()+" : "+p.getGender());

        Person p1=new Person("khalid",5,"NA");
        System.out.println(p1.getName()+" : "+p1.getAge()+" : "+p1.getGender());

        Person p2=new Person("saad");
        System.out.println(p2.getName());
        p2.setage(28);
        System.out.println(p2.getName()+" : "+p2.getAge());
    }
}




 /*public class main {
     // Attributes
     private String name;
     private int age;
     private String gender;

     // Constructor to initialize all attributes
     public Person(String name, int age, String gender) {
         this.name = name;
         this.age = age;
         this.gender = gender;
     }

     // Overloaded constructor with default gender
     public Person(String name, int age) {
         this(name, age, "NA"); // Calls the other constructor with a default gender
     }

     // Getter for name
     public String getName() {
         return name;
     }

     // Getter for age
     public int getAge() {
         return age;
     }

     // Setter for age
     public void setAge(int age) {
         this.age = age;
     }

     // Getter for gender
     public String getGender() {
         return gender;
     }

     // Method to display person's details
     public void displayInfo() {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Gender: " + gender);
     }

     public static void main(String[] args) {
         // Example usage with all attributes
         Person person1 = new Person("Alice", 30, "Female");
         person1.displayInfo();

         // Example usage with default gender
         Person person2 = new Person("Bob", 25);
         person2.displayInfo();


         // Update age
         person2.setAge(26);
         person2.displayInfo();
     }
 }*/