package music.service;

import java.util.*;



import music.entity.Music;

public interface MusicService {
    
 ArrayList <Music> getAllMusic(long userId);

  Music getMusicById(long musicId);
  
  ArrayList <Music> getMusicByAlbum(String album);

  void deleteMusic(long musicId);
  


}
