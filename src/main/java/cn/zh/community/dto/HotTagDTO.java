package cn.zh.community.dto;

import lombok.Data;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 15:04
 * @description:
 */
@Data
public class HotTagDTO implements Comparable {
    private String name;
    private Integer priority;

    @Override
    public int compareTo(Object o) {
        return this.getPriority() - ((HotTagDTO) o).getPriority();
    }
}
