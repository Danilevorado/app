package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ni1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final j3.a f12647a;

    /* renamed from: b, reason: collision with root package name */
    private final al0 f12648b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f12649c;

    /* renamed from: d, reason: collision with root package name */
    private final xm1 f12650d;

    /* renamed from: e, reason: collision with root package name */
    private final ws2 f12651e;

    /* renamed from: f, reason: collision with root package name */
    private final jy1 f12652f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f12653g;

    /* renamed from: h, reason: collision with root package name */
    private final bg f12654h;

    /* renamed from: i, reason: collision with root package name */
    private final ff0 f12655i;

    /* renamed from: j, reason: collision with root package name */
    private final tu2 f12656j;

    public ni1(Context context, Executor executor, bg bgVar, ff0 ff0Var, j3.a aVar, al0 al0Var, jy1 jy1Var, tu2 tu2Var, xm1 xm1Var, ws2 ws2Var) {
        this.f12649c = context;
        this.f12653g = executor;
        this.f12654h = bgVar;
        this.f12655i = ff0Var;
        this.f12647a = aVar;
        this.f12648b = al0Var;
        this.f12652f = jy1Var;
        this.f12656j = tu2Var;
        this.f12650d = xm1Var;
        this.f12651e = ws2Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        qi1 qi1Var = new qi1(this);
        qi1Var.h();
        return qi1Var;
    }
}
