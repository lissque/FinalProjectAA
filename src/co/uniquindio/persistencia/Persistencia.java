package co.uniquindio.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Luisa Cotte
 * @author Lissette Quebrada
 * @author Andres Cortes
 */
public class Persistencia {
	/**
	 * Metodo que permite serializar
	 * @param nombre del archivo
	 * @param objecto un {@link Object}
	 * @throws IOException exception
	 */
	public static void serializar (String nombre, Object objecto) throws IOException{
		ObjectOutputStream os = null;
		FileOutputStream fp = null;
		
		fp = new FileOutputStream(nombre);
		os = new ObjectOutputStream(fp);
		os.writeObject(objecto);
		os.flush();
		os.close();
	}
	
	/**
	 * Metodo que permite deserializar
	 * @param nombre del archivo
	 * @return Object
	 * @throws IOException exception
	 * @throws ClassNotFoundException exception
	 */
	public static Object deserializar (String nombre) throws IOException, ClassNotFoundException{
		ObjectInputStream oi;
		FileInputStream fi = null;
		Object obj = null;
		
		fi = new FileInputStream(nombre);
		oi = new ObjectInputStream(fi);
		obj = oi.readObject();
		oi.close();
		return obj;
	}
}
