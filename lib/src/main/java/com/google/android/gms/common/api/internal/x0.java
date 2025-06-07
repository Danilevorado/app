package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class x0 extends a1 {

    /* renamed from: b, reason: collision with root package name */
    protected final b f5824b;

    public x0(int i10, b bVar) {
        super(i10);
        this.f5824b = (b) e4.p.m(bVar, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void a(Status status) {
        try {
            this.f5824b.v(status);
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void b(Exception exc) {
        try {
            this.f5824b.v(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void c(m0 m0Var) throws DeadObjectException {
        try {
            this.f5824b.t(m0Var.s());
        } catch (RuntimeException e5) {
            b(e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void d(j jVar, boolean z10) {
        jVar.c(this.f5824b, z10);
    }
}
