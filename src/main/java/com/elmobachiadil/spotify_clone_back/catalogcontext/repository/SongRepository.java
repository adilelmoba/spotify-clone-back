package com.elmobachiadil.spotify_clone_back.catalogcontext.repository;

import com.elmobachiadil.spotify_clone_back.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

}
