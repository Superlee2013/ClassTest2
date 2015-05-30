package com.struts2Login.dao;

import java.util.Map;

/**
 * Created by Super on 2015/5/28.
 */
public interface ReadData {

    /**
     * 接口文件模拟从数据库中读出数据放入Map中返回
     * @param filename
     * @return
     */
    public Map<String,String> readData(String filename);
}
