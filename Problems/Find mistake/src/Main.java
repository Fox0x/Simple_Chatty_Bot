class Test {

    public static void main(String[] args) {
        new Programmer(1);
        new TeamLead(1);
    }

    public static class TeamLead {

        private final int numTeamLead;

        public TeamLead(int numTeamLead) {
            this.numTeamLead = numTeamLead;
            employ();
        }

        protected void employ() {
            System.out.println(numTeamLead + " teamlead");
        }

    }

    public static class Programmer {

        private final int numProgrammer;

        public Programmer(int numProgrammer) {
            this.numProgrammer = numProgrammer;
            employ();
        }

        protected void employ() {
            System.out.println(numProgrammer + " programmer");
        }
    }
}