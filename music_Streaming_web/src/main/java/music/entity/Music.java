package music.entity;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long musicId;
    private String musicName;
    private float musicLength;
    private String singer;
    private String album;
    private String playlist;

    private boolean isFavourite;

    @ManyToOne(fetch = FetchType.LAZY) // Use LAZY loading for efficiency
    @JoinColumn(name = "user_id", nullable = false) // Foreign key column
    private User user;
}
