package controller;

import model.Player;
import view.PlayerView;
import java.util.*;

public class PlayerController {
    private List<Player> players;
    private PlayerView view;

    public PlayerController(PlayerView view) {
        this.players = new ArrayList<>();
        this.view = view;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updatePlayerStats(int id, int runs, int wickets) {
        for (Player player : players) {
            if (player.getId() == id) {
                player.setRuns(runs);
                player.setWickets(wickets);
                break;
            }
        }
    }

    public void displayPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                view.displayPlayerDetails(player);
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public void displayTeamRoster(String team) {
        List<Player> teamPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getTeam().equalsIgnoreCase(team)) {
                teamPlayers.add(player);
            }
        }
        view.displayTeamRoster(team, teamPlayers);
    }

    public void displayTopScorer() {
        Player top = Collections.max(players, Comparator.comparing(Player::getRuns));
        view.displayTopScorer(top);
    }

    public void displayTopWicketTaker() {
        Player top = Collections.max(players, Comparator.comparing(Player::getWickets));
        view.displayTopWicketTaker(top);
    }
}
