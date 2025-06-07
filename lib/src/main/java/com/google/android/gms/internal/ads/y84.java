package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y84 {

    /* renamed from: a, reason: collision with root package name */
    private final z54 f17935a;

    public y84(Context context, wj0 wj0Var) {
        this.f17935a = new z54(context, wj0Var);
    }

    public final y84 a(final v74 v74Var) {
        z54 z54Var = this.f17935a;
        gt1.f(!z54Var.f18432q);
        Objects.requireNonNull(v74Var);
        z54Var.f18421f = new z33() { // from class: com.google.android.gms.internal.ads.q54
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return v74Var;
            }
        };
        return this;
    }

    public final y84 b(final xk4 xk4Var) {
        z54 z54Var = this.f17935a;
        gt1.f(!z54Var.f18432q);
        Objects.requireNonNull(xk4Var);
        z54Var.f18420e = new z33() { // from class: com.google.android.gms.internal.ads.r54
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return xk4Var;
            }
        };
        return this;
    }

    public final z84 c() {
        z54 z54Var = this.f17935a;
        gt1.f(!z54Var.f18432q);
        z54Var.f18432q = true;
        return new z84(z54Var);
    }
}
