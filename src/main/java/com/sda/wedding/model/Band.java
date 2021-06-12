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
public class Band {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String city;
    private TypeOfMusic music;
    private boolean isAvailable;

//    @OneToMany(mappedBy = "band")
//    private Set<User> userSet;
//
//    public void addUser (User user) {
//        userSet.add(user);
//    }





}
