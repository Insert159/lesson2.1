package ru.geekbrains;


public class Team {

    String nameTeam ;

    Competitor[] partner = new Competitor[3];
    Animal[] zoo = {new Cat("Murzik"), new Dog("Izzy")};
    public Team(String nameTeam, Competitor com1, Competitor com2, Competitor com3 ) {
        this.nameTeam  = nameTeam;

        partner[0] = com1;
        partner[1] = com2;
        partner[2] = com3;
      public void passedTheDistance() {
        for (Competitor com : partner) {
            // Если участник onDistance == true, выводим его
            if (com.isOnDistance()) {
                com.info();
            }
        }
    }
    public void showResults() {
        for (Competitor com : partner) {
            com.info();
        }
    }
    public Competitor[] getTeammates() {
        return partner;
    }
}