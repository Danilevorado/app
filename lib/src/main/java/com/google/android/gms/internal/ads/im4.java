package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class im4 extends of4 {

    /* renamed from: d1, reason: collision with root package name */
    private static final int[] f9801d1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: e1, reason: collision with root package name */
    private static boolean f9802e1;

    /* renamed from: f1, reason: collision with root package name */
    private static boolean f9803f1;
    private final tm4 A0;
    private final fn4 B0;
    private final hm4 C0;
    private final boolean D0;
    private fm4 E0;
    private boolean F0;
    private boolean G0;
    private Surface H0;
    private lm4 I0;
    private boolean J0;
    private int K0;
    private boolean L0;
    private boolean M0;
    private boolean N0;
    private long O0;
    private long P0;
    private long Q0;
    private int R0;
    private int S0;
    private int T0;
    private long U0;
    private long V0;
    private long W0;
    private int X0;
    private long Y0;
    private vh1 Z0;

    /* renamed from: a1, reason: collision with root package name */
    private vh1 f9804a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f9805b1;

    /* renamed from: c1, reason: collision with root package name */
    private mm4 f9806c1;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f9807z0;

    public im4(Context context, gf4 gf4Var, qf4 qf4Var, long j10, boolean z10, Handler handler, gn4 gn4Var, int i10, float f5) {
        super(2, gf4Var, qf4Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f9807z0 = applicationContext;
        tm4 tm4Var = new tm4(applicationContext);
        this.A0 = tm4Var;
        this.B0 = new fn4(handler, gn4Var);
        this.C0 = new hm4(tm4Var, this);
        this.D0 = "NVIDIA".equals(sv2.f15562c);
        this.P0 = -9223372036854775807L;
        this.K0 = 1;
        this.Z0 = vh1.f16691e;
        this.f9805b1 = 0;
        this.f9804a1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int N0(com.google.android.gms.internal.ads.kf4 r10, com.google.android.gms.internal.ads.k9 r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.im4.N0(com.google.android.gms.internal.ads.kf4, com.google.android.gms.internal.ads.k9):int");
    }

    protected static int O0(kf4 kf4Var, k9 k9Var) {
        if (k9Var.f10899m == -1) {
            return N0(kf4Var, k9Var);
        }
        int size = k9Var.f10900n.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) k9Var.f10900n.get(i10)).length;
        }
        return k9Var.f10899m + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean b1(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.im4.b1(java.lang.String):boolean");
    }

    protected static final boolean c1(long j10, long j11, boolean z10) {
        return k1(j10) && !z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long d1(long j10, long j11, long j12, long j13, boolean z10) {
        long jU0 = (long) ((j13 - j10) / u0());
        return z10 ? jU0 - (j12 - j11) : jU0;
    }

    private static List e1(Context context, qf4 qf4Var, k9 k9Var, boolean z10, boolean z11) {
        String str = k9Var.f10898l;
        if (str == null) {
            return c63.u();
        }
        List listF = eg4.f(str, z10, z11);
        String strE = eg4.e(k9Var);
        if (strE == null) {
            return c63.s(listF);
        }
        List listF2 = eg4.f(strE, z10, z11);
        if (sv2.f15560a >= 26 && "video/dolby-vision".equals(k9Var.f10898l) && !listF2.isEmpty() && !em4.a(context)) {
            return c63.s(listF2);
        }
        z53 z53Var = new z53();
        z53Var.i(listF);
        z53Var.i(listF2);
        return z53Var.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(vh1 vh1Var) {
        if (vh1Var.equals(vh1.f16691e) || vh1Var.equals(this.f9804a1)) {
            return;
        }
        this.f9804a1 = vh1Var;
        this.B0.t(vh1Var);
    }

    private final void g1() {
        vh1 vh1Var = this.f9804a1;
        if (vh1Var != null) {
            this.B0.t(vh1Var);
        }
    }

    private final void h1() {
        Surface surface = this.H0;
        lm4 lm4Var = this.I0;
        if (surface == lm4Var) {
            this.H0 = null;
        }
        lm4Var.release();
        this.I0 = null;
    }

    private final void i1(hf4 hf4Var, k9 k9Var, int i10, long j10, boolean z10) {
        long jV0 = this.C0.k() ? (v0() + j10) * 1000 : System.nanoTime();
        if (sv2.f15560a >= 21) {
            V0(hf4Var, i10, j10, jV0);
        } else {
            U0(hf4Var, i10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j1() {
        return sv2.f15560a >= 21;
    }

    private static boolean k1(long j10) {
        return j10 < -30000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l1(long j10, long j11) {
        int iK = k();
        boolean z10 = this.N0;
        boolean z11 = iK == 2;
        boolean z12 = z10 ? !this.L0 : z11 || this.M0;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.V0;
        if (this.P0 == -9223372036854775807L && j10 >= v0()) {
            if (z12) {
                return true;
            }
            if (z11 && k1(j11) && jElapsedRealtime > 100000) {
                return true;
            }
        }
        return false;
    }

    private final boolean m1(kf4 kf4Var) {
        return sv2.f15560a >= 23 && !b1(kf4Var.f11014a) && (!kf4Var.f11019f || lm4.b(this.f9807z0));
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void B0(long j10) {
        super.B0(j10);
        this.T0--;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void C0(k9 k9Var) {
        if (this.C0.k()) {
            return;
        }
        this.C0.m(k9Var);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void E0() {
        super.E0();
        this.T0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.t84
    public final boolean G() {
        lm4 lm4Var;
        if (super.G() && ((!this.C0.k() || this.C0.l()) && (this.L0 || (((lm4Var = this.I0) != null && this.H0 == lm4Var) || w0() == null)))) {
            this.P0 = -9223372036854775807L;
            return true;
        }
        if (this.P0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.P0) {
            return true;
        }
        this.P0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void I() {
        this.f9804a1 = null;
        this.L0 = false;
        int i10 = sv2.f15560a;
        this.J0 = false;
        try {
            super.I();
        } finally {
            this.B0.c(this.f13221s0);
        }
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final boolean I0(kf4 kf4Var) {
        return this.H0 != null || m1(kf4Var);
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void J(boolean z10, boolean z11) {
        super.J(z10, z11);
        D();
        this.B0.e(this.f13221s0);
        this.M0 = z11;
        this.N0 = false;
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void K(long j10, boolean z10) {
        super.K(j10, z10);
        if (this.C0.k()) {
            this.C0.d();
        }
        this.L0 = false;
        int i10 = sv2.f15560a;
        this.A0.f();
        this.U0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.S0 = 0;
        this.P0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.f54
    protected final void L() {
        try {
            super.L();
            if (this.C0.k()) {
                this.C0.g();
            }
            if (this.I0 != null) {
                h1();
            }
        } catch (Throwable th) {
            if (this.C0.k()) {
                this.C0.g();
            }
            if (this.I0 != null) {
                h1();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected final void M() {
        this.R0 = 0;
        this.Q0 = SystemClock.elapsedRealtime();
        this.V0 = SystemClock.elapsedRealtime() * 1000;
        this.W0 = 0L;
        this.X0 = 0;
        this.A0.g();
    }

    @Override // com.google.android.gms.internal.ads.f54
    protected final void N() {
        this.P0 = -9223372036854775807L;
        if (this.R0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.B0.d(this.R0, jElapsedRealtime - this.Q0);
            this.R0 = 0;
            this.Q0 = jElapsedRealtime;
        }
        int i10 = this.X0;
        if (i10 != 0) {
            this.B0.r(this.W0, i10);
            this.W0 = 0L;
            this.X0 = 0;
        }
        this.A0.h();
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final float R(float f5, k9 k9Var, k9[] k9VarArr) {
        float fMax = -1.0f;
        for (k9 k9Var2 : k9VarArr) {
            float f10 = k9Var2.f10905s;
            if (f10 != -1.0f) {
                fMax = Math.max(fMax, f10);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f5;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final int S(qf4 qf4Var, k9 k9Var) {
        boolean z10;
        if (!ng0.g(k9Var.f10898l)) {
            return 128;
        }
        int i10 = 0;
        boolean z11 = k9Var.f10901o != null;
        List listE1 = e1(this.f9807z0, qf4Var, k9Var, z11, false);
        if (z11 && listE1.isEmpty()) {
            listE1 = e1(this.f9807z0, qf4Var, k9Var, false, false);
        }
        if (listE1.isEmpty()) {
            return 129;
        }
        if (!of4.J0(k9Var)) {
            return 130;
        }
        kf4 kf4Var = (kf4) listE1.get(0);
        boolean zE = kf4Var.e(k9Var);
        if (zE) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listE1.size(); i11++) {
                kf4 kf4Var2 = (kf4) listE1.get(i11);
                if (kf4Var2.e(k9Var)) {
                    zE = true;
                    z10 = false;
                    kf4Var = kf4Var2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = true != zE ? 3 : 4;
        int i13 = true != kf4Var.f(k9Var) ? 8 : 16;
        int i14 = true != kf4Var.f11020g ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (sv2.f15560a >= 26 && "video/dolby-vision".equals(k9Var.f10898l) && !em4.a(this.f9807z0)) {
            i15 = 256;
        }
        if (zE) {
            List listE12 = e1(this.f9807z0, qf4Var, k9Var, z11, true);
            if (!listE12.isEmpty()) {
                kf4 kf4Var3 = (kf4) eg4.g(listE12, k9Var).get(0);
                if (kf4Var3.e(k9Var) && kf4Var3.f(k9Var)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    final void T0() {
        this.N0 = true;
        if (this.L0) {
            return;
        }
        this.L0 = true;
        this.B0.q(this.H0);
        this.J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final h54 U(kf4 kf4Var, k9 k9Var, k9 k9Var2) {
        int i10;
        int i11;
        h54 h54VarB = kf4Var.b(k9Var, k9Var2);
        int i12 = h54VarB.f9014e;
        int i13 = k9Var2.f10903q;
        fm4 fm4Var = this.E0;
        if (i13 > fm4Var.f8332a || k9Var2.f10904r > fm4Var.f8333b) {
            i12 |= 256;
        }
        if (O0(kf4Var, k9Var2) > this.E0.f8334c) {
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

    protected final void U0(hf4 hf4Var, int i10, long j10) {
        int i11 = sv2.f15560a;
        Trace.beginSection("releaseOutputBuffer");
        hf4Var.f(i10, true);
        Trace.endSection();
        this.f13221s0.f8619e++;
        this.S0 = 0;
        if (this.C0.k()) {
            return;
        }
        this.V0 = SystemClock.elapsedRealtime() * 1000;
        f1(this.Z0);
        T0();
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.t84
    public final boolean V() {
        boolean zV = super.V();
        if (this.C0.k()) {
            return false;
        }
        return zV;
    }

    protected final void V0(hf4 hf4Var, int i10, long j10, long j11) {
        int i11 = sv2.f15560a;
        Trace.beginSection("releaseOutputBuffer");
        hf4Var.b(i10, j11);
        Trace.endSection();
        this.f13221s0.f8619e++;
        this.S0 = 0;
        if (this.C0.k()) {
            return;
        }
        this.V0 = SystemClock.elapsedRealtime() * 1000;
        f1(this.Z0);
        T0();
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final h54 W(t74 t74Var) {
        h54 h54VarW = super.W(t74Var);
        this.B0.f(t74Var.f15720a, h54VarW);
        return h54VarW;
    }

    protected final void W0(hf4 hf4Var, int i10, long j10) {
        int i11 = sv2.f15560a;
        Trace.beginSection("skipVideoBuffer");
        hf4Var.f(i10, false);
        Trace.endSection();
        this.f13221s0.f8620f++;
    }

    protected final void X0(int i10, int i11) {
        g54 g54Var = this.f13221s0;
        g54Var.f8622h += i10;
        int i12 = i10 + i11;
        g54Var.f8621g += i12;
        this.R0 += i12;
        int i13 = this.S0 + i12;
        this.S0 = i13;
        g54Var.f8623i = Math.max(i13, g54Var.f8623i);
    }

    protected final void Y0(long j10) {
        g54 g54Var = this.f13221s0;
        g54Var.f8625k += j10;
        g54Var.f8626l++;
        this.W0 += j10;
        this.X0++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
    
        if (true == r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0111, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        if (true == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0116, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
    
        r3 = new android.graphics.Point(r13, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0203  */
    @Override // com.google.android.gms.internal.ads.of4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.ff4 Z(com.google.android.gms.internal.ads.kf4 r20, com.google.android.gms.internal.ads.k9 r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.im4.Z(com.google.android.gms.internal.ads.kf4, com.google.android.gms.internal.ads.k9, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.ff4");
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final List a0(qf4 qf4Var, k9 k9Var, boolean z10) {
        return eg4.g(e1(this.f9807z0, qf4Var, k9Var, false, false), k9Var);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void b0(Exception exc) {
        ad2.c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.B0.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void c0(String str, ff4 ff4Var, long j10, long j11) {
        this.B0.a(str, j10, j11);
        this.F0 = b1(str);
        kf4 kf4VarY0 = y0();
        Objects.requireNonNull(kf4VarY0);
        boolean z10 = false;
        if (sv2.f15560a >= 29 && "video/x-vnd.on2.vp9".equals(kf4VarY0.f11015b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = kf4VarY0.h();
            int length = codecProfileLevelArrH.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArrH[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.G0 = z10;
        this.C0.e(str);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void d0(String str) {
        this.B0.b(str);
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.t84
    public final void g(long j10, long j11) throws Exception {
        super.g(j10, j11);
        if (this.C0.k()) {
            this.C0.f(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.of4, com.google.android.gms.internal.ads.t84
    public final void l(float f5, float f10) throws Exception {
        super.l(f5, f10);
        this.A0.e(f5);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void n0(k9 k9Var, MediaFormat mediaFormat) {
        hf4 hf4VarW0 = w0();
        if (hf4VarW0 != null) {
            hf4VarW0.c(this.K0);
        }
        Objects.requireNonNull(mediaFormat);
        int i10 = 0;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f5 = k9Var.f10907u;
        if (j1()) {
            int i11 = k9Var.f10906t;
            if (i11 == 90 || i11 == 270) {
                f5 = 1.0f / f5;
                int i12 = integer2;
                integer2 = integer;
                integer = i12;
            }
        } else if (!this.C0.k()) {
            i10 = k9Var.f10906t;
        }
        this.Z0 = new vh1(integer, integer2, i10, f5);
        this.A0.c(k9Var.f10905s);
        if (this.C0.k()) {
            hm4 hm4Var = this.C0;
            i7 i7VarB = k9Var.b();
            i7VarB.x(integer);
            i7VarB.f(integer2);
            i7VarB.r(i10);
            i7VarB.p(f5);
            hm4Var.h(i7VarB.y());
        }
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void p0() {
        this.L0 = false;
        int i10 = sv2.f15560a;
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void q0(w44 w44Var) {
        this.T0++;
        int i10 = sv2.f15560a;
    }

    @Override // com.google.android.gms.internal.ads.t84, com.google.android.gms.internal.ads.u84
    public final String s() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final boolean s0(long j10, long j11, hf4 hf4Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, k9 k9Var) throws Exception {
        boolean z12;
        int iB;
        boolean z13;
        Objects.requireNonNull(hf4Var);
        if (this.O0 == -9223372036854775807L) {
            this.O0 = j10;
        }
        if (j12 != this.U0) {
            if (!this.C0.k()) {
                this.A0.d(j12);
            }
            this.U0 = j12;
        }
        long jV0 = j12 - v0();
        if (z10 && !z11) {
            W0(hf4Var, i10, jV0);
            return true;
        }
        boolean z14 = k() == 2;
        long jD1 = d1(j10, j11, SystemClock.elapsedRealtime() * 1000, j12, z14);
        if (this.H0 == this.I0) {
            if (!k1(jD1)) {
                return false;
            }
            W0(hf4Var, i10, jV0);
        } else {
            if (!l1(j10, jD1)) {
                if (!z14 || j10 == this.O0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                long jA = this.A0.a(jNanoTime + (jD1 * 1000));
                if (!this.C0.k()) {
                    jD1 = (jA - jNanoTime) / 1000;
                }
                long j13 = this.P0;
                if (jD1 < -500000 && !z11 && (iB = B(j10)) != 0) {
                    if (j13 != -9223372036854775807L) {
                        g54 g54Var = this.f13221s0;
                        g54Var.f8618d += iB;
                        g54Var.f8620f += this.T0;
                    } else {
                        this.f13221s0.f8624j++;
                        X0(iB, this.T0);
                    }
                    G0();
                    if (!this.C0.k()) {
                        return false;
                    }
                    this.C0.d();
                    return false;
                }
                if (c1(jD1, j11, z11)) {
                    if (j13 != -9223372036854775807L) {
                        W0(hf4Var, i10, jV0);
                        z12 = true;
                    } else {
                        int i13 = sv2.f15560a;
                        Trace.beginSection("dropVideoBuffer");
                        hf4Var.f(i10, false);
                        Trace.endSection();
                        z12 = true;
                        X0(0, 1);
                    }
                    Y0(jD1);
                    return z12;
                }
                if (this.C0.k()) {
                    this.C0.f(j10, j11);
                    if (!this.C0.n(k9Var, jV0, z11)) {
                        return false;
                    }
                    i1(hf4Var, k9Var, i10, jV0, false);
                    return true;
                }
                if (sv2.f15560a >= 21) {
                    if (jD1 < 50000) {
                        if (jA == this.Y0) {
                            W0(hf4Var, i10, jV0);
                        } else {
                            V0(hf4Var, i10, jV0, jA);
                        }
                        Y0(jD1);
                        this.Y0 = jA;
                        return true;
                    }
                } else if (jD1 < 30000) {
                    if (jD1 > 11000) {
                        try {
                            Thread.sleep(((-10000) + jD1) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    U0(hf4Var, i10, jV0);
                }
                return false;
            }
            if (!this.C0.k()) {
                z13 = true;
            } else {
                if (!this.C0.n(k9Var, jV0, z11)) {
                    return false;
                }
                z13 = false;
            }
            i1(hf4Var, k9Var, i10, jV0, z13);
        }
        Y0(jD1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.p84
    public final void u(int i10, Object obj) throws Exception {
        Surface surface;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f9806c1 = (mm4) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f9805b1 != iIntValue) {
                    this.f9805b1 = iIntValue;
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.K0 = iIntValue2;
                hf4 hf4VarW0 = w0();
                if (hf4VarW0 != null) {
                    hf4VarW0.c(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                this.A0.j(((Integer) obj).intValue());
                return;
            }
            if (i10 == 13) {
                Objects.requireNonNull(obj);
                this.C0.j((List) obj);
                return;
            } else {
                if (i10 != 14) {
                    return;
                }
                Objects.requireNonNull(obj);
                kn2 kn2Var = (kn2) obj;
                if (kn2Var.b() == 0 || kn2Var.a() == 0 || (surface = this.H0) == null) {
                    return;
                }
                this.C0.i(surface, kn2Var);
                return;
            }
        }
        lm4 lm4VarA = obj instanceof Surface ? (Surface) obj : null;
        if (lm4VarA == null) {
            lm4 lm4Var = this.I0;
            if (lm4Var != null) {
                lm4VarA = lm4Var;
            } else {
                kf4 kf4VarY0 = y0();
                if (kf4VarY0 != null && m1(kf4VarY0)) {
                    lm4VarA = lm4.a(this.f9807z0, kf4VarY0.f11019f);
                    this.I0 = lm4VarA;
                }
            }
        }
        if (this.H0 == lm4VarA) {
            if (lm4VarA == null || lm4VarA == this.I0) {
                return;
            }
            g1();
            if (this.J0) {
                this.B0.q(this.H0);
                return;
            }
            return;
        }
        this.H0 = lm4VarA;
        this.A0.i(lm4VarA);
        this.J0 = false;
        int iK = k();
        hf4 hf4VarW02 = w0();
        if (hf4VarW02 != null && !this.C0.k()) {
            if (sv2.f15560a < 23 || lm4VarA == null || this.F0) {
                D0();
                A0();
            } else {
                hf4VarW02.h(lm4VarA);
            }
        }
        if (lm4VarA == null || lm4VarA == this.I0) {
            this.f9804a1 = null;
            this.L0 = false;
            int i11 = sv2.f15560a;
            if (this.C0.k()) {
                this.C0.c();
                return;
            }
            return;
        }
        g1();
        this.L0 = false;
        int i12 = sv2.f15560a;
        if (iK == 2) {
            this.P0 = -9223372036854775807L;
        }
        if (this.C0.k()) {
            this.C0.i(lm4VarA, kn2.f11168c);
        }
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final if4 x0(Throwable th, kf4 kf4Var) {
        return new dm4(th, kf4Var, this.H0);
    }

    @Override // com.google.android.gms.internal.ads.of4
    protected final void z0(w44 w44Var) {
        if (this.G0) {
            ByteBuffer byteBuffer = w44Var.f16978f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        hf4 hf4VarW0 = w0();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        hf4VarW0.c0(bundle);
                    }
                }
            }
        }
    }
}
