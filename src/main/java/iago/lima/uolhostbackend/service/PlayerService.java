package iago.lima.uolhostbackend.service;

import iago.lima.uolhostbackend.model.Player;
import iago.lima.uolhostbackend.model.dtos.PlayerDto;
import iago.lima.uolhostbackend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public Player createPlayer(PlayerDto dto) {

        Player newPlayer = new Player(dto);
        return repository.save(newPlayer);
    }
}
