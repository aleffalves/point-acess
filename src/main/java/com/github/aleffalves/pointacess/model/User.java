package com.github.aleffalves.pointacess.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {
    @Id
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AcessLevel acessLevel;
    @ManyToOne
    private WorkJorney workJorney;
    private BigDecimal tolerance;
    private LocalDateTime journeyStart;
    private LocalDateTime endJourney;

}
