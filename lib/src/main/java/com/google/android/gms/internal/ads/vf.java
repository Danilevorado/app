package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vf implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ wf f16675m;

    vf(wf wfVar) {
        this.f16675m = wfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f16675m.f17112b != null) {
            return;
        }
        synchronized (wf.f17108c) {
            if (this.f16675m.f17112b != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) ir.f9959h2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    wf.f17109d = hz2.b(this.f16675m.f17111a.f7297a, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.f16675m.f17112b = Boolean.valueOf(z10);
            wf.f17108c.open();
        }
    }
}
