package com.sda.wedding.repository.data;

import com.sda.wedding.model.Band;
import com.sda.wedding.model.Hall;
import com.sda.wedding.model.User;
import com.sda.wedding.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class UserMockData {
    
    private final UserRepository repository;

    @PostConstruct
    public void addMockUsers () {
        List<User> users = List.of(
                createUser("Jan","Kowalski","jankow"),
                createUser("Anita","Nowak","aninow"),
                createUser("Tomasz","Jakis","tomjak"),
                createUser("Anna","Kowalska","annkow")
        );
        users.forEach(repository::save);
    }

    private User createUser(String name, String surname, String login) {
        return new User()
                .setName(name)
                .setSurname(surname)
                .setLogin(login);

    }
}
