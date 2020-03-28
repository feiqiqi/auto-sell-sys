package com.auto.vo;

import lombok.Data;

import java.util.Map;

@Data
public class ResultValue implements java.io.Serializable {

    private static final long serialVersionUID = -7333058567132357663L;

    /**
     * 设置当前返回结果的状态：0表示成功，1表示失败
     */
    private Integer code;
    /**
     * 设置返回类型
     */
    private String message;
    /**
     * 设置返回数据
     */
    private Map<String, Object> dataMap;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }
}
