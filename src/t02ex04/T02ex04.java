/*
 * Floating : Part B
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
           
        //Probando al integer
        float fNum1 = 3.1415f;
        double dNum1 = 3.1415;
        int iNum1 = (int)fNum1;
        //int iNum1 = dNum1;
        System.out.println(iNum1);
        
        //Probando al float
        int iNum2 = 5/4;
        double dNum2 = 3.1415;
        //float fNum2 =iNum2;
        //float fNum2 = dNum2;
        //System.out.println(fNum2);
                       
        //Probando al double
        int iNum3 = 5;
        float fNum3 = 3.1415f;
        //double dNum3 = fNum3;
        //double dNum3 = iNum3;
        //System.out.println(dNum3); 
      
    }
    
}
