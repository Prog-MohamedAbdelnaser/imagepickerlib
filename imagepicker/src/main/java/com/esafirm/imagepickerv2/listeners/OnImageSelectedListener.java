package com.esafirm.imagepickerv2.listeners;

import com.esafirm.imagepickerv2.model.Image;

import java.util.List;

public interface OnImageSelectedListener {
    void onSelectionUpdate(List<Image> selectedImage);
}
