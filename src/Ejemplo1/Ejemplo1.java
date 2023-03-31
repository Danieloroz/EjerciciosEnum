package Ejemplo1;

public class Ejemplo1 {
    enum Season{ VERANO, INVIERNO, OTOÑO, PRIMAVERA}
    public static void main(String args[]){
        Season season = Season.VERANO;

        switch(season){
            case VERANO:
                System.out.println("En verano hace calor");
                break;
            case INVIERNO:
                System.out.println("Deberías abrigarte");
                break;
            default:
                System.out.println("Alguna otra estación del año");
        }
    }
}
