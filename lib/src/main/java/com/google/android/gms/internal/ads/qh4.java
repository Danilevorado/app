package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class qh4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14325a;

    /* renamed from: b, reason: collision with root package name */
    public final hh4 f14326b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f14327c;

    public qh4() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private qh4(CopyOnWriteArrayList copyOnWriteArrayList, int i10, hh4 hh4Var, long j10) {
        this.f14327c = copyOnWriteArrayList;
        this.f14325a = 0;
        this.f14326b = hh4Var;
    }

    private static final long n(long j10) {
        long jY = sv2.y(j10);
        if (jY == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jY;
    }

    public final qh4 a(int i10, hh4 hh4Var, long j10) {
        return new qh4(this.f14327c, 0, hh4Var, 0L);
    }

    public final void b(Handler handler, rh4 rh4Var) {
        this.f14327c.add(new ph4(handler, rh4Var));
    }

    public final void c(final dh4 dh4Var) {
        Iterator it = this.f14327c.iterator();
        while (it.hasNext()) {
            ph4 ph4Var = (ph4) it.next();
            final rh4 rh4Var = ph4Var.f13895b;
            sv2.e(ph4Var.f13894a, new Runnable() { // from class: com.google.android.gms.internal.ads.kh4
                @Override // java.lang.Runnable
                public final void run() {
                    qh4 qh4Var = this.f11068m;
                    rh4Var.b(0, qh4Var.f14326b, dh4Var);
                }
            });
        }
    }

    public final void d(int i10, k9 k9Var, int i11, Object obj, long j10) {
        c(new dh4(1, i10, k9Var, 0, null, n(j10), -9223372036854775807L));
    }

    public final void e(final xg4 xg4Var, final dh4 dh4Var) {
        Iterator it = this.f14327c.iterator();
        while (it.hasNext()) {
            ph4 ph4Var = (ph4) it.next();
            final rh4 rh4Var = ph4Var.f13895b;
            sv2.e(ph4Var.f13894a, new Runnable() { // from class: com.google.android.gms.internal.ads.lh4
                @Override // java.lang.Runnable
                public final void run() {
                    qh4 qh4Var = this.f11605m;
                    rh4Var.c(0, qh4Var.f14326b, xg4Var, dh4Var);
                }
            });
        }
    }

    public final void f(xg4 xg4Var, int i10, int i11, k9 k9Var, int i12, Object obj, long j10, long j11) {
        e(xg4Var, new dh4(1, -1, null, 0, null, n(j10), n(j11)));
    }

    public final void g(final xg4 xg4Var, final dh4 dh4Var) {
        Iterator it = this.f14327c.iterator();
        while (it.hasNext()) {
            ph4 ph4Var = (ph4) it.next();
            final rh4 rh4Var = ph4Var.f13895b;
            sv2.e(ph4Var.f13894a, new Runnable() { // from class: com.google.android.gms.internal.ads.oh4
                @Override // java.lang.Runnable
                public final void run() {
                    qh4 qh4Var = this.f13251m;
                    rh4Var.d(0, qh4Var.f14326b, xg4Var, dh4Var);
                }
            });
        }
    }

    public final void h(xg4 xg4Var, int i10, int i11, k9 k9Var, int i12, Object obj, long j10, long j11) {
        g(xg4Var, new dh4(1, -1, null, 0, null, n(j10), n(j11)));
    }

    public final void i(final xg4 xg4Var, final dh4 dh4Var, final IOException iOException, final boolean z10) {
        Iterator it = this.f14327c.iterator();
        while (it.hasNext()) {
            ph4 ph4Var = (ph4) it.next();
            final rh4 rh4Var = ph4Var.f13895b;
            sv2.e(ph4Var.f13894a, new Runnable() { // from class: com.google.android.gms.internal.ads.mh4
                @Override // java.lang.Runnable
                public final void run() {
                    qh4 qh4Var = this.f12122m;
                    rh4Var.g(0, qh4Var.f14326b, xg4Var, dh4Var, iOException, z10);
                }
            });
        }
    }

    public final void j(xg4 xg4Var, int i10, int i11, k9 k9Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        i(xg4Var, new dh4(1, -1, null, 0, null, n(j10), n(j11)), iOException, z10);
    }

    public final void k(final xg4 xg4Var, final dh4 dh4Var) {
        Iterator it = this.f14327c.iterator();
        while (it.hasNext()) {
            ph4 ph4Var = (ph4) it.next();
            final rh4 rh4Var = ph4Var.f13895b;
            sv2.e(ph4Var.f13894a, new Runnable() { // from class: com.google.android.gms.internal.ads.nh4
                @Override // java.lang.Runnable
                public final void run() {
                    qh4 qh4Var = this.f12640m;
                    rh4Var.f(0, qh4Var.f14326b, xg4Var, dh4Var);
                }
            });
        }
    }

    public final void l(xg4 xg4Var, int i10, int i11, k9 k9Var, int i12, Object obj, long j10, long j11) {
        k(xg4Var, new dh4(1, -1, null, 0, null, n(j10), n(j11)));
    }

    public final void m(rh4 rh4Var) {
        Iterator it = this.f14327c.iterator();
        while (it.hasNext()) {
            ph4 ph4Var = (ph4) it.next();
            if (ph4Var.f13895b == rh4Var) {
                this.f14327c.remove(ph4Var);
            }
        }
    }
}
