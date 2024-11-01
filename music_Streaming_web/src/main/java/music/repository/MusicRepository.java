package music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import music.entity.Music;

public interface MusicRepository extends JpaRepository<Music, Long> {
    
}