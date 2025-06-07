package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class kg2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11032a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11033b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f11034c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f11035d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f11036e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f11037f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f11038g;

    public kg2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7) {
        this.f11032a = q44Var;
        this.f11033b = q44Var2;
        this.f11034c = q44Var3;
        this.f11035d = q44Var4;
        this.f11036e = q44Var5;
        this.f11037f = q44Var6;
        this.f11038g = q44Var7;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ae0 ae0Var = new ae0();
        int iIntValue = ((jh2) this.f11033b).b().intValue();
        Context contextA = ((qm0) this.f11034c).a();
        je0 je0Var = (je0) this.f11035d.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11036e.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new ig2(ae0Var, iIntValue, contextA, je0Var, scheduledExecutorService, bb3Var, ((ih2) this.f11038g).a());
    }
}
