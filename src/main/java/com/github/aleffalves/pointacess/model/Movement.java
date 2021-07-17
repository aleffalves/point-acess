package com.github.aleffalves.pointacess.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable {
        private long movementId;
        private long userId;
    }

    @EmbeddedId
    private MovementId id;
    private LocalDateTime dateEntry;
    private LocalDateTime exitDate;
    private BigDecimal period;
    private Ocurrence ocurrence;
    private Calendar calendar;
}
