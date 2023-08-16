package com.daraz.pos.entity.sheard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class UserFullNameResource {
    private String firstName;
    private String lastname;
}
