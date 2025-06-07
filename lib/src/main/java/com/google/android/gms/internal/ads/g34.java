package com.google.android.gms.internal.ads;

import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
final class g34 implements fy3 {

    /* renamed from: a, reason: collision with root package name */
    static final fy3 f8595a = new g34();

    private g34() {
    }

    @Override // com.google.android.gms.internal.ads.fy3
    public final boolean a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return true;
            default:
                return false;
        }
    }
}
