package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ig extends je {

    /* renamed from: b, reason: collision with root package name */
    public long f9722b;

    /* renamed from: c, reason: collision with root package name */
    public long f9723c;

    public ig(String str) {
        this.f9722b = -1L;
        this.f9723c = -1L;
        HashMap mapA = je.a(str);
        if (mapA != null) {
            this.f9722b = ((Long) mapA.get(0)).longValue();
            this.f9723c = ((Long) mapA.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f9722b));
        map.put(1, Long.valueOf(this.f9723c));
        return map;
    }
}
