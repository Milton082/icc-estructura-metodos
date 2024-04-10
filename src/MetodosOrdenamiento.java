public class MetodosOrdenamiento {

    // 1. Metodo que devuelve un arreglo
    // de enteros por metodo Burbuja

    public int[] sortByBubble(int[] arreglo) {
        int tamano = arreglo.length;
        for (int i = 0; i < tamano; i++) {
            System.out.println();

            for (int j = i + 1; j < tamano; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    System.out.print("");
                }
            }

        }
        return arreglo;
    }

    // 2. Metodo que devuelve un arreglo de
    // enteros ordenados por Seleccion

    // 3. Metodo que devuelve un arreglo de
    // enteros ordenados por Inserccion

    // 4. Metodo que imprime un arreglo

    public void imprime(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

    }

}
