
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
        System.out.println(horas.getDisplayValue() + ":" + minutos.getDisplayValue());
    }
    
    //Cambia la hora del reloj
    public void setValue(int nuevaHora, int nuevoMinuto){
        horas.setValue(nuevaHora);
        minutos.setValue(nuevoMinuto);
    }
    
    //Muestra los valores almacenados en los NumberDisplay
    public void getValue(){
        System.out.println(horas.getValor() + " " + minutos.getValor());
    }
    
    //Aumenta la hora en 1 minuto
    public void increment(){
        minutos.increment();
        if(minutos.getValor() == 0){
            horas.increment();
        }
    }
}
