package com.esafirm.imagepickerv2.helper;

import androidx.core.content.FileProvider;

import com.esafirm.imagepickerv2.features.ImagePickerComponentHolder;

public class ImagePickerFileProvider extends FileProvider {
    @Override
    public boolean onCreate() {
        ImagePickerComponentHolder.getInstance().init(getContext());
        return super.onCreate();
    }
}
