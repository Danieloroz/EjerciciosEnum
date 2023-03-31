package Ejemplo7;

import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println("List: " + numeros);

        int numero = numeros.get(2);
        System.out.println("Elemento accedido: " + numero);

        // Remove element from the list
        int numeroRemovido = numeros.remove(1);
        System.out.println("Elemento removido: " + numeroRemovido);
    }
}
