package common.resp;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

/**
 * @description: chiyou分页响应体
 * @author: daiyifan
 * @create: 2022/9/9 10:33
 */
@Data
public class ChiyouPage<T> {
    private long current;
    private long size;
    private long total;
    private List<T> records;

    public static <T> ChiyouPage<T> get(Page<T> page) {
        ChiyouPage<T> chiyouPage = new ChiyouPage<>();
        chiyouPage.setCurrent(page.getCurrent());
        chiyouPage.setSize(page.getSize());
        chiyouPage.setRecords(page.getRecords());
        return chiyouPage;
    }
}
