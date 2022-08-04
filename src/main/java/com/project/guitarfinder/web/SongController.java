package com.project.guitarfinder.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.guitarfinder.domain.Song;
import com.project.guitarfinder.domain.SongRepository;

@RestController
//@CrossOrigin(origins = "*")
public class SongController {
	@Autowired
	private SongRepository songRepository;

	@RequestMapping("/songs")
	private List<Song> getSongs() {
		System.out.println("getsongs on");
		return songRepository.findAll();
	}

	@RequestMapping("/api/test")
	private Optional<Song> test() {
		long testid = 1;
		return songRepository.findById(testid);
	}

	@RequestMapping("/api/songs/search")
	private List<Song> getSongsByTuning(@RequestParam(name = "tuning") String tune) {
		return songRepository.findByTuning(tune);
	}

	// Post method add data to repository
}
