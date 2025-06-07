package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class xh2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f17560a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f17561b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f17562c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f17563d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f17564e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f17565f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f17566g;

    public xh2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7) {
        this.f17560a = q44Var;
        this.f17561b = q44Var2;
        this.f17562c = q44Var3;
        this.f17563d = q44Var4;
        this.f17564e = q44Var5;
        this.f17565f = q44Var6;
        this.f17566g = q44Var7;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        je0 je0Var = (je0) this.f17560a.b();
        boolean zBooleanValue = ((lh2) this.f17561b).b().booleanValue();
        boolean zBooleanValue2 = ((mh2) this.f17562c).b().booleanValue();
        yd0 yd0Var = new yd0();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new vh2(je0Var, zBooleanValue, zBooleanValue2, yd0Var, bb3Var, ((ih2) this.f17565f).a(), (ScheduledExecutorService) this.f17566g.b());
    }
}
