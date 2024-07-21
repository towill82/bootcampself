public class Cat {
  private String name;
  private int age;
  
  // setter
  // void is a return type, requires return nothting.
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // getter
  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  // instance method
  public String describe (String x) {
    return "The age of this cat is " + this.age + " , and name of this cat is "
            + this.name + " " + x;
  }

  // static method
  public static String hello() {
    return "hello";
  }

  public static String hello(String s) {
    return s + "!!!";
  }

  public boolean isTooOld() {
    return this.age > 10;
  }

  public static void main(String[] args) {
    System.out.println(Cat.hello());
    System.out.println(Cat.hello("goodbye"));
    System.out.println(Book.hello());

    System.out.println(3);

    Cat cat = new Cat();
    cat.setAge(13);
    cat.setName("ABC");

    System.out.println(cat.describe("."));

  }
  
}


