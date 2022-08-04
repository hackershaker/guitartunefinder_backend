package com.project.guitarfinder.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Song {
	public Song() {
	}

	public Song(String name, String artist, String tuning) {
		super();
		this.name = name;
		this.artist = artist;
		this.tuning = tuning;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	private String name;

	@NonNull
	private String artist;

	@NonNull
	private String tuning;

	@Override
	public String toString() {
		return " id:" + this.getId() + " name:" + this.getName() + " artist:" + this.getArtist() + " tuning:"
				+ this.getTuning();
	}
}
