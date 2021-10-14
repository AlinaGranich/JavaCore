public class Team {
        String teamName;
        Participant [] teamMembers;

        Team (String teamName, String [] teamMembers){
                this.teamName = teamName;
                this.teamMembers = new Participant[teamMembers.length];
                for (int i = 0; i < teamMembers.length; i++){
                        this.teamMembers[i] = new Participant(teamMembers[i]);
                }

        }

        public void showWinners () {
                for (int i = 0; i < teamMembers.length; i++){
                        if (teamMembers[i].isWinner) {
                                System.out.println(teamMembers[i].name + " " + "Прошел полосу препятствий");
                        }
                }
        }

        public void showResults () {
                for (int i = 0; i < teamMembers.length; i++){
                        if (teamMembers[i].isWinner) {
                                System.out.println(teamMembers[i].name + " " + "Прошел полосу препятствий");
                        } else {
                                System.out.println(teamMembers[i].name + " " + "Не прошел полосу");
                        }
                }
        }

}

