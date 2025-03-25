public class Main {
    public static void main(String[] args) throws Exception {
        
        // This is an instance of the Book class
        Book book1 = new Book();

        System.out.println("Titulo: " + book1.titulo);
        System.out.println("Autor: " + book1.autor);
        System.out.println("Genero: " + book1.genero);
        System.out.println("Paginas: " + book1.numPaginas);
    }
}


// Important
// We don't need to import the Book class because it is in the same package