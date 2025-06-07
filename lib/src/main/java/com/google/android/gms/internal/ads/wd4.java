package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.ads.NativeAdScrollView;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wd4 extends of4 implements w74 {
    private final lc4 A0;
    private final sc4 B0;
    private int C0;
    private boolean D0;
    private k9 E0;
    private long F0;
    private boolean G0;
    private boolean H0;
    private boolean I0;
    private s84 J0;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f17091z0;

    public wd4(Context context, gf4 gf4Var, qf4 qf4Var, boolean z10, Handler handler, mc4 mc4Var, sc4 sc4Var) {
        super(1, gf4Var, qf4Var, false, 44100.0f);
        this.f17091z0 = context.getApplicationContext();
        this.B0 = sc4Var;
        this.A0 = new lc4(handler, mc4Var);
        sc4Var.b(new vd4(this, null));
    }

    private final void M0() {
        long jN = this.B0.n(V());
        if (jN != Long.MIN_VALUE) {
            if (!this.H0) {
                jN = Math.max(this.F0, jN);
            }
            this.F0 = jN;
            this.H0 = false;
        }
    }

    private final int P0(kf4 kf4Var, k9 k9Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(kf4Var.f11014a) || (i10 = sv2.f15560a) >= 24 || (i10 == 23 && sv2.d(this.f17091z0))) {
            return k9Var.f10899m;
        }
        return -1;
    }

    private static List Q0(qf4 qf4Var, k9 k9Var, boolean z10, sc4 sc4Var) {
        kf4 kf4VarD;
        String str = k9Var.f10898l;
        if (str == null) {
            return c63.u();
        }
        if (sc4Var.k(k9Var) && (kf4VarD = eg4.d()) != null) {
            return c63.v(kf4VarD);
        }
        List listF = eg4.f(str, false, false);
        String strE = eg4.e(k9Var);
        if (strE == null) {
            return c63.s(listF);
        }
        List listF2 = eg4.f(strE, false, false);
        z53 z53Var = new z53();
        z53Var.i(listF);
        z53Var.i(listF2);
        return z53Var.j();
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.t84
    public final boolean G() {
        return this.B0.u() || super.G();
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void I() {
        this.I0 = true;
        try {
            this.B0.c();
            try {
                super.I();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.I();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void J(boolean z10, boolean z11) {
        super.J(z10, z11);
        this.A0.f(this.f13221s0);
        D();
        this.B0.w(H());
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void K(long j10, boolean z10) {
        super.K(j10, z10);
        this.B0.c();
        this.F0 = j10;
        this.G0 = true;
        this.H0 = true;
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void L() {
        try {
            super.L();
            if (this.I0) {
                this.I0 = false;
                this.B0.j();
            }
        } catch (Throwable th) {
            if (this.I0) {
                this.I0 = false;
                this.B0.j();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected final void M() {
        this.B0.g();
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected final void N() {
        M0();
        this.B0.h();
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final float R(float f5, k9 k9Var, k9[] k9VarArr) {
        int iMax = -1;
        for (k9 k9Var2 : k9VarArr) {
            int i10 = k9Var2.f10912z;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f5;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final int S(qf4 qf4Var, k9 k9Var) {
        boolean z10;
        if (!ng0.f(k9Var.f10898l)) {
            return 128;
        }
        int i10 = sv2.f15560a >= 21 ? 32 : 0;
        int i11 = k9Var.E;
        boolean zJ0 = of4.J0(k9Var);
        if (zJ0 && this.B0.k(k9Var) && (i11 == 0 || eg4.d() != null)) {
            return i10 | 140;
        }
        if (("audio/raw".equals(k9Var.f10898l) && !this.B0.k(k9Var)) || !this.B0.k(sv2.C(2, k9Var.f10911y, k9Var.f10912z))) {
            return 129;
        }
        List listQ0 = Q0(qf4Var, k9Var, false, this.B0);
        if (listQ0.isEmpty()) {
            return 129;
        }
        if (!zJ0) {
            return 130;
        }
        kf4 kf4Var = (kf4) listQ0.get(0);
        boolean zE = kf4Var.e(k9Var);
        if (zE) {
            z10 = true;
        } else {
            for (int i12 = 1; i12 < listQ0.size(); i12++) {
                kf4 kf4Var2 = (kf4) listQ0.get(i12);
                if (kf4Var2.e(k9Var)) {
                    z10 = false;
                    zE = true;
                    kf4Var = kf4Var2;
                    break;
                }
            }
            z10 = true;
        }
        int i13 = true != zE ? 3 : 4;
        int i14 = 8;
        if (zE && kf4Var.f(k9Var)) {
            i14 = 16;
        }
        return i13 | i14 | i10 | (true != kf4Var.f11020g ? 0 : 64) | (true != z10 ? 0 : 128);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final h54 U(kf4 kf4Var, k9 k9Var, k9 k9Var2) {
        int i10;
        int i11;
        h54 h54VarB = kf4Var.b(k9Var, k9Var2);
        int i12 = h54VarB.f9014e;
        if (P0(kf4Var, k9Var2) > this.C0) {
            i12 |= 64;
        }
        String str = kf4Var.f11014a;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = h54VarB.f9013d;
        }
        return new h54(str, k9Var, k9Var2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.t84
    public final boolean V() {
        return super.V() && this.B0.v();
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final h54 W(t74 t74Var) {
        h54 h54VarW = super.W(t74Var);
        this.A0.g(t74Var.f15720a, h54VarW);
        return h54VarW;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // com.google.android.gms.internal.ads.of4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.ff4 Z(com.google.android.gms.internal.ads.kf4 r8, com.google.android.gms.internal.ads.k9 r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wd4.Z(com.google.android.gms.internal.ads.kf4, com.google.android.gms.internal.ads.k9, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.ff4");
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final long a() {
        if (k() == 2) {
            M0();
        }
        return this.F0;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final List a0(qf4 qf4Var, k9 k9Var, boolean z10) {
        return eg4.g(Q0(qf4Var, k9Var, false, this.B0), k9Var);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void b0(Exception exc) {
        ad2.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.A0.a(exc);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void c0(String str, ff4 ff4Var, long j10, long j11) {
        this.A0.c(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final sl0 d() {
        return this.B0.d();
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void d0(String str) {
        this.A0.d(str);
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final void h(sl0 sl0Var) {
        this.B0.o(sl0Var);
    }

    @Override // com.google.android.gms.internal.ads.f54, com.google.android.gms.internal.ads.t84
    public final w74 i() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void n0(k9 k9Var, MediaFormat mediaFormat) throws o54 {
        int i10;
        k9 k9Var2 = this.E0;
        int[] iArr = null;
        if (k9Var2 != null) {
            k9Var = k9Var2;
        } else if (w0() != null) {
            int iR = "audio/raw".equals(k9Var.f10898l) ? k9Var.A : (sv2.f15560a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? sv2.r(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            i7 i7Var = new i7();
            i7Var.s("audio/raw");
            i7Var.n(iR);
            i7Var.c(k9Var.B);
            i7Var.d(k9Var.C);
            i7Var.e0(mediaFormat.getInteger("channel-count"));
            i7Var.t(mediaFormat.getInteger("sample-rate"));
            k9 k9VarY = i7Var.y();
            if (this.D0 && k9VarY.f10911y == 6 && (i10 = k9Var.f10911y) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < k9Var.f10911y; i11++) {
                    iArr[i11] = i11;
                }
            }
            k9Var = k9VarY;
        }
        try {
            this.B0.q(k9Var, 0, iArr);
        } catch (nc4 e5) {
            throw A(e5, e5.f12586m, false, 5001);
        }
    }

    protected final void o0() {
        this.H0 = true;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void p0() {
        this.B0.e();
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void q0(w44 w44Var) {
        if (!this.G0 || w44Var.f()) {
            return;
        }
        if (Math.abs(w44Var.f16977e - this.F0) > 500000) {
            this.F0 = w44Var.f16977e;
        }
        this.G0 = false;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void r0() throws o54 {
        try {
            this.B0.i();
        } catch (rc4 e5) {
            throw A(e5, e5.f14749o, e5.f14748n, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.t84, com.google.android.gms.internal.ads.u84
    public final String s() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final boolean s0(long j10, long j11, hf4 hf4Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, k9 k9Var) throws o54 {
        Objects.requireNonNull(byteBuffer);
        if (this.E0 != null && (i11 & 2) != 0) {
            Objects.requireNonNull(hf4Var);
            hf4Var.f(i10, false);
            return true;
        }
        if (z10) {
            if (hf4Var != null) {
                hf4Var.f(i10, false);
            }
            this.f13221s0.f8620f += i12;
            this.B0.e();
            return true;
        }
        try {
            if (!this.B0.f(byteBuffer, j12, i12)) {
                return false;
            }
            if (hf4Var != null) {
                hf4Var.f(i10, false);
            }
            this.f13221s0.f8619e += i12;
            return true;
        } catch (oc4 e5) {
            throw A(e5, e5.f13155o, e5.f13154n, 5001);
        } catch (rc4 e10) {
            throw A(e10, k9Var, e10.f14748n, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final boolean t0(k9 k9Var) {
        return this.B0.k(k9Var);
    }

    @Override // com.google.android.gms.internal.ads.p84
    public final void u(int i10, Object obj) {
        if (i10 == 2) {
            this.B0.l(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.B0.s((u74) obj);
            return;
        }
        if (i10 == 6) {
            this.B0.p((v84) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.B0.r(((Boolean) obj).booleanValue());
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                this.B0.t(((Integer) obj).intValue());
                break;
            case 11:
                this.J0 = (s84) obj;
                break;
            case 12:
                if (sv2.f15560a >= 23) {
                    td4.a(this.B0, obj);
                    break;
                }
                break;
        }
    }
}
