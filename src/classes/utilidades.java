
package classes;

public class utilidades {
    
    public static boolean isNumeric(String numero){
        
            try {
                    Integer.parseInt(numero);
                    return true;
                    
        } catch (NumberFormatException nfe) {
            
                return false;
        }
    }
    
}
