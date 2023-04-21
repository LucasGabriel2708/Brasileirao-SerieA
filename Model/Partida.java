package Model;

import java.sql.Date;

public class Partida {
   private int id;
   private Date data;
   private Time mandante;
   private Time visitante;
   private int golsMandante;
   private int golsVisitante;


   public Partida(int id, Date data, Time mandante, Time visitante, int golsMandante, int golsVisitante) {
      this.id = id;
      this.data = data;
      this.mandante = mandante;
      this.visitante = visitante;
      this.golsMandante = golsMandante;
      this.golsVisitante = golsVisitante;
   }

   public void setGolsVisitante(int gols){
      this.golsVisitante = golsVisitante;
   }

   public void setGolsMandante(int gols){
      this.golsMandante = golsMandante;
   }

    
}
