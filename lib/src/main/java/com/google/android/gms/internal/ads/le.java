package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class le extends je {

    /* renamed from: b, reason: collision with root package name */
    public String f11517b;

    /* renamed from: c, reason: collision with root package name */
    public long f11518c;

    /* renamed from: d, reason: collision with root package name */
    public String f11519d;

    /* renamed from: e, reason: collision with root package name */
    public String f11520e;

    /* renamed from: f, reason: collision with root package name */
    public String f11521f;

    public le(String str) {
        this.f11517b = "E";
        this.f11518c = -1L;
        this.f11519d = "E";
        this.f11520e = "E";
        this.f11521f = "E";
        HashMap mapA = je.a(str);
        if (mapA != null) {
            this.f11517b = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f11518c = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f11519d = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f11520e = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f11521f = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f11517b);
        map.put(4, this.f11521f);
        map.put(3, this.f11520e);
        map.put(2, this.f11519d);
        map.put(1, Long.valueOf(this.f11518c));
        return map;
    }
}
