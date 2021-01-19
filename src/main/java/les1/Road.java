package les1;

public class Road implements Obstacle {
    private int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean takeObstacle(Team team) {
        if (team.run()>=distance) {
           // System.out.println(team.getName() + " winer");

            return true;
        }
        else {
           // System.out.println(team.getName() + " loser");

            return false;
        }
    }
}
