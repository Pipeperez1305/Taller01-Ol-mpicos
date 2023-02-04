package uniandes.dpoo.taller0.modificacion;
import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
public class Modificacion
{	
	/**
	 * Este es el método principal de la aplicación, con el que inicia la ejecución
	 * de la aplicación
	 * Así mismo, este método nos permite cargar el archivo csv con la informacion de los atletas y conocer el pais con más medallas 
	 * 
	 * @param args Parámetros introducidos en la línea de comandos al invocar la
	 *             aplicación.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("Hola, mundo!");
		System.out.println("                                                            ");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println("Cargando archivo .............");
		System.out.println("                                                            ");
		System.out.println("El país con mas medallistas es "+ calc.paisConMasMedallistas().keySet()+" con "+calc.paisConMasMedallistas().values()+" medallas.");
	}

}