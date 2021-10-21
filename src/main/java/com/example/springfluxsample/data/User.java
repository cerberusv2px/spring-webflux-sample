package com.example.springfluxsample.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.example.springfluxsample.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("users")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity<Long> {

    private String name;
    private String email;
    private String password;
}
