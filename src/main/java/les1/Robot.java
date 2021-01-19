package les1;

public class Robot implements Team {
    private String name;
    private int jumpHigh;
    private int runDist;

    public Robot(String name, int jumpHigh, int runDist) {
        this.name = name;
        this.jumpHigh = jumpHigh;
        this.runDist = runDist;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int run(){
        System.out.println("Robot "+name+ "  run "+ runDist);
        return runDist;
    }
    @Override
    public int jump(){
        System.out.println("Robot "+name+ " jump "+ jumpHigh);
        return jumpHigh;
    }
}
