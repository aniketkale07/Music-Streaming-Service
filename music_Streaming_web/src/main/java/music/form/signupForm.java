package music.form;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SignupForm {
    
    private String firstName;
    private String lastName;

    
    private String email;

    private String profilePhoto;

    private String password;
    private String confirmPassword;
    private Date birthDate;

}
