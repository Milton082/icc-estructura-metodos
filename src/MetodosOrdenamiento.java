public class MetodosOrdenamiento {

    // 1. Metodo que devuelve un arreglo
    // de enteros por metodo Burbuja

    public int[] sortByBubble(int[] arreglo, boolean logs) {
        int tamano = arreglo.length;
        for (int i = 0; i < tamano; i++) {
            if (logs) {
                System.out.println("\nPasado numero " + i);
            }

            for (int j = i + 1; j < tamano; j++) {
                if (logs) {
                    System.out.println("i= " + arreglo[i] + " j= " + arreglo[j]);
                }
                if (arreglo[i] > arreglo[j]) {
                    System.out.println(" - Si es mayor asi que cambio ");
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                    if (logs) {
                        System.out.print("");
                        imprime(arreglo);
                    }
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
