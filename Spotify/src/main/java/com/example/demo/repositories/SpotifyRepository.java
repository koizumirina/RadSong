package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Song;

@Repository
public interface SpotifyRepository extends JpaRepository<Song, Integer> {
	// 追加のクエリメソッドがあればここに追加
	public Optional<Song> findById(int id);

	public List<Song> findByTitle(String key);

	public List<Song> findByTitleLike(String key);
}
