public class Main {
    public static void main(String[] args) {
        String teamName = "Lions";
        String[] obstacles = new String[]{"Box","Pail","Pitfall","Hole"};
        Course course = new Course(obstacles);

        Team team = new Team(teamName, (new String[]{"Alex", "Max", "Alina", "Anna"}));

        course.doIt(team);
        System.out.println("====================");
        team.showWinners();
        System.out.println("====================");
        team.showResults();
        System.out.println("====================");
    }
}
