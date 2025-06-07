package com.onesignal;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
abstract class r3 {
    static SimpleDateFormat a() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
