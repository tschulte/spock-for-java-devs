package de.gliderpilot.spock;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    // subject
    private UserService userService = new UserService();

    @Test
    public void returnsEmptyOptionalWhenNoUserAddedYet() {
        // when:
        User user = userService.findById(Long.valueOf(0));

        // then:
        assertNull(user);
    }

    @Test
    public void returnsAddedUserWhenRetrieved() {
        // given:
        User user = new User();
        user.setId(Long.valueOf(0));
        Address address = new Address();
        address.setStreet("My Street");
        user.setAddress(address);
        userService.saveUser(user);

        // when:
        User foundUser = userService.findById(Long.valueOf(0));

        // then:
        assertNotNull(foundUser);
        assertNotNull(foundUser.getAddress());
        assertEquals("My Street", foundUser.getAddress().getStreet());
    }

}
