package com.app.domain.vo;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class ProductVO {
    private Long id;
    private String productName;
    private Integer productPrice;
}
