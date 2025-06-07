package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class md3 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f12067a;

    /* renamed from: b, reason: collision with root package name */
    private final hd3 f12068b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f12069c;

    /* renamed from: d, reason: collision with root package name */
    private final xn3 f12070d;

    /* synthetic */ md3(ConcurrentMap concurrentMap, hd3 hd3Var, xn3 xn3Var, Class cls, ld3 ld3Var) {
        this.f12067a = concurrentMap;
        this.f12068b = hd3Var;
        this.f12069c = cls;
        this.f12070d = xn3Var;
    }

    public final hd3 a() {
        return this.f12068b;
    }

    public final xn3 b() {
        return this.f12070d;
    }

    public final Class c() {
        return this.f12069c;
    }

    public final Collection d() {
        return this.f12067a.values();
    }

    public final List e(byte[] bArr) {
        List list = (List) this.f12067a.get(new jd3(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean f() {
        return !this.f12070d.a().isEmpty();
    }
}
