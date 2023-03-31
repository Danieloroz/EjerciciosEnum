package Ejemplo5;

enum Tamano {
    PEQUENA("El tamaño es pequeña"),
    MEDIANA("El tamaño es mediana"),
    GRANDE("El tamaño es grande"),
    EXTRAGRANDE("El tamaño es extragrande");

    private final String tamanoPizza;
    private Tamano(String tamanoPizza) {
        this.tamanoPizza = tamanoPizza;
    }

    public String getTamano() {
        return tamanoPizza;
    }
}

class Main {
    public static void main(String[] args) {
        Tamano tamano = Tamano.EXTRAGRANDE;
        System.out.println(tamano.getTamano());
    }
}

