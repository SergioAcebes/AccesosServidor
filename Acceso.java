
/**
 * Controlador de accesos al servidor.
 *
 * @SergioAcebes
 * @23/02/2018
 */
public class Acceso
{
    // instance variables - replace the example below with your own
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;

    /**
     * Constructor de objetos de la clase objeto.
     * @param ano - introducir año.
     * @param mes - introducir mes.
     * @param dia - introducir dia.
     * @param hora - introducir hora.
     * @param minuto - introducir minuto.
     */
    public Acceso(int ano,int mes,int dia,int hora,int minuto)
    {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
    }

    /**
     * Devuelve el año.
     */
    public int getAno(){
        return ano;
    }

    /**
     * Devuelve el mes.
     */
    public int getMes(){
        return mes;
    }

    /**
     * Devuelve el dia.
     */
    public int getDia(){
        return dia;
    }

    /**
     * Devuelve la hora.
     */
    public int getHora(){
        return hora;
    }

    /**
     * Devuelve los minutos.
     */
    public int getMinuto(){
        return minuto;
    }

    
}
