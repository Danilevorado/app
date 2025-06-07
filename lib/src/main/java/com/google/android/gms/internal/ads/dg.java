package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class dg extends je {

    /* renamed from: b, reason: collision with root package name */
    public Long f7285b;

    /* renamed from: c, reason: collision with root package name */
    public Long f7286c;

    /* renamed from: d, reason: collision with root package name */
    public Long f7287d;

    public dg(String str) {
        HashMap mapA = je.a(str);
        if (mapA != null) {
            this.f7285b = (Long) mapA.get(0);
            this.f7286c = (Long) mapA.get(1);
            this.f7287d = (Long) mapA.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f7285b);
        map.put(1, this.f7286c);
        map.put(2, this.f7287d);
        return map;
    }
}
