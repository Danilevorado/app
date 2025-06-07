package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private final b4.d[] f5705a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5706b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5707c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private d4.h f5708a;

        /* renamed from: c, reason: collision with root package name */
        private b4.d[] f5710c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5709b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f5711d = 0;

        /* synthetic */ a(d4.d0 d0Var) {
        }

        public f a() {
            e4.p.b(this.f5708a != null, "execute parameter required");
            return new t0(this, this.f5710c, this.f5709b, this.f5711d);
        }

        public a b(d4.h hVar) {
            this.f5708a = hVar;
            return this;
        }

        public a c(boolean z10) {
            this.f5709b = z10;
            return this;
        }

        public a d(b4.d... dVarArr) {
            this.f5710c = dVarArr;
            return this;
        }

        public a e(int i10) {
            this.f5711d = i10;
            return this;
        }
    }

    protected f(b4.d[] dVarArr, boolean z10, int i10) {
        this.f5705a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f5706b = z11;
        this.f5707c = i10;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, b5.j jVar);

    public boolean c() {
        return this.f5706b;
    }

    public final int d() {
        return this.f5707c;
    }

    public final b4.d[] e() {
        return this.f5705a;
    }
}
