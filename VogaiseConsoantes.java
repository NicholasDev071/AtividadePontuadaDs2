import java.util.Scanner;

public class VogaiseConsoantes{ 
    
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite Três Nomes: ");
        String A=reader.next();
        String B=reader.next();
        String C=reader.next();
        
   
    int consoantes = 0;    
    String a = vogal(A);
    String b = vogal(B);
    String c = vogal(C);
    
    if(a == "1"){
        consoantes+=1;
    }if(b == "1"){
        consoantes+=1;
    }if(c == "1"){
        consoantes+=1;
     }else{
        consoantes+=0;
    }

    System.out.println("A quantidades de palavras que iniciam com consoantes é " + consoantes);

    }
    
    public static String vogal(String N){
        char c=N.charAt(0);
        switch(c){

            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
    
                System.out.println("a primeira letra de  "+N+" é uma vogal");
                break;
            default:
                N= ("1");
        }
        return N;
    }
}
