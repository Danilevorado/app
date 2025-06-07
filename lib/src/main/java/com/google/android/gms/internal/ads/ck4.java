package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ck4 extends m71 {

    /* renamed from: q, reason: collision with root package name */
    private boolean f6967q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6968r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6969s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6970t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6971u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6972v;

    /* renamed from: w, reason: collision with root package name */
    private final SparseArray f6973w;

    /* renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f6974x;

    public ck4() {
        this.f6973w = new SparseArray();
        this.f6974x = new SparseBooleanArray();
        v();
    }

    public ck4(Context context) throws ClassNotFoundException, NumberFormatException {
        super.d(context);
        Point pointZ = sv2.z(context);
        e(pointZ.x, pointZ.y, true);
        this.f6973w = new SparseArray();
        this.f6974x = new SparseBooleanArray();
        v();
    }

    /* synthetic */ ck4(ek4 ek4Var, bk4 bk4Var) {
        super(ek4Var);
        this.f6967q = ek4Var.f7875d0;
        this.f6968r = ek4Var.f7877f0;
        this.f6969s = ek4Var.f7879h0;
        this.f6970t = ek4Var.f7884m0;
        this.f6971u = ek4Var.f7885n0;
        this.f6972v = ek4Var.f7887p0;
        SparseArray sparseArray = ek4Var.f7888q0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.f6973w = sparseArray2;
        this.f6974x = ek4Var.f7889r0.clone();
    }

    private final void v() {
        this.f6967q = true;
        this.f6968r = true;
        this.f6969s = true;
        this.f6970t = true;
        this.f6971u = true;
        this.f6972v = true;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final /* synthetic */ m71 e(int i10, int i11, boolean z10) {
        super.e(i10, i11, true);
        return this;
    }

    public final ck4 o(int i10, boolean z10) {
        if (this.f6974x.get(i10) == z10) {
            return this;
        }
        if (z10) {
            this.f6974x.put(i10, true);
        } else {
            this.f6974x.delete(i10);
        }
        return this;
    }
}
