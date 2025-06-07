package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zc2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18518a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18519b;

    zc2(String str, String str2) {
        this.f18518a = str;
        this.f18519b = str2;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.h(new bd2(this.f18518a, this.f18519b));
    }
}
