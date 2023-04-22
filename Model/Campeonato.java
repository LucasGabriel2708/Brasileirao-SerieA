package Model;

import java.util.ArrayList;

public class Campeonato {
   ArrayList<Time> todos_times = new ArrayList<Time>();
   ArrayList<Partida> todas_Partidas = new ArrayList<Partida>();

// CRIA UMA LISTA DE TIMES VAZIA
   public void listaTimes() {
		for (Time t: todos_times) {
			System.out.println(t.toString());
      }
   }

// ADICIONA TIMES A LISTA
   public void adicionarTimes(Time time){
      todos_times.add(time);
   }
// RETORNA TODOS OS TIMES NA LISTA
   public ArrayList<Time> getTodos_Times() {
		return todos_times;
	}
// REMOVE ALGUM TIME DA LISTA
   public void removerTime(int idtime_excluido){
      for (Time t: todos_times){
         if (t.getIdTime() == idtime_excluido){
            todos_times.remove(t);
         }
      }
   }

   // CRIA UMA LISTA VAZIA DE PARTIDAS 
   public void listaPartidas() {
		for (Partida p: todas_Partidas) {
			System.out.println(p.toString());
      }
   }

// ADICIONA PARTIDAS A LISTA
   public void adicionarPartidas(Partida part){
      todas_Partidas.add(part);
   }
// RETORNA TODOS OS PARTIDAS DA LISTA
   public ArrayList<Partida> getTodas_Partidas() {
		return todas_Partidas;
	}
// REMOVE ALGUM PARTIDA DA LISTA
   public void removerPartida(int idpartida_excluida){
      for (Partida p: todas_Partidas){
         if (p.getIdPartida() == idpartida_excluida){
            todos_times.remove(p);
         }
      }
   }
}
    

