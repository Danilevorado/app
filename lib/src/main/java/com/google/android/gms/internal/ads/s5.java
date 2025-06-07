package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s5 implements k {
    public static final r E = new r() { // from class: com.google.android.gms.internal.ads.o5
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = s5.E;
            return new k[]{new s5(0, null)};
        }
    };
    private static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final k9 G;
    private boolean D;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f15089f;

    /* renamed from: g, reason: collision with root package name */
    private final jm2 f15090g;

    /* renamed from: l, reason: collision with root package name */
    private int f15095l;

    /* renamed from: m, reason: collision with root package name */
    private int f15096m;

    /* renamed from: n, reason: collision with root package name */
    private long f15097n;

    /* renamed from: o, reason: collision with root package name */
    private int f15098o;

    /* renamed from: p, reason: collision with root package name */
    private jm2 f15099p;

    /* renamed from: q, reason: collision with root package name */
    private long f15100q;

    /* renamed from: r, reason: collision with root package name */
    private int f15101r;

    /* renamed from: v, reason: collision with root package name */
    private r5 f15105v;

    /* renamed from: w, reason: collision with root package name */
    private int f15106w;

    /* renamed from: x, reason: collision with root package name */
    private int f15107x;

    /* renamed from: y, reason: collision with root package name */
    private int f15108y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15109z;

    /* renamed from: a, reason: collision with root package name */
    private final List f15084a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: h, reason: collision with root package name */
    private final l2 f15091h = new l2();

    /* renamed from: i, reason: collision with root package name */
    private final jm2 f15092i = new jm2(16);

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f15086c = new jm2(i0.f9463a);

    /* renamed from: d, reason: collision with root package name */
    private final jm2 f15087d = new jm2(5);

    /* renamed from: e, reason: collision with root package name */
    private final jm2 f15088e = new jm2();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque f15093j = new ArrayDeque();

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque f15094k = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f15085b = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    private long f15103t = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    private long f15102s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    private long f15104u = -9223372036854775807L;
    private n A = n.f12341a;
    private s0[] B = new s0[0];
    private s0[] C = new s0[0];

    static {
        i7 i7Var = new i7();
        i7Var.s("application/x-emsg");
        G = i7Var.y();
    }

    public s5(int i10, rt2 rt2Var) {
        byte[] bArr = new byte[16];
        this.f15089f = bArr;
        this.f15090g = new jm2(bArr);
    }

    private static int b(int i10) throws oh0 {
        if (i10 >= 0) {
            return i10;
        }
        throw oh0.a("Unexpected negative value: " + i10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.c0 c(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.c5 r5 = (com.google.android.gms.internal.ads.c5) r5
            int r6 = r5.f7184a
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.jm2 r5 = r5.f6776b
            byte[] r5 = r5.h()
            com.google.android.gms.internal.ads.jm2 r6 = new com.google.android.gms.internal.ads.jm2
            r6.<init>(r5)
            int r8 = r6.l()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L99
        L33:
            r6.f(r1)
            int r8 = r6.m()
            int r9 = r6.i()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.m()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.m()
            int r7 = com.google.android.gms.internal.ads.d5.a(r7)
            r8 = 1
            if (r7 <= r8) goto L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.ad2.e(r7, r6)
            goto L31
        L6c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.z()
            long r12 = r6.z()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L84
            int r8 = r6.v()
            int r8 = r8 * 16
            r6.g(r8)
        L84:
            int r8 = r6.v()
            int r10 = r6.i()
            if (r8 == r10) goto L8f
            goto L31
        L8f:
            byte[] r10 = new byte[r8]
            r6.b(r10, r1, r8)
            com.google.android.gms.internal.ads.y5 r6 = new com.google.android.gms.internal.ads.y5
            r6.<init>(r9, r7, r10)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.util.UUID r6 = com.google.android.gms.internal.ads.y5.a(r6)
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.ad2.e(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.b r7 = new com.google.android.gms.internal.ads.b
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.c0 r14 = new com.google.android.gms.internal.ads.c0
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s5.c(java.util.List):com.google.android.gms.internal.ads.c0");
    }

    private final void g() {
        this.f15095l = 0;
        this.f15098o = 0;
    }

    private static void h(jm2 jm2Var, int i10, d6 d6Var) throws oh0 {
        jm2Var.f(i10 + 8);
        int iM = jm2Var.m() & 16777215;
        if ((iM & 1) != 0) {
            throw oh0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iM & 2) != 0;
        int iV = jm2Var.v();
        if (iV == 0) {
            Arrays.fill(d6Var.f7198l, 0, d6Var.f7191e, false);
            return;
        }
        int i11 = d6Var.f7191e;
        if (iV != i11) {
            throw oh0.a("Senc sample count " + iV + " is different from fragment sample count" + i11, null);
        }
        Arrays.fill(d6Var.f7198l, 0, iV, z10);
        d6Var.a(jm2Var.i());
        jm2 jm2Var2 = d6Var.f7200n;
        jm2Var.b(jm2Var2.h(), 0, jm2Var2.l());
        d6Var.f7200n.f(0);
        d6Var.f7201o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(long r46) throws com.google.android.gms.internal.ads.oh0 {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s5.i(long):void");
    }

    private static final n5 j(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (n5) sparseArray.valueAt(0);
        }
        n5 n5Var = (n5) sparseArray.get(i10);
        Objects.requireNonNull(n5Var);
        return n5Var;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        return a6.a(lVar);
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.A = nVar;
        g();
        s0[] s0VarArr = new s0[2];
        this.B = s0VarArr;
        int i10 = 0;
        s0[] s0VarArr2 = (s0[]) sv2.f(s0VarArr, 0);
        this.B = s0VarArr2;
        for (s0 s0Var : s0VarArr2) {
            s0Var.b(G);
        }
        this.C = new s0[this.f15084a.size()];
        int i11 = 100;
        while (i10 < this.C.length) {
            int i12 = i11 + 1;
            s0 s0VarS = this.A.S(i11, 3);
            s0VarS.b((k9) this.f15084a.get(i10));
            this.C[i10] = s0VarS;
            i10++;
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0243, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0245, code lost:
    
        r5.e(r10, r20, r33.f15106w, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0258, code lost:
    
        if (r33.f15094k.isEmpty() != false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025a, code lost:
    
        r1 = (com.google.android.gms.internal.ads.q5) r33.f15094k.removeFirst();
        r33.f15101r -= r1.f14144c;
        r3 = r1.f14142a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026d, code lost:
    
        if (r1.f14143b == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026f, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0270, code lost:
    
        r5 = r33.B;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0274, code lost:
    
        if (r8 >= r6) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0276, code lost:
    
        r5[r8].e(r3, 1, r1.f14144c, r33.f15101r, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028e, code lost:
    
        if (r2.k() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0290, code lost:
    
        r33.f15105v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0292, code lost:
    
        r33.f15095l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0296, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r33.f15095l != 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        r3 = r2.b();
        r33.f15106w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r2.f14629f >= r2.f14632i) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.bo4) r1).h(r3, false);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        r3 = r2.f14625b.f7200n;
        r1 = r1.f6785d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        r3.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        if (r2.f14625b.b(r2.f14629f) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        r3.g(r3.w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        if (r2.k() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d9, code lost:
    
        r33.f15105v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
    
        r33.f15095l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        if (r2.f14627d.f7643a.f6352g != 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        r33.f15106w = r3 - 8;
        ((com.google.android.gms.internal.ads.bo4) r1).h(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        if ("audio/ac4".equals(r2.f14627d.f7643a.f6351f.f10898l) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0104, code lost:
    
        r33.f15107x = r2.c(r33.f15106w, 7);
        com.google.android.gms.internal.ads.pn4.b(r33.f15106w, r33.f15090g);
        r2.f14624a.a(r33.f15090g, 7);
        r3 = r33.f15107x + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
    
        r3 = r2.c(r33.f15106w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        r33.f15107x = r3;
        r33.f15106w += r3;
        r33.f15095l = 4;
        r33.f15108y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
    
        r3 = r2.f14627d.f7643a;
        r5 = r2.f14624a;
        r10 = r2.e();
        r6 = r3.f6355j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013d, code lost:
    
        if (r6 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013f, code lost:
    
        r3 = r33.f15107x;
        r4 = r33.f15106w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0143, code lost:
    
        if (r3 >= r4) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        r33.f15107x += r5.f(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0150, code lost:
    
        r13 = r33.f15087d.h();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
    
        if (r33.f15107x >= r33.f15106w) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0168, code lost:
    
        r12 = r33.f15108y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
    
        if (r12 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        ((com.google.android.gms.internal.ads.bo4) r1).C(r13, r6, r14, r9);
        r33.f15087d.f(r9);
        r12 = r33.f15087d.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017f, code lost:
    
        if (r12 <= 0) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0181, code lost:
    
        r33.f15108y = r12 - 1;
        r33.f15086c.f(r9);
        r5.a(r33.f15086c, 4);
        r5.a(r33.f15087d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        if (r33.C.length <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019a, code lost:
    
        r12 = r3.f6351f.f10898l;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.i0.f9463a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a8, code lost:
    
        if ("video/avc".equals(r12) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
    
        if ((r17 & 31) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01af, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b5, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bc, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bf, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
    
        r33.f15109z = r9;
        r33.f15107x += 5;
        r33.f15106w += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d4, code lost:
    
        throw com.google.android.gms.internal.ads.oh0.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d7, code lost:
    
        if (r33.f15109z == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
    
        r33.f15088e.c(r12);
        ((com.google.android.gms.internal.ads.bo4) r1).C(r33.f15088e.h(), 0, r33.f15108y, false);
        r5.a(r33.f15088e, r33.f15108y);
        r4 = r33.f15108y;
        r8 = r33.f15088e;
        r8 = com.google.android.gms.internal.ads.i0.b(r8.h(), r8.l());
        r33.f15088e.f("video/hevc".equals(r3.f6351f.f10898l) ? 1 : 0);
        r33.f15088e.e(r8);
        com.google.android.gms.internal.ads.yn4.a(r10, r33.f15088e, r33.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x021e, code lost:
    
        r4 = r5.f(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0224, code lost:
    
        r33.f15107x += r4;
        r33.f15108y -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0230, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0234, code lost:
    
        r20 = r2.a();
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023c, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023e, code lost:
    
        r23 = r1.f6784c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r34, com.google.android.gms.internal.ads.l0 r35) throws com.google.android.gms.internal.ads.oh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s5.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        int size = this.f15085b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r5) this.f15085b.valueAt(i10)).i();
        }
        this.f15094k.clear();
        this.f15101r = 0;
        this.f15102s = j11;
        this.f15093j.clear();
        g();
    }
}
