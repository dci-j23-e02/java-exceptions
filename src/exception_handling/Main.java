package exception_handling;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    try {
      ArrayList<Player> playerList =Player.getPlayers("players.dat");
      playerList.forEach(
          player -> System.out.println("Player Name: " + player.getName()
          + "\n"+ "Player Score: " + player.getScore())
      );
    }catch (Exception e) {
    System.out.println("The specified fila path was not found: "+ e.getMessage());
   /*   StackTraceElement[] stackTrace = e.getStackTrace();
      for (StackTraceElement element :stackTrace ) {
        System.out.println(element.toString());
      }*/
    }
  }
}
