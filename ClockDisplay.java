
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
    
    //Cambia la hora del reloj
    public void setValue(int nuevaHora, int nuevoMinuto){
        horas.setValue(nuevaHora);
        minutos.setValue(nuevoMinuto);
    }
    
    //Muestra los valores almacenados en los NumberDisplay
    public void getValue(){
        System.out.println(horas.getValor() + " " + minutos.getValor());
    }
}
