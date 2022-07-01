package tema9;

public class Main {
    
    public static void main(String[] args) {

        Client client = new Client();
        client.age = 30;
        client.phone = 675987612;
        client.name = "Antonio";
        client.credit = 1000; 

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 5000; 
    }
    
}

class Person{
    int age;
    String name; 
    int phone; 
}

class Client extends Person {
    
    int credit; 
    
}

class Trabajador extends Person{
    int salario; 
}

// Crea una clase Persona con las siguientes variables:La edad-El nombre-El teléfono

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.