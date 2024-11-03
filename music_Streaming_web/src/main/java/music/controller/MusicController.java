package music.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import music.entity.Music;
import music.entity.User;
import music.repository.MusicRepository;
import music.repository.UserRepository;

@Controller
public class MusicController {
    private Music music;

    @Autowired
    private MusicRepository musicRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/musiclist")
    private String musicList(long userId){
     User user = userRepository.findById(userId).get();
     
     ArrayList list =  user.getMusic();
         return "musiclist";
    }

}
