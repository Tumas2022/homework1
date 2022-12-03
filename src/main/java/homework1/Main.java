package homework1;

public class Main {
    public static void main(String[] args) {
        Player[]player=new Player[4];
        player[0]=new Player(" Name1", 120 );
        player[1]=new Player( " Name2",70 );
        player[2]=new Player(  " Name3",10);
        player[3]=new Player( " Name4",40 );

        Team team=new Team( "DYNAMO",player);

        Course course=new Course( 50, 100);

        String result= course.doIt(team);
        System.out.println(result);
    }
}
