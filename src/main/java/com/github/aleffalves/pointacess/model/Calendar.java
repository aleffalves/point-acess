package com.github.aleffalves.pointacess.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {
    private long id;
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
