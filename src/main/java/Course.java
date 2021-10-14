import java.util.Random;

public class Course {
    String [] obstacles;

    Course(String [] obstacles) {
        this.obstacles = new String[obstacles.length];
        for(int i = 0; i < obstacles.length; i++) {
            this.obstacles[i] = obstacles[i];
        }
    }

    public void doIt (Team team) {
        Random random = new Random();
       for (int i = 0; i < team.teamMembers.length; i++) {
           boolean isWinner = true;
           for (int j = 0; j < obstacles.length; j++){
                if (random.nextInt(100)< 20) {
                    isWinner = false;
                    break;
                }
           }
           if (isWinner) {
               team.teamMembers[i].setWinner();
           }
       }
    }
}

