package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yd1 {

    /* renamed from: a, reason: collision with root package name */
    qv f17972a;

    /* renamed from: b, reason: collision with root package name */
    nv f17973b;

    /* renamed from: c, reason: collision with root package name */
    dw f17974c;

    /* renamed from: d, reason: collision with root package name */
    aw f17975d;

    /* renamed from: e, reason: collision with root package name */
    n00 f17976e;

    /* renamed from: f, reason: collision with root package name */
    final q.g f17977f = new q.g();

    /* renamed from: g, reason: collision with root package name */
    final q.g f17978g = new q.g();

    public final yd1 a(nv nvVar) {
        this.f17973b = nvVar;
        return this;
    }

    public final yd1 b(qv qvVar) {
        this.f17972a = qvVar;
        return this;
    }

    public final yd1 c(String str, wv wvVar, tv tvVar) {
        this.f17977f.put(str, wvVar);
        if (tvVar != null) {
            this.f17978g.put(str, tvVar);
        }
        return this;
    }

    public final yd1 d(n00 n00Var) {
        this.f17976e = n00Var;
        return this;
    }

    public final yd1 e(aw awVar) {
        this.f17975d = awVar;
        return this;
    }

    public final yd1 f(dw dwVar) {
        this.f17974c = dwVar;
        return this;
    }

    public final ae1 g() {
        return new ae1(this);
    }
}
