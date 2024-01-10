package exception_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
// import java.util.stream.Collectors;

public class Player {
  // Attributes
  private  String name;
  private int score;

  // Constructor that parses the input string into name and score
  public  Player(String info){
    // info:"name,score" - info.split (parts): ["name", "score"]
    // "Safwan,1500": ["Safwan" , "1500"]
    String[] parts = info.split(","); // the "," is the splitter
    this.name = parts[0];
    this.score = Integer.parseInt(parts[1]);
  }
  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  // a static method that reads a list of players from a file
  public static ArrayList<Player> getPlayers(String fileName) throws IOException {
    Path path = Paths.get(fileName);
    List<String> playersInfo = Files.readAllLines(path);
   /* return players.stream()
        .map(Player::new)
        .collect(Collectors.toList());
    */
    ArrayList<Player> players = new ArrayList<>();
    for (String info : playersInfo) {
      players.add(new Player(info));
    }

    return players;

  }

  @Override
  public String toString() {
    return "Player{"+
        "name="+ name + '\''+
        ", score="+ score +
        '}';
  }



}
