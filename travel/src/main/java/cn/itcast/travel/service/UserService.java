package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {

    public boolean regist(User user);

    public boolean active(String code);

    public User findUserByup(User user);
}
