package com.logistics.common.exception.user;

import com.bootlearn.boot.exception.common.user.UserException;

/**
 * 用户锁定异常类
 * 
 * @author logistics
 */
public class UserBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserBlockedException()
    {
        super("user.blocked", null);
    }
}
