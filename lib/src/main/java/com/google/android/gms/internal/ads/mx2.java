package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import e4.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class mx2 implements c.a, c.b {

    /* renamed from: m, reason: collision with root package name */
    protected final ly2 f12281m;

    /* renamed from: n, reason: collision with root package name */
    private final String f12282n;

    /* renamed from: o, reason: collision with root package name */
    private final String f12283o;

    /* renamed from: p, reason: collision with root package name */
    private final LinkedBlockingQueue f12284p;

    /* renamed from: q, reason: collision with root package name */
    private final HandlerThread f12285q;

    /* renamed from: r, reason: collision with root package name */
    private final dx2 f12286r;

    /* renamed from: s, reason: collision with root package name */
    private final long f12287s;

    /* renamed from: t, reason: collision with root package name */
    private final int f12288t;

    public mx2(Context context, int i10, int i11, String str, String str2, String str3, dx2 dx2Var) {
        this.f12282n = str;
        this.f12288t = i11;
        this.f12283o = str2;
        this.f12286r = dx2Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f12285q = handlerThread;
        handlerThread.start();
        this.f12287s = System.currentTimeMillis();
        ly2 ly2Var = new ly2(context, handlerThread.getLooper(), this, this, 19621000);
        this.f12281m = ly2Var;
        this.f12284p = new LinkedBlockingQueue();
        ly2Var.u();
    }

    static yy2 a() {
        return new yy2(null, 1);
    }

    private final void e(int i10, long j10, Exception exc) {
        this.f12286r.c(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // e4.c.a
    public final void C(int i10) throws InterruptedException {
        try {
            e(4011, this.f12287s, null);
            this.f12284p.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        qy2 qy2VarD = d();
        if (qy2VarD != null) {
            try {
                yy2 yy2VarX4 = qy2VarD.x4(new wy2(1, this.f12288t, this.f12282n, this.f12283o));
                e(5011, this.f12287s, null);
                this.f12284p.put(yy2VarX4);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final yy2 b(int i10) {
        yy2 yy2Var;
        try {
            yy2Var = (yy2) this.f12284p.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            e(AdError.INTERSTITIAL_AD_TIMEOUT, this.f12287s, e5);
            yy2Var = null;
        }
        e(3004, this.f12287s, null);
        if (yy2Var != null) {
            dx2.g(yy2Var.f18326o == 7 ? 3 : 2);
        }
        return yy2Var == null ? a() : yy2Var;
    }

    public final void c() {
        ly2 ly2Var = this.f12281m;
        if (ly2Var != null) {
            if (ly2Var.a() || this.f12281m.i()) {
                this.f12281m.q();
            }
        }
    }

    protected final qy2 d() {
        try {
            return this.f12281m.n0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // e4.c.b
    public final void w0(b4.b bVar) throws InterruptedException {
        try {
            e(4012, this.f12287s, null);
            this.f12284p.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
