package cn.yhq.http.core;

import android.content.Context;

public class HttpRequestListener implements IHttpRequestListener {

    @Override
    public void onStart(Context context, ICancelable cancelable, int requestCode) {

    }

    @Override
    public void onException(Context context, int requestCode, Throwable t) {

    }

    @Override
    public void onComplete(int requestCode) {

    }

    @Override
    public void onRequestProgress(boolean multipart, long bytesRead, long contentLength, boolean done) {

    }

    @Override
    public void onResponseProgress(boolean multipart, long bytesRead, long contentLength, boolean done) {

    }

}
