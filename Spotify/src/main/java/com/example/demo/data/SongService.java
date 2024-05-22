package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.SpotifyRepository;

@Service
public class SongService {
	@Autowired
	private SpotifyRepository repository;

	public List<? extends SpotifyInterface> getAll() {
		System.out.println("Service:getAll");
		return repository.findAll();
	}

	public SpotifyInterface getById(int id) {
		System.out.println("Service:getById id[" + id + "]");
		return repository.findById(id).orElse(null);
	}

	public List<? extends SpotifyInterface> findByNameLike(String find) {
		System.out.println("Service:getSong_tytleLike find[" + find + "]");
		return repository.findByTitleLike("%" + find + "%");
	}

	// 他のメソッド（例えば、特定のランキングの楽曲を取得するメソッドなど）があれば追加
}
