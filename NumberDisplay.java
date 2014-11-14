
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
    
    //Constructor que interpreta valor si no esta dentro de los limites
    public NumberDisplay(int nuevoLimite, int nuevoValor){
        limite = nuevoLimite;
        valor = nuevoValor;
        validar();
    }

    /**
     * Devuelve el numero almacenado en "valor"
     */
    public int getValor()
    {
        return valor;
    }
    
    public String getDisplayValue(){
        return String.format("%02d",valor);
    }
    
    //Cambia el numero almacenado en "valor"
    public void setValue(int nuevoValor){
        valor = nuevoValor;
    }
    
    //Suma 1 minuto al reloj
    public void increment(){
        valor += 1;
        validar();
    }
    
    //Valida los valores introducidos
    public void validar(){
        if (valor >= limite || valor < 0){
            valor = 0;
        }
    }
}
