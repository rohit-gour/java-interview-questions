package StreamExample;

public class Player {
    private String id;
    private double score;
    public Player(String id, double score){
        this.id = id;
        this.score = score;
    }
    public double getScore(){
        return  this.score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}
