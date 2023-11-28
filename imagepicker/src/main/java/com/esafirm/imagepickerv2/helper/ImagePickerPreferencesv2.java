package com.esafirm.imagepickerv2.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class ImagePickerPreferencesv2 {

    public static final String PREF_WRITE_EXTERNAL_STORAGE_REQUESTED = "writeExternalRequested";
    public static final String PREF_CAMERA_REQUESTED = "cameraRequested";

    private Context context;

    public ImagePickerPreferencesv2(Context context) {
        this.context = context;
    }

    /**
     * Set a permission is requested
     */
    public void setPermissionRequested(String permission) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(permission, true);
        editor.apply();
    }

    /**
     * Check if a permission is requestted or not (false by default)
     */
    public boolean isPermissionRequested(String permission) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(permission, false);
    }
}
