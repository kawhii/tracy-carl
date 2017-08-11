package com.tracy.framework.core.plugin;

/**
 * 插件的最底层接口
 *
 * @author Carl
 * @date 2017/8/11
 * @since JDK1.7
 */
public interface Plugin {

    /**
     * 初始化时被执行
     */
    void init();

    /**
     * 销毁时被执行
     */
    void destroy();
}
