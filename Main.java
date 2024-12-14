public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Ligacao ligacao = new Ligacao();
    
    System.out.println("Escolha a opção 1 se deseja ligar");
    
    i = sc.nextInt();
    switch(i) {
    
    case 1:
        ligacao.ligar();
        System.out.println("Escolha a opção 2 se deseja desligar");
        i = sc.nextInt();
    case 2:
        ligacao.desligar();
        break;
    default:
        System.out.println("Opção Invalida");
    }
        
}
}