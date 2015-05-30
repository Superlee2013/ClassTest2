package com.struts2Login.service.impl;

import com.struts2Login.bean.User;
import com.struts2Login.dao.UserDao;
import com.struts2Login.dao.impl.UserDaoImpl;
import com.struts2Login.service.LoginServeice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Super on 2015/5/28.
 */
public class LoginServiceImpl implements LoginServeice {

    private UserDao userDao=new UserDaoImpl();
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    /**
     *��֤�û�����������������Ƿ�ƥ��
     * @param username �û����������
     * @param password �û����������
     * @return ��֤ͨ��������true;��֮������false
     */
    @Override
    public boolean checkUserLogin(String username, String password) {
        /*String filename = "D:\\sql.txt";
        Map<String, String> map = new HashMap<String, String>();
        map=userDao.readData(filename);
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        for (String name : set) // ����map�е�key
        {
            if (name.equals(username) && password.equals(map.get(name)))
            { // ��֤�ͻ��˴�����username��password���ȡ����key��valueֵ�Ƿ���ͬ
                return true;
            }
        }
        return false;*/
        User user=userDao.findUserByName(username);
        if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkUsernameExist(String username) {
        User user=userDao.findUserByName(username);
        if(user.getUsername().length()!=0){
            return true;
        }
        return false;
    }
}
