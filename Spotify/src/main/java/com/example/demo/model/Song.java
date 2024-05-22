package com.example.demo.model;

import java.util.Date;

import com.example.demo.data.SpotifyInterface;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RADWIMPS_Best10")
public class Song implements SpotifyInterface {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long song_id;
	@Column
	private int rank;
	@Column
	private String title;
	@Column
	private String album_name;
	@Column
	private Date release_year;

	public Long getId() {
		return song_id;
	}

	public void setId(Long songId) {
		this.song_id = songId;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public Date getRelease_year() {
		return release_year;
	}

	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}

	// Getters and setters
	// コンストラクタ
}
