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
        ReadData in = new ReadDataImpl(); // 实例化读取数据的对象
        Map<String, String> map = new HashMap<String, String>();
        map = in.readData(filename); // 利用读取函数读取数据返回一个map函数
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        for (String name : set) // 迭代map中的key
        {
            if (name.equals(username) && password.equals(map.get(name)))
            { // 验证客户端传进的username和password与读取出的key和value值是否相同
                return true;
            }
        }
        return false;
    }

}
