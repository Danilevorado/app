package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class jb3 {
    static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
