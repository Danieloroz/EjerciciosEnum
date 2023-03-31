package Ejemplo2;

public enum Dia {
        LUNES, MARTES, MIERCOLES, JUEVES,
        VIERNES, SABADO, DOMINGO
}

class Main{
    public static void main(String[] args) {
        Ejemplo2 primerDia = new Ejemplo2(Dia.LUNES);
        primerDia.describir();
        Ejemplo2 tercerDia = new Ejemplo2(Dia.MIERCOLES);
        tercerDia.describir();
        Ejemplo2 quintoDia = new Ejemplo2(Dia.VIERNES);
        quintoDia.describir();
        Ejemplo2 sextoDia = new Ejemplo2(Dia.SABADO);
        sextoDia.describir();
        Ejemplo2 septimoDia = new Ejemplo2(Dia.DOMINGO);
        septimoDia.describir();
    }
}
