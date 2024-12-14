import java.util.Scanner;

import javax.swing.JOptionPane;

public class Votos{

    public static void main(String[] args) {
        String cand1,cand2,cand3; 
        int op;
        int qtd;
        int ptcand1=0;
        int ptcand2=0;
        int ptcand3 =0;
        Scanner scan = new Scanner(System.in);
        Scanner vot = new Scanner(System.in);
        
       System.out.println("Insira o nome do candito 1: ");
        cand1 = scan.next();
        System.out.println("Insira o nome do candidato 2: ");
        cand2 = scan.next();
        System.out.println("Insira o nome do candidato 3: ");
        cand3 = scan.next();
        System.out.println();
        
        do{
            System.out.printf(" Escolha o numero do candidato: \n 1> " + cand1 + "\n 2> " + cand2 + "\n 3> " + cand3 + "\n" + " ou 0(zero) para encerrar! " + "\n" );
            System.out.println();

            op = vot.nextInt();
           

            if(op>3){
                System.out.println("opção invalida, digite novamente");
                System.out.println();
                continue;
            }
            switch(op)  { 
              
                case 0:
                System.out.println(" Você enccerrou a operação");  
                System.out.println("A quantidade de votos para o candidato "+cand1+ " foi de : " + ptcand1);  
                System.out.println("A quantidade de votos para o candidato "+cand2+ " foi de : " + ptcand2);  
                System.out.println("A quantidade de votos para o candidato "+cand3+ " foi de : " + ptcand3);  

                break;  
                case 1:
                System.out.println(" Você votou em " +cand1 +"\n");  
                ptcand1+=1;
                break;  

                case 2:
                System.out.println(" Você votou em " +cand2 + "\n");  
                ptcand2+=1;
                break;  

                case 3:
                System.out.println(" Você votou em " +cand3 + "\n");  
                ptcand3+=1;
                break;  

               
               
                default: 
            }

        }while(op !=0);
    }
}

