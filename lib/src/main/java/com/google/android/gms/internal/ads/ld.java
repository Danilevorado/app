package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public abstract class ld {

    /* renamed from: a, reason: collision with root package name */
    private static final ey3 f11485a = new jd();

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }
}
