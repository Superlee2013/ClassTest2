package com.struts2Login.service;

/**
 * Created by Super on 2015/5/28.
 */
public interface LoginServeice {

    /**
     * ��֤�û�����������������Ƿ�ƥ��
     * @param username �û����������
     * @param password �û����������
     * @return ��֤ͨ��������true;��֮������false
     */
    public boolean checkUserLogin(String username, String password);

    /**
     * ����û����Ƿ����
     * @param username �û�ע����û���
     * @return ��֤ͨ��������true;��֮������false
     */
    public boolean checkUsernameExist(String username);
}
