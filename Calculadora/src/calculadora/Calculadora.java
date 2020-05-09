/*
 *Hola Mundo
 */
package calculadora;

/**
 *
 * @author redes
 * @version version 3.0 github
 * @since 09/05/2020
 * 
 */
public class Calculadora {
    private int num1;
    private int num2;
    /**
     * 
     * @param a
     * @param b 
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    /**
     * 
     * @return resultado de la suma
     */
    
    public int suma(){
        int result=num1+num2;
        return result;
    }
    /**
     * 
     * @return resultado de la resta
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    /**
     * 
     * @return 
     */    
    public boolean resta2(){
        return num1 > num2;
    }
    /**
     * 
     * @return resultado de la multiplicacion
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    /**
     * 
     * @return resultado de la division
     * @deprecated por divide2
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    /**
     * 
     * @return resultado de la division
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
    /**
     * 
     * @return result
     * @exception java.lang.ArithmeticException si divide por 0
     */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
}
