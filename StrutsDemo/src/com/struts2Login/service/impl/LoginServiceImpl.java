package com.struts2Login.service.impl;

import com.struts2Login.dao.ReadData;
import com.struts2Login.dao.impl.ReadDataImpl;
import com.struts2Login.service.LoginServeice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Super on 2015/5/28.
 */
public class LoginServiceImpl implements LoginServeice {

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean isLogin(String username, String password) {
        String filename = "D:\\sql.txt";
        ReadData in = new ReadDataImpl(); // ʵ������ȡ���ݵĶ���
        Map<String, String> map = new HashMap<String, String>();
        map = in.readData(filename); // ���ö�ȡ������ȡ���ݷ���һ��map����
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        for (String name : set) // ����map�е�key
        {
            if (name.equals(username) && password.equals(map.get(name)))
            { // ��֤�ͻ��˴�����username��password���ȡ����key��valueֵ�Ƿ���ͬ
                return true;
            }
        }
        return false;
    }

}
