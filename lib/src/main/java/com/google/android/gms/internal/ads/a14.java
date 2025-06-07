package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
final class a14 implements fy3 {

    /* renamed from: a, reason: collision with root package name */
    static final fy3 f5911a = new a14();

    private a14() {
    }

    @Override // com.google.android.gms.internal.ads.fy3
    public final boolean a(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case AdError.NETWORK_ERROR_CODE /* 1000 */:
                case AdError.NO_FILL_ERROR_CODE /* 1001 */:
                case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /* 1002 */:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
