package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cj0 extends yi0 {
    public cj0(lh0 lh0Var) {
        super(lh0Var);
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final boolean w(String str) {
        String strG = se0.g(str);
        lh0 lh0Var = (lh0) this.f18054o.get();
        if (lh0Var != null && strG != null) {
            lh0Var.F(strG, this);
        }
        ze0.g("VideoStreamNoopCache is doing nothing.");
        l(str, strG, "noop", "Noop cache is a noop.");
        return false;
    }
}
