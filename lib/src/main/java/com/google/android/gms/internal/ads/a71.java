package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a71 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f5956a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set f5957b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set f5958c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Set f5959d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set f5960e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Set f5961f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Set f5962g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final Set f5963h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Set f5964i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final Set f5965j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Set f5966k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final Set f5967l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private final Set f5968m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final Set f5969n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private tk2 f5970o;

    public final a71 d(k3.a aVar, Executor executor) {
        this.f5958c.add(new x81(aVar, executor));
        return this;
    }

    public final a71 e(o11 o11Var, Executor executor) {
        this.f5964i.add(new x81(o11Var, executor));
        return this;
    }

    public final a71 f(b21 b21Var, Executor executor) {
        this.f5967l.add(new x81(b21Var, executor));
        return this;
    }

    public final a71 g(f21 f21Var, Executor executor) {
        this.f5961f.add(new x81(f21Var, executor));
        return this;
    }

    public final a71 h(l11 l11Var, Executor executor) {
        this.f5960e.add(new x81(l11Var, executor));
        return this;
    }

    public final a71 i(a31 a31Var, Executor executor) {
        this.f5963h.add(new x81(a31Var, executor));
        return this;
    }

    public final a71 j(m31 m31Var, Executor executor) {
        this.f5962g.add(new x81(m31Var, executor));
        return this;
    }

    public final a71 k(l3.t tVar, Executor executor) {
        this.f5969n.add(new x81(tVar, executor));
        return this;
    }

    public final a71 l(y31 y31Var, Executor executor) {
        this.f5968m.add(new x81(y31Var, executor));
        return this;
    }

    public final a71 m(i41 i41Var, Executor executor) {
        this.f5957b.add(new x81(i41Var, executor));
        return this;
    }

    public final a71 n(e3.c cVar, Executor executor) {
        this.f5966k.add(new x81(cVar, executor));
        return this;
    }

    public final a71 o(f91 f91Var, Executor executor) {
        this.f5959d.add(new x81(f91Var, executor));
        return this;
    }

    public final a71 p(tk2 tk2Var) {
        this.f5970o = tk2Var;
        return this;
    }

    public final c71 q() {
        return new c71(this, null);
    }
}
