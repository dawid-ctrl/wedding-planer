package com.sda.wedding.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
//@EqualsAndHashCode(exclude = "userSet")
//@ToString(exclude = "userSet")
public class Hall {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private String email;
    private int capacity;
    private boolean isAvailable;

//    @OneToMany(mappedBy = "hall")
//    private Set<User> userSet;
//
//    public void addUser (User user) {
//        userSet.add(user);
//    }
}
