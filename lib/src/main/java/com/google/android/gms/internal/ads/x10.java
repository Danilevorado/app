package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class x10 implements xf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y10 f17338a;

    x10(y10 y10Var) {
        this.f17338a = y10Var;
    }

    @Override // com.google.android.gms.internal.ads.xf0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final u00 u00Var = (u00) obj;
        of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.w10
            @Override // java.lang.Runnable
            public final void run() {
                u00 u00Var2 = u00Var;
                u00Var2.C("/result", fy.f8490o);
                u00Var2.d();
            }
        });
    }
}
