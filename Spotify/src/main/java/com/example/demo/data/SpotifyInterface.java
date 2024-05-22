package com.example.demo.data;

import java.util.Date;

public interface SpotifyInterface {

	public Long getId();

	public void setId(Long id);

	public int getRank();

	public void setRank(int rank);

	public String getTitle();

	public void setTitle(String title);

	public String getAlbum_name();

	public void setAlbum_name(String album_name);

	public Date getRelease_year();

	public void setRelease_year(Date release_year);
}
