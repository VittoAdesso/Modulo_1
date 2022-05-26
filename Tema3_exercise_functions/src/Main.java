public class Main {

    public static void main(String[] args) {
        var result = sum(1,4,5);

        Car myCar = new Car();
        myCar.addDoor();

        System.out.println(result);
        System.out.println(myCar.door);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Car {
    public int door = 4;

    public void addDoor(){
        this.door++;
    }
}