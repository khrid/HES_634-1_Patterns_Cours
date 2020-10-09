package ex1_football;

import ex1_football.composite.Team;
import ex1_football.leaf.Player;

/**
 * You have to write a game application. You must control a team of players
 * (maybe 11, maybe 6, maybe 5).
 * A player can
 * • Enter the field
 * • Shoot
 * • Cry
 * • Simulate an injury
 * In this game, you can control either one or a group of players, or a group of
 * groups of players, calling on them their methods.
 */

public class Game {
    public static void main(String[] args) {
        Player jo = new Player(1);
        Player jean = new Player(2);
        Player paul = new Player(3);

        jo.cry();
        jean.cry();
        jo.enterField();
        Team team1 = new Team();
        team1.add(jo);
        team1.add(jean);
        team1.add(paul);

        team1.enterField();
        team1.cry();
        team1.simulateInjury();

        Player martine = new Player(3);
        Player isabelle = new Player(4);
        Player mariePaule = new Player(5);

        Team team2 = new Team();
        team2.add(martine);
        team2.add(isabelle);
        team2.add(mariePaule);
        team2.add(team1);
        team2.enterField();
        team2.cry();
        team2.simulateInjury();
        team2.remove(team1);
        team2.simulateInjury();
    }
}
