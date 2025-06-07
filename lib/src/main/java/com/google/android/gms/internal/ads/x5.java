package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x5 implements k, o0 {

    /* renamed from: x, reason: collision with root package name */
    public static final r f17389x = new r() { // from class: com.google.android.gms.internal.ads.u5
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = x5.f17389x;
            return new k[]{new x5(0)};
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private int f17398i;

    /* renamed from: j, reason: collision with root package name */
    private long f17399j;

    /* renamed from: k, reason: collision with root package name */
    private int f17400k;

    /* renamed from: l, reason: collision with root package name */
    private jm2 f17401l;

    /* renamed from: n, reason: collision with root package name */
    private int f17403n;

    /* renamed from: o, reason: collision with root package name */
    private int f17404o;

    /* renamed from: p, reason: collision with root package name */
    private int f17405p;

    /* renamed from: s, reason: collision with root package name */
    private long[][] f17408s;

    /* renamed from: t, reason: collision with root package name */
    private int f17409t;

    /* renamed from: u, reason: collision with root package name */
    private long f17410u;

    /* renamed from: v, reason: collision with root package name */
    private int f17411v;

    /* renamed from: w, reason: collision with root package name */
    private z3 f17412w;

    /* renamed from: h, reason: collision with root package name */
    private int f17397h = 0;

    /* renamed from: f, reason: collision with root package name */
    private final z5 f17395f = new z5();

    /* renamed from: g, reason: collision with root package name */
    private final List f17396g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final jm2 f17393d = new jm2(16);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f17394e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f17390a = new jm2(i0.f9463a);

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f17391b = new jm2(4);

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f17392c = new jm2();

    /* renamed from: m, reason: collision with root package name */
    private int f17402m = -1;

    /* renamed from: q, reason: collision with root package name */
    private n f17406q = n.f12341a;

    /* renamed from: r, reason: collision with root package name */
    private w5[] f17407r = new w5[0];

    public x5(int i10) {
    }

    private static int j(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int k(e6 e6Var, long j10) {
        int iA = e6Var.a(j10);
        return iA == -1 ? e6Var.b(j10) : iA;
    }

    private static long l(e6 e6Var, long j10, long j11) {
        int iK = k(e6Var, j10);
        return iK == -1 ? j11 : Math.min(e6Var.f7645c[iK], j11);
    }

    private final void m() {
        this.f17397h = 0;
        this.f17400k = 0;
    }

    private final void n(long j10) throws oh0 {
        x5 x5Var;
        int i10;
        ld0 ld0Var;
        ld0 ld0Var2;
        long j11;
        int i11;
        List list;
        ld0 ld0Var3;
        ArrayList arrayList;
        int i12;
        x5 x5Var2 = this;
        while (!x5Var2.f17394e.isEmpty() && ((b5) x5Var2.f17394e.peek()).f6338b == j10) {
            b5 b5Var = (b5) x5Var2.f17394e.pop();
            if (b5Var.f7184a == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                int i13 = x5Var2.f17411v;
                z zVar = new z();
                c5 c5VarD = b5Var.d(1969517665);
                int i14 = 1835365473;
                if (c5VarD != null) {
                    int i15 = m5.f11930b;
                    jm2 jm2Var = c5VarD.f6776b;
                    jm2Var.f(8);
                    ld0 ld0Var4 = null;
                    ld0 ld0Var5 = null;
                    for (int i16 = 8; jm2Var.i() >= i16; i16 = 8) {
                        int iK = jm2Var.k();
                        int iM = jm2Var.m();
                        int iM2 = jm2Var.m();
                        if (iM2 == i14) {
                            jm2Var.f(iK);
                            int i17 = iK + iM;
                            jm2Var.g(i16);
                            m5.c(jm2Var);
                            while (true) {
                                if (jm2Var.k() >= i17) {
                                    break;
                                }
                                int iK2 = jm2Var.k();
                                int iM3 = jm2Var.m();
                                if (jm2Var.m() == 1768715124) {
                                    jm2Var.f(iK2);
                                    int i18 = iK2 + iM3;
                                    jm2Var.g(i16);
                                    ArrayList arrayList3 = new ArrayList();
                                    while (jm2Var.k() < i18) {
                                        kc0 kc0VarA = t5.a(jm2Var);
                                        if (kc0VarA != null) {
                                            arrayList3.add(kc0VarA);
                                        }
                                    }
                                    if (arrayList3.isEmpty()) {
                                        break;
                                    } else {
                                        ld0Var4 = new ld0(arrayList3);
                                    }
                                } else {
                                    jm2Var.f(iK2 + iM3);
                                }
                            }
                            ld0Var4 = null;
                        } else if (iM2 == 1936553057) {
                            jm2Var.f(iK);
                            int i19 = iK + iM;
                            jm2Var.g(12);
                            while (true) {
                                if (jm2Var.k() >= i19) {
                                    break;
                                }
                                int iK3 = jm2Var.k();
                                int iM4 = jm2Var.m();
                                if (jm2Var.m() != 1935766900) {
                                    jm2Var.f(iK3 + iM4);
                                } else {
                                    if (iM4 < 14) {
                                        break;
                                    }
                                    jm2Var.g(5);
                                    int iS = jm2Var.s();
                                    float f5 = 120.0f;
                                    if (iS != 12) {
                                        if (iS != 13) {
                                            break;
                                        }
                                    } else if (iS == 12) {
                                        f5 = 240.0f;
                                    }
                                    jm2Var.g(1);
                                    ld0Var5 = new ld0(-9223372036854775807L, new c4(f5, jm2Var.s()));
                                }
                            }
                            ld0Var5 = null;
                        }
                        jm2Var.f(iK + iM);
                        i14 = 1835365473;
                    }
                    Pair pairCreate = Pair.create(ld0Var4, ld0Var5);
                    ld0 ld0Var6 = (ld0) pairCreate.first;
                    ld0Var = (ld0) pairCreate.second;
                    if (ld0Var6 != null) {
                        zVar.b(ld0Var6);
                    }
                    ld0Var2 = ld0Var6;
                    i10 = 1835365473;
                } else {
                    i10 = 1835365473;
                    ld0Var = null;
                    ld0Var2 = null;
                }
                b5 b5VarC = b5Var.c(i10);
                ld0 ld0VarA = b5VarC != null ? m5.a(b5VarC) : null;
                List listB = m5.b(b5Var, zVar, -9223372036854775807L, null, false, i13 == 1, new w23() { // from class: com.google.android.gms.internal.ads.v5
                    @Override // com.google.android.gms.internal.ads.w23
                    public final Object a(Object obj) {
                        b6 b6Var = (b6) obj;
                        r rVar = x5.f17389x;
                        return b6Var;
                    }
                });
                int size = listB.size();
                long j12 = -9223372036854775807L;
                int i20 = 0;
                int size2 = -1;
                while (true) {
                    j11 = 0;
                    if (i20 >= size) {
                        break;
                    }
                    e6 e6Var = (e6) listB.get(i20);
                    if (e6Var.f7644b == 0) {
                        arrayList = arrayList2;
                        ld0Var3 = ld0Var;
                        list = listB;
                        i11 = size;
                    } else {
                        b6 b6Var = e6Var.f7643a;
                        long j13 = j12;
                        long j14 = b6Var.f6350e;
                        if (j14 == -9223372036854775807L) {
                            j14 = e6Var.f7650h;
                        }
                        List list2 = listB;
                        i11 = size;
                        long jMax = Math.max(j13, j14);
                        w5 w5Var = new w5(b6Var, e6Var, x5Var2.f17406q.S(i20, b6Var.f6347b));
                        int i21 = "audio/true-hd".equals(b6Var.f6351f.f10898l) ? e6Var.f7647e * 16 : e6Var.f7647e + 30;
                        i7 i7VarB = b6Var.f6351f.b();
                        i7VarB.l(i21);
                        list = list2;
                        if (b6Var.f6347b == 2 && j14 > 0 && (i12 = e6Var.f7644b) > 1) {
                            i7VarB.e(i12 / (j14 / 1000000.0f));
                        }
                        int i22 = b6Var.f6347b;
                        int i23 = t5.f15693b;
                        if (i22 == 1 && zVar.a()) {
                            i7VarB.c(zVar.f18339a);
                            i7VarB.d(zVar.f18340b);
                        }
                        int i24 = b6Var.f6347b;
                        ld0[] ld0VarArr = new ld0[2];
                        ld0VarArr[0] = ld0Var;
                        ld0VarArr[1] = x5Var2.f17396g.isEmpty() ? null : new ld0(x5Var2.f17396g);
                        ld0Var3 = ld0Var;
                        ArrayList arrayList4 = arrayList2;
                        ld0 ld0Var7 = new ld0(-9223372036854775807L, new kc0[0]);
                        if (i24 == 1) {
                            if (ld0Var2 != null) {
                                ld0Var7 = ld0Var2;
                            }
                        } else if (i24 == 2 && ld0VarA != null) {
                            for (int i25 = 0; i25 < ld0VarA.a(); i25++) {
                                kc0 kc0VarB = ld0VarA.b(i25);
                                if (kc0VarB instanceof w3) {
                                    w3 w3Var = (w3) kc0VarB;
                                    if ("com.android.capture.fps".equals(w3Var.f16941m)) {
                                        ld0Var7 = new ld0(-9223372036854775807L, w3Var);
                                        break;
                                    }
                                }
                            }
                        }
                        for (int i26 = 0; i26 < 2; i26++) {
                            ld0Var7 = ld0Var7.d(ld0VarArr[i26]);
                        }
                        if (ld0Var7.a() > 0) {
                            i7VarB.m(ld0Var7);
                        }
                        w5Var.f16982c.b(i7VarB.y());
                        if (b6Var.f6347b == 2 && size2 == -1) {
                            size2 = arrayList4.size();
                        }
                        arrayList = arrayList4;
                        arrayList.add(w5Var);
                        j12 = jMax;
                    }
                    i20++;
                    x5Var2 = this;
                    arrayList2 = arrayList;
                    size = i11;
                    listB = list;
                    ld0Var = ld0Var3;
                }
                long j15 = j12;
                x5Var = x5Var2;
                x5Var.f17409t = size2;
                x5Var.f17410u = j15;
                w5[] w5VarArr = (w5[]) arrayList2.toArray(new w5[0]);
                x5Var.f17407r = w5VarArr;
                int length = w5VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i27 = 0; i27 < w5VarArr.length; i27++) {
                    jArr[i27] = new long[w5VarArr[i27].f16981b.f7644b];
                    jArr2[i27] = w5VarArr[i27].f16981b.f7648f[0];
                }
                int i28 = 0;
                while (i28 < w5VarArr.length) {
                    long j16 = Long.MAX_VALUE;
                    int i29 = -1;
                    for (int i30 = 0; i30 < w5VarArr.length; i30++) {
                        if (!zArr[i30]) {
                            long j17 = jArr2[i30];
                            if (j17 <= j16) {
                                i29 = i30;
                                j16 = j17;
                            }
                        }
                    }
                    int i31 = iArr[i29];
                    long[] jArr3 = jArr[i29];
                    jArr3[i31] = j11;
                    e6 e6Var2 = w5VarArr[i29].f16981b;
                    j11 += e6Var2.f7646d[i31];
                    int i32 = i31 + 1;
                    iArr[i29] = i32;
                    if (i32 < jArr3.length) {
                        jArr2[i29] = e6Var2.f7648f[i32];
                    } else {
                        zArr[i29] = true;
                        i28++;
                    }
                }
                x5Var.f17408s = jArr;
                x5Var.f17406q.Q();
                x5Var.f17406q.R(x5Var);
                x5Var.f17394e.clear();
                x5Var.f17397h = 2;
            } else {
                x5Var = x5Var2;
                if (!x5Var.f17394e.isEmpty()) {
                    ((b5) x5Var.f17394e.peek()).e(b5Var);
                }
            }
            x5Var2 = x5Var;
        }
        if (x5Var2.f17397h != 2) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        return a6.b(lVar, false);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f17410u;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f17406q = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r33, com.google.android.gms.internal.ads.l0 r34) throws com.google.android.gms.internal.ads.oh0 {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x5.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.f17394e.clear();
        this.f17400k = 0;
        this.f17402m = -1;
        this.f17403n = 0;
        this.f17404o = 0;
        this.f17405p = 0;
        if (j10 == 0) {
            m();
            return;
        }
        for (w5 w5Var : this.f17407r) {
            e6 e6Var = w5Var.f16981b;
            int iA = e6Var.a(j11);
            if (iA == -1) {
                iA = e6Var.b(j11);
            }
            w5Var.f16984e = iA;
            t0 t0Var = w5Var.f16983d;
            if (t0Var != null) {
                t0Var.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        long j11;
        long j12;
        int iB;
        w5[] w5VarArr = this.f17407r;
        if (w5VarArr.length == 0) {
            p0 p0Var = p0.f13489c;
            return new m0(p0Var, p0Var);
        }
        int i10 = this.f17409t;
        long jL = -1;
        if (i10 != -1) {
            e6 e6Var = w5VarArr[i10].f16981b;
            int iK = k(e6Var, j10);
            if (iK == -1) {
                p0 p0Var2 = p0.f13489c;
                return new m0(p0Var2, p0Var2);
            }
            long j13 = e6Var.f7648f[iK];
            j11 = e6Var.f7645c[iK];
            if (j13 >= j10 || iK >= e6Var.f7644b - 1 || (iB = e6Var.b(j10)) == -1 || iB == iK) {
                j12 = -9223372036854775807L;
            } else {
                j12 = e6Var.f7648f[iB];
                jL = e6Var.f7645c[iB];
            }
            j10 = j13;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            w5[] w5VarArr2 = this.f17407r;
            if (i11 >= w5VarArr2.length) {
                break;
            }
            if (i11 != this.f17409t) {
                e6 e6Var2 = w5VarArr2[i11].f16981b;
                long jL2 = l(e6Var2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    jL = l(e6Var2, j12, jL);
                }
                j11 = jL2;
            }
            i11++;
        }
        p0 p0Var3 = new p0(j10, j11);
        return j12 == -9223372036854775807L ? new m0(p0Var3, p0Var3) : new m0(p0Var3, new p0(j12, jL));
    }
}
