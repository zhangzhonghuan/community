package cn.zh.community.enums;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 15:09
 * @description:
 */
public enum NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
