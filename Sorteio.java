import java.util.Random;
import java.util.Scanner;


public class Sorteio{
    
    public static void main(String[] args) {
    Random rand = new Random();
    int sort = rand.nextInt(100+1);
    System.out.println(sort);
    boolean igual = false;
    int cont =0;
    int ent;
    Scanner scan = new Scanner(System.in);
    while(igual==false){
        System.out.println("Digite um valor de 0 a 100! ");
     ent = scan.nextInt();
     cont+=1;
     if(ent==sort){
        igual = true;
        System.out.println(" Parabéns você acertou! ");
        System.out.println("A quantidade de tentativas feitas foram: "+ cont);
     }else if(ent<sort){
        System.out.println(" O numero digitado é menor que a tentativa feita! ");
     }else if(ent>sort){
        System.out.println(" O numero digitado é maior que a tentativa feita! ");
     }

    }
}
}


