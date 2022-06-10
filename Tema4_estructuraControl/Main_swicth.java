package Tema4_estructuraControl;

public class Main_swicth {
    public static void main_swicth(String[] args) {
        String estacion = "invierno";
        
        switch(estacion){

            case "otoño": 
            System.out.println("Es otoño");
            break;
            case "invierno": 
            System.out.println("Es invierno");
            break;
                case "verano": 
            System.out.println("Es verano");
            break;
                case "primavera": 
            System.out.println("Es primavera");
            break;
            
        default:
        System.out.println("Prueba otra estación");
        }  
    }
}
