package com.google.android.gms.internal.measurement;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class ba implements ja {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f18845p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    private static final Unsafe f18846q = za.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f18847a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f18848b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18849c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18850d;

    /* renamed from: e, reason: collision with root package name */
    private final y9 f18851e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f18852f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18853g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f18854h;

    /* renamed from: i, reason: collision with root package name */
    private final int f18855i;

    /* renamed from: j, reason: collision with root package name */
    private final int f18856j;

    /* renamed from: k, reason: collision with root package name */
    private final m9 f18857k;

    /* renamed from: l, reason: collision with root package name */
    private final pa f18858l;

    /* renamed from: m, reason: collision with root package name */
    private final k8 f18859m;

    /* renamed from: n, reason: collision with root package name */
    private final da f18860n;

    /* renamed from: o, reason: collision with root package name */
    private final t9 f18861o;

    private ba(int[] iArr, Object[] objArr, int i10, int i11, y9 y9Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, da daVar, m9 m9Var, pa paVar, k8 k8Var, t9 t9Var, byte[] bArr) {
        this.f18847a = iArr;
        this.f18848b = objArr;
        this.f18849c = i10;
        this.f18850d = i11;
        this.f18853g = z10;
        boolean z12 = false;
        if (k8Var != null && k8Var.c(y9Var)) {
            z12 = true;
        }
        this.f18852f = z12;
        this.f18854h = iArr2;
        this.f18855i = i12;
        this.f18856j = i13;
        this.f18860n = daVar;
        this.f18857k = m9Var;
        this.f18858l = paVar;
        this.f18859m = k8Var;
        this.f18851e = y9Var;
        this.f18861o = t9Var;
    }

    private final boolean A(Object obj, int i10, int i11) {
        return za.h(obj, (long) (S(i11) & 1048575)) == i10;
    }

    private static boolean B(Object obj, long j10) {
        return ((Boolean) za.k(obj, j10)).booleanValue();
    }

    private static final void C(int i10, Object obj, gb gbVar) {
        if (obj instanceof String) {
            gbVar.D(i10, (String) obj);
        } else {
            gbVar.L(i10, (x7) obj);
        }
    }

    static qa E(Object obj) {
        u8 u8Var = (u8) obj;
        qa qaVar = u8Var.zzc;
        if (qaVar != qa.c()) {
            return qaVar;
        }
        qa qaVarE = qa.e();
        u8Var.zzc = qaVarE;
        return qaVarE;
    }

    static ba F(Class cls, v9 v9Var, da daVar, m9 m9Var, pa paVar, k8 k8Var, t9 t9Var) {
        if (v9Var instanceof ia) {
            return G((ia) v9Var, daVar, m9Var, paVar, k8Var, t9Var);
        }
        a5.a.a(v9Var);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.measurement.ba G(com.google.android.gms.internal.measurement.ia r34, com.google.android.gms.internal.measurement.da r35, com.google.android.gms.internal.measurement.m9 r36, com.google.android.gms.internal.measurement.pa r37, com.google.android.gms.internal.measurement.k8 r38, com.google.android.gms.internal.measurement.t9 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.G(com.google.android.gms.internal.measurement.ia, com.google.android.gms.internal.measurement.da, com.google.android.gms.internal.measurement.m9, com.google.android.gms.internal.measurement.pa, com.google.android.gms.internal.measurement.k8, com.google.android.gms.internal.measurement.t9):com.google.android.gms.internal.measurement.ba");
    }

    private static double H(Object obj, long j10) {
        return ((Double) za.k(obj, j10)).doubleValue();
    }

    private static float I(Object obj, long j10) {
        return ((Float) za.k(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x020c, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0219, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0226, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0233, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0240, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024d, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024f, code lost:
    
        r4 = com.google.android.gms.internal.measurement.f8.C(r11) + com.google.android.gms.internal.measurement.f8.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (A(r17, r11, r5) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (A(r17, r11, r5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (A(r17, r11, r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
    
        if (A(r17, r11, r5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        if (A(r17, r11, r5) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
    
        if (A(r17, r11, r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        r3 = L(r17, r3);
        r4 = com.google.android.gms.internal.measurement.f8.a(r11 << 3);
        r3 = com.google.android.gms.internal.measurement.f8.z(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        if (A(r17, r11, r5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
    
        r3 = com.google.android.gms.internal.measurement.f8.a(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:
    
        if (A(r17, r11, r5) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
    
        r3 = com.google.android.gms.internal.measurement.f8.a(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ba, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e4, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f2, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ff, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int J(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.J(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.x7) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0311, code lost:
    
        r5 = com.google.android.gms.internal.measurement.f8.a(r6 << 3);
        r4 = com.google.android.gms.internal.measurement.f8.B((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.x7) != false) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int K(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.K(java.lang.Object):int");
    }

    private static int L(Object obj, long j10) {
        return ((Integer) za.k(obj, j10)).intValue();
    }

    private final int M(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, k7 k7Var) {
        Unsafe unsafe = f18846q;
        Object objO = o(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((s9) object).f()) {
            s9 s9VarB = s9.a().b();
            t9.b(s9VarB, object);
            unsafe.putObject(obj, j10, s9VarB);
        }
        a5.a.a(objO);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, k7 k7Var) throws d9 {
        int iM;
        long jB;
        int iA;
        Object objValueOf;
        int iJ;
        Object objG;
        Unsafe unsafe = f18846q;
        long j11 = this.f18847a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(l7.n(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(l7.b(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    iM = l7.m(bArr, i10, k7Var);
                    jB = k7Var.f19049b;
                    objValueOf = Long.valueOf(jB);
                    unsafe.putObject(obj, j10, objValueOf);
                    unsafe.putInt(obj, j11, i13);
                    return iM;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    iM = l7.j(bArr, i10, k7Var);
                    iA = k7Var.f19048a;
                    objValueOf = Integer.valueOf(iA);
                    unsafe.putObject(obj, j10, objValueOf);
                    unsafe.putInt(obj, j11, i13);
                    return iM;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(l7.n(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(l7.b(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    iM = l7.m(bArr, i10, k7Var);
                    objValueOf = Boolean.valueOf(k7Var.f19049b != 0);
                    unsafe.putObject(obj, j10, objValueOf);
                    unsafe.putInt(obj, j11, i13);
                    return iM;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    iJ = l7.j(bArr, i10, k7Var);
                    int i18 = k7Var.f19048a;
                    if (i18 == 0) {
                        objG = "";
                        unsafe.putObject(obj, j10, objG);
                        unsafe.putInt(obj, j11, i13);
                        return iJ;
                    }
                    if ((i15 & 536870912) != 0 && !fb.f(bArr, iJ, iJ + i18)) {
                        throw d9.c();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iJ, i18, b9.f18840b));
                    iJ += i18;
                    unsafe.putInt(obj, j11, i13);
                    return iJ;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    iJ = l7.d(n(i17), bArr, i10, i11, k7Var);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    objG = k7Var.f19050c;
                    if (object != null) {
                        objG = b9.g(object, objG);
                    }
                    unsafe.putObject(obj, j10, objG);
                    unsafe.putInt(obj, j11, i13);
                    return iJ;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    iM = l7.a(bArr, i10, k7Var);
                    objValueOf = k7Var.f19050c;
                    unsafe.putObject(obj, j10, objValueOf);
                    unsafe.putInt(obj, j11, i13);
                    return iM;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int iJ2 = l7.j(bArr, i10, k7Var);
                    int i19 = k7Var.f19048a;
                    x8 x8VarM = m(i17);
                    if (x8VarM == null || x8VarM.a(i19)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i19));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        E(obj).h(i12, Long.valueOf(i19));
                    }
                    return iJ2;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    iM = l7.j(bArr, i10, k7Var);
                    iA = b8.a(k7Var.f19048a);
                    objValueOf = Integer.valueOf(iA);
                    unsafe.putObject(obj, j10, objValueOf);
                    unsafe.putInt(obj, j11, i13);
                    return iM;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    iM = l7.m(bArr, i10, k7Var);
                    jB = b8.b(k7Var.f19049b);
                    objValueOf = Long.valueOf(jB);
                    unsafe.putObject(obj, j10, objValueOf);
                    unsafe.putInt(obj, j11, i13);
                    return iM;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    iJ = l7.c(n(i17), bArr, i10, i11, (i12 & (-8)) | 4, k7Var);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    objG = k7Var.f19050c;
                    if (object2 != null) {
                        objG = b9.g(object2, objG);
                    }
                    unsafe.putObject(obj, j10, objG);
                    unsafe.putInt(obj, j11, i13);
                    return iJ;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c1, code lost:
    
        if (r0 != r5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c3, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r10 = r19;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d9, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x030a, code lost:
    
        if (r0 != r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x032b, code lost:
    
        if (r0 != r15) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x008d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int O(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.k7 r36) throws com.google.android.gms.internal.measurement.d9 {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.O(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.k7):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0132, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.x7.t(r16, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0122, code lost:
    
        if (r4 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0124, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.x7.f19398n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012a, code lost:
    
        r12.add(com.google.android.gms.internal.measurement.x7.t(r16, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0132, code lost:
    
        if (r1 >= r18) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0134, code lost:
    
        r4 = com.google.android.gms.internal.measurement.l7.j(r16, r1, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
    
        if (r19 == r28.f19048a) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
    
        r1 = com.google.android.gms.internal.measurement.l7.j(r16, r4, r28);
        r4 = r28.f19048a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0143, code lost:
    
        if (r4 < 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
    
        if (r4 > (r16.length - r1)) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        if (r4 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0150, code lost:
    
        throw com.google.android.gms.internal.measurement.d9.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0155, code lost:
    
        throw com.google.android.gms.internal.measurement.d9.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01b6 -> B:95:0x0195). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x01fe -> B:113:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0149 -> B:64:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int P(java.lang.Object r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23, int r25, long r26, com.google.android.gms.internal.measurement.k7 r28) throws com.google.android.gms.internal.measurement.d9 {
        /*
            Method dump skipped, instructions count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.P(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.k7):int");
    }

    private final int Q(int i10) {
        if (i10 < this.f18849c || i10 > this.f18850d) {
            return -1;
        }
        return T(i10, 0);
    }

    private final int R(int i10, int i11) {
        if (i10 < this.f18849c || i10 > this.f18850d) {
            return -1;
        }
        return T(i10, i11);
    }

    private final int S(int i10) {
        return this.f18847a[i10 + 2];
    }

    private final int T(int i10, int i11) {
        int length = (this.f18847a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f18847a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int j(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int k(int i10) {
        return this.f18847a[i10 + 1];
    }

    private static long l(Object obj, long j10) {
        return ((Long) za.k(obj, j10)).longValue();
    }

    private final x8 m(int i10) {
        int i11 = i10 / 3;
        return (x8) this.f18848b[i11 + i11 + 1];
    }

    private final ja n(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        ja jaVar = (ja) this.f18848b[i12];
        if (jaVar != null) {
            return jaVar;
        }
        ja jaVarB = ga.a().b((Class) this.f18848b[i12 + 1]);
        this.f18848b[i12] = jaVarB;
        return jaVarB;
    }

    private final Object o(int i10) {
        int i11 = i10 / 3;
        return this.f18848b[i11 + i11];
    }

    private static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void q(Object obj, Object obj2, int i10) {
        long jK = k(i10) & 1048575;
        if (x(obj2, i10)) {
            Object objK = za.k(obj, jK);
            Object objK2 = za.k(obj2, jK);
            if (objK != null && objK2 != null) {
                objK2 = b9.g(objK, objK2);
            } else if (objK2 == null) {
                return;
            }
            za.x(obj, jK, objK2);
            s(obj, i10);
        }
    }

    private final void r(Object obj, Object obj2, int i10) {
        int iK = k(i10);
        int i11 = this.f18847a[i10];
        long j10 = iK & 1048575;
        if (A(obj2, i11, i10)) {
            Object objK = A(obj, i11, i10) ? za.k(obj, j10) : null;
            Object objK2 = za.k(obj2, j10);
            if (objK != null && objK2 != null) {
                objK2 = b9.g(objK, objK2);
            } else if (objK2 == null) {
                return;
            }
            za.x(obj, j10, objK2);
            t(obj, i11, i10);
        }
    }

    private final void s(Object obj, int i10) {
        int iS = S(i10);
        long j10 = 1048575 & iS;
        if (j10 == 1048575) {
            return;
        }
        za.v(obj, j10, (1 << (iS >>> 20)) | za.h(obj, j10));
    }

    private final void t(Object obj, int i10, int i11) {
        za.v(obj, S(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void u(Object obj, gb gbVar) {
        int i10;
        boolean z10;
        if (this.f18852f) {
            this.f18859m.a(obj);
            throw null;
        }
        int length = this.f18847a.length;
        Unsafe unsafe = f18846q;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iK = k(i13);
            int[] iArr = this.f18847a;
            int i15 = iArr[i13];
            int iJ = j(iK);
            if (iJ <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iK & i11;
            switch (iJ) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.c(i15, za.f(obj, j10));
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.f(i15, za.g(obj, j10));
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.j(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.G(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.a(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.b(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.h(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.i(i15, za.B(obj, j10));
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        C(i15, unsafe.getObject(obj, j10), gbVar);
                        break;
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.I(i15, unsafe.getObject(obj, j10), n(i13));
                        break;
                    }
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.L(i15, (x7) unsafe.getObject(obj, j10));
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.w(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.t(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.y(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.E(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.C(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.K(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        gbVar.A(i15, unsafe.getObject(obj, j10), n(i13));
                        break;
                    }
                case 18:
                    la.j(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 19:
                    la.n(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                    la.q(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 21:
                    la.y(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 22:
                    la.p(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 23:
                    la.m(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 24:
                    la.l(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 25:
                    la.h(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 26:
                    la.w(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar);
                    break;
                case 27:
                    la.r(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, n(i13));
                    break;
                case 28:
                    la.i(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar);
                    break;
                case 29:
                    z10 = false;
                    la.x(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 30:
                    z10 = false;
                    la.k(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 31:
                    z10 = false;
                    la.s(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 32:
                    z10 = false;
                    la.t(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 33:
                    z10 = false;
                    la.u(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 34:
                    z10 = false;
                    la.v(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, false);
                    break;
                case 35:
                    la.j(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 36:
                    la.n(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 37:
                    la.q(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 38:
                    la.y(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 39:
                    la.p(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 40:
                    la.m(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 41:
                    la.l(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 42:
                    la.h(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 43:
                    la.x(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 44:
                    la.k(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 45:
                    la.s(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 46:
                    la.t(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 47:
                    la.u(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 48:
                    la.v(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, true);
                    break;
                case 49:
                    la.o(this.f18847a[i13], (List) unsafe.getObject(obj, j10), gbVar, n(i13));
                    break;
                case 50:
                    v(gbVar, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (A(obj, i15, i13)) {
                        gbVar.c(i15, H(obj, j10));
                    }
                    break;
                case 52:
                    if (A(obj, i15, i13)) {
                        gbVar.f(i15, I(obj, j10));
                    }
                    break;
                case 53:
                    if (A(obj, i15, i13)) {
                        gbVar.j(i15, l(obj, j10));
                    }
                    break;
                case 54:
                    if (A(obj, i15, i13)) {
                        gbVar.G(i15, l(obj, j10));
                    }
                    break;
                case 55:
                    if (A(obj, i15, i13)) {
                        gbVar.a(i15, L(obj, j10));
                    }
                    break;
                case 56:
                    if (A(obj, i15, i13)) {
                        gbVar.b(i15, l(obj, j10));
                    }
                    break;
                case 57:
                    if (A(obj, i15, i13)) {
                        gbVar.h(i15, L(obj, j10));
                    }
                    break;
                case 58:
                    if (A(obj, i15, i13)) {
                        gbVar.i(i15, B(obj, j10));
                    }
                    break;
                case 59:
                    if (A(obj, i15, i13)) {
                        C(i15, unsafe.getObject(obj, j10), gbVar);
                    }
                    break;
                case 60:
                    if (A(obj, i15, i13)) {
                        gbVar.I(i15, unsafe.getObject(obj, j10), n(i13));
                    }
                    break;
                case 61:
                    if (A(obj, i15, i13)) {
                        gbVar.L(i15, (x7) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (A(obj, i15, i13)) {
                        gbVar.w(i15, L(obj, j10));
                    }
                    break;
                case 63:
                    if (A(obj, i15, i13)) {
                        gbVar.t(i15, L(obj, j10));
                    }
                    break;
                case 64:
                    if (A(obj, i15, i13)) {
                        gbVar.y(i15, L(obj, j10));
                    }
                    break;
                case 65:
                    if (A(obj, i15, i13)) {
                        gbVar.E(i15, l(obj, j10));
                    }
                    break;
                case 66:
                    if (A(obj, i15, i13)) {
                        gbVar.C(i15, L(obj, j10));
                    }
                    break;
                case 67:
                    if (A(obj, i15, i13)) {
                        gbVar.K(i15, l(obj, j10));
                    }
                    break;
                case 68:
                    if (A(obj, i15, i13)) {
                        gbVar.A(i15, unsafe.getObject(obj, j10), n(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        pa paVar = this.f18858l;
        paVar.i(paVar.c(obj), gbVar);
    }

    private final void v(gb gbVar, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        a5.a.a(o(i11));
        throw null;
    }

    private final boolean w(Object obj, Object obj2, int i10) {
        return x(obj, i10) == x(obj2, i10);
    }

    private final boolean x(Object obj, int i10) {
        int iS = S(i10);
        long j10 = iS & 1048575;
        if (j10 != 1048575) {
            return (za.h(obj, j10) & (1 << (iS >>> 20))) != 0;
        }
        int iK = k(i10);
        long j11 = iK & 1048575;
        switch (j(iK)) {
            case 0:
                return Double.doubleToRawLongBits(za.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(za.g(obj, j11)) != 0;
            case 2:
                return za.i(obj, j11) != 0;
            case 3:
                return za.i(obj, j11) != 0;
            case 4:
                return za.h(obj, j11) != 0;
            case 5:
                return za.i(obj, j11) != 0;
            case 6:
                return za.h(obj, j11) != 0;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return za.B(obj, j11);
            case 8:
                Object objK = za.k(obj, j11);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof x7) {
                    return !x7.f19398n.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return za.k(obj, j11) != null;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return !x7.f19398n.equals(za.k(obj, j11));
            case 11:
                return za.h(obj, j11) != 0;
            case 12:
                return za.h(obj, j11) != 0;
            case 13:
                return za.h(obj, j11) != 0;
            case 14:
                return za.i(obj, j11) != 0;
            case 15:
                return za.h(obj, j11) != 0;
            case 16:
                return za.i(obj, j11) != 0;
            case 17:
                return za.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean y(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? x(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean z(Object obj, int i10, ja jaVar) {
        return jaVar.g(za.k(obj, i10 & 1048575));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008c. Please report as an issue. */
    final int D(Object obj, byte[] bArr, int i10, int i11, int i12, k7 k7Var) throws d9 {
        Unsafe unsafe;
        int i13;
        ba baVar;
        Object obj2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        k7 k7Var2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        long j10;
        Object objG;
        long j11;
        int iA;
        int i28;
        int i29;
        ba baVar2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i30 = i11;
        int i31 = i12;
        k7 k7Var3 = k7Var;
        Unsafe unsafe2 = f18846q;
        int i32 = i10;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                byte b10 = bArr2[i32];
                if (b10 < 0) {
                    int iK = l7.k(b10, bArr2, i38, k7Var3);
                    i14 = k7Var3.f19048a;
                    i38 = iK;
                } else {
                    i14 = b10;
                }
                int i39 = i14 >>> 3;
                int i40 = i14 & 7;
                int iR = i39 > i36 ? baVar2.R(i39, i34 / 3) : baVar2.Q(i39);
                if (iR == -1) {
                    i15 = i39;
                    i16 = i38;
                    i17 = i14;
                    i18 = i35;
                    unsafe = unsafe2;
                    i13 = i31;
                    i19 = 0;
                } else {
                    int[] iArr = baVar2.f18847a;
                    int i41 = iArr[iR + 1];
                    int iJ = j(i41);
                    int i42 = i38;
                    long j12 = i41 & 1048575;
                    if (iJ <= 17) {
                        int i43 = iArr[iR + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        int i46 = i14;
                        if (i45 != i37) {
                            if (i37 != 1048575) {
                                unsafe2.putInt(obj3, i37, i35);
                            }
                            i35 = unsafe2.getInt(obj3, i45);
                            i21 = i45;
                        } else {
                            i21 = i37;
                        }
                        int i47 = i35;
                        switch (iJ) {
                            case 0:
                                i22 = iR;
                                i15 = i39;
                                i23 = i42;
                                if (i40 != 1) {
                                    i42 = i23;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    za.t(obj3, j12, Double.longBitsToDouble(l7.n(bArr2, i23)));
                                    i32 = i23 + 8;
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i46;
                                    i37 = i21;
                                    i30 = i11;
                                }
                            case 1:
                                i22 = iR;
                                i15 = i39;
                                i23 = i42;
                                if (i40 != 5) {
                                    i42 = i23;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    za.u(obj3, j12, Float.intBitsToFloat(l7.b(bArr2, i23)));
                                    i32 = i23 + 4;
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i46;
                                    i37 = i21;
                                    i30 = i11;
                                }
                            case 2:
                            case 3:
                                i22 = iR;
                                i15 = i39;
                                i23 = i42;
                                if (i40 != 0) {
                                    i42 = i23;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    int iM = l7.m(bArr2, i23, k7Var3);
                                    unsafe2.putLong(obj, j12, k7Var3.f19049b);
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i31 = i12;
                                    i32 = iM;
                                    i34 = i22;
                                    i33 = i46;
                                    i37 = i21;
                                    i30 = i11;
                                }
                            case 4:
                            case 11:
                                i22 = iR;
                                i15 = i39;
                                i23 = i42;
                                if (i40 != 0) {
                                    i42 = i23;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = l7.j(bArr2, i23, k7Var3);
                                    unsafe2.putInt(obj3, j12, k7Var3.f19048a);
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i46;
                                    i37 = i21;
                                    i30 = i11;
                                }
                            case 5:
                            case 14:
                                i15 = i39;
                                if (i40 != 1) {
                                    i22 = iR;
                                    i46 = i46;
                                    i42 = i42;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i22 = iR;
                                    i46 = i46;
                                    i23 = i42;
                                    unsafe2.putLong(obj, j12, l7.n(bArr2, i42));
                                    i32 = i23 + 8;
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i46;
                                    i37 = i21;
                                    i30 = i11;
                                }
                            case 6:
                            case 13:
                                i24 = i46;
                                i15 = i39;
                                i25 = i42;
                                if (i40 != 5) {
                                    i22 = iR;
                                    i42 = i25;
                                    i46 = i24;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j12, l7.b(bArr2, i25));
                                    i32 = i25 + 4;
                                    i35 = i47 | i44;
                                    i34 = iR;
                                    i33 = i24;
                                    i37 = i21;
                                    i36 = i15;
                                    i31 = i12;
                                }
                            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                                i24 = i46;
                                i15 = i39;
                                i25 = i42;
                                if (i40 != 0) {
                                    i22 = iR;
                                    i42 = i25;
                                    i46 = i24;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = l7.m(bArr2, i25, k7Var3);
                                    za.r(obj3, j12, k7Var3.f19049b != 0);
                                    i35 = i47 | i44;
                                    i34 = iR;
                                    i33 = i24;
                                    i37 = i21;
                                    i36 = i15;
                                    i31 = i12;
                                }
                            case 8:
                                i24 = i46;
                                i15 = i39;
                                i25 = i42;
                                if (i40 != 2) {
                                    i22 = iR;
                                    i42 = i25;
                                    i46 = i24;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = (536870912 & i41) == 0 ? l7.g(bArr2, i25, k7Var3) : l7.h(bArr2, i25, k7Var3);
                                    unsafe2.putObject(obj3, j12, k7Var3.f19050c);
                                    i35 = i47 | i44;
                                    i34 = iR;
                                    i33 = i24;
                                    i37 = i21;
                                    i36 = i15;
                                    i31 = i12;
                                }
                            case 9:
                                i26 = iR;
                                i24 = i46;
                                i15 = i39;
                                i27 = i42;
                                j10 = j12;
                                if (i40 != 2) {
                                    i42 = i27;
                                    i22 = i26;
                                    i46 = i24;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = l7.d(baVar2.n(i26), bArr2, i27, i30, k7Var3);
                                    objG = (i47 & i44) == 0 ? k7Var3.f19050c : b9.g(unsafe2.getObject(obj3, j10), k7Var3.f19050c);
                                    unsafe2.putObject(obj3, j10, objG);
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                }
                            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                                i26 = iR;
                                i24 = i46;
                                i15 = i39;
                                i27 = i42;
                                j10 = j12;
                                if (i40 != 2) {
                                    i42 = i27;
                                    i22 = i26;
                                    i46 = i24;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = l7.a(bArr2, i27, k7Var3);
                                    objG = k7Var3.f19050c;
                                    unsafe2.putObject(obj3, j10, objG);
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                }
                            case 12:
                                i26 = iR;
                                i24 = i46;
                                i15 = i39;
                                i27 = i42;
                                j11 = j12;
                                if (i40 != 0) {
                                    i42 = i27;
                                    i22 = i26;
                                    i46 = i24;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = l7.j(bArr2, i27, k7Var3);
                                    iA = k7Var3.f19048a;
                                    x8 x8VarM = baVar2.m(i26);
                                    if (x8VarM != null && !x8VarM.a(iA)) {
                                        E(obj).h(i24, Long.valueOf(iA));
                                        i36 = i15;
                                        i35 = i47;
                                        i34 = i26;
                                        i33 = i24;
                                        i37 = i21;
                                        i31 = i12;
                                    }
                                    unsafe2.putInt(obj3, j11, iA);
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                }
                                break;
                            case 15:
                                i26 = iR;
                                i24 = i46;
                                i15 = i39;
                                i27 = i42;
                                if (i40 != 0) {
                                    i42 = i27;
                                    i22 = i26;
                                    i46 = i24;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = l7.j(bArr2, i27, k7Var3);
                                    iA = b8.a(k7Var3.f19048a);
                                    j11 = j12;
                                    unsafe2.putInt(obj3, j11, iA);
                                    i35 = i47 | i44;
                                    i36 = i15;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                }
                            case 16:
                                if (i40 != 0) {
                                    i15 = i39;
                                    i22 = iR;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    int iM2 = l7.m(bArr2, i42, k7Var3);
                                    i26 = iR;
                                    i24 = i46;
                                    unsafe2.putLong(obj, j12, b8.b(k7Var3.f19049b));
                                    i35 = i47 | i44;
                                    i36 = i39;
                                    i32 = iM2;
                                    i34 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                }
                            default:
                                i22 = iR;
                                i15 = i39;
                                i23 = i42;
                                if (i40 != 3) {
                                    i42 = i23;
                                    i13 = i12;
                                    i18 = i47;
                                    unsafe = unsafe2;
                                    i17 = i46;
                                    i16 = i42;
                                    i37 = i21;
                                    i19 = i22;
                                    break;
                                } else {
                                    i32 = l7.c(baVar2.n(i22), bArr, i23, i11, (i15 << 3) | 4, k7Var);
                                    unsafe2.putObject(obj3, j12, (i47 & i44) == 0 ? k7Var3.f19050c : b9.g(unsafe2.getObject(obj3, j12), k7Var3.f19050c));
                                    i35 = i47 | i44;
                                    bArr2 = bArr;
                                    i36 = i15;
                                    i31 = i12;
                                    i34 = i22;
                                    i33 = i46;
                                    i37 = i21;
                                    i30 = i11;
                                }
                        }
                    } else {
                        int i48 = iR;
                        int i49 = i14;
                        if (iJ != 27) {
                            i18 = i35;
                            i28 = i37;
                            if (iJ <= 49) {
                                i15 = i39;
                                unsafe = unsafe2;
                                i19 = i48;
                                i32 = P(obj, bArr, i42, i11, i49, i15, i40, i48, i41, iJ, j12, k7Var);
                                if (i32 != i42) {
                                    baVar2 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i36 = i15;
                                    i30 = i11;
                                    i31 = i12;
                                    k7Var3 = k7Var;
                                    i33 = i49;
                                    i34 = i19;
                                    i35 = i18;
                                    i37 = i28;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i16 = i32;
                                    i17 = i49;
                                    i37 = i28;
                                }
                            } else {
                                i15 = i39;
                                unsafe = unsafe2;
                                i29 = i42;
                                i19 = i48;
                                if (iJ != 50) {
                                    i32 = N(obj, bArr, i29, i11, i49, i15, i40, i41, iJ, j12, i19, k7Var);
                                    if (i32 != i29) {
                                        baVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i36 = i15;
                                        i30 = i11;
                                        i31 = i12;
                                        k7Var3 = k7Var;
                                        i33 = i49;
                                        i34 = i19;
                                        i35 = i18;
                                        i37 = i28;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i16 = i32;
                                        i17 = i49;
                                        i37 = i28;
                                    }
                                } else if (i40 == 2) {
                                    i32 = M(obj, bArr, i29, i11, i19, j12, k7Var);
                                    if (i32 != i29) {
                                        baVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i36 = i15;
                                        i30 = i11;
                                        i31 = i12;
                                        k7Var3 = k7Var;
                                        i33 = i49;
                                        i34 = i19;
                                        i35 = i18;
                                        i37 = i28;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i16 = i32;
                                        i17 = i49;
                                        i37 = i28;
                                    }
                                }
                            }
                        } else if (i40 == 2) {
                            a9 a9VarJ = (a9) unsafe2.getObject(obj3, j12);
                            if (!a9VarJ.d()) {
                                int size = a9VarJ.size();
                                a9VarJ = a9VarJ.j(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j12, a9VarJ);
                            }
                            i33 = i49;
                            i21 = i37;
                            i32 = l7.e(baVar2.n(i48), i33, bArr, i42, i11, a9VarJ, k7Var);
                            bArr2 = bArr;
                            i31 = i12;
                            i36 = i39;
                            i34 = i48;
                            i35 = i35;
                            i37 = i21;
                            i30 = i11;
                        } else {
                            i18 = i35;
                            i28 = i37;
                            i15 = i39;
                            unsafe = unsafe2;
                            i29 = i42;
                            i19 = i48;
                        }
                        i13 = i12;
                        i16 = i29;
                        i17 = i49;
                        i37 = i28;
                    }
                }
                if (i17 != i13 || i13 == 0) {
                    if (this.f18852f) {
                        k7Var2 = k7Var;
                        if (k7Var2.f19051d != j8.a()) {
                            i20 = i15;
                            k7Var2.f19051d.c(this.f18851e, i20);
                            i32 = l7.i(i17, bArr, i16, i11, E(obj), k7Var);
                            obj3 = obj;
                            bArr2 = bArr;
                            i30 = i11;
                            i33 = i17;
                            baVar2 = this;
                            k7Var3 = k7Var2;
                            i36 = i20;
                            i34 = i19;
                            i35 = i18;
                            unsafe2 = unsafe;
                            i31 = i13;
                        } else {
                            i20 = i15;
                        }
                    } else {
                        i20 = i15;
                        k7Var2 = k7Var;
                    }
                    i32 = l7.i(i17, bArr, i16, i11, E(obj), k7Var);
                    obj3 = obj;
                    bArr2 = bArr;
                    i30 = i11;
                    i33 = i17;
                    baVar2 = this;
                    k7Var3 = k7Var2;
                    i36 = i20;
                    i34 = i19;
                    i35 = i18;
                    unsafe2 = unsafe;
                    i31 = i13;
                } else {
                    baVar = this;
                    i32 = i16;
                    i33 = i17;
                    i35 = i18;
                }
            } else {
                unsafe = unsafe2;
                i13 = i31;
                baVar = baVar2;
            }
        }
        if (i37 != 1048575) {
            long j13 = i37;
            obj2 = obj;
            unsafe.putInt(obj2, j13, i35);
        } else {
            obj2 = obj;
        }
        for (int i50 = baVar.f18855i; i50 < baVar.f18856j; i50++) {
            int i51 = baVar.f18854h[i50];
            int i52 = baVar.f18847a[i51];
            Object objK = za.k(obj2, baVar.k(i51) & 1048575);
            if (objK != null && baVar.m(i51) != null) {
                a5.a.a(baVar.o(i51));
                throw null;
            }
        }
        if (i13 == 0) {
            if (i32 != i11) {
                throw d9.e();
            }
        } else if (i32 > i11 || i33 != i13) {
            throw d9.e();
        }
        return i32;
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final int a(Object obj) {
        return this.f18853g ? K(obj) : J(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc A[PHI: r3
  0x00dc: PHI (r3v13 java.lang.Object) = (r3v10 java.lang.Object), (r3v14 java.lang.Object) binds: [B:66:0x00da, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final Object c() {
        return ((u8) this.f18851e).u(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final void d(Object obj) {
        int i10;
        int i11 = this.f18855i;
        while (true) {
            i10 = this.f18856j;
            if (i11 >= i10) {
                break;
            }
            long jK = k(this.f18854h[i11]) & 1048575;
            Object objK = za.k(obj, jK);
            if (objK != null) {
                ((s9) objK).c();
                za.x(obj, jK, objK);
            }
            i11++;
        }
        int length = this.f18854h.length;
        while (i10 < length) {
            this.f18857k.a(obj, this.f18854h[i10]);
            i10++;
        }
        this.f18858l.g(obj);
        if (this.f18852f) {
            this.f18859m.b(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.google.android.gms.internal.measurement.ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.e(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final boolean f(Object obj, Object obj2) {
        int length = this.f18847a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iK = k(i10);
            long j10 = iK & 1048575;
            switch (j(iK)) {
                case 0:
                    if (!w(obj, obj2, i10) || Double.doubleToLongBits(za.f(obj, j10)) != Double.doubleToLongBits(za.f(obj2, j10))) {
                        return false;
                    }
                    break;
                case 1:
                    if (!w(obj, obj2, i10) || Float.floatToIntBits(za.g(obj, j10)) != Float.floatToIntBits(za.g(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!w(obj, obj2, i10) || za.i(obj, j10) != za.i(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!w(obj, obj2, i10) || za.i(obj, j10) != za.i(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!w(obj, obj2, i10) || za.h(obj, j10) != za.h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!w(obj, obj2, i10) || za.i(obj, j10) != za.i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 6:
                    if (!w(obj, obj2, i10) || za.h(obj, j10) != za.h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    if (!w(obj, obj2, i10) || za.B(obj, j10) != za.B(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!w(obj, obj2, i10) || !la.z(za.k(obj, j10), za.k(obj2, j10))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!w(obj, obj2, i10) || !la.z(za.k(obj, j10), za.k(obj2, j10))) {
                        return false;
                    }
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    if (!w(obj, obj2, i10) || !la.z(za.k(obj, j10), za.k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!w(obj, obj2, i10) || za.h(obj, j10) != za.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 12:
                    if (!w(obj, obj2, i10) || za.h(obj, j10) != za.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 13:
                    if (!w(obj, obj2, i10) || za.h(obj, j10) != za.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 14:
                    if (!w(obj, obj2, i10) || za.i(obj, j10) != za.i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 15:
                    if (!w(obj, obj2, i10) || za.h(obj, j10) != za.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 16:
                    if (!w(obj, obj2, i10) || za.i(obj, j10) != za.i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 17:
                    if (!w(obj, obj2, i10) || !la.z(za.k(obj, j10), za.k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!la.z(za.k(obj, j10), za.k(obj2, j10))) {
                        return false;
                    }
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jS = S(i10) & 1048575;
                    if (za.h(obj, jS) != za.h(obj2, jS) || !la.z(za.k(obj, j10), za.k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f18858l.c(obj).equals(this.f18858l.c(obj2))) {
            return false;
        }
        if (!this.f18852f) {
            return true;
        }
        this.f18859m.a(obj);
        this.f18859m.a(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    @Override // com.google.android.gms.internal.measurement.ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.g(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0364  */
    @Override // com.google.android.gms.internal.measurement.ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r10, com.google.android.gms.internal.measurement.gb r11) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ba.h(java.lang.Object, com.google.android.gms.internal.measurement.gb):void");
    }

    @Override // com.google.android.gms.internal.measurement.ja
    public final void i(Object obj, byte[] bArr, int i10, int i11, k7 k7Var) throws d9 {
        if (this.f18853g) {
            O(obj, bArr, i10, i11, k7Var);
        } else {
            D(obj, bArr, i10, i11, 0, k7Var);
        }
    }
}
