package homework1;

public class Course {
    String result;
    private int run;
    private int swim;

    public Course(int run, int swim) {
        this.run = run;
        this.swim = swim;
       // this.jump = jump;
    }
    public String doIt(Team team){
        result = "Team " + team.getTeamName()+ " "+ '\n';
        for (Player player: team.getPlayers() ){
            result+="Player" + player.getName()+" "+ "\n";
            int value =player.getPassObstacles();
            testRun(value);
            testSwim(value);
            //testJump(value);
        }
        return result;
    }

//    private void testJump(int value) {
//        if (value<jump) result=result + "Not Passed" + '\n';
//        else result+= "Passed"+ '\n';
//    }

    private void testSwim(int value) {
        if (value<swim) result=result + "Not Passed" + '\n';
        else result+= "Passed"+ '\n';

    }

    private void testRun(int value) {
        if (value<run) result=result + "Not Passed" + '\n';
        else result+= "Passed"+ '\n';
    }

   // private int jump;

}
