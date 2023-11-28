package com.esafirm.imagepickerv2.features;

import com.esafirm.imagepickerv2.features.common.MvpView;
import com.esafirm.imagepickerv2.model.Folder;
import com.esafirm.imagepickerv2.model.Image;

import java.util.List;

public interface ImagePickerView extends MvpView {
    void showLoading(boolean isLoading);
    void showFetchCompleted(List<Image> images, List<Folder> folders);
    void showError(Throwable throwable);
    void showEmpty();
    void showCapturedImage();
    void finishPickImages(List<Image> images);
}
