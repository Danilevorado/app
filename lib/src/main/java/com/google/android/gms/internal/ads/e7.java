package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class e7 implements k {

    /* renamed from: j, reason: collision with root package name */
    public static final r f7659j = new r() { // from class: com.google.android.gms.internal.ads.d7
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = e7.f7659j;
            return new k[]{new e7(0)};
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f7662c;

    /* renamed from: d, reason: collision with root package name */
    private final il2 f7663d;

    /* renamed from: e, reason: collision with root package name */
    private n f7664e;

    /* renamed from: f, reason: collision with root package name */
    private long f7665f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7667h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7668i;

    /* renamed from: a, reason: collision with root package name */
    private final f7 f7660a = new f7(true, null);

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f7661b = new jm2(2048);

    /* renamed from: g, reason: collision with root package name */
    private long f7666g = -1;

    public e7(int i10) {
        jm2 jm2Var = new jm2(10);
        this.f7662c = jm2Var;
        byte[] bArrH = jm2Var.h();
        this.f7663d = new il2(bArrH, bArrH.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.l r10) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.android.gms.internal.ads.jm2 r2 = r9.f7662c
            byte[] r2 = r2.h()
            r3 = r10
            com.google.android.gms.internal.ads.bo4 r3 = (com.google.android.gms.internal.ads.bo4) r3
            r4 = 10
            r3.E(r2, r0, r4, r0)
            com.google.android.gms.internal.ads.jm2 r2 = r9.f7662c
            r2.f(r0)
            com.google.android.gms.internal.ads.jm2 r2 = r9.f7662c
            int r2 = r2.u()
            r4 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r4) goto L91
            r10.j()
            r2 = r10
            com.google.android.gms.internal.ads.bo4 r2 = (com.google.android.gms.internal.ads.bo4) r2
            r2.g(r1, r0)
            long r3 = r9.f7666g
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L34
            long r3 = (long) r1
            r9.f7666g = r3
        L34:
            r3 = r0
            r5 = r3
            r4 = r1
        L37:
            com.google.android.gms.internal.ads.jm2 r6 = r9.f7662c
            byte[] r6 = r6.h()
            r7 = 2
            r2.E(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.jm2 r6 = r9.f7662c
            r6.f(r0)
            com.google.android.gms.internal.ads.jm2 r6 = r9.f7662c
            int r6 = r6.w()
            boolean r6 = com.google.android.gms.internal.ads.f7.f(r6)
            if (r6 != 0) goto L5d
        L52:
            int r4 = r4 + 1
            r10.j()
            r2.g(r4, r0)
            r3 = r0
            r5 = r3
            goto L8a
        L5d:
            r6 = 1
            int r3 = r3 + r6
            r7 = 4
            if (r3 < r7) goto L68
            r8 = 188(0xbc, float:2.63E-43)
            if (r5 > r8) goto L67
            goto L68
        L67:
            return r6
        L68:
            com.google.android.gms.internal.ads.jm2 r6 = r9.f7662c
            byte[] r6 = r6.h()
            r2.E(r6, r0, r7, r0)
            com.google.android.gms.internal.ads.il2 r6 = r9.f7663d
            r7 = 14
            r6.j(r7)
            com.google.android.gms.internal.ads.il2 r6 = r9.f7663d
            r7 = 13
            int r6 = r6.d(r7)
            r7 = 6
            if (r6 > r7) goto L84
            goto L52
        L84:
            int r7 = r6 + (-6)
            r2.g(r7, r0)
            int r5 = r5 + r6
        L8a:
            int r6 = r4 - r1
            r7 = 8192(0x2000, float:1.148E-41)
            if (r6 < r7) goto L37
            return r0
        L91:
            com.google.android.gms.internal.ads.jm2 r2 = r9.f7662c
            r4 = 3
            r2.g(r4)
            com.google.android.gms.internal.ads.jm2 r2 = r9.f7662c
            int r2 = r2.r()
            int r4 = r2 + 10
            int r1 = r1 + r4
            r3.g(r2, r0)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e7.a(com.google.android.gms.internal.ads.l):boolean");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f7664e = nVar;
        this.f7660a.b(nVar, new x8(Integer.MIN_VALUE, 0, 1));
        nVar.Q();
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) {
        gt1.b(this.f7664e);
        int iZ = lVar.z(this.f7661b.h(), 0, 2048);
        if (!this.f7668i) {
            this.f7664e.R(new n0(-9223372036854775807L, 0L));
            this.f7668i = true;
        }
        if (iZ == -1) {
            return -1;
        }
        this.f7661b.f(0);
        this.f7661b.e(iZ);
        if (!this.f7667h) {
            this.f7660a.e(this.f7665f, 4);
            this.f7667h = true;
        }
        this.f7660a.a(this.f7661b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.f7667h = false;
        this.f7660a.c();
        this.f7665f = j11;
    }
}
