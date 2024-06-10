public class Cat {
  
  private String name;
  private int age;

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public String describe(String x) {
    return "The age of this cat is " + this.age + ", and name of this cat is "
    + this.name + " " + x;
  }

  // static method
  public static String hello() {
    return "hello";
  }
  
  public static String hello(String s) {
    return s + "!!!";
  }

  public static void main(String[] args) {
    
    System.out.println(Cat.hello());
    System.out.println(Cat.hello("goodbye"));
    //System.out.println(Book.hello());
    System.out.println(3);

    Cat cat = new Cat();
    cat.setAge(13);
    cat.setName("ABC");
    System.out.println(cat.describe("."));


  }
 }

