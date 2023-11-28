package com.esafirm.imagepickerv2.features.camera;

import com.esafirm.imagepickerv2.model.Image;

import java.util.List;

public interface OnImageReadyListener {
    void onImageReady(List<Image> image);
}
