package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes.dex */
final class zo1 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp1 f18675a;

    zo1(bp1 bp1Var) {
        this.f18675a = bp1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        synchronized (this) {
            this.f18675a.f6613c = true;
            this.f18675a.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (j3.t.b().b() - this.f18675a.f6614d));
            this.f18675a.f6615e.f(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.f18675a.f6613c = true;
            this.f18675a.v("com.google.android.gms.ads.MobileAds", true, "", (int) (j3.t.b().b() - this.f18675a.f6614d));
            this.f18675a.f6619i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yo1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zo1 zo1Var = this.f18238m;
                    bp1.j(zo1Var.f18675a, str);
                }
            });
        }
    }
}
