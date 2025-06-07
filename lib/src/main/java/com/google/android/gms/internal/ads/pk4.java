package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class pk4 extends uk4 {

    /* renamed from: k, reason: collision with root package name */
    private static final k73 f13925k = k73.b(new Comparator() { // from class: com.google.android.gms.internal.ads.vj4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = pk4.f13927m;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* renamed from: l, reason: collision with root package name */
    private static final k73 f13926l = k73.b(new Comparator() { // from class: com.google.android.gms.internal.ads.wj4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10 = pk4.f13927m;
            return 0;
        }
    });

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f13927m = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f13928d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13929e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f13930f;

    /* renamed from: g, reason: collision with root package name */
    private ek4 f13931g;

    /* renamed from: h, reason: collision with root package name */
    private ik4 f13932h;

    /* renamed from: i, reason: collision with root package name */
    private u74 f13933i;

    /* renamed from: j, reason: collision with root package name */
    private final kj4 f13934j;

    public pk4(Context context) {
        kj4 kj4Var = new kj4();
        ek4 ek4VarD = ek4.d(context);
        this.f13928d = new Object();
        this.f13929e = context != null ? context.getApplicationContext() : null;
        this.f13934j = kj4Var;
        this.f13931g = ek4VarD;
        this.f13933i = u74.f16215c;
        boolean z10 = false;
        if (context != null && sv2.d(context)) {
            z10 = true;
        }
        this.f13930f = z10;
        if (!z10 && context != null && sv2.f15560a >= 32) {
            this.f13932h = ik4.a(context);
        }
        if (this.f13931g.f7884m0 && context == null) {
            ad2.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int j(k9 k9Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(k9Var.f10889c)) {
            return 4;
        }
        String strN = n(str);
        String strN2 = n(k9Var.f10889c);
        if (strN2 == null || strN == null) {
            return (z10 && strN2 == null) ? 1 : 0;
        }
        if (strN2.startsWith(strN) || strN.startsWith(strN2)) {
            return 3;
        }
        int i10 = sv2.f15560a;
        return strN2.split("-", 2)[0].equals(strN.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String n(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean q(com.google.android.gms.internal.ads.pk4 r8, com.google.android.gms.internal.ads.k9 r9) {
        /*
            java.lang.Object r0 = r8.f13928d
            monitor-enter(r0)
            com.google.android.gms.internal.ads.ek4 r1 = r8.f13931g     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.f7884m0     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8b
            boolean r1 = r8.f13930f     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L8b
            int r1 = r9.f10911y     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r1 <= r4) goto L8b
            java.lang.String r1 = r9.f10898l     // Catch: java.lang.Throwable -> L8e
            r5 = 32
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r4
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r3) goto L56
            if (r1 == r4) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.sv2.f15560a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8b
            com.google.android.gms.internal.ads.ik4 r1 = r8.f13932h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8b
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L8b
        L65:
            int r1 = com.google.android.gms.internal.ads.sv2.f15560a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8c
            com.google.android.gms.internal.ads.ik4 r1 = r8.f13932h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r4 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8c
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.ik4 r1 = r8.f13932h     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.ik4 r1 = r8.f13932h     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.u74 r8 = r8.f13933i     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.d(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
        L8b:
            r2 = r3
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pk4.q(com.google.android.gms.internal.ads.pk4, com.google.android.gms.internal.ads.k9):boolean");
    }

    protected static boolean r(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    private static void s(fj4 fj4Var, n81 n81Var, Map map) {
        for (int i10 = 0; i10 < fj4Var.f8303a; i10++) {
            a5.a.a(n81Var.f12509y.get(fj4Var.b(i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        boolean z10;
        ik4 ik4Var;
        synchronized (this.f13928d) {
            z10 = false;
            if (this.f13931g.f7884m0 && !this.f13930f && sv2.f15560a >= 32 && (ik4Var = this.f13932h) != null && ik4Var.g()) {
                z10 = true;
            }
        }
        if (z10) {
            h();
        }
    }

    private static final Pair u(int i10, tk4 tk4Var, int[][][] iArr, kk4 kk4Var, Comparator comparator) {
        int i11;
        RandomAccess randomAccessV;
        int i12;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 2; i13++) {
            if (i10 == tk4Var.c(i13)) {
                fj4 fj4VarD = tk4Var.d(i13);
                for (int i14 = 0; i14 < fj4VarD.f8303a; i14++) {
                    j31 j31VarB = fj4VarD.b(i14);
                    List listA = kk4Var.a(i13, j31VarB, iArr[i13][i14]);
                    int i15 = j31VarB.f10281a;
                    int i16 = 1;
                    boolean[] zArr = new boolean[1];
                    int i17 = 0;
                    while (i17 <= 0) {
                        lk4 lk4Var = (lk4) listA.get(i17);
                        int iB = lk4Var.b();
                        if (zArr[i17] || iB == 0) {
                            i11 = i16;
                        } else {
                            if (iB == i16) {
                                randomAccessV = c63.v(lk4Var);
                                i11 = i16;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(lk4Var);
                                int i18 = i17 + 1;
                                while (i18 <= 0) {
                                    lk4 lk4Var2 = (lk4) listA.get(i18);
                                    if (lk4Var2.b() == 2 && lk4Var.d(lk4Var2)) {
                                        arrayList2.add(lk4Var2);
                                        i12 = 1;
                                        zArr[i18] = true;
                                    } else {
                                        i12 = 1;
                                    }
                                    i18++;
                                    i16 = i12;
                                }
                                i11 = i16;
                                randomAccessV = arrayList2;
                            }
                            arrayList.add(randomAccessV);
                        }
                        i17++;
                        i16 = i11;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((lk4) list.get(i19)).f11650o;
        }
        lk4 lk4Var3 = (lk4) list.get(0);
        return Pair.create(new qk4(lk4Var3.f11649n, iArr2, 0), Integer.valueOf(lk4Var3.f11648m));
    }

    @Override // com.google.android.gms.internal.ads.xk4
    public final void a() {
        ik4 ik4Var;
        synchronized (this.f13928d) {
            if (sv2.f15560a >= 32 && (ik4Var = this.f13932h) != null) {
                ik4Var.c();
            }
        }
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.xk4
    public final void b(u74 u74Var) {
        boolean z10;
        synchronized (this.f13928d) {
            z10 = !this.f13933i.equals(u74Var);
            this.f13933i = u74Var;
        }
        if (z10) {
            t();
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uk4
    protected final Pair i(tk4 tk4Var, int[][][] iArr, final int[] iArr2, hh4 hh4Var, h11 h11Var) {
        final ek4 ek4Var;
        int i10;
        final boolean z10;
        final String str;
        int[] iArr3;
        int length;
        ik4 ik4Var;
        int[][][] iArr4 = iArr;
        synchronized (this.f13928d) {
            ek4Var = this.f13931g;
            if (ek4Var.f7884m0 && sv2.f15560a >= 32 && (ik4Var = this.f13932h) != null) {
                Looper looperMyLooper = Looper.myLooper();
                gt1.b(looperMyLooper);
                ik4Var.b(this, looperMyLooper);
            }
        }
        int i11 = 2;
        qk4[] qk4VarArr = new qk4[2];
        Pair pairU = u(2, tk4Var, iArr4, new kk4() { // from class: com.google.android.gms.internal.ads.rj4
            /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
            @Override // com.google.android.gms.internal.ads.kk4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List a(int r20, com.google.android.gms.internal.ads.j31 r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 200
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rj4.a(int, com.google.android.gms.internal.ads.j31, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.sj4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                q53 q53VarI = q53.i();
                mk4 mk4Var = new Comparator() { // from class: com.google.android.gms.internal.ads.mk4
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ok4.i((ok4) obj3, (ok4) obj4);
                    }
                };
                q53 q53VarB = q53VarI.c((ok4) Collections.max(list, mk4Var), (ok4) Collections.max(list2, mk4Var), mk4Var).b(list.size(), list2.size());
                nk4 nk4Var = new Comparator() { // from class: com.google.android.gms.internal.ads.nk4
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return ok4.g((ok4) obj3, (ok4) obj4);
                    }
                };
                return q53VarB.c((ok4) Collections.max(list, nk4Var), (ok4) Collections.max(list2, nk4Var), nk4Var).a();
            }
        });
        if (pairU != null) {
            qk4VarArr[((Integer) pairU.second).intValue()] = (qk4) pairU.first;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z10 = false;
                break;
            }
            if (tk4Var.c(i13) == 2 && tk4Var.d(i13).f8303a > 0) {
                z10 = true;
                break;
            }
            i13++;
        }
        Pair pairU2 = u(1, tk4Var, iArr4, new kk4() { // from class: com.google.android.gms.internal.ads.pj4
            @Override // com.google.android.gms.internal.ads.kk4
            public final List a(int i14, j31 j31Var, int[] iArr5) {
                final pk4 pk4Var = this.f13917a;
                ek4 ek4Var2 = ek4Var;
                boolean z11 = z10;
                j33 j33Var = new j33() { // from class: com.google.android.gms.internal.ads.oj4
                    @Override // com.google.android.gms.internal.ads.j33
                    public final boolean a(Object obj) {
                        return pk4.q(pk4Var, (k9) obj);
                    }
                };
                z53 z53Var = new z53();
                int i15 = 0;
                while (true) {
                    int i16 = j31Var.f10281a;
                    if (i15 > 0) {
                        return z53Var.j();
                    }
                    z53Var.g(new xj4(i14, j31Var, i15, ek4Var2, iArr5[i15], z11, j33Var));
                    i15++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.qj4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((xj4) Collections.max((List) obj)).g((xj4) Collections.max((List) obj2));
            }
        });
        if (pairU2 != null) {
            qk4VarArr[((Integer) pairU2.second).intValue()] = (qk4) pairU2.first;
        }
        if (pairU2 == null) {
            str = null;
        } else {
            Object obj = pairU2.first;
            str = ((qk4) obj).f14385a.b(((qk4) obj).f14386b[0]).f10889c;
        }
        int i14 = 3;
        Pair pairU3 = u(3, tk4Var, iArr4, new kk4() { // from class: com.google.android.gms.internal.ads.tj4
            @Override // com.google.android.gms.internal.ads.kk4
            public final List a(int i15, j31 j31Var, int[] iArr5) {
                ek4 ek4Var2 = ek4Var;
                String str2 = str;
                int i16 = pk4.f13927m;
                z53 z53Var = new z53();
                int i17 = 0;
                while (true) {
                    int i18 = j31Var.f10281a;
                    if (i17 > 0) {
                        return z53Var.j();
                    }
                    z53Var.g(new jk4(i15, j31Var, i17, ek4Var2, iArr5[i17], str2));
                    i17++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.uj4
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((jk4) ((List) obj2).get(0)).g((jk4) ((List) obj3).get(0));
            }
        });
        if (pairU3 != null) {
            qk4VarArr[((Integer) pairU3.second).intValue()] = (qk4) pairU3.first;
        }
        int i15 = 0;
        while (i15 < i11) {
            int iC = tk4Var.c(i15);
            if (iC != i11 && iC != i10 && iC != i14) {
                fj4 fj4VarD = tk4Var.d(i15);
                int[][] iArr5 = iArr4[i15];
                int i16 = i12;
                int i17 = i16;
                j31 j31Var = null;
                yj4 yj4Var = null;
                while (i16 < fj4VarD.f8303a) {
                    j31 j31VarB = fj4VarD.b(i16);
                    int[] iArr6 = iArr5[i16];
                    int i18 = i12;
                    yj4 yj4Var2 = yj4Var;
                    while (true) {
                        int i19 = j31VarB.f10281a;
                        if (i18 <= 0) {
                            if (r(iArr6[i18], ek4Var.f7885n0)) {
                                yj4 yj4Var3 = new yj4(j31VarB.b(i18), iArr6[i18]);
                                if (yj4Var2 == null || yj4Var3.compareTo(yj4Var2) > 0) {
                                    i17 = i18;
                                    yj4Var2 = yj4Var3;
                                    j31Var = j31VarB;
                                }
                            }
                            i18++;
                        }
                    }
                    i16++;
                    yj4Var = yj4Var2;
                    i12 = 0;
                }
                qk4VarArr[i15] = j31Var == null ? null : new qk4(j31Var, new int[]{i17}, 0);
            }
            i15++;
            iArr4 = iArr;
            i11 = 2;
            i12 = 0;
            i10 = 1;
            i14 = 3;
        }
        HashMap map = new HashMap();
        int i20 = 2;
        for (int i21 = 0; i21 < 2; i21++) {
            s(tk4Var.d(i21), ek4Var, map);
        }
        s(tk4Var.e(), ek4Var, map);
        for (int i22 = 0; i22 < 2; i22++) {
            a5.a.a(map.get(Integer.valueOf(tk4Var.c(i22))));
        }
        int i23 = 0;
        while (i23 < i20) {
            fj4 fj4VarD2 = tk4Var.d(i23);
            if (ek4Var.g(i23, fj4VarD2)) {
                ek4Var.e(i23, fj4VarD2);
                qk4VarArr[i23] = null;
            }
            i23++;
            i20 = 2;
        }
        int i24 = 0;
        for (int i25 = i20; i24 < i25; i25 = 2) {
            int iC2 = tk4Var.c(i24);
            if (ek4Var.f(i24) || ek4Var.f12510z.contains(Integer.valueOf(iC2))) {
                qk4VarArr[i24] = null;
            }
            i24++;
        }
        kj4 kj4Var = this.f13934j;
        gl4 gl4VarF = f();
        c63 c63VarB = lj4.b(qk4VarArr);
        int i26 = 2;
        rk4[] rk4VarArr = new rk4[2];
        int i27 = 0;
        while (i27 < i26) {
            qk4 qk4Var = qk4VarArr[i27];
            if (qk4Var != null && (length = (iArr3 = qk4Var.f14386b).length) != 0) {
                rk4VarArr[i27] = length == 1 ? new sk4(qk4Var.f14385a, iArr3[0], 0, 0, null) : kj4Var.a(qk4Var.f14385a, iArr3, 0, gl4VarF, (c63) c63VarB.get(i27));
            }
            i27++;
            i26 = 2;
        }
        w84[] w84VarArr = new w84[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            w84VarArr[i28] = (ek4Var.f(i28) || ek4Var.f12510z.contains(Integer.valueOf(tk4Var.c(i28))) || (tk4Var.c(i28) != -2 && rk4VarArr[i28] == null)) ? null : w84.f17021a;
        }
        return Pair.create(w84VarArr, rk4VarArr);
    }

    public final ek4 k() {
        ek4 ek4Var;
        synchronized (this.f13928d) {
            ek4Var = this.f13931g;
        }
        return ek4Var;
    }

    public final void p(ck4 ck4Var) {
        boolean z10;
        ek4 ek4Var = new ek4(ck4Var);
        synchronized (this.f13928d) {
            z10 = !this.f13931g.equals(ek4Var);
            this.f13931g = ek4Var;
        }
        if (z10) {
            if (ek4Var.f7884m0 && this.f13929e == null) {
                ad2.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            h();
        }
    }
}
