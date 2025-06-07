package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ug extends je {

    /* renamed from: b, reason: collision with root package name */
    public Long f16323b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f16324c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f16325d;

    public ug(String str) {
        HashMap mapA = je.a(str);
        if (mapA != null) {
            this.f16323b = (Long) mapA.get(0);
            this.f16324c = (Boolean) mapA.get(1);
            this.f16325d = (Boolean) mapA.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f16323b);
        map.put(1, this.f16324c);
        map.put(2, this.f16325d);
        return map;
    }
}
