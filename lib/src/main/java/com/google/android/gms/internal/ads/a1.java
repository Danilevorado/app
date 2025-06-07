package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class a1 implements k {

    /* renamed from: n, reason: collision with root package name */
    public static final r f5885n = new r() { // from class: com.google.android.gms.internal.ads.z0
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = a1.f5885n;
            return new k[]{new a1(0)};
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f5886o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f5887p;

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f5888q;

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f5889r;

    /* renamed from: s, reason: collision with root package name */
    private static final int f5890s;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5892b;

    /* renamed from: c, reason: collision with root package name */
    private long f5893c;

    /* renamed from: d, reason: collision with root package name */
    private int f5894d;

    /* renamed from: e, reason: collision with root package name */
    private int f5895e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5896f;

    /* renamed from: h, reason: collision with root package name */
    private int f5898h;

    /* renamed from: i, reason: collision with root package name */
    private long f5899i;

    /* renamed from: j, reason: collision with root package name */
    private n f5900j;

    /* renamed from: k, reason: collision with root package name */
    private s0 f5901k;

    /* renamed from: l, reason: collision with root package name */
    private o0 f5902l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5903m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5891a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    private int f5897g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f5887p = iArr;
        int i10 = sv2.f15560a;
        Charset charset = u23.f16142c;
        f5888q = "#!AMR\n".getBytes(charset);
        f5889r = "#!AMR-WB\n".getBytes(charset);
        f5890s = iArr[8];
    }

    public a1(int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: EOFException -> 0x00b5, TryCatch #0 {EOFException -> 0x00b5, blocks: (B:5:0x0008, B:7:0x001c, B:21:0x003a, B:23:0x0043, B:22:0x003f, B:40:0x0081, B:41:0x009e, B:42:0x009f, B:43:0x00b4), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(com.google.android.gms.internal.ads.l r12) throws com.google.android.gms.internal.ads.oh0 {
        /*
            r11 = this;
            int r0 = r11.f5895e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L8
            goto L55
        L8:
            r12.j()     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.f5891a     // Catch: java.io.EOFException -> Lb5
            r4 = r12
            com.google.android.gms.internal.ads.bo4 r4 = (com.google.android.gms.internal.ads.bo4) r4     // Catch: java.io.EOFException -> Lb5
            r4.E(r0, r3, r2, r3)     // Catch: java.io.EOFException -> Lb5
            byte[] r0 = r11.f5891a     // Catch: java.io.EOFException -> Lb5
            r0 = r0[r3]     // Catch: java.io.EOFException -> Lb5
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L9f
            int r0 = r0 >> 3
            boolean r4 = r11.f5892b     // Catch: java.io.EOFException -> Lb5
            r0 = r0 & 15
            if (r4 == 0) goto L2d
            r6 = 10
            if (r0 < r6) goto L38
            r6 = 13
            if (r0 <= r6) goto L2d
            goto L38
        L2d:
            if (r4 != 0) goto L7a
            r6 = 12
            if (r0 < r6) goto L38
            r6 = 14
            if (r0 > r6) goto L38
            goto L7a
        L38:
            if (r4 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.a1.f5887p     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.a1.f5886o     // Catch: java.io.EOFException -> Lb5
            r0 = r4[r0]     // Catch: java.io.EOFException -> Lb5
        L43:
            r11.f5894d = r0     // Catch: java.io.EOFException -> Lb5
            r11.f5895e = r0
            int r4 = r11.f5897g
            if (r4 != r1) goto L4e
            r11.f5897g = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto L55
            int r4 = r11.f5898h
            int r4 = r4 + r2
            r11.f5898h = r4
        L55:
            com.google.android.gms.internal.ads.s0 r4 = r11.f5901k
            int r12 = com.google.android.gms.internal.ads.q0.a(r4, r12, r0, r2)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            int r0 = r11.f5895e
            int r0 = r0 - r12
            r11.f5895e = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            com.google.android.gms.internal.ads.s0 r4 = r11.f5901k
            long r5 = r11.f5893c
            r7 = 1
            int r8 = r11.f5894d
            r9 = 0
            r10 = 0
            r4.e(r5, r7, r8, r9, r10)
            long r0 = r11.f5893c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f5893c = r0
            return r3
        L7a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L81
            r12 = r3
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r2.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> Lb5
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> Lb5
            r2.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.oh0 r12 = com.google.android.gms.internal.ads.oh0.a(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        L9f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lb5
            r12.<init>()     // Catch: java.io.EOFException -> Lb5
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> Lb5
            r12.append(r0)     // Catch: java.io.EOFException -> Lb5
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> Lb5
            com.google.android.gms.internal.ads.oh0 r12 = com.google.android.gms.internal.ads.oh0.a(r12, r5)     // Catch: java.io.EOFException -> Lb5
            throw r12     // Catch: java.io.EOFException -> Lb5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a1.b(com.google.android.gms.internal.ads.l):int");
    }

    private static boolean c(l lVar, byte[] bArr) {
        lVar.j();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((bo4) lVar).E(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean g(l lVar) throws EOFException, InterruptedIOException {
        int length;
        byte[] bArr = f5888q;
        if (c(lVar, bArr)) {
            this.f5892b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f5889r;
            if (!c(lVar, bArr2)) {
                return false;
            }
            this.f5892b = true;
            length = bArr2.length;
        }
        ((bo4) lVar).h(length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        return g(lVar);
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f5900j = nVar;
        this.f5901k = nVar.S(0, 1);
        nVar.Q();
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) throws oh0 {
        gt1.b(this.f5901k);
        int i10 = sv2.f15560a;
        if (lVar.e() == 0 && !g(lVar)) {
            throw oh0.a("Could not find AMR header.", null);
        }
        if (!this.f5903m) {
            this.f5903m = true;
            boolean z10 = this.f5892b;
            String str = true != z10 ? "audio/3gpp" : "audio/amr-wb";
            int i11 = true != z10 ? 8000 : 16000;
            s0 s0Var = this.f5901k;
            i7 i7Var = new i7();
            i7Var.s(str);
            i7Var.l(f5890s);
            i7Var.e0(1);
            i7Var.t(i11);
            s0Var.b(i7Var.y());
        }
        int iB = b(lVar);
        if (this.f5896f) {
            return iB;
        }
        n0 n0Var = new n0(-9223372036854775807L, 0L);
        this.f5902l = n0Var;
        this.f5900j.R(n0Var);
        this.f5896f = true;
        return iB;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.f5893c = 0L;
        this.f5894d = 0;
        this.f5895e = 0;
        this.f5899i = 0L;
    }
}
