import javax.swing.JOptionPane ;

public class Decrescente{
public static void main(String[] args){
int[] numeros = new int[] {
Integer.parseInt( JOptionPane.showInputDialog( "Digite o primeiro número" ) ),
Integer.parseInt( JOptionPane.showInputDialog( "Digite o segundo número" ) ),

} ;

ordenacaoDecrescente(numeros) ;
JOptionPane.showMessageDialog( null, "Ordenação decrescente:\n" + numeros[0] + "\n" + numeros[1] + "\n" ) ;
}

static void ordenacaoDecrescente(int[] numeros){

int quantidade = numeros.length ;
int primeiro = 0 ;
int segundo = 1 ;

while ( segundo < quantidade ){

if ( numeros[ primeiro ] < numeros[ segundo ] ){
int troca = numeros[ primeiro ] ;
numeros[ primeiro ] = numeros[ segundo ] ;
numeros[ segundo ] = troca ;
primeiro = 0 ;segundo = 1 ;
}else{
primeiro++ ;
segundo++ ;

}
}
}
}