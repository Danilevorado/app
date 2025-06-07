package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class y0 extends d4.w {

    /* renamed from: b, reason: collision with root package name */
    private final f f5846b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.j f5847c;

    /* renamed from: d, reason: collision with root package name */
    private final d4.j f5848d;

    public y0(int i10, f fVar, b5.j jVar, d4.j jVar2) {
        super(i10);
        this.f5847c = jVar;
        this.f5846b = fVar;
        this.f5848d = jVar2;
        if (i10 == 2 && fVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void a(Status status) {
        this.f5847c.d(this.f5848d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void b(Exception exc) {
        this.f5847c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void c(m0 m0Var) throws DeadObjectException {
        try {
            this.f5846b.b(m0Var.s(), this.f5847c);
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e10) {
            a(a1.e(e10));
        } catch (RuntimeException e11) {
            this.f5847c.d(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void d(j jVar, boolean z10) {
        jVar.d(this.f5847c, z10);
    }

    @Override // d4.w
    public final boolean f(m0 m0Var) {
        return this.f5846b.c();
    }

    @Override // d4.w
    public final b4.d[] g(m0 m0Var) {
        return this.f5846b.e();
    }
}
