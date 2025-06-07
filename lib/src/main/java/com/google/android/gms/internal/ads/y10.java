package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y10 extends ag0 {

    /* renamed from: d, reason: collision with root package name */
    private final m3.d0 f17852d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f17851c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f17853e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f17854f = 0;

    public y10(m3.d0 d0Var) {
        this.f17852d = d0Var;
    }

    public final t10 f() {
        t10 t10Var = new t10(this);
        synchronized (this.f17851c) {
            e(new u10(this, t10Var), new v10(this, t10Var));
            e4.p.o(this.f17854f >= 0);
            this.f17854f++;
        }
        return t10Var;
    }

    public final void g() {
        synchronized (this.f17851c) {
            e4.p.o(this.f17854f >= 0);
            m3.n1.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f17853e = true;
            h();
        }
    }

    protected final void h() {
        synchronized (this.f17851c) {
            e4.p.o(this.f17854f >= 0);
            if (this.f17853e && this.f17854f == 0) {
                m3.n1.k("No reference is left (including root). Cleaning up engine.");
                e(new x10(this), new wf0());
            } else {
                m3.n1.k("There are still references to the engine. Not destroying.");
            }
        }
    }

    protected final void i() {
        synchronized (this.f17851c) {
            e4.p.o(this.f17854f > 0);
            m3.n1.k("Releasing 1 reference for JS Engine");
            this.f17854f--;
            h();
        }
    }
}
