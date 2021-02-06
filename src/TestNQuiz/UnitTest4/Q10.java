package TestNQuiz.UnitTest4;

public class Q10 {
    String name;
    int numOfPlayers;
    boolean teamBased;

    public void Q10(String name, int numOfPlayers, boolean teamBased) {
        name = name;
        numOfPlayers = numOfPlayers;
        teamBased = teamBased;
    }

    @Override
    public String toString() {
        return "Q10{" +
                "name='" + name + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                ", teamBased=" + teamBased +
                '}';
    }

    public static void main(String[] args) {
        Q10 soccer = new Q10();
        soccer.Q10("Soccer",22,true);
        System.out.println(soccer);
    }
}
