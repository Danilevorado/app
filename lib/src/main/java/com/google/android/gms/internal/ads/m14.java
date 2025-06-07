package com.google.android.gms.internal.ads;

import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
final class m14 implements fy3 {

    /* renamed from: a, reason: collision with root package name */
    static final fy3 f11902a = new m14();

    private m14() {
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
                return true;
            default:
                return false;
        }
    }
}
