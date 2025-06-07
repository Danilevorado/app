package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class hm4 {

    /* renamed from: a, reason: collision with root package name */
    private final tm4 f9214a;

    /* renamed from: b, reason: collision with root package name */
    private final im4 f9215b;

    /* renamed from: e, reason: collision with root package name */
    private Handler f9218e;

    /* renamed from: f, reason: collision with root package name */
    private tf1 f9219f;

    /* renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList f9220g;

    /* renamed from: h, reason: collision with root package name */
    private k9 f9221h;

    /* renamed from: i, reason: collision with root package name */
    private Pair f9222i;

    /* renamed from: j, reason: collision with root package name */
    private Pair f9223j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9226m;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f9216c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f9217d = new ArrayDeque();

    /* renamed from: k, reason: collision with root package name */
    private int f9224k = -1;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9225l = true;

    /* renamed from: n, reason: collision with root package name */
    private final vh1 f9227n = vh1.f16691e;

    /* renamed from: o, reason: collision with root package name */
    private long f9228o = -9223372036854775807L;

    public hm4(tm4 tm4Var, im4 im4Var) {
        this.f9214a = tm4Var;
        this.f9215b = im4Var;
    }

    private final void o(long j10, boolean z10) {
        gt1.b(this.f9219f);
        this.f9219f.e();
        this.f9216c.remove();
        this.f9215b.V0 = SystemClock.elapsedRealtime() * 1000;
        if (j10 != -2) {
            this.f9215b.T0();
        }
    }

    public final MediaFormat a(MediaFormat mediaFormat) {
        if (sv2.f15560a >= 29 && this.f9215b.f9807z0.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return mediaFormat;
    }

    public final Surface b() {
        tf1 tf1Var = this.f9219f;
        Objects.requireNonNull(tf1Var);
        return tf1Var.b();
    }

    public final void c() {
        tf1 tf1Var = this.f9219f;
        Objects.requireNonNull(tf1Var);
        tf1Var.g();
        this.f9223j = null;
    }

    public final void d() {
        gt1.b(this.f9219f);
        this.f9219f.d();
        this.f9216c.clear();
        this.f9218e.removeCallbacksAndMessages(null);
        if (this.f9226m) {
            this.f9226m = false;
        }
    }

    public final void e(String str) {
        Context context = this.f9215b.f9807z0;
        int i10 = 1;
        if (sv2.f15560a >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            i10 = n23.b(str).startsWith("OMX.") ? 5 : Integer.MAX_VALUE;
        }
        this.f9224k = i10;
    }

    public final void f(long j10, long j11) {
        gt1.b(this.f9219f);
        while (!this.f9216c.isEmpty()) {
            boolean z10 = this.f9215b.k() == 2;
            Long l10 = (Long) this.f9216c.peek();
            Objects.requireNonNull(l10);
            long jLongValue = l10.longValue();
            long jD1 = this.f9215b.d1(j10, j11, SystemClock.elapsedRealtime() * 1000, jLongValue, z10);
            if (this.f9215b.l1(j10, jD1)) {
                o(-1L, false);
                return;
            }
            if (!z10 || j10 == this.f9215b.O0 || jD1 > 50000) {
                return;
            }
            this.f9214a.d(jLongValue);
            long jA = this.f9214a.a(System.nanoTime() + (jD1 * 1000));
            if (im4.c1((jA - System.nanoTime()) / 1000, j11, false)) {
                jA = -2;
            } else {
                if (!this.f9217d.isEmpty() && jLongValue > ((Long) ((Pair) this.f9217d.peek()).first).longValue()) {
                    this.f9222i = (Pair) this.f9217d.remove();
                }
                this.f9215b.v0();
                if (this.f9228o >= jLongValue) {
                    this.f9228o = -9223372036854775807L;
                    this.f9215b.f1(this.f9227n);
                }
            }
            o(jA, false);
        }
    }

    public final void g() {
        tf1 tf1Var = this.f9219f;
        Objects.requireNonNull(tf1Var);
        tf1Var.c();
        this.f9219f = null;
        Handler handler = this.f9218e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9220g;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        this.f9216c.clear();
        this.f9225l = true;
    }

    public final void h(k9 k9Var) {
        tf1 tf1Var = this.f9219f;
        Objects.requireNonNull(tf1Var);
        la laVar = new la(k9Var.f10903q, k9Var.f10904r);
        laVar.a(k9Var.f10907u);
        laVar.b(this.f9215b.v0());
        laVar.c();
        tf1Var.h();
        this.f9221h = k9Var;
        if (this.f9226m) {
            this.f9226m = false;
        }
    }

    public final void i(Surface surface, kn2 kn2Var) {
        Pair pair = this.f9223j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((kn2) this.f9223j.second).equals(kn2Var)) {
            return;
        }
        this.f9223j = Pair.create(surface, kn2Var);
        if (k()) {
            tf1 tf1Var = this.f9219f;
            Objects.requireNonNull(tf1Var);
            kn2Var.b();
            kn2Var.a();
            tf1Var.g();
        }
    }

    public final void j(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9220g;
        if (copyOnWriteArrayList == null) {
            this.f9220g = new CopyOnWriteArrayList(list);
        } else {
            copyOnWriteArrayList.clear();
            this.f9220g.addAll(list);
        }
    }

    public final boolean k() {
        return this.f9219f != null;
    }

    public final boolean l() {
        Pair pair = this.f9223j;
        return pair == null || !((kn2) pair.second).equals(kn2.f11168c);
    }

    public final boolean m(k9 k9Var) {
        int i10;
        gt1.f(!k());
        if (!this.f9225l) {
            return false;
        }
        if (this.f9220g == null) {
            this.f9225l = false;
            return false;
        }
        bg4 bg4Var = k9Var.f10910x;
        if (bg4Var == null) {
            bg4 bg4Var2 = bg4.f6475f;
        } else if (bg4Var.f6483c == 7) {
            af4 af4VarC = bg4Var.c();
            af4VarC.a(6);
            af4VarC.b();
        }
        this.f9218e = sv2.A(null);
        try {
            if (!im4.j1() && (i10 = k9Var.f10906t) != 0) {
                this.f9220g.add(0, gm4.a(i10));
            }
            se1 se1VarB = gm4.b();
            Objects.requireNonNull(this.f9220g);
            bj4 bj4Var = bj4.f6514a;
            this.f9218e.getClass();
            tf1 tf1VarA = se1VarB.a();
            this.f9219f = tf1VarA;
            Pair pair = this.f9223j;
            if (pair != null) {
                kn2 kn2Var = (kn2) pair.second;
                kn2Var.b();
                kn2Var.a();
                tf1VarA.g();
            }
            h(k9Var);
            return true;
        } catch (Exception e5) {
            throw this.f9215b.A(e5, k9Var, false, 7000);
        }
    }

    public final boolean n(k9 k9Var, long j10, boolean z10) {
        gt1.b(this.f9219f);
        gt1.f(this.f9224k != -1);
        gt1.f(!this.f9226m);
        if (this.f9219f.a() >= this.f9224k) {
            return false;
        }
        this.f9219f.f();
        Pair pair = this.f9222i;
        if (pair == null) {
            this.f9222i = Pair.create(Long.valueOf(j10), k9Var);
        } else if (!sv2.b(k9Var, pair.second)) {
            this.f9217d.add(Pair.create(Long.valueOf(j10), k9Var));
        }
        if (z10) {
            this.f9226m = true;
        }
        return true;
    }
}
