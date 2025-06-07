package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class mz3 implements d04 {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f12323q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f12324r = t04.q();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f12325a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f12326b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12327c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12328d;

    /* renamed from: e, reason: collision with root package name */
    private final jz3 f12329e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12330f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12331g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12332h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f12333i;

    /* renamed from: j, reason: collision with root package name */
    private final int f12334j;

    /* renamed from: k, reason: collision with root package name */
    private final int f12335k;

    /* renamed from: l, reason: collision with root package name */
    private final yy3 f12336l;

    /* renamed from: m, reason: collision with root package name */
    private final i04 f12337m;

    /* renamed from: n, reason: collision with root package name */
    private final rx3 f12338n;

    /* renamed from: o, reason: collision with root package name */
    private final oz3 f12339o;

    /* renamed from: p, reason: collision with root package name */
    private final ez3 f12340p;

    private mz3(int[] iArr, Object[] objArr, int i10, int i11, jz3 jz3Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, oz3 oz3Var, yy3 yy3Var, i04 i04Var, rx3 rx3Var, ez3 ez3Var) {
        this.f12325a = iArr;
        this.f12326b = objArr;
        this.f12327c = i10;
        this.f12328d = i11;
        this.f12331g = jz3Var instanceof by3;
        this.f12332h = z10;
        boolean z12 = false;
        if (rx3Var != null && rx3Var.h(jz3Var)) {
            z12 = true;
        }
        this.f12330f = z12;
        this.f12333i = iArr2;
        this.f12334j = i12;
        this.f12335k = i13;
        this.f12339o = oz3Var;
        this.f12336l = yy3Var;
        this.f12337m = i04Var;
        this.f12338n = rx3Var;
        this.f12329e = jz3Var;
        this.f12340p = ez3Var;
    }

    private final boolean A(Object obj, Object obj2, int i10) {
        return C(obj, i10) == C(obj2, i10);
    }

    private static boolean B(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean C(Object obj, int i10) {
        int iW = W(i10);
        long j10 = iW & 1048575;
        if (j10 != 1048575) {
            return (t04.l(obj, j10) & (1 << (iW >>> 20))) != 0;
        }
        int iZ = Z(i10);
        long j11 = iZ & 1048575;
        switch (Y(iZ)) {
            case 0:
                return Double.doubleToRawLongBits(t04.j(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(t04.k(obj, j11)) != 0;
            case 2:
                return t04.n(obj, j11) != 0;
            case 3:
                return t04.n(obj, j11) != 0;
            case 4:
                return t04.l(obj, j11) != 0;
            case 5:
                return t04.n(obj, j11) != 0;
            case 6:
                return t04.l(obj, j11) != 0;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return t04.H(obj, j11);
            case 8:
                Object objP = t04.p(obj, j11);
                if (objP instanceof String) {
                    return !((String) objP).isEmpty();
                }
                if (objP instanceof ww3) {
                    return !ww3.f17284n.equals(objP);
                }
                throw new IllegalArgumentException();
            case 9:
                return t04.p(obj, j11) != null;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return !ww3.f17284n.equals(t04.p(obj, j11));
            case 11:
                return t04.l(obj, j11) != 0;
            case 12:
                return t04.l(obj, j11) != 0;
            case 13:
                return t04.l(obj, j11) != 0;
            case 14:
                return t04.n(obj, j11) != 0;
            case 15:
                return t04.l(obj, j11) != 0;
            case 16:
                return t04.n(obj, j11) != 0;
            case 17:
                return t04.p(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean D(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? C(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean E(Object obj, int i10, d04 d04Var) {
        return d04Var.g(t04.p(obj, i10 & 1048575));
    }

    private static boolean F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof by3) {
            return ((by3) obj).E();
        }
        return true;
    }

    private final boolean G(Object obj, int i10, int i11) {
        return t04.l(obj, (long) (W(i11) & 1048575)) == i10;
    }

    private static boolean H(Object obj, long j10) {
        return ((Boolean) t04.p(obj, j10)).booleanValue();
    }

    private final void I(nx3 nx3Var, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        a5.a.a(o(i11));
        throw null;
    }

    private static final void J(int i10, Object obj, nx3 nx3Var) {
        if (obj instanceof String) {
            nx3Var.f(i10, (String) obj);
        } else {
            nx3Var.o(i10, (ww3) obj);
        }
    }

    static j04 L(Object obj) {
        by3 by3Var = (by3) obj;
        j04 j04Var = by3Var.zzc;
        if (j04Var != j04.c()) {
            return j04Var;
        }
        j04 j04VarF = j04.f();
        by3Var.zzc = j04VarF;
        return j04VarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0372  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.ads.mz3 M(java.lang.Class r31, com.google.android.gms.internal.ads.gz3 r32, com.google.android.gms.internal.ads.oz3 r33, com.google.android.gms.internal.ads.yy3 r34, com.google.android.gms.internal.ads.i04 r35, com.google.android.gms.internal.ads.rx3 r36, com.google.android.gms.internal.ads.ez3 r37) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.M(java.lang.Class, com.google.android.gms.internal.ads.gz3, com.google.android.gms.internal.ads.oz3, com.google.android.gms.internal.ads.yy3, com.google.android.gms.internal.ads.i04, com.google.android.gms.internal.ads.rx3, com.google.android.gms.internal.ads.ez3):com.google.android.gms.internal.ads.mz3");
    }

    private static double N(Object obj, long j10) {
        return ((Double) t04.p(obj, j10)).doubleValue();
    }

    private static float O(Object obj, long j10) {
        return ((Float) t04.p(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020a, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0217, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0224, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0231, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023e, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024b, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024d, code lost:
    
        r4 = com.google.android.gms.internal.ads.mx3.b(r11 << 3) + com.google.android.gms.internal.ads.mx3.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (G(r17, r11, r5) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (G(r17, r11, r5) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (G(r17, r11, r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
    
        if (G(r17, r11, r5) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:
    
        if (G(r17, r11, r5) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        if (G(r17, r11, r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
    
        r4 = r11 << 3;
        r3 = com.google.android.gms.internal.ads.mx3.A(Q(r17, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        if (G(r17, r11, r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0141, code lost:
    
        if (G(r17, r11, r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0143, code lost:
    
        r3 = com.google.android.gms.internal.ads.mx3.c(k(r17, r3));
        r4 = com.google.android.gms.internal.ads.mx3.b(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        if (G(r17, r11, r5) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
    
        r3 = com.google.android.gms.internal.ads.mx3.b(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0167, code lost:
    
        if (G(r17, r11, r5) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0169, code lost:
    
        r3 = com.google.android.gms.internal.ads.mx3.b(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b6, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c4, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d2, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f0, code lost:
    
        if (r3 > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fd, code lost:
    
        if (r3 > 0) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int P(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.P(java.lang.Object):int");
    }

    private static int Q(Object obj, long j10) {
        return ((Integer) t04.p(obj, j10)).intValue();
    }

    private final int R(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, jw3 jw3Var) {
        Unsafe unsafe = f12324r;
        Object objO = o(i12);
        Object object = unsafe.getObject(obj, j10);
        if (ez3.b(object)) {
            dz3 dz3VarB = dz3.a().b();
            ez3.c(dz3VarB, object);
            unsafe.putObject(obj, j10, dz3VarB);
        }
        a5.a.a(objO);
        throw null;
    }

    private final int S(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, jw3 jw3Var) throws ny3 {
        Unsafe unsafe = f12324r;
        long j11 = this.f12325a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(kw3.p(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(kw3.b(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int iM = kw3.m(bArr, i10, jw3Var);
                    unsafe.putObject(obj, j10, Long.valueOf(jw3Var.f10733b));
                    unsafe.putInt(obj, j11, i13);
                    return iM;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int iJ = kw3.j(bArr, i10, jw3Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(jw3Var.f10732a));
                    unsafe.putInt(obj, j11, i13);
                    return iJ;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(kw3.p(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(kw3.b(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int iM2 = kw3.m(bArr, i10, jw3Var);
                    unsafe.putObject(obj, j10, Boolean.valueOf(jw3Var.f10733b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return iM2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int iJ2 = kw3.j(bArr, i10, jw3Var);
                    int i22 = jw3Var.f10732a;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else {
                        if ((i15 & 536870912) != 0 && !y04.j(bArr, iJ2, iJ2 + i22)) {
                            throw ny3.d();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, iJ2, i22, ly3.f11869b));
                        iJ2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return iJ2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object objQ = q(obj, i13, i17);
                    int iO = kw3.o(objQ, m(i17), bArr, i10, i11, jw3Var);
                    z(obj, i13, i17, objQ);
                    return iO;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int iA = kw3.a(bArr, i10, jw3Var);
                    unsafe.putObject(obj, j10, jw3Var.f10734c);
                    unsafe.putInt(obj, j11, i13);
                    return iA;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int iJ3 = kw3.j(bArr, i10, jw3Var);
                    int i23 = jw3Var.f10732a;
                    fy3 fy3VarL = l(i17);
                    if (fy3VarL == null || fy3VarL.a(i23)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        L(obj).j(i12, Long.valueOf(i23));
                    }
                    return iJ3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int iJ4 = kw3.j(bArr, i10, jw3Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(fx3.e(jw3Var.f10732a)));
                    unsafe.putInt(obj, j11, i13);
                    return iJ4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int iM3 = kw3.m(bArr, i10, jw3Var);
                    unsafe.putObject(obj, j10, Long.valueOf(fx3.f(jw3Var.f10733b)));
                    unsafe.putInt(obj, j11, i13);
                    return iM3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object objQ2 = q(obj, i13, i17);
                    int iN = kw3.n(objQ2, m(i17), bArr, i10, i11, (i12 & (-8)) | 4, jw3Var);
                    z(obj, i13, i17, objQ2);
                    return iN;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x0129, code lost:
    
        r12.add(com.google.android.gms.internal.ads.ww3.I(r16, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
    
        if (r4 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
    
        r12.add(com.google.android.gms.internal.ads.ww3.f17284n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        r12.add(com.google.android.gms.internal.ads.ww3.I(r16, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0129, code lost:
    
        if (r1 >= r18) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
    
        r4 = com.google.android.gms.internal.ads.kw3.j(r16, r1, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        if (r19 == r28.f10732a) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        r1 = com.google.android.gms.internal.ads.kw3.j(r16, r4, r28);
        r4 = r28.f10732a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        if (r4 < 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        if (r4 > (r16.length - r1)) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
    
        if (r4 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0147, code lost:
    
        throw com.google.android.gms.internal.ads.ny3.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
    
        throw com.google.android.gms.internal.ads.ny3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014d, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01f3 -> B:104:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0140 -> B:56:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01ab -> B:86:0x018a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int T(java.lang.Object r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23, int r25, long r26, com.google.android.gms.internal.ads.jw3 r28) throws com.google.android.gms.internal.ads.ny3 {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.T(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.jw3):int");
    }

    private final int U(int i10) {
        if (i10 < this.f12327c || i10 > this.f12328d) {
            return -1;
        }
        return X(i10, 0);
    }

    private final int V(int i10, int i11) {
        if (i10 < this.f12327c || i10 > this.f12328d) {
            return -1;
        }
        return X(i10, i11);
    }

    private final int W(int i10) {
        return this.f12325a[i10 + 2];
    }

    private final int X(int i10, int i11) {
        int length = (this.f12325a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f12325a[i13];
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

    private static int Y(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int Z(int i10) {
        return this.f12325a[i10 + 1];
    }

    private static long k(Object obj, long j10) {
        return ((Long) t04.p(obj, j10)).longValue();
    }

    private final fy3 l(int i10) {
        int i11 = i10 / 3;
        return (fy3) this.f12326b[i11 + i11 + 1];
    }

    private final d04 m(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        d04 d04Var = (d04) this.f12326b[i12];
        if (d04Var != null) {
            return d04Var;
        }
        d04 d04VarB = rz3.a().b((Class) this.f12326b[i12 + 1]);
        this.f12326b[i12] = d04VarB;
        return d04VarB;
    }

    private final Object n(Object obj, int i10, Object obj2, i04 i04Var, Object obj3) {
        int i11 = this.f12325a[i10];
        Object objP = t04.p(obj, Z(i10) & 1048575);
        if (objP == null || l(i10) == null) {
            return obj2;
        }
        a5.a.a(o(i10));
        throw null;
    }

    private final Object o(int i10) {
        int i11 = i10 / 3;
        return this.f12326b[i11 + i11];
    }

    private final Object p(Object obj, int i10) {
        d04 d04VarM = m(i10);
        int iZ = Z(i10) & 1048575;
        if (!C(obj, i10)) {
            return d04VarM.c();
        }
        Object object = f12324r.getObject(obj, iZ);
        if (F(object)) {
            return object;
        }
        Object objC = d04VarM.c();
        if (object != null) {
            d04VarM.e(objC, object);
        }
        return objC;
    }

    private final Object q(Object obj, int i10, int i11) {
        d04 d04VarM = m(i11);
        if (!G(obj, i10, i11)) {
            return d04VarM.c();
        }
        Object object = f12324r.getObject(obj, Z(i11) & 1048575);
        if (F(object)) {
            return object;
        }
        Object objC = d04VarM.c();
        if (object != null) {
            d04VarM.e(objC, object);
        }
        return objC;
    }

    private static Field r(Class cls, String str) {
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

    private static void s(Object obj) {
        if (!F(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void t(Object obj, Object obj2, int i10) {
        if (C(obj2, i10)) {
            int iZ = Z(i10) & 1048575;
            Unsafe unsafe = f12324r;
            long j10 = iZ;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f12325a[i10] + " is present but null: " + obj2.toString());
            }
            d04 d04VarM = m(i10);
            if (!C(obj, i10)) {
                if (F(object)) {
                    Object objC = d04VarM.c();
                    d04VarM.e(objC, object);
                    unsafe.putObject(obj, j10, objC);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                w(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!F(object2)) {
                Object objC2 = d04VarM.c();
                d04VarM.e(objC2, object2);
                unsafe.putObject(obj, j10, objC2);
                object2 = objC2;
            }
            d04VarM.e(object2, object);
        }
    }

    private final void u(Object obj, Object obj2, int i10) {
        int i11 = this.f12325a[i10];
        if (G(obj2, i11, i10)) {
            int iZ = Z(i10) & 1048575;
            Unsafe unsafe = f12324r;
            long j10 = iZ;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f12325a[i10] + " is present but null: " + obj2.toString());
            }
            d04 d04VarM = m(i10);
            if (!G(obj, i11, i10)) {
                if (F(object)) {
                    Object objC = d04VarM.c();
                    d04VarM.e(objC, object);
                    unsafe.putObject(obj, j10, objC);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                x(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!F(object2)) {
                Object objC2 = d04VarM.c();
                d04VarM.e(objC2, object2);
                unsafe.putObject(obj, j10, objC2);
                object2 = objC2;
            }
            d04VarM.e(object2, object);
        }
    }

    private final void v(Object obj, int i10, uz3 uz3Var) {
        int i11;
        Object objR;
        if (B(i10)) {
            i11 = i10 & 1048575;
            objR = uz3Var.t();
        } else {
            i11 = i10 & 1048575;
            objR = this.f12331g ? uz3Var.r() : uz3Var.o();
        }
        t04.D(obj, i11, objR);
    }

    private final void w(Object obj, int i10) {
        int iW = W(i10);
        long j10 = 1048575 & iW;
        if (j10 == 1048575) {
            return;
        }
        t04.B(obj, j10, (1 << (iW >>> 20)) | t04.l(obj, j10));
    }

    private final void x(Object obj, int i10, int i11) {
        t04.B(obj, W(i11) & 1048575, i10);
    }

    private final void y(Object obj, int i10, Object obj2) {
        f12324r.putObject(obj, Z(i10) & 1048575, obj2);
        w(obj, i10);
    }

    private final void z(Object obj, int i10, int i11, Object obj2) {
        f12324r.putObject(obj, Z(i11) & 1048575, obj2);
        x(obj, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0308, code lost:
    
        if (r0 != r21) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x030a, code lost:
    
        r15 = r27;
        r14 = r28;
        r12 = r29;
        r1 = r30;
        r13 = r31;
        r11 = r32;
        r9 = r33;
        r8 = r18;
        r5 = r19;
        r3 = r20;
        r2 = r21;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0326, code lost:
    
        r2 = r0;
        r7 = r20;
        r6 = r23;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035a, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0380, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0091. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int K(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.jw3 r33) throws com.google.android.gms.internal.ads.ny3 {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.K(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.jw3):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x031b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.ads.ww3) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x031e, code lost:
    
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.ads.mx3.C((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.ads.ww3) != false) goto L156;
     */
    @Override // com.google.android.gms.internal.ads.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.a(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3 A[PHI: r3
  0x00e3: PHI (r3v12 java.lang.Object) = (r3v10 java.lang.Object), (r3v13 java.lang.Object) binds: [B:67:0x00e1, B:62:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final Object c() {
        return ((by3) this.f12329e).k();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    @Override // com.google.android.gms.internal.ads.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = F(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.by3
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.ads.by3 r0 = (com.google.android.gms.internal.ads.by3) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.C(r2)
            r0.zza = r1
            r0.A()
        L1a:
            int[] r0 = r7.f12325a
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L75
            int r2 = r7.Z(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = Y(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L5f
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L5f;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L72
        L3c:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.mz3.f12324r
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L72
            r6 = r5
            com.google.android.gms.internal.ads.dz3 r6 = (com.google.android.gms.internal.ads.dz3) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L72
        L4e:
            com.google.android.gms.internal.ads.yy3 r2 = r7.f12336l
            r2.b(r8, r3)
            goto L72
        L54:
            int[] r2 = r7.f12325a
            r2 = r2[r1]
            boolean r2 = r7.G(r8, r2, r1)
            if (r2 == 0) goto L72
            goto L65
        L5f:
            boolean r2 = r7.C(r8, r1)
            if (r2 == 0) goto L72
        L65:
            com.google.android.gms.internal.ads.d04 r2 = r7.m(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.mz3.f12324r
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L72:
            int r1 = r1 + 3
            goto L1d
        L75:
            com.google.android.gms.internal.ads.i04 r0 = r7.f12337m
            r0.m(r8)
            boolean r0 = r7.f12330f
            if (r0 == 0) goto L83
            com.google.android.gms.internal.ads.rx3 r0 = r7.f12338n
            r0.e(r8)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.d(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.google.android.gms.internal.ads.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.e(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final boolean f(Object obj, Object obj2) {
        int length = this.f12325a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZ = Z(i10);
            long j10 = iZ & 1048575;
            switch (Y(iZ)) {
                case 0:
                    if (!A(obj, obj2, i10) || Double.doubleToLongBits(t04.j(obj, j10)) != Double.doubleToLongBits(t04.j(obj2, j10))) {
                        return false;
                    }
                    break;
                case 1:
                    if (!A(obj, obj2, i10) || Float.floatToIntBits(t04.k(obj, j10)) != Float.floatToIntBits(t04.k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!A(obj, obj2, i10) || t04.n(obj, j10) != t04.n(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!A(obj, obj2, i10) || t04.n(obj, j10) != t04.n(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!A(obj, obj2, i10) || t04.l(obj, j10) != t04.l(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!A(obj, obj2, i10) || t04.n(obj, j10) != t04.n(obj2, j10)) {
                        return false;
                    }
                    break;
                case 6:
                    if (!A(obj, obj2, i10) || t04.l(obj, j10) != t04.l(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    if (!A(obj, obj2, i10) || t04.H(obj, j10) != t04.H(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!A(obj, obj2, i10) || !f04.f(t04.p(obj, j10), t04.p(obj2, j10))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!A(obj, obj2, i10) || !f04.f(t04.p(obj, j10), t04.p(obj2, j10))) {
                        return false;
                    }
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    if (!A(obj, obj2, i10) || !f04.f(t04.p(obj, j10), t04.p(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!A(obj, obj2, i10) || t04.l(obj, j10) != t04.l(obj2, j10)) {
                        return false;
                    }
                    break;
                case 12:
                    if (!A(obj, obj2, i10) || t04.l(obj, j10) != t04.l(obj2, j10)) {
                        return false;
                    }
                    break;
                case 13:
                    if (!A(obj, obj2, i10) || t04.l(obj, j10) != t04.l(obj2, j10)) {
                        return false;
                    }
                    break;
                case 14:
                    if (!A(obj, obj2, i10) || t04.n(obj, j10) != t04.n(obj2, j10)) {
                        return false;
                    }
                    break;
                case 15:
                    if (!A(obj, obj2, i10) || t04.l(obj, j10) != t04.l(obj2, j10)) {
                        return false;
                    }
                    break;
                case 16:
                    if (!A(obj, obj2, i10) || t04.n(obj, j10) != t04.n(obj2, j10)) {
                        return false;
                    }
                    break;
                case 17:
                    if (!A(obj, obj2, i10) || !f04.f(t04.p(obj, j10), t04.p(obj2, j10))) {
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
                    if (!f04.f(t04.p(obj, j10), t04.p(obj2, j10))) {
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
                    long jW = W(i10) & 1048575;
                    if (t04.l(obj, jW) != t04.l(obj2, jW) || !f04.f(t04.p(obj, j10), t04.p(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f12337m.d(obj).equals(this.f12337m.d(obj2))) {
            return false;
        }
        if (!this.f12330f) {
            return true;
        }
        this.f12338n.a(obj);
        this.f12338n.a(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    @Override // com.google.android.gms.internal.ads.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.g(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:183:0x043e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036b  */
    @Override // com.google.android.gms.internal.ads.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r17, com.google.android.gms.internal.ads.nx3 r18) {
        /*
            Method dump skipped, instructions count: 2422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.h(java.lang.Object, com.google.android.gms.internal.ads.nx3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e5, code lost:
    
        if (r0 != r24) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e7, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fa, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0326, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0347, code lost:
    
        if (r0 != r14) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0095. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.jw3 r35) throws com.google.android.gms.internal.ads.ny3 {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mz3.i(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.jw3):void");
    }

    @Override // com.google.android.gms.internal.ads.d04
    public final void j(Object obj, uz3 uz3Var, qx3 qx3Var) {
        jz3 jz3Var;
        int iC;
        List listA;
        List listA2;
        List listA3;
        List listA4;
        List listA5;
        List listA6;
        List listA7;
        List listA8;
        List listA9;
        List listA10;
        fy3 fy3VarL;
        List listA11;
        List listA12;
        List listA13;
        List listA14;
        jz3 jz3Var2;
        Objects.requireNonNull(qx3Var);
        s(obj);
        i04 i04Var = this.f12337m;
        rx3 rx3Var = this.f12338n;
        Object objD = null;
        while (true) {
            try {
                int iD = uz3Var.d();
                int iU = U(iD);
                if (iU >= 0) {
                    int iZ = Z(iU);
                    try {
                        switch (Y(iZ)) {
                            case 0:
                                t04.z(obj, iZ & 1048575, uz3Var.a());
                                w(obj, iU);
                                break;
                            case 1:
                                t04.A(obj, iZ & 1048575, uz3Var.b());
                                w(obj, iU);
                                break;
                            case 2:
                                t04.C(obj, iZ & 1048575, uz3Var.l());
                                w(obj, iU);
                                break;
                            case 3:
                                t04.C(obj, iZ & 1048575, uz3Var.p());
                                w(obj, iU);
                                break;
                            case 4:
                                t04.B(obj, iZ & 1048575, uz3Var.h());
                                w(obj, iU);
                                break;
                            case 5:
                                t04.C(obj, iZ & 1048575, uz3Var.k());
                                w(obj, iU);
                                break;
                            case 6:
                                t04.B(obj, iZ & 1048575, uz3Var.e());
                                w(obj, iU);
                                break;
                            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                                t04.x(obj, iZ & 1048575, uz3Var.G());
                                w(obj, iU);
                                break;
                            case 8:
                                v(obj, iZ, uz3Var);
                                w(obj, iU);
                                break;
                            case 9:
                                jz3Var = (jz3) p(obj, iU);
                                uz3Var.E(jz3Var, m(iU), qx3Var);
                                y(obj, iU, jz3Var);
                                break;
                            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                                t04.D(obj, iZ & 1048575, uz3Var.o());
                                w(obj, iU);
                                break;
                            case 11:
                                t04.B(obj, iZ & 1048575, uz3Var.j());
                                w(obj, iU);
                                break;
                            case 12:
                                iC = uz3Var.c();
                                fy3 fy3VarL2 = l(iU);
                                if (fy3VarL2 != null && !fy3VarL2.a(iC)) {
                                    objD = f04.c(obj, iD, iC, objD, i04Var);
                                    break;
                                } else {
                                    t04.B(obj, iZ & 1048575, iC);
                                    w(obj, iU);
                                    break;
                                }
                                break;
                            case 13:
                                t04.B(obj, iZ & 1048575, uz3Var.g());
                                w(obj, iU);
                                break;
                            case 14:
                                t04.C(obj, iZ & 1048575, uz3Var.n());
                                w(obj, iU);
                                break;
                            case 15:
                                t04.B(obj, iZ & 1048575, uz3Var.i());
                                w(obj, iU);
                                break;
                            case 16:
                                t04.C(obj, iZ & 1048575, uz3Var.m());
                                w(obj, iU);
                                break;
                            case 17:
                                jz3Var = (jz3) p(obj, iU);
                                uz3Var.x(jz3Var, m(iU), qx3Var);
                                y(obj, iU, jz3Var);
                                break;
                            case 18:
                                listA = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.A(listA);
                                break;
                            case 19:
                                listA2 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.M(listA2);
                                break;
                            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                                listA3 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.v(listA3);
                                break;
                            case 21:
                                listA4 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.z(listA4);
                                break;
                            case 22:
                                listA5 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.D(listA5);
                                break;
                            case 23:
                                listA6 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.w(listA6);
                                break;
                            case 24:
                                listA7 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.L(listA7);
                                break;
                            case 25:
                                listA8 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.J(listA8);
                                break;
                            case 26:
                                if (B(iZ)) {
                                    ((gx3) uz3Var).N(this.f12336l.a(obj, iZ & 1048575), true);
                                    break;
                                } else {
                                    ((gx3) uz3Var).N(this.f12336l.a(obj, iZ & 1048575), false);
                                    break;
                                }
                            case 27:
                                uz3Var.s(this.f12336l.a(obj, iZ & 1048575), m(iU), qx3Var);
                                break;
                            case 28:
                                uz3Var.C(this.f12336l.a(obj, iZ & 1048575));
                                break;
                            case 29:
                                listA9 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.F(listA9);
                                break;
                            case 30:
                                listA10 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.u(listA10);
                                fy3VarL = l(iU);
                                objD = f04.b(obj, iD, listA10, fy3VarL, objD, i04Var);
                                break;
                            case 31:
                                listA11 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.K(listA11);
                                break;
                            case 32:
                                listA12 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.H(listA12);
                                break;
                            case 33:
                                listA13 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.B(listA13);
                                break;
                            case 34:
                                listA14 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.q(listA14);
                                break;
                            case 35:
                                listA = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.A(listA);
                                break;
                            case 36:
                                listA2 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.M(listA2);
                                break;
                            case 37:
                                listA3 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.v(listA3);
                                break;
                            case 38:
                                listA4 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.z(listA4);
                                break;
                            case 39:
                                listA5 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.D(listA5);
                                break;
                            case 40:
                                listA6 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.w(listA6);
                                break;
                            case 41:
                                listA7 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.L(listA7);
                                break;
                            case 42:
                                listA8 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.J(listA8);
                                break;
                            case 43:
                                listA9 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.F(listA9);
                                break;
                            case 44:
                                listA10 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.u(listA10);
                                fy3VarL = l(iU);
                                objD = f04.b(obj, iD, listA10, fy3VarL, objD, i04Var);
                                break;
                            case 45:
                                listA11 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.K(listA11);
                                break;
                            case 46:
                                listA12 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.H(listA12);
                                break;
                            case 47:
                                listA13 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.B(listA13);
                                break;
                            case 48:
                                listA14 = this.f12336l.a(obj, iZ & 1048575);
                                uz3Var.q(listA14);
                                break;
                            case 49:
                                uz3Var.y(this.f12336l.a(obj, iZ & 1048575), m(iU), qx3Var);
                                break;
                            case 50:
                                Object objO = o(iU);
                                long jZ = Z(iU) & 1048575;
                                Object objP = t04.p(obj, jZ);
                                if (objP == null) {
                                    objP = dz3.a().b();
                                    t04.D(obj, jZ, objP);
                                } else if (ez3.b(objP)) {
                                    Object objB = dz3.a().b();
                                    ez3.c(objB, objP);
                                    t04.D(obj, jZ, objB);
                                    objP = objB;
                                }
                                a5.a.a(objO);
                                throw null;
                                break;
                            case 51:
                                t04.D(obj, iZ & 1048575, Double.valueOf(uz3Var.a()));
                                x(obj, iD, iU);
                                break;
                            case 52:
                                t04.D(obj, iZ & 1048575, Float.valueOf(uz3Var.b()));
                                x(obj, iD, iU);
                                break;
                            case 53:
                                t04.D(obj, iZ & 1048575, Long.valueOf(uz3Var.l()));
                                x(obj, iD, iU);
                                break;
                            case 54:
                                t04.D(obj, iZ & 1048575, Long.valueOf(uz3Var.p()));
                                x(obj, iD, iU);
                                break;
                            case 55:
                                t04.D(obj, iZ & 1048575, Integer.valueOf(uz3Var.h()));
                                x(obj, iD, iU);
                                break;
                            case 56:
                                t04.D(obj, iZ & 1048575, Long.valueOf(uz3Var.k()));
                                x(obj, iD, iU);
                                break;
                            case 57:
                                t04.D(obj, iZ & 1048575, Integer.valueOf(uz3Var.e()));
                                x(obj, iD, iU);
                                break;
                            case 58:
                                t04.D(obj, iZ & 1048575, Boolean.valueOf(uz3Var.G()));
                                x(obj, iD, iU);
                                break;
                            case 59:
                                v(obj, iZ, uz3Var);
                                x(obj, iD, iU);
                                break;
                            case 60:
                                jz3Var2 = (jz3) q(obj, iD, iU);
                                uz3Var.E(jz3Var2, m(iU), qx3Var);
                                z(obj, iD, iU, jz3Var2);
                                break;
                            case 61:
                                t04.D(obj, iZ & 1048575, uz3Var.o());
                                x(obj, iD, iU);
                                break;
                            case 62:
                                t04.D(obj, iZ & 1048575, Integer.valueOf(uz3Var.j()));
                                x(obj, iD, iU);
                                break;
                            case 63:
                                iC = uz3Var.c();
                                fy3 fy3VarL3 = l(iU);
                                if (fy3VarL3 != null && !fy3VarL3.a(iC)) {
                                    objD = f04.c(obj, iD, iC, objD, i04Var);
                                    break;
                                }
                                t04.D(obj, iZ & 1048575, Integer.valueOf(iC));
                                x(obj, iD, iU);
                                break;
                            case 64:
                                t04.D(obj, iZ & 1048575, Integer.valueOf(uz3Var.g()));
                                x(obj, iD, iU);
                                break;
                            case 65:
                                t04.D(obj, iZ & 1048575, Long.valueOf(uz3Var.n()));
                                x(obj, iD, iU);
                                break;
                            case 66:
                                t04.D(obj, iZ & 1048575, Integer.valueOf(uz3Var.i()));
                                x(obj, iD, iU);
                                break;
                            case 67:
                                t04.D(obj, iZ & 1048575, Long.valueOf(uz3Var.m()));
                                x(obj, iD, iU);
                                break;
                            case 68:
                                jz3Var2 = (jz3) q(obj, iD, iU);
                                uz3Var.x(jz3Var2, m(iU), qx3Var);
                                z(obj, iD, iU, jz3Var2);
                                break;
                            default:
                                if (objD == null) {
                                    objD = i04Var.c(obj);
                                }
                                if (!i04Var.p(objD, uz3Var)) {
                                    Object objN = objD;
                                    for (int i10 = this.f12334j; i10 < this.f12335k; i10++) {
                                        objN = n(obj, this.f12333i[i10], objN, i04Var, obj);
                                    }
                                    if (objN != null) {
                                        i04Var.n(obj, objN);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (my3 unused) {
                        i04Var.q(uz3Var);
                        if (objD == null) {
                            objD = i04Var.c(obj);
                        }
                        if (!i04Var.p(objD, uz3Var)) {
                            Object objN2 = objD;
                            for (int i11 = this.f12334j; i11 < this.f12335k; i11++) {
                                objN2 = n(obj, this.f12333i[i11], objN2, i04Var, obj);
                            }
                            if (objN2 != null) {
                                i04Var.n(obj, objN2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iD == Integer.MAX_VALUE) {
                        Object objN3 = objD;
                        for (int i12 = this.f12334j; i12 < this.f12335k; i12++) {
                            objN3 = n(obj, this.f12333i[i12], objN3, i04Var, obj);
                        }
                        if (objN3 != null) {
                            i04Var.n(obj, objN3);
                            return;
                        }
                        return;
                    }
                    Object objC = !this.f12330f ? null : rx3Var.c(qx3Var, this.f12329e, iD);
                    if (objC != null) {
                        rx3Var.b(obj);
                        objD = rx3Var.d(obj, uz3Var, objC, qx3Var, null, objD, i04Var);
                    } else {
                        i04Var.q(uz3Var);
                        if (objD == null) {
                            objD = i04Var.c(obj);
                        }
                        if (!i04Var.p(objD, uz3Var)) {
                            Object objN4 = objD;
                            for (int i13 = this.f12334j; i13 < this.f12335k; i13++) {
                                objN4 = n(obj, this.f12333i[i13], objN4, i04Var, obj);
                            }
                            if (objN4 != null) {
                                i04Var.n(obj, objN4);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                Object objN5 = objD;
                for (int i14 = this.f12334j; i14 < this.f12335k; i14++) {
                    objN5 = n(obj, this.f12333i[i14], objN5, i04Var, obj);
                }
                if (objN5 != null) {
                    i04Var.n(obj, objN5);
                }
                throw th;
            }
        }
    }
}
