package com.sda.wedding.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
//@EqualsAndHashCode(exclude = {"band", "hall"})
//@ToString(exclude = {"band", "hall"})
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String login;

//    @ManyToOne
//    private Band band;
//
//    @ManyToOne
//    private Hall hall;




}
