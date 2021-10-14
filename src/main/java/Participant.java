public class Participant {
    String name;
    boolean isWinner = false;

    Participant (String name) {
        this.name = name;
    }

    public void setWinner() {
        this.isWinner = true;
    }
}
