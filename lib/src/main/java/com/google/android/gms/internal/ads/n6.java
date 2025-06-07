package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class n6 {

    /* renamed from: a, reason: collision with root package name */
    private final o6 f12432a = new o6();

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f12433b = new jm2(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f12434c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f12435d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12436e;

    n6() {
    }

    private final int f(int i10) {
        int i11;
        int i12 = 0;
        this.f12435d = 0;
        do {
            int i13 = this.f12435d;
            int i14 = i10 + i13;
            o6 o6Var = this.f12432a;
            if (i14 >= o6Var.f13021c) {
                break;
            }
            int[] iArr = o6Var.f13024f;
            this.f12435d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final jm2 a() {
        return this.f12433b;
    }

    public final o6 b() {
        return this.f12432a;
    }

    public final void c() {
        this.f12432a.a();
        this.f12433b.c(0);
        this.f12434c = -1;
        this.f12436e = false;
    }

    public final void d() {
        jm2 jm2Var = this.f12433b;
        if (jm2Var.h().length == 65025) {
            return;
        }
        jm2Var.d(Arrays.copyOf(jm2Var.h(), Math.max(65025, jm2Var.l())), this.f12433b.l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.android.gms.internal.ads.l r7) {
        /*
            r6 = this;
            boolean r0 = r6.f12436e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.f12436e = r1
            com.google.android.gms.internal.ads.jm2 r0 = r6.f12433b
            r0.c(r1)
        Ld:
            boolean r0 = r6.f12436e
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.f12434c
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.o6 r0 = r6.f12432a
            r3 = -1
            boolean r0 = r0.c(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.o6 r0 = r6.f12432a
            boolean r0 = r0.b(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.o6 r0 = r6.f12432a
            int r3 = r0.f13022d
            int r0 = r0.f13019a
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.jm2 r0 = r6.f12433b
            int r0 = r0.l()
            if (r0 != 0) goto L42
            int r0 = r6.f(r1)
            int r3 = r3 + r0
            int r0 = r6.f12435d
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = com.google.android.gms.internal.ads.o.e(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.f12434c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.f(r0)
            int r3 = r6.f12434c
            int r4 = r6.f12435d
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.google.android.gms.internal.ads.jm2 r4 = r6.f12433b
            int r5 = r4.l()
            int r5 = r5 + r0
            r4.H(r5)
            com.google.android.gms.internal.ads.jm2 r4 = r6.f12433b
            byte[] r5 = r4.h()
            int r4 = r4.l()
            boolean r4 = com.google.android.gms.internal.ads.o.d(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.google.android.gms.internal.ads.jm2 r4 = r6.f12433b
            int r5 = r4.l()
            int r5 = r5 + r0
            r4.e(r5)
            com.google.android.gms.internal.ads.o6 r0 = r6.f12432a
            int[] r0 = r0.f13024f
            int r4 = r3 + (-1)
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = r1
        L8c:
            r6.f12436e = r2
        L8e:
            com.google.android.gms.internal.ads.o6 r0 = r6.f12432a
            int r0 = r0.f13021c
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.f12434c = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n6.e(com.google.android.gms.internal.ads.l):boolean");
    }
}
