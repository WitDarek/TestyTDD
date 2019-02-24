package CzescII;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class UserRegistrationTest {


    @Test
    void registrationTest(){
        UserRegistration userRegistration = new UserRegistration ();
        String name = "Piotr";
        String email = "piotr.p.osowsski@gmail.com";
        String password = "123";
        String passwordConfirmed="123";
        UserType userType = UserType.USER;
        assertThat(userRegistration.registerNewUser(name,email,password,passwordConfirmed,userType));
        assertThat (userRegistration.getUserList ()).isNotEmpty ();
        assertThat (userRegistration
                .getUserList ()
                .stream () //zamiana listy na stream
                .anyMatch (
                        x->x.getName ().equals (name)&& x.getMail ().equals (email))).isEqualTo (true);

        assertThat (userRegistration
                .getUserList ()
                .stream () //zamiana listy na stream
                .filter (
                        x->x.getName ().equals (name)).toArray ()).isNotEmpty ();
    }

    @Test
    void testEmail(){
        UserRegistration userRegistration=new UserRegistration ();
        String email = "piotr.p.osowsski@gmail.com";

        assertThat (userRegistration
                .isMailValid(email))
                .isEqualTo (true);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc","ppp@"})
    void testEmailFail(String email){
        UserRegistration userRegistration=new UserRegistration ();
        assertThat (userRegistration
                .isMailValid(email))
                .isEqualTo (false);
    }

    @ParameterizedTest
    @CsvSource ({"123,123",
                    "111,121"})
    void testPasswords(String password, String passwordConfirmed){
        UserRegistration userRegistration=new UserRegistration ();
        assertThat (userRegistration
        .isPasswordValid(password,passwordConfirmed))
                .isEqualTo(true);


    }
}