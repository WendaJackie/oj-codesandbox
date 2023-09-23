package com.yupi.yuojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 */
@Data
public class ExecuteMessage {

    /**
     * 程序退出码
     */
    private Integer exitValue;

    /**
     * 程序正常信息
     */
    private String message;

    /**
     * 程序异常信息
     */
    private String errorMessage;

    private Long time;

    private Long memory;
}
