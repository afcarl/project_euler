import java.math.*;
import java.util.*;

public class problem_three{

    public static List<BigInteger> primeFactors(BigInteger number){
	BigInteger n = number;
	List<BigInteger> factors = new ArrayList<BigInteger>();
	BigInteger j = new BigInteger(2);
	for(BigInteger i = j; i.compareTo(n) == -1 || i.compareTo(n) == 0; i.add(1)){
	    while(n.mod(i).equals(BigInteger.ZERO)){
		factors.add(i);
		n = n.divide(i);
	    }
	}
	return factors;
    }

    public static void main(String[] args){
	BigInteger j = new BigInteger(2);
	//System.out.println(primeFactors(new BigInteger(600851475143L)));
    }
}
