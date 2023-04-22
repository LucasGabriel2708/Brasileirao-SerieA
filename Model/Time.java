package Model;


import java.util.ArrayList;

public class Time{
   private int id;
   private String nome;
   private String tecnico;
   ArrayList<Jogador> todos_jogadores = new ArrayList<Jogador>();

// CONSTRUTOR DO TIME
   public Time(int id, String nome, String tecnico, ArrayList<Jogador> todos_jogadores) {
      this.id = id;
      this.nome = nome;
      this.tecnico = tecnico;
      this.todos_jogadores = todos_jogadores;
   }
// CRIA UMA LISTA DE JOGADORES VAZIA
   public void listaJogadores() {
		for (Jogador j: todos_jogadores) {
			System.out.println(j.toString());
      }
   }

// ADICIONA JOGADORES A LISTA
   public void adicionarJogador(Jogador joga){
      todos_jogadores.add(joga);

   }

// RETORNA TODOS OS JOGADORES NA LISTA
   public ArrayList<Jogador> getTodos_Jogadors() {
		return todos_jogadores;
	}

// REMOVE ALGUM JOGADOR DA LISTA
   public void removerJogador(int idjogador_excluido){
      for (Jogador j: todos_jogadores){
         if (j.getIdJogador() == idjogador_excluido){
            todos_jogadores.remove(j);
         }
      }
   }
   public int getIdTime(){
      return id;
   }
   @Override
   public String toString() {
      return "Time [id=" + id + ", nome=" + nome + ", tecnico=" + tecnico + ", todos_jogadores=" + todos_jogadores
            + "]";
   }
}


         