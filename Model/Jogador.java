package Model;

public class Jogador {
   private int id;
   private String nome;
   private String posicao;
   private int numero;
   private Time time;

// CONSTRUTOR DE JOGADOR
   public Jogador(int id, String nome, String posicao, int numero, Time time) {
      this.id = id;
      this.nome = nome;
      this.posicao = posicao;
      this.numero = numero;
      this.time = time;
   }

// SETA UM NUMERO NUM JOGADOR
   public void setPosicao(String posicao){
      this.posicao = posicao;
   }

// SETA UM NUMERO NUM JOGADOR
   public void setNumero(int numero){
      this.numero = numero;
   }

// RECUPERA O NOME DO JOGADOR, USADO EM TIME PARA PERCORRER A LISTA
   public int getIdJogador() {
      return id;
   }
    
}
