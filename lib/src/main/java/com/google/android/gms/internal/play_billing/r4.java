package com.google.android.gms.internal.play_billing;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
final class r4 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    static final r1 f19634a = new r4();

    private r4() {
    }

    @Override // com.google.android.gms.internal.play_billing.r1
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
                return true;
            default:
                switch (i10) {
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
