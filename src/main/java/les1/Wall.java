package les1;

public class Wall implements Obstacle {
   private int high;

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public boolean takeObstacle(Team team) {
        if (team.jump()>=high) {
           // System.out.println(team.getName() + " winer");

            return true;
        }
        else {
            //System.out.println(team.getName() + " loser");

            return false;
        }
    }
}
