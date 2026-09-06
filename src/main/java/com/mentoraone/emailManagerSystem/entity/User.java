package com.mentoraone.emailManagerSystem.entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    private String fullName;
    private String email;
    private String phoneNumber;



}
