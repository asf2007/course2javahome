package les1;

public class Man implements Team{
    private String name;
    private int jumpHigh;
    private int runDist;

    public Man(String name, int jumpHigh, int runDist) {
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
        System.out.println("Man "+name+ " run "+ runDist);
        return runDist;
    }
    @Override
    public int jump(){
        System.out.println("Man "+name+ " jump "+ jumpHigh);
        return jumpHigh;
    }
    }


