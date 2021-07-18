package com.github.aleffalves.pointacess.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Company {
    @Id
    private long id;
    private String description;
    private String cnpj;
    private String adress;
    private String district;
    private String city;
    private String state;
    private String number;
}
