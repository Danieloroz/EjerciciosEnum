package Ejemplo3;

public enum Nivel {
    ALTO (3),
    MEDIO (2),
    BAJO (1);
    private final int codigoNivel;
    Nivel(int codigoNivel) {
        this.codigoNivel = codigoNivel;
    }
    public int getCodigoNivel() {
        return this.codigoNivel;
    }
}
class Main {
    public static void main(String[] args) {
        Nivel nivel = Nivel.ALTO;

        System.out.println(nivel.getCodigoNivel());
    }
}
