package com.example.PlayerClient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.PlayerClient.data.Player;
import com.example.PlayerClient.service.PlayerService;

import reactor.core.publisher.Flux;

@RestController
public class PlayerController {

	
	@Autowired
	private WebClient webClient;
	
	@Autowired
	private PlayerService service;
	
	@GetMapping("/getDataWithWebClient")
	public List<Player> getdata()
	{
		Flux<Player> p = webClient.get().uri("/getData").retrieve().bodyToFlux(Player.class);
		List<Player> players = p.collectList().block();
		return players;
	}
	
	
	@GetMapping("/getDataWithWebClient/{id}")
	public Player getdatafromServer(@PathVariable int id)
	{
		Player p = webClient.get().uri("/getData/{id}",id).retrieve().bodyToMono(Player.class).block();
		return p;
	}
	

	
	@GetMapping("/getDataWithFiegn/{id}")
	public Player getdataFromServer(@PathVariable int id)
	{
		return service.getdatafromPlayerService(id);
	}
}
