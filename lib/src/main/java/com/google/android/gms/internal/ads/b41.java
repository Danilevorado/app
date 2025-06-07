package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class b41 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final WeakReference f6329m;

    @Override // java.lang.Runnable
    public final void run() {
        c41 c41Var = (c41) this.f6329m.get();
        if (c41Var != null) {
            c41Var.q0(new y61() { // from class: com.google.android.gms.internal.ads.z31
                @Override // com.google.android.gms.internal.ads.y61
                public final void a(Object obj) {
                    ((d41) obj).a();
                }
            });
        }
    }
}
