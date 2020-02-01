package cn.zh.community.utils;

import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 20:30
 * @description:
 */
@Slf4j
public class CommunityUtils {

    public static String getMachineIP() {
        InetAddress machineAddress;
        try {
            machineAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            machineAddress = InetAddress.getLoopbackAddress();
        }
        return machineAddress.getHostAddress();
    }
}