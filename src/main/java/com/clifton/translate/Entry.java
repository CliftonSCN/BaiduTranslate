package com.clifton.translate;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

/**
 * @author Clifton
 * @create 2020/8/17 - 17:06
 */
public class Entry {

    public static void main(String[] args) {
        String path = "F:\\WorkSpace\\BaiduTranslate\\src\\main\\java\\com\\clifton\\translate\\il8n\\zh.json";
        String jsonStr = JsonUtils.readJsonFile(path);

        JSONObject jsonArray = (JSONObject) JSONArray.parse(jsonStr);

        System.out.println(jsonArray);

//将json转换为json字符串
        String newJsonString = jsonArray.toString();
        JsonUtils.writeJsonFile(newJsonString, path);
    }

}
