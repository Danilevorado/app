package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mg2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    final bb3 f12094a;

    /* renamed from: b, reason: collision with root package name */
    final Context f12095b;

    /* renamed from: c, reason: collision with root package name */
    final em f12096c;

    public mg2(em emVar, bb3 bb3Var, Context context) {
        this.f12096c = emVar;
        this.f12094a = bb3Var;
        this.f12095b = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f12094a.g(new Callable() { // from class: com.google.android.gms.internal.ads.lg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ng2(new JSONObject());
            }
        });
    }
}
