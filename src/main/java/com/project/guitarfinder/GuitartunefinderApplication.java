package com.project.guitarfinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.guitarfinder.domain.Song;
import com.project.guitarfinder.domain.SongRepository;

@SpringBootApplication
public class GuitartunefinderApplication {
	@Autowired
	private SongRepository songRepository;

	public static void main(String[] args) {
		SpringApplication.run(GuitartunefinderApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Song song1 = new Song("You are the hero", "Kotaro Oshio", "DADGAD");
			Song song2 = new Song("Twilight", "Kotaro Oshio", "EADGBE");
			Song song3 = new Song("Close to you", "Tommy Emmanuel", "EADGBE");
			System.out.println("=============================================================");
			songRepository.save(song1);
			songRepository.save(song2);
			songRepository.save(song3);
			List<Song> allArray = songRepository.findAll();
			System.out.println("All list is:");
			allArray.forEach(arr -> System.out.println(arr));
			;
		};
	}
}
