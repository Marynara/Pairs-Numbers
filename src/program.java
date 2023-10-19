import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n, qtdpares;
		
		System.out.print("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
	    int [] vet =new int [n];
	    
	    for (int i=0; i<n; i++) {
	    System.out.print("Digite um numero:");
	    vet [i] =sc.nextInt();
	    }
	    
	    System.out.println ("Numeros pares:");
	    qtdpares = 0;
	    for (int i=0; i<n; i++) {
	    	if (vet [i]%2==0) {
	    		System.out.printf("%d ", vet[i]);
	    		qtdpares++;
	    	}
	    }
        System.out.printf("quantidades de pares = %d\n", qtdpares);

         sc.close();
	}

}
