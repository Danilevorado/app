package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class y2 extends s8 implements z9 {
    /* synthetic */ y2(v2 v2Var) {
        super(z2.zza);
    }

    public final int s() {
        return ((z2) this.f19277n).v();
    }

    public final y2 t(String str) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        z2.D((z2) this.f19277n, str);
        return this;
    }

    public final y2 u(int i10, b3 b3Var) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        z2.E((z2) this.f19277n, i10, b3Var);
        return this;
    }

    public final b3 v(int i10) {
        return ((z2) this.f19277n).z(i10);
    }

    public final String w() {
        return ((z2) this.f19277n).B();
    }
}
