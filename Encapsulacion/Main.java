package Encapsulacion;

public class Main {
    // create an object
    Person ingeniero = new Person(); 
    //setter
    ingeniero.setAge(32);
    // getter
    String age = ingeniero.getAge();
    ingeniero.setAge("Vittorio"); 
    String name = ingeniero.getName();
    ingeniero.setAge(97645247); 
    String phone = ingeniero.getPhone();

    System.out.println(ingeniero.age);
    System.out.println(ingeniero.name);
    System.out.println(ingeniero.phone);

}

class Person {
    private int age; 
    private String name; 
    private int phone; 

    //setters
    public void setAge(int valorParam){
        this.age = valorParam; 
    }
    public void setName(String valorParam){
        this.name = valorParam; 
    }
    public void setPhone(int valorParam){
        this.phone = valorParam; 
    }

    //getters
    public int  getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public int getPhone() {
        return this.phone;
    }
}