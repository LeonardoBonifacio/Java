package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {

        // Player  1 -- 1 Character | player can have one character and one character belongs a one team
        // Team    1 -- M Player | one team can have many players but one player belongs a one team only
        // Player  M -- 1 Team | one player belongs only a one team but one team can have many players
        // Student M -- M Course | one student can have many courses and one courses can belong a many players
        Player p1 = new Player("Pelé");
        Player p2 = new Player("Romário");
        Player p3 = new Player("Cafú");
        // association is just the relationship between objects
        Player[] players = {p1, p2, p3};
        // just create and array to hold all of my reference variables(aka objects), and keep more easy to work with them
        for (Player player : players) {
            player.print();
        }
    }
}
