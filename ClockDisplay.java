
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas, minutos;
    private String cadenaHora;
    
    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        getDisplayValue();
    }
    
    //Constructor ClockDisplay que pide hora
    public ClockDisplay(int nuevaHora, int nuevoMinuto){
        horas = new NumberDisplay(24, nuevaHora);
        minutos = new NumberDisplay(60, nuevoMinuto);
        getDisplayValue();
    }
    
    //Refresca en memoria la hora del reloj
    public void getDisplayValue(){
        cadenaHora = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    //Muestra la hora del reloj
    public String getTime()
    {
        return cadenaHora;
    }
    
    //Cambia la hora del reloj
    public void setTime(int nuevaHora, int nuevoMinuto){
        horas.setValue(nuevaHora);
        minutos.setValue(nuevoMinuto);
        horas.validar();
        minutos.validar();
        getDisplayValue();
    }
    
    //Muestra los valores almacenados en los NumberDisplay
    public void getValue(){
        System.out.println(horas.getValue() + " " + minutos.getValue());
    }
    
    //Aumenta la hora en 1 minuto
    public void timeTick(){
        minutos.increment();
        if(minutos.getValue() == 0){
            horas.increment();
        }
        getDisplayValue();
    }
}
