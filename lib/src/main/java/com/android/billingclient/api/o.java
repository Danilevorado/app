package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5249a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k1.f f5250b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f5251c;

    o(b bVar, String str, k1.f fVar) {
        this.f5249a = str;
        this.f5250b = fVar;
        this.f5251c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        s sVarY = b.Y(this.f5251c, this.f5249a);
        this.f5250b.a(sVarY.a(), sVarY.b());
        return null;
    }
}
