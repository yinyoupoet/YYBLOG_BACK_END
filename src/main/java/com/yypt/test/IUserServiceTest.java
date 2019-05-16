package com.yypt.test;

/**
 * @ClassName IUserServiceTest
 * @Description TODO
 * @Author hasee
 * @Date 2019-04-17 22:48
 * Version 1.0
 */


import com.yypt.entity.UserAccount;
import com.yypt.service.UserAccountService;
import com.yypt.service.impl.IUserAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class IUserServiceTest {

    @Resource
    private UserAccountService userAccountService;
    @Test
    public void getUserByIdTest(){

        UserAccount userAccount = UserAccount.builder()
                .userId(2)
                .userName("sada")
                .userPwd("asdas")
                .build();
        userAccountService.insert(userAccount);
        System.out.println(userAccount);
    }
}
