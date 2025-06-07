package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import e4.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class kx2 implements c.a, c.b {

    /* renamed from: m, reason: collision with root package name */
    protected final ly2 f11263m;

    /* renamed from: n, reason: collision with root package name */
    private final String f11264n;

    /* renamed from: o, reason: collision with root package name */
    private final String f11265o;

    /* renamed from: p, reason: collision with root package name */
    private final LinkedBlockingQueue f11266p;

    /* renamed from: q, reason: collision with root package name */
    private final HandlerThread f11267q;

    public kx2(Context context, String str, String str2) {
        this.f11264n = str;
        this.f11265o = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f11267q = handlerThread;
        handlerThread.start();
        ly2 ly2Var = new ly2(context, handlerThread.getLooper(), this, this, 9200000);
        this.f11263m = ly2Var;
        this.f11266p = new LinkedBlockingQueue();
        ly2Var.u();
    }

    static vd a() {
        xc xcVarK0 = vd.k0();
        xcVarK0.y(32768L);
        return (vd) xcVarK0.m();
    }

    @Override // e4.c.a
    public final void C(int i10) throws InterruptedException {
        try {
            this.f11266p.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        qy2 qy2VarD = d();
        if (qy2VarD != null) {
            try {
                try {
                    this.f11266p.put(qy2VarD.w3(new my2(this.f11264n, this.f11265o)).f());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    c();
                    this.f11267q.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.f11266p.put(a());
            }
            c();
            this.f11267q.quit();
        }
    }

    public final vd b(int i10) {
        vd vdVar;
        try {
            vdVar = (vd) this.f11266p.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            vdVar = null;
        }
        return vdVar == null ? a() : vdVar;
    }

    public final void c() {
        ly2 ly2Var = this.f11263m;
        if (ly2Var != null) {
            if (ly2Var.a() || this.f11263m.i()) {
                this.f11263m.q();
            }
        }
    }

    protected final qy2 d() {
        try {
            return this.f11263m.n0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // e4.c.b
    public final void w0(b4.b bVar) throws InterruptedException {
        try {
            this.f11266p.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
