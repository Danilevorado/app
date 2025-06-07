package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.Map;

/* loaded from: classes.dex */
public final class ek4 extends n81 {
    private static final String A0;
    private static final String B0;
    private static final String C0;
    private static final String D0;
    private static final String E0;
    private static final String F0;
    private static final String G0;
    private static final String H0;
    private static final String I0;
    private static final String J0;
    private static final String K0;
    public static final xa4 L0;

    /* renamed from: s0, reason: collision with root package name */
    public static final ek4 f7867s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final ek4 f7868t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final String f7869u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final String f7870v0;

    /* renamed from: w0, reason: collision with root package name */
    private static final String f7871w0;

    /* renamed from: x0, reason: collision with root package name */
    private static final String f7872x0;

    /* renamed from: y0, reason: collision with root package name */
    private static final String f7873y0;

    /* renamed from: z0, reason: collision with root package name */
    private static final String f7874z0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f7875d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f7876e0;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f7877f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f7878g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f7879h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f7880i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f7881j0;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f7882k0;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f7883l0;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f7884m0;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f7885n0;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f7886o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f7887p0;

    /* renamed from: q0, reason: collision with root package name */
    private final SparseArray f7888q0;

    /* renamed from: r0, reason: collision with root package name */
    private final SparseBooleanArray f7889r0;

    static {
        ek4 ek4Var = new ek4(new ck4());
        f7867s0 = ek4Var;
        f7868t0 = ek4Var;
        f7869u0 = Integer.toString(AdError.NETWORK_ERROR_CODE, 36);
        f7870v0 = Integer.toString(AdError.NO_FILL_ERROR_CODE, 36);
        f7871w0 = Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
        f7872x0 = Integer.toString(1003, 36);
        f7873y0 = Integer.toString(1004, 36);
        f7874z0 = Integer.toString(1005, 36);
        A0 = Integer.toString(1006, 36);
        B0 = Integer.toString(1007, 36);
        C0 = Integer.toString(1008, 36);
        D0 = Integer.toString(1009, 36);
        E0 = Integer.toString(1010, 36);
        F0 = Integer.toString(1011, 36);
        G0 = Integer.toString(1012, 36);
        H0 = Integer.toString(1013, 36);
        I0 = Integer.toString(1014, 36);
        J0 = Integer.toString(1015, 36);
        K0 = Integer.toString(1016, 36);
        L0 = new xa4() { // from class: com.google.android.gms.internal.ads.zj4
        };
    }

    private ek4(ck4 ck4Var) {
        super(ck4Var);
        this.f7875d0 = ck4Var.f6967q;
        this.f7876e0 = false;
        this.f7877f0 = ck4Var.f6968r;
        this.f7878g0 = false;
        this.f7879h0 = ck4Var.f6969s;
        this.f7880i0 = false;
        this.f7881j0 = false;
        this.f7882k0 = false;
        this.f7883l0 = false;
        this.f7884m0 = ck4Var.f6970t;
        this.f7885n0 = ck4Var.f6971u;
        this.f7886o0 = false;
        this.f7887p0 = ck4Var.f6972v;
        this.f7888q0 = ck4Var.f6973w;
        this.f7889r0 = ck4Var.f6974x;
    }

    public static ek4 d(Context context) {
        return new ek4(new ck4(context));
    }

    public final ck4 c() {
        return new ck4(this, null);
    }

    public final fk4 e(int i10, fj4 fj4Var) {
        Map map = (Map) this.f7888q0.get(i10);
        if (map != null) {
            a5.a.a(map.get(fj4Var));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ek4.class == obj.getClass()) {
            ek4 ek4Var = (ek4) obj;
            if (super.equals(ek4Var) && this.f7875d0 == ek4Var.f7875d0 && this.f7877f0 == ek4Var.f7877f0 && this.f7879h0 == ek4Var.f7879h0 && this.f7884m0 == ek4Var.f7884m0 && this.f7885n0 == ek4Var.f7885n0 && this.f7887p0 == ek4Var.f7887p0) {
                SparseBooleanArray sparseBooleanArray = this.f7889r0;
                SparseBooleanArray sparseBooleanArray2 = ek4Var.f7889r0;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.f7888q0;
                            SparseArray sparseArray2 = ek4Var.f7888q0;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                fj4 fj4Var = (fj4) entry.getKey();
                                                if (!map2.containsKey(fj4Var) || !sv2.b(entry.getValue(), map2.get(fj4Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i10) {
        return this.f7889r0.get(i10);
    }

    public final boolean g(int i10, fj4 fj4Var) {
        Map map = (Map) this.f7888q0.get(i10);
        return map != null && map.containsKey(fj4Var);
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.f7875d0 ? 1 : 0)) * 961) + (this.f7877f0 ? 1 : 0)) * 961) + (this.f7879h0 ? 1 : 0)) * 28629151) + (this.f7884m0 ? 1 : 0)) * 31) + (this.f7885n0 ? 1 : 0)) * 961) + (this.f7887p0 ? 1 : 0);
    }
}
