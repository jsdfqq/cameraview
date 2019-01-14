package com.google.android.cameraview;

public interface RecordCallback {
//    void onStart(RecordTask task);
    void onFinish(RecordTask task);
    void onError(RecordTask task, String reason);
}