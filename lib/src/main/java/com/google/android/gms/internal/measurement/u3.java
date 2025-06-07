package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u3 extends s8 implements z9 {
    /* synthetic */ u3(o3 o3Var) {
        super(v3.zza);
    }

    public final int s() {
        return ((v3) this.f19277n).w();
    }

    public final t3 t(int i10) {
        return ((v3) this.f19277n).y(i10);
    }

    public final u3 u() {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        ((v3) this.f19277n).zzk = u8.i();
        return this;
    }

    public final u3 v(int i10, s3 s3Var) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        v3.I((v3) this.f19277n, i10, (t3) s3Var.k());
        return this;
    }

    public final String w() {
        return ((v3) this.f19277n).D();
    }

    public final List x() {
        return Collections.unmodifiableList(((v3) this.f19277n).E());
    }

    public final List y() {
        return Collections.unmodifiableList(((v3) this.f19277n).F());
    }
}
