package com.google.android.gms.internal.play_billing;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class x2 implements f3 {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f19672o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    private static final Unsafe f19673p = f4.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f19674a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f19675b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19676c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19677d;

    /* renamed from: e, reason: collision with root package name */
    private final u2 f19678e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19679f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f19680g;

    /* renamed from: h, reason: collision with root package name */
    private final int f19681h;

    /* renamed from: i, reason: collision with root package name */
    private final int f19682i;

    /* renamed from: j, reason: collision with root package name */
    private final k2 f19683j;

    /* renamed from: k, reason: collision with root package name */
    private final v3 f19684k;

    /* renamed from: l, reason: collision with root package name */
    private final d1 f19685l;

    /* renamed from: m, reason: collision with root package name */
    private final z2 f19686m;

    /* renamed from: n, reason: collision with root package name */
    private final p2 f19687n;

    private x2(int[] iArr, Object[] objArr, int i10, int i11, u2 u2Var, int i12, boolean z10, int[] iArr2, int i13, int i14, z2 z2Var, k2 k2Var, v3 v3Var, d1 d1Var, p2 p2Var) {
        this.f19674a = iArr;
        this.f19675b = objArr;
        this.f19676c = i10;
        this.f19677d = i11;
        boolean z11 = false;
        if (d1Var != null && d1Var.f(u2Var)) {
            z11 = true;
        }
        this.f19679f = z11;
        this.f19680g = iArr2;
        this.f19681h = i13;
        this.f19682i = i14;
        this.f19686m = z2Var;
        this.f19683j = k2Var;
        this.f19684k = v3Var;
        this.f19685l = d1Var;
        this.f19678e = u2Var;
        this.f19687n = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.play_billing.x2 A(java.lang.Class r33, com.google.android.gms.internal.play_billing.r2 r34, com.google.android.gms.internal.play_billing.z2 r35, com.google.android.gms.internal.play_billing.k2 r36, com.google.android.gms.internal.play_billing.v3 r37, com.google.android.gms.internal.play_billing.d1 r38, com.google.android.gms.internal.play_billing.p2 r39) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.A(java.lang.Class, com.google.android.gms.internal.play_billing.r2, com.google.android.gms.internal.play_billing.z2, com.google.android.gms.internal.play_billing.k2, com.google.android.gms.internal.play_billing.v3, com.google.android.gms.internal.play_billing.d1, com.google.android.gms.internal.play_billing.p2):com.google.android.gms.internal.play_billing.x2");
    }

    private static double B(Object obj, long j10) {
        return ((Double) f4.k(obj, j10)).doubleValue();
    }

    private static float C(Object obj, long j10) {
        return ((Float) f4.k(obj, j10)).floatValue();
    }

    private static int D(Object obj, long j10) {
        return ((Integer) f4.k(obj, j10)).intValue();
    }

    private final int E(int i10) {
        return this.f19674a[i10 + 2];
    }

    private final int F(int i10, int i11) {
        int length = (this.f19674a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f19674a[i13];
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

    private static int G(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int H(int i10) {
        return this.f19674a[i10 + 1];
    }

    private static long I(Object obj, long j10) {
        return ((Long) f4.k(obj, j10)).longValue();
    }

    private final r1 J(int i10) {
        int i11 = i10 / 3;
        return (r1) this.f19675b[i11 + i11 + 1];
    }

    private final f3 K(int i10) {
        Object[] objArr = this.f19675b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        f3 f3Var = (f3) objArr[i12];
        if (f3Var != null) {
            return f3Var;
        }
        f3 f3VarB = c3.a().b((Class) objArr[i12 + 1]);
        this.f19675b[i12] = f3VarB;
        return f3VarB;
    }

    private final Object L(int i10) {
        int i11 = i10 / 3;
        return this.f19675b[i11 + i11];
    }

    private final Object M(Object obj, int i10) {
        f3 f3VarK = K(i10);
        int iH = H(i10) & 1048575;
        if (!r(obj, i10)) {
            return f3VarK.c();
        }
        Object object = f19673p.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        Object objC = f3VarK.c();
        if (object != null) {
            f3VarK.e(objC, object);
        }
        return objC;
    }

    private final Object N(Object obj, int i10, int i11) {
        f3 f3VarK = K(i11);
        if (!v(obj, i10, i11)) {
            return f3VarK.c();
        }
        Object object = f19673p.getObject(obj, H(i11) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objC = f3VarK.c();
        if (object != null) {
            f3VarK.e(objC, object);
        }
        return objC;
    }

    private static Field O(Class cls, String str) {
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

    private static void j(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void k(Object obj, Object obj2, int i10) {
        if (r(obj2, i10)) {
            int iH = H(i10) & 1048575;
            Unsafe unsafe = f19673p;
            long j10 = iH;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f19674a[i10] + " is present but null: " + obj2.toString());
            }
            f3 f3VarK = K(i10);
            if (!r(obj, i10)) {
                if (u(object)) {
                    Object objC = f3VarK.c();
                    f3VarK.e(objC, object);
                    unsafe.putObject(obj, j10, objC);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                m(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!u(object2)) {
                Object objC2 = f3VarK.c();
                f3VarK.e(objC2, object2);
                unsafe.putObject(obj, j10, objC2);
                object2 = objC2;
            }
            f3VarK.e(object2, object);
        }
    }

    private final void l(Object obj, Object obj2, int i10) {
        int i11 = this.f19674a[i10];
        if (v(obj2, i11, i10)) {
            int iH = H(i10) & 1048575;
            Unsafe unsafe = f19673p;
            long j10 = iH;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f19674a[i10] + " is present but null: " + obj2.toString());
            }
            f3 f3VarK = K(i10);
            if (!v(obj, i11, i10)) {
                if (u(object)) {
                    Object objC = f3VarK.c();
                    f3VarK.e(objC, object);
                    unsafe.putObject(obj, j10, objC);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                n(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!u(object2)) {
                Object objC2 = f3VarK.c();
                f3VarK.e(objC2, object2);
                unsafe.putObject(obj, j10, objC2);
                object2 = objC2;
            }
            f3VarK.e(object2, object);
        }
    }

    private final void m(Object obj, int i10) {
        int iE = E(i10);
        long j10 = 1048575 & iE;
        if (j10 == 1048575) {
            return;
        }
        f4.v(obj, j10, (1 << (iE >>> 20)) | f4.h(obj, j10));
    }

    private final void n(Object obj, int i10, int i11) {
        f4.v(obj, E(i11) & 1048575, i10);
    }

    private final void o(Object obj, int i10, Object obj2) {
        f19673p.putObject(obj, H(i10) & 1048575, obj2);
        m(obj, i10);
    }

    private final void p(Object obj, int i10, int i11, Object obj2) {
        f19673p.putObject(obj, H(i11) & 1048575, obj2);
        n(obj, i10, i11);
    }

    private final boolean q(Object obj, Object obj2, int i10) {
        return r(obj, i10) == r(obj2, i10);
    }

    private final boolean r(Object obj, int i10) {
        int iE = E(i10);
        long j10 = iE & 1048575;
        if (j10 != 1048575) {
            return (f4.h(obj, j10) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i10);
        long j11 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(f4.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(f4.g(obj, j11)) != 0;
            case 2:
                return f4.i(obj, j11) != 0;
            case 3:
                return f4.i(obj, j11) != 0;
            case 4:
                return f4.h(obj, j11) != 0;
            case 5:
                return f4.i(obj, j11) != 0;
            case 6:
                return f4.h(obj, j11) != 0;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return f4.B(obj, j11);
            case 8:
                Object objK = f4.k(obj, j11);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof q0) {
                    return !q0.f19623n.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return f4.k(obj, j11) != null;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return !q0.f19623n.equals(f4.k(obj, j11));
            case 11:
                return f4.h(obj, j11) != 0;
            case 12:
                return f4.h(obj, j11) != 0;
            case 13:
                return f4.h(obj, j11) != 0;
            case 14:
                return f4.i(obj, j11) != 0;
            case 15:
                return f4.h(obj, j11) != 0;
            case 16:
                return f4.i(obj, j11) != 0;
            case 17:
                return f4.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean s(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? r(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean t(Object obj, int i10, f3 f3Var) {
        return f3Var.g(f4.k(obj, i10 & 1048575));
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof n1) {
            return ((n1) obj).w();
        }
        return true;
    }

    private final boolean v(Object obj, int i10, int i11) {
        return f4.h(obj, (long) (E(i11) & 1048575)) == i10;
    }

    private static boolean w(Object obj, long j10) {
        return ((Boolean) f4.k(obj, j10)).booleanValue();
    }

    private static final void x(int i10, Object obj, n4 n4Var) {
        if (obj instanceof String) {
            n4Var.q(i10, (String) obj);
        } else {
            n4Var.z(i10, (q0) obj);
        }
    }

    static w3 z(Object obj) {
        n1 n1Var = (n1) obj;
        w3 w3Var = n1Var.zzc;
        if (w3Var != w3.c()) {
            return w3Var;
        }
        w3 w3VarF = w3.f();
        n1Var.zzc = w3VarF;
        return w3VarF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x04f3, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.q0) != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04f6, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.y0.w(r0);
        r1 = com.google.android.gms.internal.play_billing.y0.v((java.lang.String) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.q0) != false) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03bd  */
    @Override // com.google.android.gms.internal.play_billing.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.a(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r1 r2
  0x00e2: PHI (r1v14 int) = (r1v12 int), (r1v17 int) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r2v15 java.lang.Object) = (r2v12 java.lang.Object), (r2v16 java.lang.Object) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.b(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final Object c() {
        return ((n1) this.f19678e).l();
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
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // com.google.android.gms.internal.play_billing.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = u(r8)
            if (r0 != 0) goto L8
            goto L84
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.play_billing.n1
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.play_billing.n1 r0 = (com.google.android.gms.internal.play_billing.n1) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.u(r2)
            r0.zza = r1
            r0.s()
        L1b:
            int[] r0 = r7.f19674a
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L76
            int r2 = r7.H(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = G(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L60
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L60;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L73
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.x2.f19673p
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L73
            r6 = r5
            com.google.android.gms.internal.play_billing.o2 r6 = (com.google.android.gms.internal.play_billing.o2) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L73
        L4f:
            com.google.android.gms.internal.play_billing.k2 r2 = r7.f19683j
            r2.a(r8, r3)
            goto L73
        L55:
            int[] r2 = r7.f19674a
            r2 = r2[r1]
            boolean r2 = r7.v(r8, r2, r1)
            if (r2 == 0) goto L73
            goto L66
        L60:
            boolean r2 = r7.r(r8, r1)
            if (r2 == 0) goto L73
        L66:
            com.google.android.gms.internal.play_billing.f3 r2 = r7.K(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.play_billing.x2.f19673p
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L73:
            int r1 = r1 + 3
            goto L1d
        L76:
            com.google.android.gms.internal.play_billing.v3 r0 = r7.f19684k
            r0.g(r8)
            boolean r0 = r7.f19679f
            if (r0 == 0) goto L84
            com.google.android.gms.internal.play_billing.d1 r0 = r7.f19685l
            r0.d(r8)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.d(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.google.android.gms.internal.play_billing.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.e(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final boolean f(Object obj, Object obj2) {
        for (int i10 = 0; i10 < this.f19674a.length; i10 += 3) {
            int iH = H(i10);
            long j10 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i10) || Double.doubleToLongBits(f4.f(obj, j10)) != Double.doubleToLongBits(f4.f(obj2, j10))) {
                        return false;
                    }
                    break;
                case 1:
                    if (!q(obj, obj2, i10) || Float.floatToIntBits(f4.g(obj, j10)) != Float.floatToIntBits(f4.g(obj2, j10))) {
                        return false;
                    }
                    break;
                case 2:
                    if (!q(obj, obj2, i10) || f4.i(obj, j10) != f4.i(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i10) || f4.i(obj, j10) != f4.i(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i10) || f4.h(obj, j10) != f4.h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i10) || f4.i(obj, j10) != f4.i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 6:
                    if (!q(obj, obj2, i10) || f4.h(obj, j10) != f4.h(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    if (!q(obj, obj2, i10) || f4.B(obj, j10) != f4.B(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i10) || !h3.g(f4.k(obj, j10), f4.k(obj2, j10))) {
                        return false;
                    }
                    break;
                case 9:
                    if (!q(obj, obj2, i10) || !h3.g(f4.k(obj, j10), f4.k(obj2, j10))) {
                        return false;
                    }
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    if (!q(obj, obj2, i10) || !h3.g(f4.k(obj, j10), f4.k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!q(obj, obj2, i10) || f4.h(obj, j10) != f4.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 12:
                    if (!q(obj, obj2, i10) || f4.h(obj, j10) != f4.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 13:
                    if (!q(obj, obj2, i10) || f4.h(obj, j10) != f4.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 14:
                    if (!q(obj, obj2, i10) || f4.i(obj, j10) != f4.i(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!q(obj, obj2, i10) || f4.h(obj, j10) != f4.h(obj2, j10)) {
                        return false;
                    }
                    break;
                case 16:
                    if (!q(obj, obj2, i10) || f4.i(obj, j10) != f4.i(obj2, j10)) {
                        return false;
                    }
                    break;
                case 17:
                    if (!q(obj, obj2, i10) || !h3.g(f4.k(obj, j10), f4.k(obj2, j10))) {
                        return false;
                    }
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
                    if (!h3.g(f4.k(obj, j10), f4.k(obj2, j10))) {
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
                    long jE = E(i10) & 1048575;
                    if (f4.h(obj, jE) != f4.h(obj2, jE) || !h3.g(f4.k(obj, j10), f4.k(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f19684k.d(obj).equals(this.f19684k.d(obj2))) {
            return false;
        }
        if (this.f19679f) {
            return this.f19685l.b(obj).equals(this.f19685l.b(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    @Override // com.google.android.gms.internal.play_billing.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.g(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r24, com.google.android.gms.internal.play_billing.n4 r25) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.h(java.lang.Object, com.google.android.gms.internal.play_billing.n4):void");
    }

    @Override // com.google.android.gms.internal.play_billing.f3
    public final void i(Object obj, byte[] bArr, int i10, int i11, d0 d0Var) throws x1 {
        y(obj, bArr, i10, i11, 0, d0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0635, code lost:
    
        if (r1 == 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0637, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.q0.f19623n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x063d, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.q0.t(r37, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0645, code lost:
    
        if (r0 >= r8) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0647, code lost:
    
        r1 = com.google.android.gms.internal.play_billing.e0.h(r37, r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x064d, code lost:
    
        if (r14 != r10.f19472a) goto L688;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x064f, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.e0.h(r37, r1, r10);
        r1 = r10.f19472a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0655, code lost:
    
        if (r1 < 0) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0659, code lost:
    
        if (r1 > (r37.length - r0)) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x065b, code lost:
    
        if (r1 != 0) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0662, code lost:
    
        throw com.google.android.gms.internal.play_billing.x1.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0667, code lost:
    
        throw com.google.android.gms.internal.play_billing.x1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0668, code lost:
    
        r1 = r0;
        r7 = r14;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0645, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.q0.t(r37, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0b3b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x091f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0931 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0b4e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:270:0x065b -> B:261:0x0637). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:302:0x06fa -> B:294:0x06d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:322:0x0744 -> B:312:0x071b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int y(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.play_billing.d0 r41) throws com.google.android.gms.internal.play_billing.x1 {
        /*
            Method dump skipped, instructions count: 3212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.x2.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.d0):int");
    }
}
