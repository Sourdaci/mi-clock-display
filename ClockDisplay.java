
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas, minutos;
    private NumberDisplay dia, mes, year;
    private String cadenaHora;
    
    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new NumberDisplay(31, 1);
        mes = new NumberDisplay(13, 1);
        year = new NumberDisplay(100);
        getDisplayValue();
    }
    
    //Constructor ClockDisplay que pide hora y fecha
    public ClockDisplay(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoYear){
        horas = new NumberDisplay(24, nuevaHora);
        minutos = new NumberDisplay(60, nuevoMinuto);
        dia = new NumberDisplay(31, nuevoDia);
        if (dia.getValue() == 0){
            dia.setValue(1);
        }
        mes = new NumberDisplay(13, nuevoMes);
        if (mes.getValue() == 0){
            mes.setValue(1);
        }
        year = new NumberDisplay(100, nuevoYear);
        getDisplayValue();
    }
    
    /**
    //Refresca en memoria la hora del reloj en formato 24H
    private void getDisplayValue(){
        cadenaHora = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    */
    
    //Refresca en memoria la hora del reloj en formato 12H
    private void getDisplayValue(){
		String aM = " A.M.";
		int controlHora = horas.getValue();
        if (controlHora == 0){
            cadenaHora = "12:" + minutos.getDisplayValue() + aM;
        }else if (controlHora < 12){
            cadenaHora = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + aM;
        }else{
			String pM = " P.M.";
			if (controlHora == 12){
				cadenaHora = "12:" + minutos.getDisplayValue() + pM;
			}else{
				cadenaHora = String.format("%02d",(controlHora - 12))+ ":" + minutos.getDisplayValue() + pM;
			}
        }
        cadenaHora += " - " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + year.getDisplayValue();
    }
   
    //Muestra la hora
    public String getTime(){
        return cadenaHora;
    }
    //Cambia la hora del reloj
    public void setTime(int nuevaHora, int nuevoMinuto, int nuevoDia, int nuevoMes, int nuevoYear){
        horas.setValue(nuevaHora);
        minutos.setValue(nuevoMinuto);
        horas.validar();
        minutos.validar();
        dia.setValue(nuevoDia);
        if (dia.getValue() == 0){
            dia.setValue(1);
        }
        mes.setValue(nuevoMes);
        if (mes.getValue() == 0){
            mes.setValue(1);
        }
        year.setValue(nuevoYear);
        getDisplayValue();
    }
    
    //Muestra los valores almacenados en los NumberDisplay
    public void getValue(){
        System.out.println(horas.getValue() + " " + minutos.getValue() + " - " + dia.getValue() + " " + mes.getValue() + " " + year.getValue());
    }
    
    //Aumenta la hora en 1 minuto
    public void timeTick(){
        minutos.increment();
        if(minutos.getValue() == 0){
            horas.increment();
            if(horas.getValue() == 0){
                dia.increment();
                if(dia.getValue() == 0){
                    dia.setValue(1);
                    mes.increment();
                    if(mes.getValue() == 0){
                        mes.setValue(1);
                        year.increment();
                    }
                }
            }
        }
        getDisplayValue();
    }
}
