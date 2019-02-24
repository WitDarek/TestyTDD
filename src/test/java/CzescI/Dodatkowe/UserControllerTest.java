package CzescI.Dodatkowe;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class UserControllerTest {

    static Map<User,String> passwordsMap = new HashMap<> ();
    UserController controller =new UserController (passwordsMap);
    static User user = new User ("Piotr" ,new LinkedList<> ());

    @BeforeAll
    static void populatePasswdMap(){
        passwordsMap.put (user,"123");
    }

    @AfterEach
    void logout(){
        user.setLogged (false);
    }
    @Test
    void testLogin(){

        passwordsMap.put (user,"123");

        String inputPasswd="123";
        Assertions.assertTrue(controller.login(user,inputPasswd));
        String wrongPasswd = "321";
        Assertions.assertFalse (controller.login(user,wrongPasswd));
        Assertions.assertFalse (controller.login(new User ("testowy",new LinkedList<> ()),inputPasswd));
        Assertions.assertEquals (true,user.getLogged ());

    }

    @Test
    void resourcesAccessTest(){
        Resource resource=new Resource ("zasoby1");
        Resource resource2=new Resource ("zasoby2");
        controller.login (user,"123");
        user.getResources ().add (resource);
        Assertions.assertTrue (controller.hasAccess(user ,resource));
        Assertions.assertFalse (controller.hasAccess(user ,resource2));
    }

}