package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ki0 extends yb {

    /* renamed from: c, reason: collision with root package name */
    static final ki0 f11072c = new ki0();

    ki0() {
    }

    @Override // com.google.android.gms.internal.ads.yb
    public final cc b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new ec() : "mvhd".equals(str) ? new fc() : new gc(str);
    }
}
