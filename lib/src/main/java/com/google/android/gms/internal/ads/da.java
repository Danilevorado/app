package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class da implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final oa f7230m;

    /* renamed from: n, reason: collision with root package name */
    private final ua f7231n;

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f7232o;

    public da(oa oaVar, ua uaVar, Runnable runnable) {
        this.f7230m = oaVar;
        this.f7231n = uaVar;
        this.f7232o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7230m.B();
        ua uaVar = this.f7231n;
        if (uaVar.c()) {
            this.f7230m.t(uaVar.f16245a);
        } else {
            this.f7230m.s(uaVar.f16247c);
        }
        if (this.f7231n.f16248d) {
            this.f7230m.r("intermediate-response");
        } else {
            this.f7230m.u("done");
        }
        Runnable runnable = this.f7232o;
        if (runnable != null) {
            runnable.run();
        }
    }
}
