package les1;

public class Main {
    public static void main(String[] args) {



        Obstacle start[] = new Obstacle[3];
        start[0] = new Wall(3);
        start[1] = new Road(500);
        start[2] = new Road(1400);
       // Road oneR = new Road(1000);
        //Wall oneW = new Wall(2);
        //Man alex = new Man("Alex");
        Team team[] = new Team[4];
        //team mans[] = new Man[4];
        team[0] = new Man("Alex",3,500);
        team[1] = new Robot("Anton",2,1000);
        team[2] = new Man("Roman",4,1500);
        team[3] = new Robot("Igor", 5,2000);
       for(int i=0; i<team.length; i++){
           for(int j = 0; j<start.length; j++){
              if( start[j].takeObstacle(team[i])==false){
                  System.out.println(team[i].getName()+ " LOSER!!!");
                  break;
              }
              else {
                  System.out.println(team[i].getName()+ " take obstacle " + (j+1));
                  if(j==(start.length)){
                      System.out.println(team[i].getName()+ " WINNER!!!");
                  }
              }
           }
       }

    }
}
