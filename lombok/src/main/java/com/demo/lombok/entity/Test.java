package com.demo.lombok.entity;

import lombok.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Test {
    /**
     * id
     */
    @NonNull
    private Integer id;

    /**
     * 姓名
     */
    private String name;
}
