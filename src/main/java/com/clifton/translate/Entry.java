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
        System.out.println(jsonStr);

        JSONObject jsonObject = (JSONObject) JSONArray.parseObject(jsonStr, Feature.OrderedField);
        System.out.println("----------------------------");
        String string = jsonObject.getString("common.alarmSmsManage");
        System.out.println("----------------------------");
        System.out.println(string);

        jsonObject.forEach((key, value) -> {
            System.out.println(key + "---" + value);
        });
//将json转换为json字符串
        String newJsonString = jsonObject.toString();
        System.out.println("----------------------------");
        System.out.println(newJsonString);
//        JsonUtils.writeJsonFile(newJsonString, path);
    }

}
