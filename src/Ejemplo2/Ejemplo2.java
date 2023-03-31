package Ejemplo2;

public class Ejemplo2 {
    Dia dia;

    public Ejemplo2(Dia dia) {
        this.dia = dia;
    }

    public void describir() {
        switch (dia) {
            case LUNES:
                System.out.println("Los lunes son de pereza");
                break;

            case VIERNES:
                System.out.println("El viernes es para salir");
                break;

            case SABADO: case DOMINGO:
                System.out.println("Los fines de semana son para descansar");
                break;

            default:
                System.out.println("Entre semana es aburrido");
                break;
        }
    }
}

