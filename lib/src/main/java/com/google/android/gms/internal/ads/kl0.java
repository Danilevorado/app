package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class kl0 extends k3.l2 {

    /* renamed from: m, reason: collision with root package name */
    private final lh0 f11116m;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f11118o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f11119p;

    /* renamed from: q, reason: collision with root package name */
    private int f11120q;

    /* renamed from: r, reason: collision with root package name */
    private k3.p2 f11121r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11122s;

    /* renamed from: u, reason: collision with root package name */
    private float f11124u;

    /* renamed from: v, reason: collision with root package name */
    private float f11125v;

    /* renamed from: w, reason: collision with root package name */
    private float f11126w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f11127x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f11128y;

    /* renamed from: z, reason: collision with root package name */
    private xv f11129z;

    /* renamed from: n, reason: collision with root package name */
    private final Object f11117n = new Object();

    /* renamed from: t, reason: collision with root package name */
    private boolean f11123t = true;

    public kl0(lh0 lh0Var, float f5, boolean z10, boolean z11) {
        this.f11116m = lh0Var;
        this.f11124u = f5;
        this.f11118o = z10;
        this.f11119p = z11;
    }

    private final void S5(final int i10, final int i11, final boolean z10, final boolean z11) {
        of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10556m.N5(i10, i11, z10, z11);
            }
        });
    }

    private final void T5(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.il0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9784m.O5(map2);
            }
        });
    }

    public final void M5(float f5, float f10, int i10, boolean z10, float f11) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.f11117n) {
            z11 = true;
            if (f10 == this.f11124u && f11 == this.f11126w) {
                z11 = false;
            }
            this.f11124u = f10;
            this.f11125v = f5;
            z12 = this.f11123t;
            this.f11123t = z10;
            i11 = this.f11120q;
            this.f11120q = i10;
            float f12 = this.f11126w;
            this.f11126w = f11;
            if (Math.abs(f11 - f12) > 1.0E-4f) {
                this.f11116m.z().invalidate();
            }
        }
        if (z11) {
            try {
                xv xvVar = this.f11129z;
                if (xvVar != null) {
                    xvVar.c();
                }
            } catch (RemoteException e5) {
                ze0.i("#007 Could not call remote method.", e5);
            }
        }
        S5(i11, i10, z12, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0055 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070 A[Catch: all -> 0x0072, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:29:0x0033, B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067, B:55:0x0070, B:54:0x006b), top: B:60:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void N5(int r8, int r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f11117n
            monitor-enter(r0)
            boolean r1 = r7.f11122s     // Catch: java.lang.Throwable -> L72
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lf
            if (r9 != r3) goto Lf
            r9 = r3
            r4 = r9
            r5 = r4
            goto L11
        Lf:
            r4 = r9
            r5 = r2
        L11:
            if (r8 == r9) goto L15
            r8 = r3
            goto L16
        L15:
            r8 = r2
        L16:
            if (r8 == 0) goto L1d
            if (r4 != r3) goto L1d
            r9 = r3
            r4 = r9
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r8 == 0) goto L25
            r6 = 2
            if (r4 != r6) goto L25
            r6 = r3
            goto L26
        L25:
            r6 = r2
        L26:
            if (r8 == 0) goto L2d
            r8 = 3
            if (r4 != r8) goto L2d
            r8 = r3
            goto L2e
        L2d:
            r8 = r2
        L2e:
            if (r1 != 0) goto L32
            if (r5 == 0) goto L33
        L32:
            r2 = r3
        L33:
            r7.f11122s = r2     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L41
            k3.p2 r1 = r7.f11121r     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r1 == 0) goto L41
            r1.i()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            goto L41
        L3f:
            r8 = move-exception
            goto L6b
        L41:
            if (r9 == 0) goto L4a
            k3.p2 r9 = r7.f11121r     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r9 == 0) goto L4a
            r9.g()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L4a:
            if (r6 == 0) goto L53
            k3.p2 r9 = r7.f11121r     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r9 == 0) goto L53
            r9.h()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L53:
            if (r8 == 0) goto L61
            k3.p2 r8 = r7.f11121r     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r8 == 0) goto L5c
            r8.c()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L5c:
            com.google.android.gms.internal.ads.lh0 r8 = r7.f11116m     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            r8.D()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L61:
            if (r10 == r11) goto L70
            k3.p2 r8 = r7.f11121r     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r8 == 0) goto L70
            r8.B0(r11)     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            goto L70
        L6b:
            java.lang.String r9 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.ze0.i(r9, r8)     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            return
        L72:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kl0.N5(int, int, boolean, boolean):void");
    }

    @Override // k3.m2
    public final void O0(k3.p2 p2Var) {
        synchronized (this.f11117n) {
            this.f11121r = p2Var;
        }
    }

    final /* synthetic */ void O5(Map map) {
        this.f11116m.c("pubVideoCmd", map);
    }

    public final void P5(k3.v3 v3Var) {
        boolean z10 = v3Var.f24779m;
        boolean z11 = v3Var.f24780n;
        boolean z12 = v3Var.f24781o;
        synchronized (this.f11117n) {
            this.f11127x = z11;
            this.f11128y = z12;
        }
        T5("initialState", i4.f.c("muteStart", true != z10 ? "0" : "1", "customControlsRequested", true != z11 ? "0" : "1", "clickToExpandRequested", true != z12 ? "0" : "1"));
    }

    public final void Q5(float f5) {
        synchronized (this.f11117n) {
            this.f11125v = f5;
        }
    }

    public final void R5(xv xvVar) {
        synchronized (this.f11117n) {
            this.f11129z = xvVar;
        }
    }

    @Override // k3.m2
    public final float c() {
        float f5;
        synchronized (this.f11117n) {
            f5 = this.f11126w;
        }
        return f5;
    }

    @Override // k3.m2
    public final float e() {
        float f5;
        synchronized (this.f11117n) {
            f5 = this.f11125v;
        }
        return f5;
    }

    @Override // k3.m2
    public final int g() {
        int i10;
        synchronized (this.f11117n) {
            i10 = this.f11120q;
        }
        return i10;
    }

    @Override // k3.m2
    public final float h() {
        float f5;
        synchronized (this.f11117n) {
            f5 = this.f11124u;
        }
        return f5;
    }

    @Override // k3.m2
    public final k3.p2 i() {
        k3.p2 p2Var;
        synchronized (this.f11117n) {
            p2Var = this.f11121r;
        }
        return p2Var;
    }

    @Override // k3.m2
    public final void k() {
        T5("pause", null);
    }

    @Override // k3.m2
    public final void l() {
        T5("play", null);
    }

    @Override // k3.m2
    public final void m() {
        T5("stop", null);
    }

    @Override // k3.m2
    public final boolean o() {
        boolean z10;
        synchronized (this.f11117n) {
            z10 = false;
            if (this.f11118o && this.f11127x) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // k3.m2
    public final boolean p() {
        boolean z10;
        boolean zO = o();
        synchronized (this.f11117n) {
            z10 = false;
            if (!zO) {
                try {
                    if (this.f11128y && this.f11119p) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // k3.m2
    public final boolean q() {
        boolean z10;
        synchronized (this.f11117n) {
            z10 = this.f11123t;
        }
        return z10;
    }

    public final void u() {
        boolean z10;
        int i10;
        synchronized (this.f11117n) {
            z10 = this.f11123t;
            i10 = this.f11120q;
            this.f11120q = 3;
        }
        S5(i10, 3, z10, z10);
    }

    @Override // k3.m2
    public final void x0(boolean z10) {
        T5(true != z10 ? "unmute" : "mute", null);
    }
}
