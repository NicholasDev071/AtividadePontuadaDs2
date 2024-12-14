import java.util.Scanner;


public class Positivo2 {

	public static void main(String[] args) {  

    Scanner sc = new Scanner (System.in);  
    int entry;
      
     
    do{
        System.out.println("Digite um numero inteiro ! \n");
        entry = sc.nextInt();
        if(entry > 0 ){
            System.out.println("Voce digitou um numero positivo ! \n");

        }else if (entry < 0) {
            System.out.println("Voce digitou um numero negativo ! \n");
        }else{
            System.out.println("Operação encerrada");
        }

    }while(entry != 0);

    }  
}