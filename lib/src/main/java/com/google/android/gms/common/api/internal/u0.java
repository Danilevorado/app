package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
abstract class u0 extends d4.w {

    /* renamed from: b, reason: collision with root package name */
    protected final b5.j f5816b;

    public u0(int i10, b5.j jVar) {
        super(i10);
        this.f5816b = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void a(Status status) {
        this.f5816b.d(new c4.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void b(Exception exc) {
        this.f5816b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void c(m0 m0Var) throws DeadObjectException {
        try {
            h(m0Var);
        } catch (DeadObjectException e5) {
            a(a1.e(e5));
            throw e5;
        } catch (RemoteException e10) {
            a(a1.e(e10));
        } catch (RuntimeException e11) {
            this.f5816b.d(e11);
        }
    }

    protected abstract void h(m0 m0Var);
}
