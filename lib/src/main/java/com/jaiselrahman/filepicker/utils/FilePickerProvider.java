package com.jaiselrahman.filepicker.utils;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.b;
import java.io.File;

/* loaded from: classes.dex */
public class FilePickerProvider extends b {
    public static String i(Context context) {
        return context.getPackageName() + ".filepicker.provider";
    }

    public static Uri j(Context context, File file) {
        return b.f(context, i(context), file);
    }
}
