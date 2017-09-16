
package menu;



import java.math.*;

public class congruencial {


    private BigInteger xn=new BigInteger("0"); //semilla 
    private final BigInteger a  = new BigInteger("1103515245"); //Multiplicador
    private final BigInteger m = new BigInteger("2").pow(32); //Modulo
    private final BigInteger c  = new BigInteger("12345"); //Constante aditiva

    private int precision = 5;

    
    public congruencial(){} 

    public BigInteger getXn() {
        return xn;
    }

    public void setXn(BigInteger xn) {
        this.xn = xn;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }   

    
    public BigDecimal next()
    {           
       
        xn = ((xn.multiply(a)).add(c)).mod(m);        
        BigDecimal x  = new BigDecimal( xn.floatValue() / m.floatValue() ).setScale( precision, BigDecimal.ROUND_HALF_UP);        
        return  x;
    }

}

