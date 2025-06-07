package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wf2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17114a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17115b;

    /* renamed from: c, reason: collision with root package name */
    private final bb3 f17116c;

    public wf2(m90 m90Var, Context context, String str, bb3 bb3Var) {
        this.f17114a = context;
        this.f17115b = str;
        this.f17116c = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f17116c.g(new Callable() { // from class: com.google.android.gms.internal.ads.vf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new xf2(new JSONObject());
            }
        });
    }
}
