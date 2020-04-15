package Entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User sampleUser;


    @Before
    public void setUp() throws Exception {
        sampleUser = new User("Abubakar", "Abdulsalam",
                "Abu", null, null);
    }

    @After
    public void tearDown() throws Exception {
        this.sampleUser = null;
    }

    @Test
    public void setFirstName() {
        sampleUser.setFirstName("AbdulMutalib");
        assertTrue(sampleUser.getFirstName().equals("AbdulMutalib"));
    }

    @Test
    public void getFirstName() {
        assertTrue(sampleUser.getFirstName().equals("Abubakar"));
    }

    @Test
    public void getLastName() {
        assertTrue(sampleUser.getLastName().equals("Abdulsalam"));
    }

    @Test
    public void setLastName() {
        sampleUser.setLastName("Abdullahi");
        assertTrue(sampleUser.getLastName().equals("Abdullahi"));
    }

    @Test
    public void getPreferredName() {
        System.out.println(this.sampleUser);
        assertTrue(this.sampleUser.getPreferredName().equals("Abu"));
    }

    @Test
    public void setPreferredName() {
        sampleUser.setPreferredName("Abdul");
        assertTrue(sampleUser.getPreferredName().equals("Abdul"));
    }

   @Test
    public void getId()
   {
       assertEquals(sampleUser.getId(), 0);
   }
}