package doce;
import java.util.Hashtable;
import java.util.Enumeration;
import javax.swing.JOptionPane;
public class TercerEjercicio {
	public static void main(String[] args) {
        
        Hashtable<String, Integer> students = new Hashtable<String, Integer>();
        
        for (int i = 0; i < 3; i++) {
            String name = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
            Integer grade = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación de " + name));
            students.put(name, grade);
        }
  
        displayGrades(students);
    }

    private static void displayGrades(Hashtable<String, Integer> students) {
        Enumeration<String> keys = students.keys();
        while (keys.hasMoreElements()) {
            String name = keys.nextElement();
            Integer grade = students.get(name);
            System.out.println("Estudiante: " + name + ", Calificación: " + grade);
        }
    }
}

