package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class y9 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ oa f17936m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ z9 f17937n;

    y9(z9 z9Var, oa oaVar) {
        this.f17937n = z9Var;
        this.f17936m = oaVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f17937n.f18486n.put(this.f17936m);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
