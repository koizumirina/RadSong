package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.SongService;
import com.example.demo.data.SpotifyInterface;

@RestController
public class SpotifyController {
	@Autowired
	SongService songService;

	@GetMapping("/api/songs")
	@CrossOrigin
	public List<? extends SpotifyInterface> songs() {
		System.out.println("songs/index");
		return songService.getAll();
	}

	// 他のエンドポイント（例えば、特定のランキングの楽曲を取得するエンドポイントなど）があれば追加
}
