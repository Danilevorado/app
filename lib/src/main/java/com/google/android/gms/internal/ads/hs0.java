package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class hs0 implements fs0 {

    /* renamed from: a, reason: collision with root package name */
    private final m3.p1 f9406a;

    public hs0(m3.p1 p1Var) {
        this.f9406a = p1Var;
    }

    @Override // com.google.android.gms.internal.ads.fs0
    public final void a(Map map) {
        this.f9406a.H(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
