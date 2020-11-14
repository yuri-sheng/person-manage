package com.shengyu.utils;

import reactor.util.Logger;
import reactor.util.Loggers;

import java.io.Closeable;
import java.io.IOException;

public class IOUtils {
    private static Logger LOGGER = Loggers.getLogger(IOUtils.class);

    /**
     * 关闭流对象
     *
     * @param closeable 流对象
     */
    public static void closeQuick(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            LOGGER.error("IO close failed!", e);
        }
    }
}
