package principal;

import java.util.Scanner;

public class principal {

    Scanner teclado = new Scanner(System.in);

    public void mostrarMenu(){

        int opcion = -1;

        while(opcion != 0){

            System.out.println("""
            ===== LITERALURA =====
            1 - Buscar libro por titulo
            2 - Listar libros
            3 - Listar autores
            4 - Listar autores vivos en un año
            5 - Listar libros por idioma
            0 - Salir
            """);

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion){

                case 1:
                    buscarLibro();
                    break;

                case 2:
                    System.out.println("Lista de libros...");
                    break;

                case 3:
                    System.out.println("Lista de autores...");
                    break;

                case 4:
                    System.out.println("Autores vivos...");
                    break;

                case 5:
                    System.out.println("Libros por idioma...");
                    break;
            }
        }
    }

    private void buscarLibro(){

        System.out.println("Escribe el nombre del libro:");

        String nombreLibro = teclado.nextLine();

        String url = "https://gutendex.com/books/?search=" + nombreLibro.replace(" ", "%20");

        System.out.println("Consultando API:");
        System.out.println(url);
    }
}