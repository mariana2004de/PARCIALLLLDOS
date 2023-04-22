package libro;

public class Main {
	public static void main(String[] args) {
    Libro libro1 = new Libro("978-3-16-148410-0", "Los Hermanos ", "Fiodor Dostoievski", 824);
    Libro libro2 = new Libro("978-84-08-17465-8", "La Ilíada", "Homero", 468);
    
    System.out.println(libro1.toString());
    System.out.println(libro2.toString());

    if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
        System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas que el libro " + libro2.getTitulo());
    } else {
        System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas que el libro " + libro1.getTitulo());
    }
}


}
