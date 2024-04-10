public class App {
    public static void main(String[] args) throws Exception {

        // Crear la instancia de la (clase u objetos) Metodos Ordemaniento
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();

        int[] numeros = { 30, 7, 12, 5 };
        metodosOrdenamiento.imprime(numeros);

        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(numeros);
        metodosOrdenamiento.imprime(arregloOrdenado);
    }
}
