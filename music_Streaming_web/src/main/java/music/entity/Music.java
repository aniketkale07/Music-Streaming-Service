package music.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Music {

    @Id
    private Long musicId;
    private String musicName;
    private float musicLength;
    private String singer;
    private String album;
    private String playlist;

    private boolean isFavourite;

    @ManyToAny
    private User user;
}
