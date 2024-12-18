package com.elmobachiadil.spotify_clone_back.catalogcontext.application.mapper;

import com.elmobachiadil.spotify_clone_back.catalogcontext.application.dto.ReadSongInfoDTO;
import com.elmobachiadil.spotify_clone_back.catalogcontext.application.dto.SaveSongDTO;
import com.elmobachiadil.spotify_clone_back.catalogcontext.application.vo.SongAuthorVO;
import com.elmobachiadil.spotify_clone_back.catalogcontext.application.vo.SongTitleVO;
import com.elmobachiadil.spotify_clone_back.catalogcontext.domain.Song;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SongMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "publicId", ignore = true)
    Song saveSongDTOToSong(SaveSongDTO saveSongDTO);

    @Mapping(target = "favorite", ignore = true)
    ReadSongInfoDTO songToReadSongInfoDTO(Song song);

    default SongTitleVO stringToSongTitleVO(String title) {
        return new SongTitleVO(title);
    }

    default SongAuthorVO stringToSongAuthorVO(String author) {
        return new SongAuthorVO(author);
    }
    
    default String songTitleVOToString(SongTitleVO title) {
        return title.value();
    }

    default String songAuthorVOToString(SongAuthorVO author) {
        return author.value();
    }

}
