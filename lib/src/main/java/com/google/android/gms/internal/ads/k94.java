package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k94 {

    /* renamed from: a, reason: collision with root package name */
    private final g4 f10932a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f10933b;

    public k94(g4 g4Var, SparseArray sparseArray) {
        this.f10932a = g4Var;
        SparseArray sparseArray2 = new SparseArray(g4Var.b());
        for (int i10 = 0; i10 < g4Var.b(); i10++) {
            int iA = g4Var.a(i10);
            j94 j94Var = (j94) sparseArray.get(iA);
            Objects.requireNonNull(j94Var);
            sparseArray2.append(iA, j94Var);
        }
        this.f10933b = sparseArray2;
    }

    public final int a(int i10) {
        return this.f10932a.a(i10);
    }

    public final int b() {
        return this.f10932a.b();
    }

    public final j94 c(int i10) {
        j94 j94Var = (j94) this.f10933b.get(i10);
        Objects.requireNonNull(j94Var);
        return j94Var;
    }

    public final boolean d(int i10) {
        return this.f10932a.c(i10);
    }
}
