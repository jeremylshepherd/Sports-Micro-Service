package app.service;

import app.model.Player;

import java.util.List;

public interface IPlayerService {

    Player fetchPLayerById(int id);

    List<Player> fetchAllPlayers();

    Player savePlayer(Player player) throws Exception;

}
