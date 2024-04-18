package com.ecommerce.common.dto;

import com.ecommerce.common.constant.Gender;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserInfoDto {
    private Long userInfoId;
    private Long userId;
    private String email;
    private String fullName;
    private String mobile;
    private String street;
    private String lane;
    private String state;
    private String country;
    private Integer pincode;
    // TODO add Enumerated Annotation
    private Gender gender;
    private String profileUrl;
}
