package music.helper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {

    private String content;

    @Builder.Default
    private MessageType type = MessageType.GREEN; // Assuming MessageType is an enum
}