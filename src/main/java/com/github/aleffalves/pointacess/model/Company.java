package com.github.aleffalves.pointacess.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Company {
    private long id;
    private String description;
    private String cnpj;
    private String adress;
    private String district;
    private String city;
    private String state;
    private String number;
}
