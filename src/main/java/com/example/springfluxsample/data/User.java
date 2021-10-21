package com.example.springfluxsample.data;

import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.example.springfluxsample.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("users")
@EqualsAndHashCode(callSuper = true)
@Entity
public class User extends BaseEntity<Long> {

    private String name;
    private String email;
    private String password;
}
