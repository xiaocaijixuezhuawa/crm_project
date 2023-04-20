package com.zll.crm.settings.service;

import com.zll.crm.settings.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    User queryUserByLoginActAndPwd(Map<String, Object> map);

    List<User> queryAllUsers();

    int saveNewUser(User user);
}
