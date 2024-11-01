package music.entity;


import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long userId;

    
    private String username;

    
    private String gmail;

    private String profilePhoto;

    private String password;

    private boolean isLogged;
    private boolean isOnline;

    @OneToMany
    private ArrayList<Music> music; 
}
