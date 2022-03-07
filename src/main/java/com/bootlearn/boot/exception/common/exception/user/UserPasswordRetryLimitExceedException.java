package com.logistics.common.exception.user;

import com.bootlearn.boot.exception.common.user.UserException;

/**
 * 用户错误最大次数异常类
 * 
 * @author logistics
 */
public class UserPasswordRetryLimitExceedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitExceedException(int retryLimitCount)
    {
        super("user.password.retry.limit.exceed", new Object[] { retryLimitCount });
    }
}
