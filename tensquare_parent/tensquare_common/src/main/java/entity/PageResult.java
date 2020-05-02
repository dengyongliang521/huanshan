package entity;

import java.util.List;

/**
 * @Auther: dengYongLiang
 * @Date: 2020/04/15 17:32
 * @Description:
 * @Version 1.0
 */
public class PageResult<T> {
    private long total;
    private List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
