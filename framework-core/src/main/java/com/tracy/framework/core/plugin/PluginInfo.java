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
    private Icon icon;
    private P plugin;
    //运行时文件夹
    private String runtimeFolder;

    private Map<String,String> config;

    public String getId() {
        return id;
    }

    public PluginInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PluginInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PluginInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public PluginInfo setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public PluginInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getClazz() {
        return clazz;
    }

    public PluginInfo setClazz(String clazz) {
        this.clazz = clazz;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public PluginInfo setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public PluginInfo setEvent(String event) {
        this.event = event;
        return this;
    }

    public Icon getIcon() {
        return icon;
    }

    public PluginInfo setIcon(Icon icon) {
        this.icon = icon;
        return this;
    }

    public P getPlugin() {
        return plugin;
    }

    public PluginInfo setPlugin(P plugin) {
        this.plugin = plugin;
        return this;
    }

    public String getRuntimeFolder() {
        return runtimeFolder;
    }

    public PluginInfo setRuntimeFolder(String runtimeFolder) {
        this.runtimeFolder = runtimeFolder;
        return this;
    }

    public Map<String, String> getConfig() {
        return config;
    }

    public PluginInfo setConfig(Map<String, String> config) {
        this.config = config;
        return this;
    }
}
