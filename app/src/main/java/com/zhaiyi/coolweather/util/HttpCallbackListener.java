package com.zhaiyi.coolweather.util;

/**
 * Created by yzhai on 7/1/16.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
