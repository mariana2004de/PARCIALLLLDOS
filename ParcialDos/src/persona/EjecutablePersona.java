package persona;
import java.util.Scanner;

public class EjecutablePersona {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Primer objeto
	        System.out.println("Introduce el nombre:");
	        String nombre = sc.nextLine();
	        System.out.println("Introduce la edad:");
	        int edad = sc.nextInt();
	        System.out.println("Introduce el sexo (H/M):");
	        char sexo = sc.next().charAt(0);
	        System.out.println("Introduce el peso:");
	        double peso = sc.nextDouble();
	        System.out.println("Introduce la altura:");
	        double altura = sc.nextDouble();
	        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

	        // Segundo objeto
	        sc.nextLine();
	        System.out.println("Introduce el nombre:");
	        nombre = sc.nextLine();
	        System.out.println("Introduce la edad:");
	        edad = sc.nextInt();
	        System.out.println("Introduce el sexo (H/M):");
	        sexo = sc.next().charAt(0);
	        Persona persona2 = new Persona(nombre, edad, sexo);

	        // Tercer objeto
	        Persona persona3 = new Persona();
	        persona3.setNombre("Juan");
	        persona3.setEdad(25);
	        persona3.setSexo('H');
	        persona3.setPeso(80);
	        persona3.setAltura(1.75);

	        // Mostramos información
	        System.out.println("=== Información del primer objeto ===");
	        persona1.mostrarInformacion();
	        persona1.calcularIMC();
	        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());

	        System.out.println("=== Información del segundo objeto ===");
	        persona2.mostrarInformacion();
	        persona2.calcularIMC();
	        System.out.println("Es mayor de edad: " + persona2.esMayorDeEdad());

	        System.out.println("=== Información del tercer objeto ===");
	        persona3.mostrarInformacion();
	        persona3.calcularIMC();
	        System.out.println("Es mayor de edad: " + persona3.esMayorDeEdad());
	    }
	}

