package music.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.nimbusds.openid.connect.sdk.UserInfoRequest;

import music.entity.Music;
import music.entity.User;
import music.repository.UserRepository;
import music.service.UserService;

@Service
public class UserServiceImpl implements UserService {

@Autowired
private UserRepository userRepository;

    @Override
    public User getUser(long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public ArrayList<Music> favouriteMusic(long userId) {
        
        throw new UnsupportedOperationException("Unimplemented method 'favouriteMusic'");
    }

    @Override
    public ArrayList<User> getAllUser() {
        
        return (ArrayList<User>) userRepository.findAll();
    }  
}