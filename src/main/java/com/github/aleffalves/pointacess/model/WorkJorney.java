package com.github.aleffalves.pointacess.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class WorkJorney {
    private long id;
    private String description;
}
