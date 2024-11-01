package music.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import music.entity.Music;
import music.repository.MusicRepository;
import music.service.MusicService;

@Service
public class MusicServiceImpl implements MusicService {

@Autowired
private MusicRepository musicRepository;

    @Override
    public ArrayList<Music> getAllMusic(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMusic'");
    }

    @Override
    public Music getMusicById(long musicId) {
        
        // return musicRepository.getById(musicId);
        return null;
    }

    @Override
    public ArrayList<Music> getMusicByAlbum(String album) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMusic'");
    }

    @Override
    public void deleteMusic(long musicId) {
        // TODO Auto-generated method stub
        
  
    }
}