package com.logistics.common.exception.user;

import com.bootlearn.boot.exception.common.user.UserException;

/**
 * 用户密码不正确或不符合规范异常类
 * 
 * @author logistics
 */
public class UserPasswordNotMatchException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
