package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class t8 implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final r f15722q = new r() { // from class: com.google.android.gms.internal.ads.q8
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = t8.f15722q;
            return new k[]{new t8(0)};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f15723a;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f15724b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f15725c;

    /* renamed from: d, reason: collision with root package name */
    private final w8 f15726d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray f15727e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseBooleanArray f15728f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseBooleanArray f15729g;

    /* renamed from: h, reason: collision with root package name */
    private final p8 f15730h;

    /* renamed from: i, reason: collision with root package name */
    private o8 f15731i;

    /* renamed from: j, reason: collision with root package name */
    private n f15732j;

    /* renamed from: k, reason: collision with root package name */
    private int f15733k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15734l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15735m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15736n;

    /* renamed from: o, reason: collision with root package name */
    private int f15737o;

    /* renamed from: p, reason: collision with root package name */
    private int f15738p;

    public t8(int i10) {
        this(1, new rt2(0L), new g7(0), 112800);
    }

    public t8(int i10, rt2 rt2Var, w8 w8Var, int i11) {
        this.f15726d = w8Var;
        this.f15723a = Collections.singletonList(rt2Var);
        this.f15724b = new jm2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f15728f = sparseBooleanArray;
        this.f15729g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f15727e = sparseArray;
        this.f15725c = new SparseIntArray();
        this.f15730h = new p8(112800);
        this.f15732j = n.f12341a;
        this.f15738p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f15727e.put(sparseArray2.keyAt(i12), (y8) sparseArray2.valueAt(i12));
        }
        this.f15727e.put(0, new l8(new r8(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.l r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.jm2 r0 = r6.f15724b
            byte[] r0 = r0.h()
            com.google.android.gms.internal.ads.bo4 r7 = (com.google.android.gms.internal.ads.bo4) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.E(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.h(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t8.a(com.google.android.gms.internal.ads.l):boolean");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f15732j = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r19, com.google.android.gms.internal.ads.l0 r20) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t8.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r9, long r11) {
        /*
            r8 = this;
            java.util.List r9 = r8.f15723a
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        L8:
            r1 = 0
            if (r0 >= r9) goto L37
            java.util.List r3 = r8.f15723a
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.rt2 r3 = (com.google.android.gms.internal.ads.rt2) r3
            long r4 = r3.e()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            long r4 = r3.c()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L34
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L34
        L31:
            r3.f(r11)
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L42
            com.google.android.gms.internal.ads.o8 r9 = r8.f15731i
            if (r9 == 0) goto L42
            r9.d(r11)
        L42:
            com.google.android.gms.internal.ads.jm2 r9 = r8.f15724b
            r9.c(r10)
            android.util.SparseIntArray r9 = r8.f15725c
            r9.clear()
            r9 = r10
        L4d:
            android.util.SparseArray r11 = r8.f15727e
            int r11 = r11.size()
            if (r9 >= r11) goto L63
            android.util.SparseArray r11 = r8.f15727e
            java.lang.Object r11 = r11.valueAt(r9)
            com.google.android.gms.internal.ads.y8 r11 = (com.google.android.gms.internal.ads.y8) r11
            r11.d()
            int r9 = r9 + 1
            goto L4d
        L63:
            r8.f15737o = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t8.f(long, long):void");
    }
}
