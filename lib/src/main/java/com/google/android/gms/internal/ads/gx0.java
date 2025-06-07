package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class gx0 implements hx0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8901a;

    gx0(Map map) {
        this.f8901a = map;
    }

    @Override // com.google.android.gms.internal.ads.hx0
    public final az1 a(int i10, String str) {
        return (az1) this.f8901a.get(str);
    }
}
