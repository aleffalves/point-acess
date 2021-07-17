package com.github.aleffalves.pointacess.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Location {
    private long id;
    @ManyToOne
    private AcessLevel acessLevel;
    private String description;
}
