package com.struts2Login.dao.impl;

import com.struts2Login.dao.ReadData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Super on 2015/5/28.
 */
public class ReadDataImpl implements ReadData {

    @Override
    public Map<String, String> readData(String filename) {
        Map<String, String> map = new HashMap<String, String>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String dataString = null;
            while ((dataString = in.readLine()) != null) {
                String[] data=dataString.split(",");
                map.put(data[0],data[1]);

            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }
}
