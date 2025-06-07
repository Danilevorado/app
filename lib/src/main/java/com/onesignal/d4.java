package com.onesignal;

import java.io.File;

/* loaded from: classes.dex */
abstract class d4 {
    static boolean a() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i10 = 0; i10 < 8; i10++) {
            try {
                if (new File(strArr[i10] + "su").exists()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
