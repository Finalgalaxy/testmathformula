
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Alternative formula: n^2 = ( n - 200 )^2 + [ 4 x 10^2 ( n - 100 ) ]
		System.out.println("Hello world, Long max value = "+Long.MAX_VALUE);
		long value=0;
		long correct_value=0;
		for(long n=0;n<Long.MAX_VALUE;n++){
			//value=(long) (Math.pow((n-200), 2) + ( 400L * (n-100L)       ));
			value=(long) ((n-250)*1000 + Math.pow((n-500), 2));
			correct_value=(long) Math.pow(n, 2);
			if(value != correct_value){
				System.out.println("Errore, n valeva: "+n+". N-100 fa: "+(n-100)+". Moltiplicazione: "+( 400L * (n-100L)       )+". Nativamente fa "+correct_value+", la formula calcola: "+value+", la differenza è: "+(correct_value-value));
				break;
			}
			//System.out.println("La formula, con n equivalente a "+n+" vale:  "+value);
		}
	}

}
