package com.github.aleffalves.pointacess.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class AcessLevel {
    private long id;
    private String description;
}
