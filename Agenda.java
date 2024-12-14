public class Agenda {
public static void main(String[] args) {
    
}

public void armazenaPessoa(String nome, int idade, float altura) {
    if (totalPessoas < 10) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        pessoas[totalPessoas] = pessoa;
        totalPessoas++;
        System.out.println("Pessoa armazenada com sucesso.");
    } else {
        System.out.println("A agenda está cheia. Não é possível armazenar mais pessoas.");
    }
}

public void removePessoa(String nome) {
    int posicao = buscaPessoa(nome);
    if (posicao == -1) {
        System.out.println("A pessoa não foi encontrada na agenda.");
    } else {
        for (int i = posicao; i < totalPessoas - 1; i++) {
            pessoas[i] = pessoas[i + 1];
        }
        pessoas[totalPessoas - 1] = null;
        totalPessoas--;
        System.out.println("Pessoa removida com sucesso.");
    }
}

public int buscaPessoa(String nome) {
    for (int i = 0; i < totalPessoas; i++) {
        if (pessoas[i].getNome().equals(nome)) {
            return i;
        }
    }
    return -1;
}

public void imprimeAgenda() {
    if (totalPessoas == 0) {
        System.out.println("A agenda está vazia.");
    } else {
        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Posição " + i + ":");
            System.out.println(pessoas[i].toString());
            System.out.println("-------------------------------");
        }
    }
}}
