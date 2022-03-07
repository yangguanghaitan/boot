package com.logistics.common.exception.user;

import com.bootlearn.boot.exception.common.user.UserException;

/**
 * 用户错误记数异常类
 * 
 * @author logistics
 */
public class UserPasswordRetryLimitCountException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitCountException(int retryLimitCount)
    {
        super("user.password.retry.limit.count", new Object[] { retryLimitCount });
    }
}
