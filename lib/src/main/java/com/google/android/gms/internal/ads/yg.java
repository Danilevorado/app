package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class yg extends je {

    /* renamed from: b, reason: collision with root package name */
    public Long f18029b;

    /* renamed from: c, reason: collision with root package name */
    public Long f18030c;

    public yg(String str) {
        HashMap mapA = je.a(str);
        if (mapA != null) {
            this.f18029b = (Long) mapA.get(0);
            this.f18030c = (Long) mapA.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.je
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f18029b);
        map.put(1, this.f18030c);
        return map;
    }
}
