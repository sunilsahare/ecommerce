package com.ecommerce.common.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    private Long userId;
    private String username;
    private String password;
    private String Role;
    private boolean active;
    private boolean deleted;
    private Long userInfoId;
    private UserInfoDto userInfo;
}
