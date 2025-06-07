package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class sz2 implements t53 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15609a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f15610b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f15611c;

    /* renamed from: d, reason: collision with root package name */
    private ib3 f15612d;

    protected sz2(boolean z10) {
        this.f15609a = z10;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void b(wy3 wy3Var) {
        Objects.requireNonNull(wy3Var);
        if (this.f15610b.contains(wy3Var)) {
            return;
        }
        this.f15610b.add(wy3Var);
        this.f15611c++;
    }

    @Override // com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public /* synthetic */ Map c() {
        return Collections.emptyMap();
    }

    protected final void g() {
        ib3 ib3Var = this.f15612d;
        int i10 = sv2.f15560a;
        for (int i11 = 0; i11 < this.f15611c; i11++) {
            ((wy3) this.f15610b.get(i11)).k(this, ib3Var, this.f15609a);
        }
        this.f15612d = null;
    }

    protected final void h(ib3 ib3Var) {
        for (int i10 = 0; i10 < this.f15611c; i10++) {
            ((wy3) this.f15610b.get(i10)).m(this, ib3Var, this.f15609a);
        }
    }

    protected final void i(ib3 ib3Var) {
        this.f15612d = ib3Var;
        for (int i10 = 0; i10 < this.f15611c; i10++) {
            ((wy3) this.f15610b.get(i10)).c(this, ib3Var, this.f15609a);
        }
    }

    protected final void w(int i10) {
        ib3 ib3Var = this.f15612d;
        int i11 = sv2.f15560a;
        for (int i12 = 0; i12 < this.f15611c; i12++) {
            ((wy3) this.f15610b.get(i12)).i(this, ib3Var, this.f15609a, i10);
        }
    }
}
