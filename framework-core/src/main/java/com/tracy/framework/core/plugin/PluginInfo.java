package com.tracy.framework.core.plugin;

import java.util.Map;

/**
 * 插件具体信息，包括插件的配置
 *
 * @author Carl
 * @date 2017/8/11
 * @since JDK1.7
 */
public class PluginInfo<P extends Plugin> {
    //唯一id
    private String id;
    private String name;
    private String description;
    private String author;
    private String createTime;
    //插件类
    private String clazz;
    private String version;
    private String event;
//    private Icon icon;
    private P plugin;
    //运行时文件夹
    private String runtimeFolder;

    private Map<String,String> config;
}
