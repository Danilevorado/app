package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class g1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: n, reason: collision with root package name */
    protected volatile boolean f5743n;

    /* renamed from: o, reason: collision with root package name */
    protected final AtomicReference f5744o;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f5745p;

    /* renamed from: q, reason: collision with root package name */
    protected final b4.e f5746q;

    g1(d4.f fVar, b4.e eVar) {
        super(fVar);
        this.f5744o = new AtomicReference(null);
        this.f5745p = new p4.l(Looper.getMainLooper());
        this.f5746q = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(b4.b bVar, int i10) {
        this.f5744o.set(null);
        m(bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f5744o.set(null);
        n();
    }

    private static final int p(d1 d1Var) {
        if (d1Var == null) {
            return -1;
        }
        return d1Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i10, int i11, Intent intent) {
        d1 d1Var = (d1) this.f5744o.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int i12 = this.f5746q.i(b());
                if (i12 == 0) {
                    o();
                    return;
                } else {
                    if (d1Var == null) {
                        return;
                    }
                    if (d1Var.b().f() == 18 && i12 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (d1Var != null) {
                l(new b4.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, d1Var.b().toString()), p(d1Var));
                return;
            }
            return;
        }
        if (d1Var != null) {
            l(d1Var.b(), d1Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f5744o.set(bundle.getBoolean("resolving_error", false) ? new d1(new b4.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        d1 d1Var = (d1) this.f5744o.get();
        if (d1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", d1Var.a());
        bundle.putInt("failed_status", d1Var.b().f());
        bundle.putParcelable("failed_resolution", d1Var.b().v());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f5743n = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f5743n = false;
    }

    protected abstract void m(b4.b bVar, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new b4.b(13, null), p((d1) this.f5744o.get()));
    }

    public final void s(b4.b bVar, int i10) {
        AtomicReference atomicReference;
        d1 d1Var = new d1(bVar, i10);
        do {
            atomicReference = this.f5744o;
            if (atomicReference.compareAndSet(null, d1Var)) {
                this.f5745p.post(new f1(this, d1Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
