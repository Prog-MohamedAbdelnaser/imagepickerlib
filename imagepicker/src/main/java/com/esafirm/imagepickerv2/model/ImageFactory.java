package com.esafirm.imagepickerv2.model;

import com.esafirm.imagepickerv2.helper.ImagePickerUtils;

import java.util.ArrayList;
import java.util.List;

public class ImageFactory {

    public static List<Image> singleListFromPath(String path) {
        List<Image> images = new ArrayList<>();
        images.add(new Image(0, ImagePickerUtils.getNameFromFilePath(path), path));
        return images;
    }
}
