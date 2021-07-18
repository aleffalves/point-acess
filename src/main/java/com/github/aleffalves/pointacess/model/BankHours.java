package com.github.aleffalves.pointacess.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BankHours {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class BankHoursId implements Serializable{
        private long bankHoursId;
        private long movementId;
        private long userId;
    }
    @EmbeddedId
    @Id
    private BankHoursId id;
    private LocalDateTime dateWorked;
    private BigDecimal numberHours;
    private BigDecimal balanceHours;
}
