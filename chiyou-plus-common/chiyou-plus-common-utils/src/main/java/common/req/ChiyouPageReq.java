package common.req;

import lombok.Data;

/**
 * @description: 分页基础类
 * @author: daiyifan
 * @create: 2022/9/8 13:35
 */
@Data
public class ChiyouPageReq {
    int size;
    int current;
}
