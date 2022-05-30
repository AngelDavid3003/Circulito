package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author Angel David Garrido González
 * @version 1.1 31/05/2022
 */
public class Circulito {
    /**
     * Límite inferior del tamaño del radio
     */
    private static final double LIMITERADIO = 0.0; 
    /**
     * Representa el valor de la coordenada x del centro del círculo
     */
    private int coordenadaX;
    /**
     * Representa el valor de la coordenada y del centro del círculo
     */
    private int coordenadaY;
    /**
     * Representa el valor de longitud del radio del círculo
     */
    private double radio;
    
    /**
     * Constructor vacío
     */
    public Circulito() {
    }
    /**
     * Constructor con parámetros
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
    }
    /**
     * Método para la obtención del diámetro
     * @return valor del diámetro  
     */
    public double obtenerDiametro() {
        return getRadio() * 2;
    }
    /**
     * Método para la obtención de la circunferencia
     * @return valor de la circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }
    /**
     * Método para la obtención del área del círculo
     * @return valor del área del círculo
     */
    public double ObtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }
    /**
     * Información de las características del círculo
     * @return string informativo
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
    /**
     * Método para trasladar el centro de la circunferencia
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}
