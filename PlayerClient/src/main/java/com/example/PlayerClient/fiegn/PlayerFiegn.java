package com.example.PlayerClient.fiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.PlayerClient.data.Player;

@FeignClient(name="PlayerService",url="localhost:8086")
//@FeignClient(name="PlayerService") required only when load balancing
public interface PlayerFiegn {

	
	@GetMapping("/getData/{id}")
	Player getdatafromPlayerService(@PathVariable int id);

	
}
