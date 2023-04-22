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

   public void setGolsVisitante(int golsVist){
      this.golsVisitante = golsVist;
   }

   public void setGolsMandante(int golsMand){
      this.golsMandante = golsMand;
   }
   public int getIdPartida(){
      return id;
   }

   @Override
   public String toString() {
      return "Partida [id=" + id + ", data=" + data + ", mandante=" + mandante + ", visitante=" + visitante
            + ", golsMandante=" + golsMandante + ", golsVisitante=" + golsVisitante + "]";
   }  
}
