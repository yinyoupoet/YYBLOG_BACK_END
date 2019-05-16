package com.yypt.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yypt.entity.UserAccount;
import com.yypt.mapper.UserAccountMapper;
import com.yypt.service.impl.IUserAccountService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserAccountService
 * @Description TODO
 * @Author hasee
 * @Date 2019-04-17 23:31
 * Version 1.0
 */
@Service
public class UserAccountService extends ServiceImpl<UserAccountMapper , UserAccount>{
}
