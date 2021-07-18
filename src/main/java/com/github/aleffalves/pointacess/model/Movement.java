package com.github.aleffalves.pointacess.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class MovementId implements Serializable {
        private long movementId;
        private long userId;
    }

    @EmbeddedId
    @Id
    private MovementId id;
    private LocalDateTime dateEntry;
    private LocalDateTime exitDate;
    private BigDecimal period;
    @ManyToOne
    private Ocurrence ocurrence;
    @ManyToOne
    private Calendar calendar;
}
