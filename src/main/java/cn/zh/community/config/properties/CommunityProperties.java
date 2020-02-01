package cn.zh.community.config.properties;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 20:19
 * @description:
 */

@Data
@Component
public class CommunityProperties {

    /**
     * Doc api disabled. (Default is true)
     */
    private boolean docDisabled = true;

    /**
     * Production env. (Default is true)
     */
    private boolean productionEnv = true;

    /**
     * Authentication enabled
     */
    private boolean authEnabled = true;

    /**
     * Admin path.
     */
    private String adminPath = "admin";

    /**
     * Upload prefix.
     */
    private String uploadUrlPrefix = "upload";

}
