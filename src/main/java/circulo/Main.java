package circulo;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * Método main de la aplicación
 * @see Circulito
 * @author Angel David Garrido González
 * @version V1.2 31/05/2022
 */
public class Main {
    public static void main(String[] args) {
        Circulito circulo = new Circulito(37,43,2.5);
        String salida =
                "La coordenada X es "+circulo.getCoordenadaX()+
                "\nLa coordenada Y es "+circulo.getCoordenadaY()+
                "\nEl radio es "+circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.setRadio(4.2);
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.ObtenerAreaCirculo());
        System.out.println(salida);
    }

}
