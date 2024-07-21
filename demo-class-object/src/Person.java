public class Person {
  
  // Private attributes
  private String name;
  private int age;

  // constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter
  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  // Setter
  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age; 
  }

  public String toString() {
    return "Person(" + "Name : " + this.name //
            + " Age: " + this.age // 
            + ")";
  }

  // Main method
  public static void main(String[] args) {
  
  // Create new object
  Person person = new Person ("Alice", 30);

  System.out.println("Name: " + person.getName());
  System.out.println("Age: " + person.getAge());

  Person person2 = new Person ("Peter", 56);
  System.out.println("Name: " + person2.getName());
  System.out.println("Age: " + person2.getAge());

  person.setName("Mary");
  person2.setName("Calvin");
  person.setAge(60);
  person2.setAge(12);

  System.out.println("Name: " + person.getName());
  System.out.println("Age: " + person.getAge());
  System.out.println("Name: " + person2.getName());
  System.out.println("Age: " + person2.getAge());

  System.out.println(person.toString());
  System.out.println(person2.toString());
  }
}
