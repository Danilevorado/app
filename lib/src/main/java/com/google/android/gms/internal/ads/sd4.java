package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class sd4 implements dd4 {
    protected sd4(rd4 rd4Var) {
    }

    protected static int a(int i10, int i11, int i12) {
        return k83.a(((i10 * i11) * i12) / 1000000);
    }

    protected static int b(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                return 63750;
        }
    }
}
