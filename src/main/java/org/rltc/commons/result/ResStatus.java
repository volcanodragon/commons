package org.rltc.commons.result;

/**
 * 结果状态枚举
 */
public enum ResStatus {

    /**
     * 成功
     */
    SUCCESS(0, "success"),
    /**
     * 失败
     */
    FAIL(1, "fail");

    /**
     * 状态码
     */
    private final int code;
    /**
     * 状态值
     */
    private final String val;

    ResStatus(int code, String val) {
        this.code = code;
        this.val = val;
    }

    public int getCode() {
        return code;
    }

    public String getVal() {
        return val;
    }
}
