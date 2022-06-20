package org.rltc.commons.result;

/**
 * 统一返回结果对象
 */
public class Result {

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态描述
     */
    private String message;
    /**
     * 返回数据
     */
    private Object obj;

    public Result() {

    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message, Object obj) {
        this.code = code;
        this.message = message;
        this.obj = obj;
    }

    /**
     * 创建一个成功结果对象
     *
     * @return Result
     */
    public static Result successRes() {
        return new Result(ResStatus.SUCCESS.getCode(), ResStatus.SUCCESS.getVal());
    }

    /**
     * 创建一个失败结果对象
     *
     * @return Result
     */
    public static Result failRes() {
        return new Result(ResStatus.FAIL.getCode(), ResStatus.FAIL.getVal());
    }

    /**
     * 构建一个结果对象
     *
     * @param code 状态码
     * @param message 状态描述
     * @return Result
     */
    public static Result build(int code, String message) {
        return new Result(code, message);
    }

    /**
     * 构建一个结果对象
     *
     * @param code 状态码
     * @param message 状态描述
     * @param obj 返回数据
     * @return Result
     */
    public static Result build(int code, String message, Object obj) {
        return new Result(code, message, obj);
    }

    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Object setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public Result setObj(Object obj) {
        this.obj = obj;
        return this;
    }
}
