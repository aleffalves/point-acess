package com.github.aleffalves.pointacess.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Location {
    @Id
    private long id;
    @ManyToOne
    private AcessLevel acessLevel;
    private String description;
}
