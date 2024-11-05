package music.service;

import music.entity.User;

import java.util.ArrayList;

import music.entity.Music;

public interface UserService {
    
    User getUser(long userid);

    ArrayList <Music> favouriteMusic(long userId);

    ArrayList<User> getAllUser();

    User findByEmail(String email);
    
    void saveUser(User user);
    
}
