package les1;

public class Cat implements Team {
    private String name;
    private int jumpHigh;
    private int runDist;
@Override
    public String getName() {
        return name;
    }

    public Cat(String name, int jumpHigh, int runDist) {
        this.name = name;
        this.jumpHigh = jumpHigh;
        this.runDist = runDist;
    }
@Override
    public int run(){
        System.out.println("Cat "+name+ " run "+ runDist);
        return runDist;
    }
    @Override
    public int jump(){
        System.out.println("Cat "+name+ " jump "+ jumpHigh);
        return jumpHigh;
    }
}
