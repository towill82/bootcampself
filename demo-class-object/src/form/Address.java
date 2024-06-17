package form;

public class Address {
  
  private String line1;
  private String line2;
  private String line3;

  public Address(String line1, String line2, String line3) {
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }

  public String getline1(){
    return this.line1;
  }

  public String getline2(){
    return this.line2;
  }

  public String getline3(){
    return this.line3;
  }

  public void setLine1(String line1){
    this.line1 = line1;
  }

  public void setLine2(String line2){
    this.line2 = line2;
  }

  public void setLine3(String line3){
    this.line3 = line3;
  }

  public String toString() {
    return "Address(" //
        + "line1=" + this.line1 //
        + ", line2=" + this.line2 //
        + ", line3=" + this.line3 //
        + ")";
  }

  public static void main(String[] args) {
    Address address = new Address("abc", "ijk", "def");
    Form form = new Form("Vincent", "Lau", address);

    System.out.println(form);
    System.out.println(form.getAddress()); 
    System.out.println(form.getAddress().getLine2());
  }

}
