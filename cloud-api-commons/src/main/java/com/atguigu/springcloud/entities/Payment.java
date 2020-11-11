package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author
 * @create 2020-11-05 9:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {


    private Long id;
    //支付流水号
    private String serial;
}
