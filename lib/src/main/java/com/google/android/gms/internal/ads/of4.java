package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class of4 extends f54 {

    /* renamed from: y0, reason: collision with root package name */
    private static final byte[] f13195y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private boolean A;
    private long B;
    private float C;
    private float D;
    private hf4 E;
    private k9 F;
    private MediaFormat G;
    private boolean H;
    private float I;
    private ArrayDeque J;
    private mf4 K;
    private kf4 L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private cf4 W;
    private long X;
    private int Y;
    private int Z;

    /* renamed from: a0, reason: collision with root package name */
    private ByteBuffer f13196a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f13197b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f13198c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f13199d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f13200e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f13201f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f13202g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f13203h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f13204i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f13205j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f13206k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f13207l0;

    /* renamed from: m, reason: collision with root package name */
    private final gf4 f13208m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f13209m0;

    /* renamed from: n, reason: collision with root package name */
    private final qf4 f13210n;

    /* renamed from: n0, reason: collision with root package name */
    private long f13211n0;

    /* renamed from: o, reason: collision with root package name */
    private final float f13212o;

    /* renamed from: o0, reason: collision with root package name */
    private long f13213o0;

    /* renamed from: p, reason: collision with root package name */
    private final w44 f13214p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f13215p0;

    /* renamed from: q, reason: collision with root package name */
    private final w44 f13216q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f13217q0;

    /* renamed from: r, reason: collision with root package name */
    private final w44 f13218r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f13219r0;

    /* renamed from: s, reason: collision with root package name */
    private final bf4 f13220s;

    /* renamed from: s0, reason: collision with root package name */
    protected g54 f13221s0;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f13222t;

    /* renamed from: t0, reason: collision with root package name */
    private nf4 f13223t0;

    /* renamed from: u, reason: collision with root package name */
    private final MediaCodec.BufferInfo f13224u;

    /* renamed from: u0, reason: collision with root package name */
    private long f13225u0;

    /* renamed from: v, reason: collision with root package name */
    private final ArrayDeque f13226v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f13227v0;

    /* renamed from: w, reason: collision with root package name */
    private final xd4 f13228w;

    /* renamed from: w0, reason: collision with root package name */
    private me4 f13229w0;

    /* renamed from: x, reason: collision with root package name */
    private k9 f13230x;

    /* renamed from: x0, reason: collision with root package name */
    private me4 f13231x0;

    /* renamed from: y, reason: collision with root package name */
    private k9 f13232y;

    /* renamed from: z, reason: collision with root package name */
    private MediaCrypto f13233z;

    public of4(int i10, gf4 gf4Var, qf4 qf4Var, boolean z10, float f5) {
        super(i10);
        this.f13208m = gf4Var;
        Objects.requireNonNull(qf4Var);
        this.f13210n = qf4Var;
        this.f13212o = f5;
        this.f13214p = new w44(0, 0);
        this.f13216q = new w44(0, 0);
        this.f13218r = new w44(2, 0);
        bf4 bf4Var = new bf4();
        this.f13220s = bf4Var;
        this.f13222t = new ArrayList();
        this.f13224u = new MediaCodec.BufferInfo();
        this.C = 1.0f;
        this.D = 1.0f;
        this.B = -9223372036854775807L;
        this.f13226v = new ArrayDeque();
        f0(nf4.f12605d);
        bf4Var.i(0);
        bf4Var.f16975c.order(ByteOrder.nativeOrder());
        this.f13228w = new xd4();
        this.I = -1.0f;
        this.M = 0;
        this.f13203h0 = 0;
        this.Y = -1;
        this.Z = -1;
        this.X = -9223372036854775807L;
        this.f13211n0 = -9223372036854775807L;
        this.f13213o0 = -9223372036854775807L;
        this.f13225u0 = -9223372036854775807L;
        this.f13204i0 = 0;
        this.f13205j0 = 0;
    }

    protected static boolean J0(k9 k9Var) {
        return k9Var.E == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K0(com.google.android.gms.internal.ads.kf4 r21, android.media.MediaCrypto r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.of4.K0(com.google.android.gms.internal.ads.kf4, android.media.MediaCrypto):void");
    }

    private final void L0() throws Exception {
        int i10 = this.f13205j0;
        if (i10 == 1) {
            o0();
            return;
        }
        if (i10 == 2) {
            o0();
            g0();
        } else if (i10 != 3) {
            this.f13217q0 = true;
            r0();
        } else {
            D0();
            A0();
        }
    }

    private final void M0() {
        this.Y = -1;
        this.f13216q.f16975c = null;
    }

    private final void X() {
        this.f13201f0 = false;
        this.f13220s.b();
        this.f13218r.b();
        this.f13200e0 = false;
        this.f13199d0 = false;
        this.f13228w.b();
    }

    private final void Y() throws Exception {
        if (this.f13206k0) {
            this.f13204i0 = 1;
            this.f13205j0 = 3;
        } else {
            D0();
            A0();
        }
    }

    private final void e0() {
        this.Z = -1;
        this.f13196a0 = null;
    }

    private final void f0(nf4 nf4Var) {
        this.f13223t0 = nf4Var;
        if (nf4Var.f12607b != -9223372036854775807L) {
            this.f13227v0 = true;
        }
    }

    private final void g0() throws o54 {
        try {
            throw null;
        } catch (MediaCryptoException e5) {
            throw A(e5, this.f13230x, false, 6006);
        }
    }

    private final boolean h0() throws o54 {
        if (this.f13206k0) {
            this.f13204i0 = 1;
            if (this.O || this.Q) {
                this.f13205j0 = 3;
                return false;
            }
            this.f13205j0 = 2;
        } else {
            g0();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean i0() throws Exception {
        hf4 hf4Var = this.E;
        boolean z10 = 0;
        if (hf4Var == null || this.f13204i0 == 2 || this.f13215p0) {
            return false;
        }
        if (this.Y < 0) {
            int iA = hf4Var.a();
            this.Y = iA;
            if (iA < 0) {
                return false;
            }
            this.f13216q.f16975c = this.E.C(iA);
            this.f13216q.b();
        }
        if (this.f13204i0 == 1) {
            if (!this.V) {
                this.f13207l0 = true;
                this.E.e(this.Y, 0, 0, 0L, 4);
                M0();
            }
            this.f13204i0 = 2;
            return false;
        }
        if (this.T) {
            this.T = false;
            this.f13216q.f16975c.put(f13195y0);
            this.E.e(this.Y, 0, 38, 0L, 0);
            M0();
            this.f13206k0 = true;
            return true;
        }
        if (this.f13203h0 == 1) {
            for (int i10 = 0; i10 < this.F.f10900n.size(); i10++) {
                this.f13216q.f16975c.put((byte[]) this.F.f10900n.get(i10));
            }
            this.f13203h0 = 2;
        }
        int iPosition = this.f13216q.f16975c.position();
        t74 t74VarC = C();
        try {
            int iY = y(t74VarC, this.f13216q, 0);
            if (P()) {
                this.f13213o0 = this.f13211n0;
            }
            if (iY == -3) {
                return false;
            }
            if (iY == -5) {
                if (this.f13203h0 == 2) {
                    this.f13216q.b();
                    this.f13203h0 = 1;
                }
                W(t74VarC);
                return true;
            }
            w44 w44Var = this.f13216q;
            if (w44Var.g()) {
                if (this.f13203h0 == 2) {
                    w44Var.b();
                    this.f13203h0 = 1;
                }
                this.f13215p0 = true;
                if (!this.f13206k0) {
                    L0();
                    return false;
                }
                try {
                    if (!this.V) {
                        this.f13207l0 = true;
                        this.E.e(this.Y, 0, 0, 0L, 4);
                        M0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e5) {
                    throw A(e5, this.f13230x, false, sv2.p(e5.getErrorCode()));
                }
            }
            if (!this.f13206k0 && !w44Var.h()) {
                w44Var.b();
                if (this.f13203h0 == 2) {
                    this.f13203h0 = 1;
                }
                return true;
            }
            boolean zK = w44Var.k();
            if (zK) {
                w44Var.f16974b.b(iPosition);
            }
            if (this.N && !zK) {
                ByteBuffer byteBuffer = this.f13216q.f16975c;
                byte[] bArr = i0.f9463a;
                int iPosition2 = byteBuffer.position();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    if (i13 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i14 = byteBuffer.get(i11) & 255;
                    if (i12 == 3) {
                        if (i14 == 1) {
                            if ((byteBuffer.get(i13) & 31) == 7) {
                                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                byteBufferDuplicate.position(i11 - 3);
                                byteBufferDuplicate.limit(iPosition2);
                                byteBuffer.position(0);
                                byteBuffer.put(byteBufferDuplicate);
                                break;
                            }
                            i14 = 1;
                        }
                    } else if (i14 == 0) {
                        i12++;
                    }
                    if (i14 != 0) {
                        i12 = 0;
                    }
                    i11 = i13;
                }
                if (this.f13216q.f16975c.position() == 0) {
                    return true;
                }
                this.N = false;
            }
            w44 w44Var2 = this.f13216q;
            long jB = w44Var2.f16977e;
            cf4 cf4Var = this.W;
            if (cf4Var != null) {
                jB = cf4Var.b(this.f13230x, w44Var2);
                this.f13211n0 = Math.max(this.f13211n0, this.W.a(this.f13230x));
            }
            long j10 = jB;
            if (this.f13216q.f()) {
                this.f13222t.add(Long.valueOf(j10));
            }
            if (this.f13219r0) {
                (!this.f13226v.isEmpty() ? (nf4) this.f13226v.peekLast() : this.f13223t0).f12608c.d(j10, this.f13230x);
                this.f13219r0 = false;
            }
            this.f13211n0 = Math.max(this.f13211n0, j10);
            this.f13216q.j();
            w44 w44Var3 = this.f13216q;
            if (w44Var3.e()) {
                z0(w44Var3);
            }
            q0(this.f13216q);
            try {
                if (zK) {
                    this.E.g(this.Y, 0, this.f13216q.f16974b, j10, 0);
                } else {
                    this.E.e(this.Y, 0, this.f13216q.f16975c.limit(), j10, 0);
                }
                M0();
                this.f13206k0 = true;
                this.f13203h0 = 0;
                g54 g54Var = this.f13221s0;
                z10 = g54Var.f8617c + 1;
                g54Var.f8617c = z10;
                return true;
            } catch (MediaCodec.CryptoException e10) {
                throw A(e10, this.f13230x, z10, sv2.p(e10.getErrorCode()));
            }
        } catch (v44 e11) {
            b0(e11);
            k0(0);
            o0();
            return true;
        }
    }

    private final boolean j0() {
        return this.Z >= 0;
    }

    private final boolean k0(int i10) throws Exception {
        t74 t74VarC = C();
        this.f13214p.b();
        int iY = y(t74VarC, this.f13214p, i10 | 4);
        if (iY == -5) {
            W(t74VarC);
            return true;
        }
        if (iY != -4 || !this.f13214p.g()) {
            return false;
        }
        this.f13215p0 = true;
        L0();
        return false;
    }

    private final boolean l0(long j10) {
        return this.B == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.B;
    }

    private final boolean m0(k9 k9Var) throws Exception {
        if (sv2.f15560a >= 23 && this.E != null && this.f13205j0 != 3 && k() != 0) {
            float fR = R(this.D, k9Var, w());
            float f5 = this.I;
            if (f5 == fR) {
                return true;
            }
            if (fR == -1.0f) {
                Y();
                return false;
            }
            if (f5 == -1.0f && fR <= this.f13212o) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fR);
            this.E.c0(bundle);
            this.I = fR;
        }
        return true;
    }

    private final void o0() {
        try {
            this.E.i();
        } finally {
            E0();
        }
    }

    protected final void A0() throws Exception {
        k9 k9Var;
        if (this.E != null || this.f13199d0 || (k9Var = this.f13230x) == null) {
            return;
        }
        if (this.f13231x0 == null && t0(k9Var)) {
            k9 k9Var2 = this.f13230x;
            X();
            String str = k9Var2.f10898l;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f13220s.o(32);
            } else {
                this.f13220s.o(1);
            }
            this.f13199d0 = true;
            return;
        }
        me4 me4Var = this.f13231x0;
        this.f13229w0 = me4Var;
        k9 k9Var3 = this.f13230x;
        String str2 = k9Var3.f10898l;
        if (me4Var != null && ne4.f12600a) {
            de4 de4VarA = me4Var.a();
            throw A(de4VarA, this.f13230x, false, de4VarA.f7280m);
        }
        try {
            if (this.J == null) {
                try {
                    List listA0 = a0(this.f13210n, k9Var3, false);
                    listA0.isEmpty();
                    this.J = new ArrayDeque();
                    if (!listA0.isEmpty()) {
                        this.J.add((kf4) listA0.get(0));
                    }
                    this.K = null;
                } catch (xf4 e5) {
                    throw new mf4(this.f13230x, (Throwable) e5, false, -49998);
                }
            }
            if (this.J.isEmpty()) {
                throw new mf4(this.f13230x, (Throwable) null, false, -49999);
            }
            kf4 kf4Var = (kf4) this.J.peekFirst();
            while (this.E == null) {
                kf4 kf4Var2 = (kf4) this.J.peekFirst();
                if (!I0(kf4Var2)) {
                    return;
                }
                try {
                    K0(kf4Var2, null);
                } catch (Exception e10) {
                    if (kf4Var2 != kf4Var) {
                        throw e10;
                    }
                    try {
                        ad2.e("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        K0(kf4Var2, null);
                    } catch (Exception e11) {
                        ad2.f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(kf4Var2)), e11);
                        this.J.removeFirst();
                        mf4 mf4Var = new mf4(this.f13230x, (Throwable) e11, false, kf4Var2);
                        b0(mf4Var);
                        mf4 mf4Var2 = this.K;
                        if (mf4Var2 == null) {
                            this.K = mf4Var;
                        } else {
                            this.K = mf4.a(mf4Var2, mf4Var);
                        }
                        if (this.J.isEmpty()) {
                            throw this.K;
                        }
                    }
                }
            }
            this.J = null;
        } catch (mf4 e12) {
            throw A(e12, this.f13230x, false, 4001);
        }
    }

    protected void B0(long j10) {
        this.f13225u0 = j10;
        if (this.f13226v.isEmpty() || j10 < ((nf4) this.f13226v.peek()).f12606a) {
            return;
        }
        f0((nf4) this.f13226v.poll());
        p0();
    }

    protected void C0(k9 k9Var) {
    }

    protected final void D0() {
        try {
            hf4 hf4Var = this.E;
            if (hf4Var != null) {
                hf4Var.l();
                this.f13221s0.f8616b++;
                d0(this.L.f11014a);
            }
        } finally {
            this.E = null;
            this.f13233z = null;
            this.f13229w0 = null;
            F0();
        }
    }

    protected void E0() {
        M0();
        e0();
        this.X = -9223372036854775807L;
        this.f13207l0 = false;
        this.f13206k0 = false;
        this.T = false;
        this.U = false;
        this.f13197b0 = false;
        this.f13198c0 = false;
        this.f13222t.clear();
        this.f13211n0 = -9223372036854775807L;
        this.f13213o0 = -9223372036854775807L;
        this.f13225u0 = -9223372036854775807L;
        cf4 cf4Var = this.W;
        if (cf4Var != null) {
            cf4Var.c();
        }
        this.f13204i0 = 0;
        this.f13205j0 = 0;
        this.f13203h0 = this.f13202g0 ? 1 : 0;
    }

    protected final void F0() {
        E0();
        this.W = null;
        this.J = null;
        this.L = null;
        this.F = null;
        this.G = null;
        this.H = false;
        this.f13209m0 = false;
        this.I = -1.0f;
        this.M = 0;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.V = false;
        this.f13202g0 = false;
        this.f13203h0 = 0;
        this.A = false;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public boolean G() {
        if (this.f13230x != null) {
            if (v() || j0()) {
                return true;
            }
            if (this.X != -9223372036854775807L && SystemClock.elapsedRealtime() < this.X) {
                return true;
            }
        }
        return false;
    }

    protected final boolean G0() throws Exception {
        boolean zH0 = H0();
        if (zH0) {
            A0();
        }
        return zH0;
    }

    protected final boolean H0() {
        if (this.E == null) {
            return false;
        }
        int i10 = this.f13205j0;
        if (i10 == 3 || this.O || ((this.P && !this.f13209m0) || (this.Q && this.f13207l0))) {
            D0();
            return true;
        }
        if (i10 == 2) {
            int i11 = sv2.f15560a;
            gt1.f(i11 >= 23);
            if (i11 >= 23) {
                try {
                    g0();
                } catch (o54 e5) {
                    ad2.f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e5);
                    D0();
                    return true;
                }
            }
        }
        o0();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected void I() {
        this.f13230x = null;
        f0(nf4.f12605d);
        this.f13226v.clear();
        H0();
    }

    protected boolean I0(kf4 kf4Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected void J(boolean z10, boolean z11) {
        this.f13221s0 = new g54();
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected void K(long j10, boolean z10) {
        this.f13215p0 = false;
        this.f13217q0 = false;
        if (this.f13199d0) {
            this.f13220s.b();
            this.f13218r.b();
            this.f13200e0 = false;
        } else {
            G0();
        }
        qs2 qs2Var = this.f13223t0.f12608c;
        if (qs2Var.a() > 0) {
            this.f13219r0 = true;
        }
        qs2Var.e();
        this.f13226v.clear();
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected void L() {
        try {
            X();
            D0();
        } finally {
            this.f13231x0 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1 >= r17.f13211n0) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.f54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void O(com.google.android.gms.internal.ads.k9[] r18, long r19, long r21) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.nf4 r1 = r0.f13223t0
            long r1 = r1.f12607b
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L36
            java.util.ArrayDeque r1 = r0.f13226v
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L24
            long r1 = r0.f13225u0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L24
            long r3 = r0.f13211n0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L24
            goto L36
        L24:
            java.util.ArrayDeque r1 = r0.f13226v
            com.google.android.gms.internal.ads.nf4 r9 = new com.google.android.gms.internal.ads.nf4
            long r3 = r0.f13211n0
            r2 = r9
            r5 = r19
            r7 = r21
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        L36:
            com.google.android.gms.internal.ads.nf4 r1 = new com.google.android.gms.internal.ads.nf4
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r1
            r13 = r19
            r15 = r21
            r10.<init>(r11, r13, r15)
            r0.f0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.of4.O(com.google.android.gms.internal.ads.k9[], long, long):void");
    }

    protected abstract float R(float f5, k9 k9Var, k9[] k9VarArr);

    protected abstract int S(qf4 qf4Var, k9 k9Var);

    protected abstract h54 U(kf4 kf4Var, k9 k9Var, k9 k9Var2);

    @Override // com.google.android.gms.internal.ads.t84
    public boolean V() {
        return this.f13217q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.gms.internal.ads.h54 W(com.google.android.gms.internal.ads.t74 r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.of4.W(com.google.android.gms.internal.ads.t74):com.google.android.gms.internal.ads.h54");
    }

    protected abstract ff4 Z(kf4 kf4Var, k9 k9Var, MediaCrypto mediaCrypto, float f5);

    protected abstract List a0(qf4 qf4Var, k9 k9Var, boolean z10);

    protected abstract void b0(Exception exc);

    @Override // com.google.android.gms.internal.ads.u84
    public final int c() {
        return 8;
    }

    protected abstract void c0(String str, ff4 ff4Var, long j10, long j11);

    protected abstract void d0(String str);

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.t84
    public void g(long r24, long r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.of4.g(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.t84
    public void l(float f5, float f10) throws Exception {
        this.C = f5;
        this.D = f10;
        m0(this.F);
    }

    protected abstract void n0(k9 k9Var, MediaFormat mediaFormat);

    @Override // com.google.android.gms.internal.ads.u84
    public final int o(k9 k9Var) throws o54 {
        try {
            return S(this.f13210n, k9Var);
        } catch (xf4 e5) {
            throw A(e5, k9Var, false, 4002);
        }
    }

    protected abstract void p0();

    protected abstract void q0(w44 w44Var);

    protected void r0() {
    }

    protected abstract boolean s0(long j10, long j11, hf4 hf4Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, k9 k9Var);

    protected boolean t0(k9 k9Var) {
        return false;
    }

    protected final float u0() {
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long v0() {
        return this.f13223t0.f12607b;
    }

    protected final hf4 w0() {
        return this.E;
    }

    protected if4 x0(Throwable th, kf4 kf4Var) {
        return new if4(th, kf4Var);
    }

    protected final kf4 y0() {
        return this.L;
    }

    protected void z0(w44 w44Var) {
    }
}
