package com.esafirm.imagepickerv2.features.fileloader;

import com.esafirm.imagepickerv2.features.common.ImageLoaderListener;

import java.io.File;
import java.util.ArrayList;

public interface ImageFileLoader {

    void loadDeviceImages(
            final boolean isFolderMode,
            final boolean onlyVideo,
            final boolean includeVideo,
            final boolean includeAnimation,
            final ArrayList<File> excludedImages,
            final ImageLoaderListener listener
    );

    void abortLoadImages();
}
