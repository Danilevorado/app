package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class z91 extends ex0 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f18491i;

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference f18492j;

    /* renamed from: k, reason: collision with root package name */
    private final m81 f18493k;

    /* renamed from: l, reason: collision with root package name */
    private final jb1 f18494l;

    /* renamed from: m, reason: collision with root package name */
    private final yx0 f18495m;

    /* renamed from: n, reason: collision with root package name */
    private final ox2 f18496n;

    /* renamed from: o, reason: collision with root package name */
    private final y11 f18497o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18498p;

    z91(cx0 cx0Var, Context context, nk0 nk0Var, m81 m81Var, jb1 jb1Var, yx0 yx0Var, ox2 ox2Var, y11 y11Var) {
        super(cx0Var);
        this.f18498p = false;
        this.f18491i = context;
        this.f18492j = new WeakReference(nk0Var);
        this.f18493k = m81Var;
        this.f18494l = jb1Var;
        this.f18495m = yx0Var;
        this.f18496n = ox2Var;
        this.f18497o = y11Var;
    }

    public final void finalize() throws Throwable {
        try {
            final nk0 nk0Var = (nk0) this.f18492j.get();
            if (((Boolean) k3.w.c().b(ir.f10083s6)).booleanValue()) {
                if (!this.f18498p && nk0Var != null) {
                    of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.y91
                        @Override // java.lang.Runnable
                        public final void run() {
                            nk0Var.destroy();
                        }
                    });
                }
            } else if (nk0Var != null) {
                nk0Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean h() {
        return this.f18495m.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.m81 r0 = r4.f18493k
            r0.b()
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.A0
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4d
            j3.t.r()
            android.content.Context r0 = r4.f18491i
            boolean r0 = m3.b2.b(r0)
            if (r0 == 0) goto L4d
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.ze0.g(r5)
            com.google.android.gms.internal.ads.y11 r5 = r4.f18497o
            r5.b()
            com.google.android.gms.internal.ads.zq r5 = com.google.android.gms.internal.ads.ir.B0
            com.google.android.gms.internal.ads.gr r6 = k3.w.c()
            java.lang.Object r5 = r6.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L80
            com.google.android.gms.internal.ads.ox2 r5 = r4.f18496n
            com.google.android.gms.internal.ads.un2 r6 = r4.f8015a
            com.google.android.gms.internal.ads.tn2 r6 = r6.f16413b
            com.google.android.gms.internal.ads.ln2 r6 = r6.f15924b
            java.lang.String r6 = r6.f11674b
            r5.a(r6)
            goto L80
        L4d:
            boolean r0 = r4.f18498p
            if (r0 == 0) goto L62
            java.lang.String r0 = "The interstitial ad has been showed."
            com.google.android.gms.internal.ads.ze0.g(r0)
            com.google.android.gms.internal.ads.y11 r0 = r4.f18497o
            r2 = 10
            r3 = 0
            k3.w2 r2 = com.google.android.gms.internal.ads.fp2.d(r2, r3, r3)
            r0.u(r2)
        L62:
            boolean r0 = r4.f18498p
            if (r0 != 0) goto L80
            if (r6 != 0) goto L6a
            android.content.Context r6 = r4.f18491i
        L6a:
            com.google.android.gms.internal.ads.jb1 r0 = r4.f18494l     // Catch: com.google.android.gms.internal.ads.ib1 -> L7a
            com.google.android.gms.internal.ads.y11 r2 = r4.f18497o     // Catch: com.google.android.gms.internal.ads.ib1 -> L7a
            r0.a(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.ib1 -> L7a
            com.google.android.gms.internal.ads.m81 r5 = r4.f18493k     // Catch: com.google.android.gms.internal.ads.ib1 -> L7a
            r5.a()     // Catch: com.google.android.gms.internal.ads.ib1 -> L7a
            r5 = 1
            r4.f18498p = r5
            return r5
        L7a:
            r5 = move-exception
            com.google.android.gms.internal.ads.y11 r6 = r4.f18497o
            r6.h0(r5)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z91.i(boolean, android.app.Activity):boolean");
    }
}
