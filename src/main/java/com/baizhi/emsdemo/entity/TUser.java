package com.baizhi.emsdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2019-02-20 17:04:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUser implements Serializable {

    private String id;
    
    private String username;
    
    private String password;
    
    private String realname;
    
    private Integer sex;
    
    private Date birth;
    
    private String mobile;
    
    private String email;
    
    private String pic;
    
    private String deptId;
    
    private Integer status;

}