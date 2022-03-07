package com.logistics.common.exception.user;

import com.bootlearn.boot.exception.common.user.UserException;

/**
 * 角色锁定异常类
 * 
 * @author logistics
 */
public class RoleBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public RoleBlockedException()
    {
        super("role.blocked", null);
    }
}
