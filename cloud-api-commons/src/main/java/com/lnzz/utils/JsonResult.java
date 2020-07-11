package com.lnzz.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName：JsonResult
 *
 * @Author 冷暖自知
 * @Date 2020/7/11 22:32
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public JsonResult(Integer code, String message) {
        this(code, message, null);
    }
}
