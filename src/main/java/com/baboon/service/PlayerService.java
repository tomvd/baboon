package com.baboon.service;

import com.baboon.model.Player;
import com.baboon.repository.PlayerRepository;
import jakarta.inject.Singleton;

@Singleton
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player findOrCreate(String slackUserId, String displayName) {
        return playerRepository.findOrCreate(slackUserId, displayName);
    }
}
