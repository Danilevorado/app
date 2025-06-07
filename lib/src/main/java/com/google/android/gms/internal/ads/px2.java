package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import e4.c;

/* loaded from: classes.dex */
final class px2 implements c.a, c.b {

    /* renamed from: m, reason: collision with root package name */
    private final ly2 f14078m;

    /* renamed from: n, reason: collision with root package name */
    private final fy2 f14079n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f14080o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private boolean f14081p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14082q = false;

    px2(Context context, Looper looper, fy2 fy2Var) {
        this.f14079n = fy2Var;
        this.f14078m = new ly2(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f14080o) {
            if (this.f14078m.a() || this.f14078m.i()) {
                this.f14078m.q();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // e4.c.a
    public final void C(int i10) {
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        synchronized (this.f14080o) {
            if (this.f14082q) {
                return;
            }
            this.f14082q = true;
            try {
                this.f14078m.n0().K5(new jy2(this.f14079n.x()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
        }
    }

    final void a() {
        synchronized (this.f14080o) {
            if (!this.f14081p) {
                this.f14081p = true;
                this.f14078m.u();
            }
        }
    }

    @Override // e4.c.b
    public final void w0(b4.b bVar) {
    }
}
