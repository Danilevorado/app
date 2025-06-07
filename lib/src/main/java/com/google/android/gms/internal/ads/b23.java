package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class b23 extends x13 {

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ h23 f6316n;

    b23(h23 h23Var) {
        this.f6316n = h23Var;
    }

    @Override // com.google.android.gms.internal.ads.x13
    public final void a() {
        synchronized (this.f6316n.f8973f) {
            if (this.f6316n.f8978k.get() > 0 && this.f6316n.f8978k.decrementAndGet() > 0) {
                this.f6316n.f8969b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            h23 h23Var = this.f6316n;
            if (h23Var.f8980m != null) {
                h23Var.f8969b.c("Unbind from service.", new Object[0]);
                h23 h23Var2 = this.f6316n;
                h23Var2.f8968a.unbindService(h23Var2.f8979l);
                this.f6316n.f8974g = false;
                this.f6316n.f8980m = null;
                this.f6316n.f8979l = null;
            }
            this.f6316n.w();
        }
    }
}
