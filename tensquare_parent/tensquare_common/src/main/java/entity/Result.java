package entity;

/**
 * @Auther: dengYongLiang
 * @Date: 2020/04/15 17:24
 * @Description:
 * @Version 1.0
 */
public class Result {
    private boolean flag;
    private Integer code;
    private String message;
    private Object data;

    public Result() {
    }

    /**
     * 功能描述:3个参数的适用于增删改
     *
     * @param:
     * @return:
     * @auther: TB-HTZY
     * @date: 2020/4/15 17:30
     */
    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
    /**
     * 功能描述:适用于查询
     * @param:
     * @return:
     * @auther: TB-HTZY
     * @date: 2020/4/15 17:31
     */

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

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

    public Object getData() {

        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
