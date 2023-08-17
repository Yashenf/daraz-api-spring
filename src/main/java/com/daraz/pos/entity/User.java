package com.daraz.pos.entity;

import com.daraz.pos.entity.sheard.FileResource;
import com.daraz.pos.entity.sheard.UserFullNameResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    private String propertyId;
    @Embedded
    private UserFullNameResource fullName;
    private String email;
    private String password;
    private String prefix;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;
    @Embedded
    private FileResource avatar;
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Orders> ordersList;
    @OneToMany(mappedBy = "user")
    private List<Favorite> favorites;
}
