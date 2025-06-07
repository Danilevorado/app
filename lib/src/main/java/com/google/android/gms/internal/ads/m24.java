package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
final class m24 implements fy3 {

    /* renamed from: a, reason: collision with root package name */
    static final fy3 f11916a = new m24();

    private m24() {
    }

    @Override // com.google.android.gms.internal.ads.fy3
    public final boolean a(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
            case 8:
            case 9:
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                return true;
            default:
                return false;
        }
    }
}
