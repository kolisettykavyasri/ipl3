package view;

import model.Player;
import java.util.List;

public class PlayerView {

    public void displayPlayerDetails(Player player) {
        System.out.println("----- Player Details -----");
        System.out.println("ID: " + player.getId());
        System.out.println("Name: " + player.getName());
        System.out.println("Team: " + player.getTeam());
        System.out.println("Role: " + player.getRole());
        System.out.println("Runs: " + player.getRuns());
        System.out.println("Wickets: " + player.getWickets());
        System.out.println("--------------------------");
    }

    public void displayTeamRoster(String team, List<Player> players) {
        System.out.println("\n===== " + team + " Team Roster =====");
        for (Player player : players) {
            System.out.println(player.getName() + " (" + player.getRole() + ")");
        }
        System.out.println("===============================");
    }

    public void displayTopScorer(Player player) {
        System.out.println("\nTop Scorer: " + player.getName() + " with " + player.getRuns() + " runs");
    }

    public void displayTopWicketTaker(Player player) {
        System.out.println("\nTop Wicket Taker: " + player.getName() + " with " + player.getWickets() + " wickets");
    }
}
