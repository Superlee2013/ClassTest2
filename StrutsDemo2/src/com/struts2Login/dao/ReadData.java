package com.struts2Login.dao;

import java.util.Map;

/**
 * Created by Super on 2015/5/28.
 */
public interface ReadData {

    /**
     * �ӿ��ļ�ģ������ݿ��ж������ݷ���Map�з���
     * @param filename
     * @return
     */
    public Map<String,String> readData(String filename);
}
