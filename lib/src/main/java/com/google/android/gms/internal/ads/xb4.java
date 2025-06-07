package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xb4 {

    /* renamed from: b, reason: collision with root package name */
    public static final xb4 f17502b;

    /* renamed from: a, reason: collision with root package name */
    private final wb4 f17503a;

    static {
        f17502b = sv2.f15560a < 31 ? new xb4() : new xb4(wb4.f17050b);
    }

    public xb4() {
        this.f17503a = null;
        gt1.f(sv2.f15560a < 31);
    }

    public xb4(LogSessionId logSessionId) {
        this.f17503a = new wb4(logSessionId);
    }

    private xb4(wb4 wb4Var) {
        this.f17503a = wb4Var;
    }

    public final LogSessionId a() {
        wb4 wb4Var = this.f17503a;
        Objects.requireNonNull(wb4Var);
        return wb4Var.f17051a;
    }
}
