package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i4 extends s8 implements z9 {
    /* synthetic */ i4(a4 a4Var) {
        super(j4.zza);
    }

    public final i4 A(String str) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.J((j4) this.f19277n, str);
        return this;
    }

    public final i4 B(int i10, m4 m4Var) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.E((j4) this.f19277n, i10, (n4) m4Var.k());
        return this;
    }

    public final i4 C(int i10, n4 n4Var) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.E((j4) this.f19277n, i10, n4Var);
        return this;
    }

    public final i4 D(long j10) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.L((j4) this.f19277n, j10);
        return this;
    }

    public final i4 E(long j10) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.K((j4) this.f19277n, j10);
        return this;
    }

    public final n4 F(int i10) {
        return ((j4) this.f19277n).B(i10);
    }

    public final String G() {
        return ((j4) this.f19277n).C();
    }

    public final List H() {
        return Collections.unmodifiableList(((j4) this.f19277n).D());
    }

    public final boolean I() {
        return ((j4) this.f19277n).O();
    }

    public final int s() {
        return ((j4) this.f19277n).w();
    }

    public final long t() {
        return ((j4) this.f19277n).x();
    }

    public final long u() {
        return ((j4) this.f19277n).y();
    }

    public final i4 v(Iterable iterable) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.G((j4) this.f19277n, iterable);
        return this;
    }

    public final i4 w(m4 m4Var) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.F((j4) this.f19277n, (n4) m4Var.k());
        return this;
    }

    public final i4 x(n4 n4Var) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.F((j4) this.f19277n, n4Var);
        return this;
    }

    public final i4 y() {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        ((j4) this.f19277n).zzf = u8.i();
        return this;
    }

    public final i4 z(int i10) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        j4.I((j4) this.f19277n, i10);
        return this;
    }
}
