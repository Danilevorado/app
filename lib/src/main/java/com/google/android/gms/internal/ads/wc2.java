package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class wc2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17055a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f17056b;

    /* renamed from: c, reason: collision with root package name */
    private final do2 f17057c;

    wc2(Context context, bb3 bb3Var, do2 do2Var) {
        this.f17055a = context;
        this.f17056b = bb3Var;
        this.f17057c = do2Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f17056b.g(new Callable() { // from class: com.google.android.gms.internal.ads.vc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16651a.c();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: IOException -> 0x00dd, TryCatch #0 {IOException -> 0x00dd, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:15:0x007c, B:20:0x00a2, B:22:0x00d5, B:18:0x0090, B:11:0x0044), top: B:27:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[Catch: IOException -> 0x00dd, TryCatch #0 {IOException -> 0x00dd, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:15:0x007c, B:20:0x00a2, B:22:0x00d5, B:18:0x0090, B:11:0x0044), top: B:27:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.xc2 c() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f17055a     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.do2 r1 = r8.f17057c     // Catch: java.io.IOException -> Ldd
            boolean r7 = r1.b()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.c03 r1 = new com.google.android.gms.internal.ads.c03     // Catch: java.io.IOException -> Ldd
            r1.<init>()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.c03 r2 = new com.google.android.gms.internal.ads.c03     // Catch: java.io.IOException -> Ldd
            r2.<init>()     // Catch: java.io.IOException -> Ldd
            r3 = 1
            if (r7 == 0) goto L2e
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.F2     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto L2e
            com.google.android.gms.internal.ads.xc2 r0 = new com.google.android.gms.internal.ads.xc2     // Catch: java.io.IOException -> Ldd
            r0.<init>(r3)     // Catch: java.io.IOException -> Ldd
            goto Ldc
        L2e:
            if (r7 != 0) goto L42
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.B2     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto L56
        L42:
            if (r7 == 0) goto L7a
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.D2     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 == 0) goto L7a
        L56:
            com.google.android.gms.internal.ads.f03 r1 = com.google.android.gms.internal.ads.f03.k(r0)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.M2     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.io.IOException -> Ldd
            long r4 = r4.longValue()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.je0 r6 = j3.t.q()     // Catch: java.io.IOException -> Ldd
            m3.p1 r6 = r6.h()     // Catch: java.io.IOException -> Ldd
            boolean r6 = r6.S()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.c03 r1 = r1.i(r4, r6)     // Catch: java.io.IOException -> Ldd
        L7a:
            if (r7 != 0) goto L8e
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.C2     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 != 0) goto La2
        L8e:
            if (r7 == 0) goto Ld2
            com.google.android.gms.internal.ads.zq r4 = com.google.android.gms.internal.ads.ir.E2     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.gr r5 = k3.w.c()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r4 = r5.b(r4)     // Catch: java.io.IOException -> Ldd
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> Ldd
            if (r4 == 0) goto Ld2
        La2:
            com.google.android.gms.internal.ads.g03 r0 = com.google.android.gms.internal.ads.g03.j(r0)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.zq r2 = com.google.android.gms.internal.ads.ir.N2     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.gr r3 = k3.w.c()     // Catch: java.io.IOException -> Ldd
            java.lang.Object r2 = r3.b(r2)     // Catch: java.io.IOException -> Ldd
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.io.IOException -> Ldd
            long r2 = r2.longValue()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.je0 r4 = j3.t.q()     // Catch: java.io.IOException -> Ldd
            m3.p1 r4 = r4.h()     // Catch: java.io.IOException -> Ldd
            boolean r4 = r4.S()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.ads.c03 r2 = r0.i(r2, r4)     // Catch: java.io.IOException -> Ldd
            boolean r3 = r0.p()     // Catch: java.io.IOException -> Ldd
            boolean r0 = r0.q()     // Catch: java.io.IOException -> Ldd
            r6 = r0
            r4 = r2
            r5 = r3
            goto Ld5
        Ld2:
            r4 = r2
            r5 = r3
            r6 = r5
        Ld5:
            com.google.android.gms.internal.ads.xc2 r0 = new com.google.android.gms.internal.ads.xc2     // Catch: java.io.IOException -> Ldd
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> Ldd
        Ldc:
            return r0
        Ldd:
            r0 = move-exception
            com.google.android.gms.internal.ads.je0 r1 = j3.t.q()
            java.lang.String r2 = "PerAppIdSignal"
            r1.u(r0, r2)
            com.google.android.gms.internal.ads.xc2 r0 = new com.google.android.gms.internal.ads.xc2
            com.google.android.gms.internal.ads.do2 r1 = r8.f17057c
            boolean r1 = r1.b()
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wc2.c():com.google.android.gms.internal.ads.xc2");
    }
}
