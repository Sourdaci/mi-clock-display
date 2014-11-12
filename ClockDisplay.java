
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas, minutos;
    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }
    
    //Mostrar la hora del reloj
    public void getDisplayValue(){
        int tempHoras = horas.getValor();
        int tempMinutos = minutos.getValor();
        System.out.println(String.format("%02d",tempHoras) + ":" + String.format("%02d",tempMinutos));
    }
}
