package com.app.domain.vo;

import lombok.Data;

@Data
public class UserVO {
    private Long id;
    private String userName;
    private Integer userAge;
    private String userEmail;
    private String userPhone;
}
