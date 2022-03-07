package com.bootlearn.boot.exception.common.user;
//package com.logistics.common.exception.user;

//import com.logistics.common.exception.base.BaseException;

import com.bootlearn.boot.exception.common.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author logistics
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
