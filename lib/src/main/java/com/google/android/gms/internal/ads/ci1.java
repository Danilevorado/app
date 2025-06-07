package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class ci1 implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final tv f6932a;

    /* renamed from: b, reason: collision with root package name */
    private final qi1 f6933b;

    /* renamed from: c, reason: collision with root package name */
    private final w34 f6934c;

    public ci1(ae1 ae1Var, pd1 pd1Var, qi1 qi1Var, w34 w34Var) {
        this.f6932a = ae1Var.c(pd1Var.k0());
        this.f6933b = qi1Var;
        this.f6934c = w34Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f6932a.P0((jv) this.f6934c.b(), str);
        } catch (RemoteException e5) {
            ze0.h("Failed to call onCustomClick for asset " + str + ".", e5);
        }
    }

    public final void b() {
        if (this.f6932a == null) {
            return;
        }
        this.f6933b.i("/nativeAdCustomClick", this);
    }
}
