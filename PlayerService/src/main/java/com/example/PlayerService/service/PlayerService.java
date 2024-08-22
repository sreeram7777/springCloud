package com.example.PlayerService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PlayerService.entity.Player;
import com.example.PlayerService.repo.PlayerRepo;

@Service
public class PlayerService {

	
	@Autowired
	private PlayerRepo repo;
	
	
	public List<Player> getDbData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public Player getPlayerdata(int id) {
		// TODO Auto-generated method stub
		Optional<Player> opt = repo.findById(id);
		return opt.get();
	}

}
