import java.util.Scanner;

public class MainPaciente {

    
    public static void main(String[] args) {
        
        Scanner op1 = new Scanner(System.in);

        System.out.println("introduce tu nombre");
        String nombre = op1 .next();
        System.out.println("ingresa tu apellido");
        String apellido = op1 .next();
        System.out.println("introduce tu edad");
        int edad = op1 .nextInt();
        System.out.println("introduce tu estatura");
        double estatura = op1.nextInt();
        Paciente paciente1 = new Paciente();
        paciente1.nombre = nombre;
        paciente1.apellido = apellido;
        paciente1.edad = edad;
        paciente1. estatura = estatura;
        paciente1.mostrarNombre();
        paciente1.mostrarApellido();
        paciente1.mostrarEdad();
        paciente1.mostrarEstatura();





    }
    
}

