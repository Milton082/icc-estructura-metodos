import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        int opcion;
        int[] arregloNumeros = new int[0];

        do {
            System.out.println("\nMenu Principal");
            System.out.println("1. Ingrese una arreglo");
            System.out.println("2. Ordenar Arreglo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño de su arreglo");
                    int tamano = scanner.nextInt();
                    arregloNumeros = new int[tamano];
                    for (int i = 0; i < arregloNumeros.length; i++) {
                        System.out.println("Ingrese el valor para " + (i + 1) + ": ");
                        arregloNumeros[i] = scanner.nextInt();
                    }
                    metodos.imprime(arregloNumeros);

                    break;
                case 2:
                    mostrarSubMenuMetodos(scanner, metodos, arregloNumeros);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...\nAdios");
                    break;

                default:
                    System.out.println("Opcion no valida. Repita.");
            }

        } while (opcion != 0);

    }

    public static void mostrarSubMenuMetodos(Scanner scanner, MetodosOrdenamiento metodos, int[] arreglo) {
        int opcionMetodo;
        do {
            System.out.println("\nEscoja un metodo de ordenamiento");
            System.out.println("1. Mretodo burbuja");
            System.out.println("2. Mretodo Seleccion");
            System.out.println("3. Mretodo Inserccion");
            System.out.println("0. Regresar al menu principal");
            opcionMetodo = scanner.nextInt();

            switch (opcionMetodo) {
                case 1:
                    //Ingrese A -> Para logs y B -> sin Logs
                    //String opcionLon
                    //boolean cond
                    //if opcionLog.equals (A) -> true
                    //else cond -> false
                    //metodos.sortByBubble(arreglo , cond);

                    String opcion = scanner.nextLine();
                    boolean cond;
                    if (opcion.equals("A")){
                        cond = true;

                    } else{
                        cond = false;
                    }
                    int [] arregloOrdenado = metodos.sortByBubble(arreglo, false);
                    metodos.imprime(arregloOrdenado);



                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }

        } while (opcionMetodo != 0);

    }
}
