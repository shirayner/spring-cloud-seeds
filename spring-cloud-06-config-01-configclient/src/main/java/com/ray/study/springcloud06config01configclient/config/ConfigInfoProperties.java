package com.ray.study.springcloud06config01configclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  映射配置信息
 * </p>
 *
 * @author shira 2019/06/02 22:39
 */
@Component
@ConfigurationProperties(prefix = "cn.springcloud.book")
@Data
public class ConfigInfoProperties {

    private String config;
}
