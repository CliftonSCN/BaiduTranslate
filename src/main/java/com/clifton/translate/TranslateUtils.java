package com.clifton.translate;

import okhttp3.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.text.StringEscapeUtils;

import java.io.IOException;

/**
 * @author Clifton
 * @create 2020/8/12 - 15:18
 */
public class TranslateUtils {

    static String url = "http://api.fanyi.baidu.com/api/trans/vip/translate"; // 请求链接
    static String App_id = "20200812000540942";
    static String KEY = "5TCEJj2txhSZdZ2TuiXt";
    static String salt = "123qwe";

    public static void main(String[] args) {
        postFromParameters();
    }


    public static void postFromParameters() {
        String q = "你好";
        String from = "auto";
        String to = "en";
        String sign = generateSign(q);
        OkHttpClient okHttpClient = new OkHttpClient(); // OkHttpClient对象
        RequestBody formBody = new FormBody.Builder()
                .add("q", q)
                .add("from", from)
                .add("to", to)
                .add("appid", App_id)
                .add("salt", salt)
                .add("sign", sign)
                .build(); // 表单键值对
        Request request = new Request.Builder().url(url).post(formBody).build(); // 请求
        okHttpClient.newCall(request).enqueue(new Callback() {// 回调

            public void onResponse(Call call, Response response) throws IOException {
                String s = StringEscapeUtils.unescapeJava(response.body().string());
                System.out.println(s);
            }

            public void onFailure(Call call, IOException e) {
                System.out.println(e.getMessage());//失败后的回调
            }
        });
    }

    private static String generateSign(String q) {
        String tmp = App_id + q + salt + KEY;
        return DigestUtils.md5Hex(tmp);
    }

}
