package doce;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Aplicacion3 {
	   public static void main(String[] args) {
	        Aplicacion3 miAplicacion3 = new Aplicacion3();
	        miAplicacion3.iniciar();
	   } 
	        private void iniciar() {
	            Hashtable<Integer, String> tablaNombres = new Hashtable<Integer, String>();

	            for (int i = 0; i < 5; i++) {
	            	Integer key=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Clave"));
	            	String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
	            	tablaNombres.put(key, nombre); 
	    		}
	            
	            recorrerTablaHash(tablaNombres);
	            
	        }

	    	private void recorrerTablaHash(Hashtable<Integer, String> tabla) {
	    		Enumeration<Integer>enumerationKeys=tabla.keys();
	    		Enumeration<String>enumeration=tabla.elements();
	    		while (enumeration.hasMoreElements()) {
	    			System.out.println(enumerationKeys.nextElement()+ "-"+enumeration.nextElement());
	    		}
	    	
	    	}
	    }

	            
//	            System.out.println(tablaNombres );
//	            
//	            if (tablaNombres.containsValue("Mariana")) {
//	            	System.out.println("Si Existe");
//	    		}else {
//	    			System.out.println("No Existe");
//	    		}
//	            
//	            
//	            
//	            System.out.println(tablaNombres.get(123));
//	            System.out.println(tablaNombres.size());
	    
