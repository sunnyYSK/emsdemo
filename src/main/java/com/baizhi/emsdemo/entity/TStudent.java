package com.baizhi.emsdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TStudent)实体类
 *
 * @author makejava
 * @since 2019-02-20 16:39:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TStudent implements Serializable {

    private Integer id;
    
    private String name;
    
    private Integer age;
    
    private Integer sex;

}