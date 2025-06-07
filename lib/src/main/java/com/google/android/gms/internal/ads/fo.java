package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public abstract class fo {

    /* renamed from: a, reason: collision with root package name */
    private static final ey3 f8349a = new Cdo();

    public static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 1000) {
            return 0;
        }
        return AdError.NO_FILL_ERROR_CODE;
    }
}
