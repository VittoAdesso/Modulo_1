package Tema4_estructuraControl;

public class Main {
  public static void main(String[] args){
    int numIf = 50;
        if( numIf == 0) {
            System.out.println("NumIf es igual a 0");
        } else if ( numIf > 0 ){
            System.out.println("NumIf es positivo");
        }
        else if ( numIf < 0) {
            System.out.println("NumIf es negativo");
        }
  }
}