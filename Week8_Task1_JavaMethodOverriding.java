package Week_Tasks.Week8_Tasks;

public class Week8_Task1_JavaMethodOverriding {
    static class Sports {
        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamMembers(int n) {
            System.out.println("Each team has " + n + " players in " + getName());
        }
    }

    static class Soccer extends Sports {
        @Override
        String getName() {
            return "Soccer Class";
        }

        @Override
        void getNumberOfTeamMembers(int n) {
            System.out.println("Each team has 11 players in " + getName());
        }
    }

    public static void main(String[] args) {
        Sports sports = new Sports();
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers(11);

        Sports soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers(11);
    }
}
