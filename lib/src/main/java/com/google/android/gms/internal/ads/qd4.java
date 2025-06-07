package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class qd4 implements sc4 {
    private static final Object W = new Object();
    private static ExecutorService X;
    private static int Y;
    private long A;
    private int B;
    private boolean C;
    private boolean D;
    private long E;
    private float F;
    private ByteBuffer G;
    private int H;
    private ByteBuffer I;
    private byte[] J;
    private int K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private v84 Q;
    private cd4 R;
    private long S;
    private boolean T;
    private boolean U;
    private final gd4 V;

    /* renamed from: a, reason: collision with root package name */
    private final ac4 f14254a;

    /* renamed from: b, reason: collision with root package name */
    private final xc4 f14255b;

    /* renamed from: c, reason: collision with root package name */
    private final be4 f14256c;

    /* renamed from: d, reason: collision with root package name */
    private final c63 f14257d;

    /* renamed from: e, reason: collision with root package name */
    private final c63 f14258e;

    /* renamed from: f, reason: collision with root package name */
    private final jw1 f14259f;

    /* renamed from: g, reason: collision with root package name */
    private final wc4 f14260g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayDeque f14261h;

    /* renamed from: i, reason: collision with root package name */
    private od4 f14262i;

    /* renamed from: j, reason: collision with root package name */
    private final jd4 f14263j;

    /* renamed from: k, reason: collision with root package name */
    private final jd4 f14264k;

    /* renamed from: l, reason: collision with root package name */
    private final dd4 f14265l;

    /* renamed from: m, reason: collision with root package name */
    private xb4 f14266m;

    /* renamed from: n, reason: collision with root package name */
    private pc4 f14267n;

    /* renamed from: o, reason: collision with root package name */
    private fd4 f14268o;

    /* renamed from: p, reason: collision with root package name */
    private fd4 f14269p;

    /* renamed from: q, reason: collision with root package name */
    private wi1 f14270q;

    /* renamed from: r, reason: collision with root package name */
    private AudioTrack f14271r;

    /* renamed from: s, reason: collision with root package name */
    private u74 f14272s;

    /* renamed from: t, reason: collision with root package name */
    private id4 f14273t;

    /* renamed from: u, reason: collision with root package name */
    private id4 f14274u;

    /* renamed from: v, reason: collision with root package name */
    private sl0 f14275v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14276w;

    /* renamed from: x, reason: collision with root package name */
    private long f14277x;

    /* renamed from: y, reason: collision with root package name */
    private long f14278y;

    /* renamed from: z, reason: collision with root package name */
    private long f14279z;

    /* synthetic */ qd4(ed4 ed4Var, pd4 pd4Var) {
        this.f14254a = ed4Var.f7728a;
        this.V = ed4Var.f7730c;
        int i10 = sv2.f15560a;
        this.f14265l = ed4Var.f7729b;
        jw1 jw1Var = new jw1(hu1.f9421a);
        this.f14259f = jw1Var;
        jw1Var.e();
        this.f14260g = new wc4(new ld4(this, null));
        xc4 xc4Var = new xc4();
        this.f14255b = xc4Var;
        be4 be4Var = new be4();
        this.f14256c = be4Var;
        this.f14257d = c63.y(new dq1(), xc4Var, be4Var);
        this.f14258e = c63.v(new zd4());
        this.F = 1.0f;
        this.f14272s = u74.f16215c;
        this.P = 0;
        this.Q = new v84(0, 0.0f);
        sl0 sl0Var = sl0.f15309d;
        this.f14274u = new id4(sl0Var, 0L, 0L, null);
        this.f14275v = sl0Var;
        this.f14276w = false;
        this.f14261h = new ArrayDeque();
        this.f14263j = new jd4(100L);
        this.f14264k = new jd4(100L);
    }

    static /* synthetic */ void A(AudioTrack audioTrack, jw1 jw1Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            jw1Var.e();
            synchronized (W) {
                int i10 = Y - 1;
                Y = i10;
                if (i10 == 0) {
                    X.shutdown();
                    X = null;
                }
            }
        } catch (Throwable th) {
            jw1Var.e();
            synchronized (W) {
                int i11 = Y - 1;
                Y = i11;
                if (i11 == 0) {
                    X.shutdown();
                    X = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long C() {
        return this.f14269p.f8237c == 0 ? this.f14277x / r0.f8236b : this.f14278y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D() {
        return this.f14269p.f8237c == 0 ? this.f14279z / r0.f8238d : this.A;
    }

    private final AudioTrack E(fd4 fd4Var) throws oc4 {
        try {
            return fd4Var.b(false, this.f14272s, this.P);
        } catch (oc4 e5) {
            pc4 pc4Var = this.f14267n;
            if (pc4Var != null) {
                pc4Var.a(e5);
            }
            throw e5;
        }
    }

    private final void F(long j10) {
        sl0 sl0Var;
        boolean z10;
        if (P()) {
            gd4 gd4Var = this.V;
            sl0Var = this.f14275v;
            gd4Var.c(sl0Var);
        } else {
            sl0Var = sl0.f15309d;
        }
        sl0 sl0Var2 = sl0Var;
        this.f14275v = sl0Var2;
        if (P()) {
            gd4 gd4Var2 = this.V;
            z10 = this.f14276w;
            gd4Var2.d(z10);
        } else {
            z10 = false;
        }
        this.f14276w = z10;
        this.f14261h.add(new id4(sl0Var2, Math.max(0L, j10), this.f14269p.a(D()), null));
        K();
        pc4 pc4Var = this.f14267n;
        if (pc4Var != null) {
            ((vd4) pc4Var).f16663a.A0.s(this.f14276w);
        }
    }

    private final void G() throws IllegalStateException {
        if (this.M) {
            return;
        }
        this.M = true;
        this.f14260g.c(D());
        this.f14271r.stop();
    }

    private final void H(long j10) throws Exception {
        ByteBuffer byteBufferB;
        if (!this.f14270q.h()) {
            ByteBuffer byteBuffer = this.G;
            if (byteBuffer == null) {
                byteBuffer = zl1.f18622a;
            }
            L(byteBuffer, j10);
            return;
        }
        while (!this.f14270q.g()) {
            do {
                byteBufferB = this.f14270q.b();
                if (byteBufferB.hasRemaining()) {
                    L(byteBufferB, j10);
                } else {
                    ByteBuffer byteBuffer2 = this.G;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f14270q.e(this.G);
                    }
                }
            } while (!byteBufferB.hasRemaining());
            return;
        }
    }

    private final void I(sl0 sl0Var) {
        id4 id4Var = new id4(sl0Var, -9223372036854775807L, -9223372036854775807L, null);
        if (N()) {
            this.f14273t = id4Var;
        } else {
            this.f14274u = id4Var;
        }
    }

    private final void J() {
        if (N()) {
            if (sv2.f15560a >= 21) {
                this.f14271r.setVolume(this.F);
                return;
            }
            AudioTrack audioTrack = this.f14271r;
            float f5 = this.F;
            audioTrack.setStereoVolume(f5, f5);
        }
    }

    private final void K() {
        wi1 wi1Var = this.f14269p.f8243i;
        this.f14270q = wi1Var;
        wi1Var.c();
    }

    private final void L(ByteBuffer byteBuffer, long j10) throws Exception {
        int iWrite;
        pc4 pc4Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                gt1.d(byteBuffer2 == byteBuffer);
            } else {
                this.I = byteBuffer;
                if (sv2.f15560a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.J;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.J = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.J, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.K = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = sv2.f15560a;
            if (i10 < 21) {
                int iA = this.f14260g.a(this.f14279z);
                if (iA > 0) {
                    iWrite = this.f14271r.write(this.J, this.K, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.K += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.f14271r.write(byteBuffer, iRemaining2, 1);
            }
            this.S = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                rc4 rc4Var = new rc4(iWrite, this.f14269p.f8235a, ((i10 >= 24 && iWrite == -6) || iWrite == -32) && this.A > 0);
                pc4 pc4Var2 = this.f14267n;
                if (pc4Var2 != null) {
                    pc4Var2.a(rc4Var);
                }
                if (rc4Var.f14748n) {
                    throw rc4Var;
                }
                this.f14264k.b(rc4Var);
                return;
            }
            this.f14264k.a();
            if (O(this.f14271r)) {
                if (this.A > 0) {
                    this.U = false;
                }
                if (this.N && (pc4Var = this.f14267n) != null && iWrite < iRemaining2 && !this.U) {
                    wd4 wd4Var = ((vd4) pc4Var).f16663a;
                    if (wd4Var.J0 != null) {
                        wd4Var.J0.a();
                    }
                }
            }
            int i11 = this.f14269p.f8237c;
            if (i11 == 0) {
                this.f14279z += iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    gt1.f(byteBuffer == this.G);
                    this.A += this.B * this.H;
                }
                this.I = null;
            }
        }
    }

    private final boolean M() throws Exception {
        if (!this.f14270q.h()) {
            ByteBuffer byteBuffer = this.I;
            if (byteBuffer == null) {
                return true;
            }
            L(byteBuffer, Long.MIN_VALUE);
            return this.I == null;
        }
        this.f14270q.d();
        H(Long.MIN_VALUE);
        if (!this.f14270q.g()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.I;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean N() {
        return this.f14271r != null;
    }

    private static boolean O(AudioTrack audioTrack) {
        return sv2.f15560a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean P() {
        fd4 fd4Var = this.f14269p;
        if (fd4Var.f8237c != 0) {
            return false;
        }
        int i10 = fd4Var.f8235a.A;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final int a(k9 k9Var) {
        if (!"audio/raw".equals(k9Var.f10898l)) {
            if (!this.T) {
                int i10 = sv2.f15560a;
            }
            return this.f14254a.a(k9Var) != null ? 2 : 0;
        }
        boolean zC = sv2.c(k9Var.A);
        int i11 = k9Var.A;
        if (zC) {
            return i11 != 2 ? 1 : 2;
        }
        ad2.e("DefaultAudioSink", "Invalid PCM encoding: " + i11);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void b(pc4 pc4Var) {
        this.f14267n = pc4Var;
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void c() throws IllegalStateException {
        if (N()) {
            this.f14277x = 0L;
            this.f14278y = 0L;
            this.f14279z = 0L;
            this.A = 0L;
            this.U = false;
            this.B = 0;
            this.f14274u = new id4(this.f14275v, 0L, 0L, null);
            this.E = 0L;
            this.f14273t = null;
            this.f14261h.clear();
            this.G = null;
            this.H = 0;
            this.I = null;
            this.M = false;
            this.L = false;
            this.f14256c.p();
            K();
            if (this.f14260g.h()) {
                this.f14271r.pause();
            }
            if (O(this.f14271r)) {
                od4 od4Var = this.f14262i;
                Objects.requireNonNull(od4Var);
                od4Var.b(this.f14271r);
            }
            if (sv2.f15560a < 21 && !this.O) {
                this.P = 0;
            }
            fd4 fd4Var = this.f14268o;
            if (fd4Var != null) {
                this.f14269p = fd4Var;
                this.f14268o = null;
            }
            this.f14260g.d();
            final AudioTrack audioTrack = this.f14271r;
            final jw1 jw1Var = this.f14259f;
            jw1Var.c();
            synchronized (W) {
                if (X == null) {
                    X = sv2.H("ExoPlayer:AudioTrackReleaseThread");
                }
                Y++;
                X.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yc4
                    @Override // java.lang.Runnable
                    public final void run() {
                        qd4.A(audioTrack, jw1Var);
                    }
                });
            }
            this.f14271r = null;
        }
        this.f14264k.a();
        this.f14263j.a();
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final sl0 d() {
        return this.f14275v;
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void e() {
        this.C = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038e A[Catch: oc4 -> 0x0392, TryCatch #3 {oc4 -> 0x0392, blocks: (B:37:0x0089, B:50:0x00d6, B:52:0x00de, B:54:0x00e4, B:55:0x00eb, B:56:0x00fd, B:58:0x0101, B:60:0x0105, B:61:0x010a, B:65:0x0120, B:69:0x0138, B:70:0x013d, B:46:0x009e, B:48:0x00a7, B:179:0x0386, B:181:0x038e, B:182:0x0391, B:40:0x0092, B:42:0x0097), top: B:196:0x0089, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[Catch: oc4 -> 0x0392, SYNTHETIC, TRY_LEAVE, TryCatch #3 {oc4 -> 0x0392, blocks: (B:37:0x0089, B:50:0x00d6, B:52:0x00de, B:54:0x00e4, B:55:0x00eb, B:56:0x00fd, B:58:0x0101, B:60:0x0105, B:61:0x010a, B:65:0x0120, B:69:0x0138, B:70:0x013d, B:46:0x009e, B:48:0x00a7, B:179:0x0386, B:181:0x038e, B:182:0x0391, B:40:0x0092, B:42:0x0097), top: B:196:0x0089, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.sc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.nio.ByteBuffer r26, long r27, int r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qd4.f(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void g() throws IllegalStateException {
        this.N = true;
        if (N()) {
            this.f14260g.f();
            this.f14271r.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void h() throws IllegalStateException {
        this.N = false;
        if (N() && this.f14260g.k()) {
            this.f14271r.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void i() throws IllegalStateException {
        if (!this.L && N() && M()) {
            G();
            this.L = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void j() throws IllegalStateException {
        c();
        c63 c63Var = this.f14257d;
        int size = c63Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zl1) c63Var.get(i10)).e();
        }
        c63 c63Var2 = this.f14258e;
        int size2 = c63Var2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zl1) c63Var2.get(i11)).e();
        }
        wi1 wi1Var = this.f14270q;
        if (wi1Var != null) {
            wi1Var.f();
        }
        this.N = false;
        this.T = false;
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final boolean k(k9 k9Var) {
        return a(k9Var) != 0;
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void l(float f5) {
        if (this.F != f5) {
            this.F = f5;
            J();
        }
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void m(AudioDeviceInfo audioDeviceInfo) {
        cd4 cd4Var = audioDeviceInfo == null ? null : new cd4(audioDeviceInfo);
        this.R = cd4Var;
        AudioTrack audioTrack = this.f14271r;
        if (audioTrack != null) {
            ad4.a(audioTrack, cd4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final long n(boolean z10) {
        long jU;
        if (!N() || this.D) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f14260g.b(z10), this.f14269p.a(D()));
        while (!this.f14261h.isEmpty() && jMin >= ((id4) this.f14261h.getFirst()).f9696c) {
            this.f14274u = (id4) this.f14261h.remove();
        }
        id4 id4Var = this.f14274u;
        long j10 = jMin - id4Var.f9696c;
        if (id4Var.f9694a.equals(sl0.f15309d)) {
            jU = this.f14274u.f9695b + j10;
        } else if (this.f14261h.isEmpty()) {
            jU = this.V.a(j10) + this.f14274u.f9695b;
        } else {
            id4 id4Var2 = (id4) this.f14261h.getFirst();
            jU = id4Var2.f9695b - sv2.u(id4Var2.f9696c - jMin, this.f14274u.f9694a.f15313a);
        }
        return jU + this.f14269p.a(this.V.b());
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void o(sl0 sl0Var) {
        this.f14275v = new sl0(Math.max(0.1f, Math.min(sl0Var.f15313a, 8.0f)), Math.max(0.1f, Math.min(sl0Var.f15314b, 8.0f)));
        I(sl0Var);
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void p(v84 v84Var) {
        if (this.Q.equals(v84Var)) {
            return;
        }
        int i10 = v84Var.f16632a;
        if (this.f14271r != null) {
            int i11 = this.Q.f16632a;
        }
        this.Q = v84Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    @Override // com.google.android.gms.internal.ads.sc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.google.android.gms.internal.ads.k9 r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.nc4 {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qd4.q(com.google.android.gms.internal.ads.k9, int, int[]):void");
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void r(boolean z10) {
        this.f14276w = z10;
        I(this.f14275v);
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void s(u74 u74Var) throws IllegalStateException {
        if (this.f14272s.equals(u74Var)) {
            return;
        }
        this.f14272s = u74Var;
        c();
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void t(int i10) throws IllegalStateException {
        if (this.P != i10) {
            this.P = i10;
            this.O = i10 != 0;
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final boolean u() {
        return N() && this.f14260g.g(D());
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final boolean v() {
        return !N() || (this.L && !u());
    }

    @Override // com.google.android.gms.internal.ads.sc4
    public final void w(xb4 xb4Var) {
        this.f14266m = xb4Var;
    }
}
