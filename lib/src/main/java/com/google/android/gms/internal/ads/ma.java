package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ma implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f12024m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f12025n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ oa f12026o;

    ma(oa oaVar, String str, long j10) {
        this.f12026o = oaVar;
        this.f12024m = str;
        this.f12025n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12026o.f13104m.a(this.f12024m, this.f12025n);
        oa oaVar = this.f12026o;
        oaVar.f13104m.b(oaVar.toString());
    }
}
