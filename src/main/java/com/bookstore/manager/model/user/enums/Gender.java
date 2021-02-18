package com.bookstore.manager.model.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    Male("Male"),
    FEMALE("Female");
    private String description;

}
