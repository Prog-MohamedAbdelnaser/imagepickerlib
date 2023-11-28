package com.esafirm.imagepickerv2.features.camera;

import android.content.Context;
import android.content.Intent;

import com.esafirm.imagepickerv2.features.common.BaseConfig;

public interface CameraModule {
    Intent getCameraIntent(Context context, BaseConfig config);
    void getImage(Context context, Intent intent, OnImageReadyListener imageReadyListener);
    void removeImage();
}
