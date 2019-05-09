package util;

import java.util.List;

/**
 * 分页结果类
 *
 * @param <T>
 */
public class PageResult<T> {
    private Long total;

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;

    }

    public List<T> getRows() {
        return rows;
    }

    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }
    //getter      and      setter      ....
}