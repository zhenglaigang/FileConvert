package com.example.demo.ali;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix = "xxxx")
public class ThirdPartProperties {
    private String accessKeyId;
    private String accessKeySecret;
    private String endpoint;
    private Integer version;
    private String project;
    private String ossEndpoint;
    // oss文件源地址
    private String ossBucket;
    // 文件当前地址
    private String ossStoragePath;
    private String notifyEndpoint;
    private String notifyTopicName;
    // 空白合同模板
    private String blankDoc;
    // 临时文件存放
    private String tempFileDir;
}
