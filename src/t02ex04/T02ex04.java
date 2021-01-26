/*
 * Floatin : Part B
 */
package t02ex04;

/**
 * @author rodo
 */
public class T02ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero se realiza la operación y luego se crea y asigna a la variable
        // Podemos forzar una variable a que se comporte como otra con casting
               
        int iNum1 = 5/4;
        float fNum1 = 5/4f;
        double dNum1 = 5/4;
        
        int iNum2 = 5/4;
        float fNum2 = 5/4;
        double dNum2 = 5/4;
        
        int iNum3 = 5/4;
        float fNum3 = 5/4;
        double dNum3 = 5/4;
        iNum3 = (int)fNum3;
        
        System.out.println(iNum3);
        
    }
    
}
