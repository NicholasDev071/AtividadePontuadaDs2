import java.util.Scanner;


public class Maior {

	public static void main(String[] args) {  

    Scanner sc = new Scanner (System.in);  
     
     int i=0; int j=0;
     System.out.println(" Defina a quantidade de numeros inteiros que serão digitados : ");   
     int tam = sc.nextInt();
     int valor[] = new int[tam];
     int maior = valor[0], menor=Integer.MAX_VALUE; 


    while(i<valor.length){  
        System.out.print("Digite o " +(i+1)+"º valor: ");  
        valor[i] = sc.nextInt();  
        System.out.println();
        while(valor[i]<0){
            System.out.println(" Programa encerrado! \n");
            break;
        }

        if(valor[i] > maior){   
            maior = valor[i];  
        
        }  
        i++;
        
       
          if(valor[j] < menor){  
            menor = valor[j];  
            }
            j++;  
        }
        System.out.println("Maior valor digitado foi = "+ maior);  
        System.out.println("Menor valor digitado foi = "+ menor + "\n");  
    
    } 
     
   
} 
  