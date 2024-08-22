package com.example.PlayerClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PlayerClient.data.Player;
import com.example.PlayerClient.fiegn.PlayerFiegn;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class PlayerService {

	
	@Autowired
	private PlayerFiegn fiegn;

	
	@CircuitBreaker(name="Playerservice",fallbackMethod = "fallbackMethod")
	public Player getdatafromPlayerService(int id) {
		// TODO Auto-generated method stub
		return fiegn.getdatafromPlayerService(id); 
	}
	
	public Player fallbackMethod(int id,Throwable th)
	{
		System.out.println(th.getMessage());
		return new Player();
	}

}
