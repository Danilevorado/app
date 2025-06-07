package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class g {
    public static boolean a() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
}
