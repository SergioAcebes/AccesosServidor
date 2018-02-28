import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Administrador del servidor en el que se almacenan los acessos.
 *
 * @SergioAcebes
 * @23/02/2018
 */
public class AnalizadorAccesosAServidor
{
    HashMap<Integer, ArrayList<Acceso>> registro;
    /**
     * Constructor de la clase AnalizadorAccesosAServidor.
     */
    public  AnalizadorAccesosAServidor()
    {
        registro = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void analizarArchivoDeLog(String nombreArchivo)
    {
        try{
            File entradas = new File(nombreArchivo);
            Scanner sc = new Scanner(entradas);
            while (sc.hasNextLine()) {  
                System.out.println(sc.nextLine());
                String[] copia = sc.nextLine().split(" ");
                int dia = Integer.parseInt(copia[0]);
                int mes = Integer.parseInt(copia[1]);
                int ano = Integer.parseInt(copia[2]);
                int hora = Integer.parseInt(copia[3]); 
                int minuto = Integer.parseInt(copia[4]);
                Acceso acceso = new Acceso(dia, mes, ano, hora, minuto);
                if(registro.containsKey(hora)) {
                    registro.get(hora).add(acceso);
                }
                else {
                    ArrayList<Acceso> lista = new ArrayList<>();
                    lista.add(acceso);
                    registro.put(hora, lista);
                }
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
    
    /**
     *Metodo que comprueba la hora con mas accesos del dia. 
     */
    public int obtenerHoraMasAccesos(){
        int numAccesos = 0;
        int horaMasAccesos = -1;
        if(!registro.isEmpty()){
            for(ArrayList<Acceso> comprobacionAccesos : registro.values()){
                if(comprobacionAccesos.get(0).getHora() > horaMasAccesos && comprobacionAccesos.size()>=numAccesos){
                    numAccesos = comprobacionAccesos.size();
                    horaMasAccesos = comprobacionAccesos.get(0).getHora();
                }
            }
        }
        else{
            System.out.println("Todavia no ha habido acessos");
        }
        return horaMasAccesos;
    }
    
}
