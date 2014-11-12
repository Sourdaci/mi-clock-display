
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    private int valor, limite;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int nuevoLimite)
    {
        // initialise instance variables
        limite = nuevoLimite; //Recibe de ClockDisplay 24 para horas o 60 para minutos
        valor = 0;
    }

    /**
     * Devuelve el numero almacenado en "valor"
     */
    public int getValor()
    {
        return valor;
    }
}
