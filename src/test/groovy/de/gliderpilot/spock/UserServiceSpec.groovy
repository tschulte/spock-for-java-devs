package de.gliderpilot.spock

import spock.lang.Specification
import spock.lang.Subject

public class UserServiceSpec extends Specification {

    @Subject
    private UserService userService = new UserService()

    def "returns empty optional when no user added yet"() {
        when: "I call findById when no user was added yet"
        User user = userService.findById(Long.valueOf(0))

        then: "null is returned"
        !user
    }

    def "returns added user when retrieved"() {
        given: "A user with id 0 was added"
        User user = new User(id: 0, address: new Address(street: "My Street"))
        userService.saveUser(user)

        when: "I retrieve the user with id 0"
        User foundUser = userService.findById(Long.valueOf(0))

        then: "the user is retrieved"
        foundUser?.getAddress()?.getStreet() == "My Street"
    }

}
