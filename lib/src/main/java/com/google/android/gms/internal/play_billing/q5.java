package com.google.android.gms.internal.play_billing;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
final class q5 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    static final r1 f19630a = new q5();

    private q5() {
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final boolean a(int i10) {
        if (i10 == 17) {
            return true;
        }
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
                return true;
            default:
                return false;
        }
    }
}
