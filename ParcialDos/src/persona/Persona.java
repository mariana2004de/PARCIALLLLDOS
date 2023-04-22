package persona;
import java.util.Random;

public class Persona {
    

    private final String nombre;
    private final int edad;
    private final char sexo;
    private double peso;
    private double altura;
    private final String DNI;

    private static final char SEXO_POR_DEFECTO = 'H';
    private static final double PESO_BAJO = -1;
    private static final double PESO_IDEAL_MIN = 20;
    private static final double PESO_IDEAL_MAX = 25;
    private static final double SOBREPESO = 1;
    

    public Persona() {
        this("", 0, SEXO_POR_DEFECTO, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }
    
    public double calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < PESO_IDEAL_MIN) {
            return PESO_BAJO;
        } else if (imc >= PESO_IDEAL_MIN && imc <= PESO_IDEAL_MAX) {
            return 0;
        } else {
            return SOBREPESO;
        }
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m\n" +
                "DNI: " + DNI + "\n";
    }
    
    private char comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            return SEXO_POR_DEFECTO;
        } else {
            return sexo;
        }
    }
    
    private String generaDNI() {
        Random random = new Random();
        int dniNum = random.nextInt(100000000);
        char dniLetra = calcularLetraDNI(dniNum);
        return Integer.toString(dniNum) + dniLetra;
    }
    
    private char calcularLetraDNI(int dniNum) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dniNum % 23;
        return letrasDNI.charAt(resto);
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
}


