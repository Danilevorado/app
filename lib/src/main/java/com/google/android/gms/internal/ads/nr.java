package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes.dex */
public abstract class nr {
    public static Object a(z33 z33Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return z33Var.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
