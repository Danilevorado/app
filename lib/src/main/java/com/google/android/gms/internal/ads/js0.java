package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class js0 implements fs0 {

    /* renamed from: a, reason: collision with root package name */
    private final m3.p1 f10682a;

    public js0(m3.p1 p1Var) {
        this.f10682a = p1Var;
    }

    @Override // com.google.android.gms.internal.ads.fs0
    public final void a(Map map) {
        this.f10682a.A(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
