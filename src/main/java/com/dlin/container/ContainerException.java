package com.dlin.container;

/**
 * @author created by XD.Wang
 * Date 2020/9/7.
 */
public class ContainerException extends RuntimeException {

    public ContainerException(String message) {
        super(message);
    }

    public ContainerException(String message, Throwable cause) {
        super(message, cause);
    }
}
