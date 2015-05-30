package com.struts2Login.dao;

import com.struts2Login.bean.User;

/**
 * Created by Super on 2015/5/28.
 */
public interface WriteData {
    /**
     * 将数据写入一个txt文件
     * @param filename
     * @param user
     */
    public void write(String filename,User user);
}
