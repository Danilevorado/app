package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* loaded from: classes.dex */
abstract /* synthetic */ class lk0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f11644a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f11644a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11644a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11644a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11644a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11644a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
