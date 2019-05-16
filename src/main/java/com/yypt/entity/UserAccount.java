package com.yypt.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@TableName("user_account")
@Builder
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor()
public class UserAccount {
    @TableField(value = "user_id")
    private Integer userId;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "user_pwd")
    private String userPwd;
}