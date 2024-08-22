package com.example.PlayerService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PlayerService.entity.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
