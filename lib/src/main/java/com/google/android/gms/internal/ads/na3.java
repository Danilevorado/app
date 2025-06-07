package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class na3 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final Future f12561m;

    /* renamed from: n, reason: collision with root package name */
    final ma3 f12562n;

    na3(Future future, ma3 ma3Var) {
        this.f12561m = future;
        this.f12562n = ma3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Object obj = this.f12561m;
        if ((obj instanceof ub3) && (thA = vb3.a((ub3) obj)) != null) {
            this.f12562n.a(thA);
            return;
        }
        try {
            this.f12562n.b(qa3.o(this.f12561m));
        } catch (Error e5) {
            e = e5;
            this.f12562n.a(e);
        } catch (RuntimeException e10) {
            e = e10;
            this.f12562n.a(e);
        } catch (ExecutionException e11) {
            this.f12562n.a(e11.getCause());
        }
    }

    public final String toString() {
        b33 b33VarA = c33.a(this);
        b33VarA.a(this.f12562n);
        return b33VarA.toString();
    }
}
