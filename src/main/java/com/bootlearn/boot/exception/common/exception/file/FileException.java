package com.bootlearn.boot.exception.common.file;

//import com.logistics.common.exception.base.BaseException;

import com.bootlearn.boot.exception.common.base.BaseException;

/**
 * 文件信息异常类
 *
 * @author logistics
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
