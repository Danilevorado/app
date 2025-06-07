package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ih extends je {

    /* renamed from: b, reason: collision with root package name */
    public Long f9741b;

    /* renamed from: c, reason: collision with root package name */
    public Long f9742c;

    /* renamed from: d, reason: collision with root package name */
    public Long f9743d;

    /* renamed from: e, reason: collision with root package name */
    public Long f9744e;

    /* renamed from: f, reason: collision with root package name */
    public Long f9745f;

    public ih(String str) {
        HashMap mapA = je.a(str);
        if (mapA != null) {
            this.f9741b = (Long) mapA.get(0);
            this.f9742c = (Long) mapA.get(1);
            this.f9743d = (Long) mapA.get(2);
            this.f9744e = (Long) mapA.get(3);
            this.f9745f = (Long) mapA.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f9741b);
        map.put(1, this.f9742c);
        map.put(2, this.f9743d);
        map.put(3, this.f9744e);
        map.put(4, this.f9745f);
        return map;
    }
}
