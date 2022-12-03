package homework1;

public class Player {
    private String name;

    public Player(String name, int passObstacles) {
        this.name = name;
        this.passObstacles = passObstacles;
    }

    public String getName() {
        return name;
    }

    public int getPassObstacles() {
        return passObstacles;
    }

    private int passObstacles;
}
