public class LigarDesligar{

private boolean ligado = false;
        static int i;
        public void ligar() {
            
            if (ligado) {
                System.out.println("Você já está em uma ligação.");
            } else {
                ligado = true;
                System.out.println("Ligação iniciada.");
            }
        }
        
        public void desligar() {
            if (ligado) {
                ligado = false;
                
                System.out.println("Ligação encerrada com sucesso.");
            } else {
                System.out.println("Você não pode desligar porque não está em uma ligação.");
            }
        }
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