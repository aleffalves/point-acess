package com.github.aleffalves.pointacess.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Ocurrence {
    private long id;
    private String name;
    private String description;
}
