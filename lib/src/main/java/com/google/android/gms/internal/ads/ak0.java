package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class ak0 extends ch0 implements wy3, l94 {
    public static final /* synthetic */ int I = 0;
    private long A;
    private final String B;
    private final int C;
    private Integer E;
    private final ArrayList F;
    private volatile mj0 G;

    /* renamed from: o, reason: collision with root package name */
    private final Context f6115o;

    /* renamed from: p, reason: collision with root package name */
    private final kj0 f6116p;

    /* renamed from: q, reason: collision with root package name */
    private final pk4 f6117q;

    /* renamed from: r, reason: collision with root package name */
    private final kh0 f6118r;

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f6119s;

    /* renamed from: t, reason: collision with root package name */
    private final mi4 f6120t;

    /* renamed from: u, reason: collision with root package name */
    private a64 f6121u;

    /* renamed from: v, reason: collision with root package name */
    private ByteBuffer f6122v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6123w;

    /* renamed from: x, reason: collision with root package name */
    private bh0 f6124x;

    /* renamed from: y, reason: collision with root package name */
    private int f6125y;

    /* renamed from: z, reason: collision with root package name */
    private int f6126z;
    private final Object D = new Object();
    private final Set H = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ak0(android.content.Context r4, com.google.android.gms.internal.ads.kh0 r5, com.google.android.gms.internal.ads.lh0 r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ak0.<init>(android.content.Context, com.google.android.gms.internal.ads.kh0, com.google.android.gms.internal.ads.lh0, java.lang.Integer):void");
    }

    private final boolean d0() {
        return this.G != null && this.G.q();
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void A(int i10) {
        this.f6116p.k(i10);
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void B(int i10) {
        this.f6116p.l(i10);
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void C(bh0 bh0Var) {
        this.f6124x = bh0Var;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void D(int i10) {
        this.f6116p.m(i10);
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void E(int i10) {
        this.f6116p.n(i10);
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void F(boolean z10) {
        this.f6121u.r(z10);
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void G(Integer num) {
        this.E = num;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void H(boolean z10) {
        if (this.f6121u == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.f6121u.N();
            if (i10 >= 2) {
                return;
            }
            pk4 pk4Var = this.f6117q;
            ck4 ck4VarC = pk4Var.k().c();
            ck4VarC.o(i10, !z10);
            pk4Var.p(ck4VarC);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void I(int i10) throws SocketException {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            jj0 jj0Var = (jj0) ((WeakReference) it.next()).get();
            if (jj0Var != null) {
                jj0Var.m(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void J(Surface surface, boolean z10) {
        a64 a64Var = this.f6121u;
        if (a64Var != null) {
            a64Var.s(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void K(float f5, boolean z10) {
        a64 a64Var = this.f6121u;
        if (a64Var != null) {
            a64Var.w(f5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void L() {
        this.f6121u.u();
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final boolean M() {
        return this.f6121u != null;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final int N() {
        return this.f6126z;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final int P() {
        return this.f6121u.e();
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final long R() {
        return this.f6121u.i();
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final long S() {
        return this.f6125y;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final long T() {
        if (d0() && this.G.p()) {
            return Math.min(this.f6125y, this.G.k());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final long U() {
        return this.f6121u.k();
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final long V() {
        return this.f6121u.l();
    }

    final /* synthetic */ t53 W(String str, boolean z10) {
        kh0 kh0Var = this.f6118r;
        return new dk0(str, true != z10 ? null : this, kh0Var.f11046d, kh0Var.f11048f, kh0Var.f11056n, kh0Var.f11057o);
    }

    final /* synthetic */ t53 X(String str, boolean z10) {
        kh0 kh0Var = this.f6118r;
        jj0 jj0Var = new jj0(str, true != z10 ? null : this, kh0Var.f11046d, kh0Var.f11048f, kh0Var.f11051i);
        this.H.add(new WeakReference(jj0Var));
        return jj0Var;
    }

    final /* synthetic */ t53 Y(String str, boolean z10) {
        le3 le3Var = new le3();
        le3Var.f(str);
        le3Var.e(true != z10 ? null : this);
        le3Var.c(this.f6118r.f11046d);
        le3Var.d(this.f6118r.f11048f);
        le3Var.b(true);
        return le3Var.a();
    }

    final /* synthetic */ t53 Z(s43 s43Var) {
        return new mj0(this.f6115o, s43Var.a(), this.B, this.C, this, new pj0(this));
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void a(j94 j94Var, int i10) {
        bh0 bh0Var = this.f6124x;
        if (bh0Var != null) {
            bh0Var.a(i10);
        }
    }

    final jh4 a0(Uri uri) {
        rg rgVar = new rg();
        rgVar.b(uri);
        v30 v30VarC = rgVar.c();
        mi4 mi4Var = this.f6120t;
        mi4Var.a(this.f6118r.f11049g);
        return mi4Var.b(v30VarC);
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void b(au0 au0Var, k94 k94Var) {
    }

    final /* synthetic */ void b0(boolean z10, long j10) {
        bh0 bh0Var = this.f6124x;
        if (bh0Var != null) {
            bh0Var.f(z10, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void c(t53 t53Var, ib3 ib3Var, boolean z10) {
        if (t53Var instanceof zt3) {
            synchronized (this.D) {
                this.F.add((zt3) t53Var);
            }
        } else if (t53Var instanceof mj0) {
            this.G = (mj0) t53Var;
            final lh0 lh0Var = (lh0) this.f6119s.get();
            if (((Boolean) k3.w.c().b(ir.I1)).booleanValue() && lh0Var != null && this.G.n()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.G.p()));
                map.put("gcacheDownloaded", String.valueOf(this.G.o()));
                m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh0 lh0Var2 = lh0Var;
                        Map map2 = map;
                        int i10 = ak0.I;
                        lh0Var2.c("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    final /* synthetic */ t84[] c0(Handler handler, gn4 gn4Var, mc4 mc4Var, ij4 ij4Var, hg4 hg4Var) {
        Context context = this.f6115o;
        qf4 qf4Var = qf4.f14304a;
        ac4 ac4Var = ac4.f6037c;
        zl1[] zl1VarArr = new zl1[0];
        ed4 ed4Var = new ed4();
        if (ac4Var == null) {
            Objects.requireNonNull(ac4Var, "Both parameters are null");
        }
        ed4Var.b(ac4Var);
        ed4Var.c(zl1VarArr);
        qd4 qd4VarD = ed4Var.d();
        gf4 gf4Var = gf4.f8707a;
        return new t84[]{new wd4(context, gf4Var, qf4Var, false, handler, mc4Var, qd4VarD), new im4(this.f6115o, gf4Var, qf4Var, 0L, false, handler, gn4Var, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void d(j94 j94Var, vh1 vh1Var) {
        bh0 bh0Var = this.f6124x;
        if (bh0Var != null) {
            bh0Var.d(vh1Var.f16697a, vh1Var.f16698b);
        }
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void e(j94 j94Var, int i10, long j10) {
        this.f6126z += i10;
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void f(j94 j94Var, int i10, long j10, long j11) {
    }

    public final void finalize() {
        ch0.u().decrementAndGet();
        if (m3.n1.m()) {
            m3.n1.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void g(j94 j94Var, k9 k9Var, h54 h54Var) {
        lh0 lh0Var = (lh0) this.f6119s.get();
        if (!((Boolean) k3.w.c().b(ir.I1)).booleanValue() || lh0Var == null || k9Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = k9Var.f10897k;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = k9Var.f10898l;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = k9Var.f10895i;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        lh0Var.c("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void h(j94 j94Var, zs0 zs0Var, zs0 zs0Var2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void i(t53 t53Var, ib3 ib3Var, boolean z10, int i10) {
        this.f6125y += i10;
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void j(j94 j94Var, xg4 xg4Var, dh4 dh4Var, IOException iOException, boolean z10) {
        bh0 bh0Var = this.f6124x;
        if (bh0Var != null) {
            if (this.f6118r.f11053k) {
                bh0Var.e("onLoadException", iOException);
            } else {
                bh0Var.g("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void k(t53 t53Var, ib3 ib3Var, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void l(j94 j94Var, g54 g54Var) {
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void m(t53 t53Var, ib3 ib3Var, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void n(j94 j94Var, qj0 qj0Var) {
        bh0 bh0Var = this.f6124x;
        if (bh0Var != null) {
            bh0Var.g("onPlayerError", qj0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void o(j94 j94Var, k9 k9Var, h54 h54Var) {
        lh0 lh0Var = (lh0) this.f6119s.get();
        if (!((Boolean) k3.w.c().b(ir.I1)).booleanValue() || lh0Var == null || k9Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(k9Var.f10905s));
        map.put("bitRate", String.valueOf(k9Var.f10894h));
        map.put("resolution", k9Var.f10903q + "x" + k9Var.f10904r);
        String str = k9Var.f10897k;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = k9Var.f10898l;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = k9Var.f10895i;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        lh0Var.c("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void p(j94 j94Var, dh4 dh4Var) {
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void q(j94 j94Var, Object obj, long j10) {
        bh0 bh0Var = this.f6124x;
        if (bh0Var != null) {
            bh0Var.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final long r() {
        if (d0()) {
            return 0L;
        }
        return this.f6125y;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final long s() {
        if (d0()) {
            return this.G.l();
        }
        synchronized (this.D) {
            while (!this.F.isEmpty()) {
                long j10 = this.A;
                Map mapC = ((zt3) this.F.remove(0)).c();
                long j11 = 0;
                if (mapC != null) {
                    Iterator it = mapC.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && n23.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.A = j10 + j11;
            }
        }
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final Integer t() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        jh4 xh4Var;
        if (this.f6121u != null) {
            this.f6122v = byteBuffer;
            this.f6123w = z10;
            int length = uriArr.length;
            if (length == 1) {
                xh4Var = a0(uriArr[0]);
            } else {
                jh4[] jh4VarArr = new jh4[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    jh4VarArr[i10] = a0(uriArr[i10]);
                }
                xh4Var = new xh4(false, false, jh4VarArr);
            }
            this.f6121u.a(xh4Var);
            this.f6121u.o();
            ch0.v().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void y() {
        a64 a64Var = this.f6121u;
        if (a64Var != null) {
            a64Var.x(this);
            this.f6121u.q();
            this.f6121u = null;
            ch0.v().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.ch0
    public final void z(long j10) {
        w94 w94Var = (w94) this.f6121u;
        w94Var.y(w94Var.f(), j10, 5, false);
    }
}
