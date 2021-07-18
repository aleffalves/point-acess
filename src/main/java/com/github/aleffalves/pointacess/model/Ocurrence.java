package com.github.aleffalves.pointacess.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocurrence {
    @Id
    private long id;
    private String name;
    private String description;
}
