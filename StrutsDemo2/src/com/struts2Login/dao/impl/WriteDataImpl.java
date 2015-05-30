package com.struts2Login.dao.impl;

import com.struts2Login.bean.User;
import com.struts2Login.dao.WriteData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;

/**
 * Created by Super on 2015/5/28.
 */
public class WriteDataImpl implements WriteData {
    @Override
    public void write(String filename, User user) {
        /*DateFormat sf=DateFormat.getDateInstance(DateFormat.DATE_FIELD);

        String birthday=sf.format(user.getBirthday());
        String graduation=sf.format(user.getGraduation());*/

        /*String dataString = user.getUsername() + "," + user.getPassword()+","+user.getRepassword()
                + "," + user.getAge() + "," +user.getEmail()+","+ birthday + "," + graduation;

*/      String dataString = user.getUsername() + "," + user.getPassword();
        try {
            BufferedWriter out=new BufferedWriter(new FileWriter(new File(filename),true));
            out.write(dataString+"\r\n");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
