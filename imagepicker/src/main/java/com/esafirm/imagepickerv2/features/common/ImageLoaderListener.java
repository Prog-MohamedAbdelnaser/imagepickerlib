package com.esafirm.imagepickerv2.features.common;

import com.esafirm.imagepickerv2.model.Folder;
import com.esafirm.imagepickerv2.model.Image;

import java.util.List;

public interface ImageLoaderListener {
    void onImageLoaded(List<Image> images, List<Folder> folders);
    void onFailed(Throwable throwable);
}
