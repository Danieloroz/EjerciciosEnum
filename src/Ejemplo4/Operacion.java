package Ejemplo4;

public enum Operacion {
    SUMA,
    RESTA,
    MULTIPLICACION,
    DIVISION;

    double calcular(double x, double y) {
        switch (this) {
            case SUMA:
                return x + y;
            case RESTA:
                return x - y;
            case MULTIPLICACION:
                return x * y;
            case DIVISION:
                return x / y;
            default:
                throw new AssertionError("Operaciones desconocidas " + this);
        }
    }
}
