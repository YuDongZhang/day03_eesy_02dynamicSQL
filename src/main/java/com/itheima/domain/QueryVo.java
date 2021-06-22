package com.itheima.domain;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * 把实际的对象再包装一层 , 在开发中由多个对象,组合起来的
 */
public class QueryVo {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
