package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f19960h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f19961a;

    /* renamed from: b, reason: collision with root package name */
    private final f3 f19962b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f19963c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f19964d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19965e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f19966f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile Object f19967g = null;

    /* synthetic */ h3(String str, Object obj, Object obj2, f3 f3Var, x4.d dVar) {
        this.f19961a = str;
        this.f19963c = obj;
        this.f19964d = obj2;
        this.f19962b = f3Var;
    }

    public final Object a(Object obj) {
        synchronized (this.f19965e) {
        }
        if (obj != null) {
            return obj;
        }
        if (g3.f19918a == null) {
            return this.f19963c;
        }
        synchronized (f19960h) {
            if (c.a()) {
                return this.f19967g == null ? this.f19963c : this.f19967g;
            }
            try {
                for (h3 h3Var : i3.f20003a) {
                    if (c.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objA = null;
                    try {
                        f3 f3Var = h3Var.f19962b;
                        if (f3Var != null) {
                            objA = f3Var.a();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f19960h) {
                        h3Var.f19967g = objA;
                    }
                }
            } catch (SecurityException unused2) {
            }
            f3 f3Var2 = this.f19962b;
            if (f3Var2 == null) {
                return this.f19963c;
            }
            try {
                return f3Var2.a();
            } catch (IllegalStateException unused3) {
                return this.f19963c;
            } catch (SecurityException unused4) {
                return this.f19963c;
            }
        }
    }

    public final String b() {
        return this.f19961a;
    }
}
