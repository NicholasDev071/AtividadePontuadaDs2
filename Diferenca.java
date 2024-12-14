import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {  
	int r;    

    Scanner sc = new Scanner (System.in);
    System.out.println("Digite o Primeiro Numero: ");
    int A = sc.nextInt();
    System.out.println("Digite o Segundo Numero: ");
    int B = sc.nextInt();
    
    
if(A>B){
   
 r = A - B ;
   System.out.println("A diferença entre o primeiro e o segundo numero é = "+ r);  
     
}
if(B>A){
    r = B - A;
     System.out.println("A diferença entre o primeiro e o segundo numero é = "+ r);  
     
}
    
}  
}

