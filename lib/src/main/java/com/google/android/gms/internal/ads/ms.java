package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ms implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12230a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12231b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12232c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f12233d;

    public ms(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f12230a = q44Var;
        this.f12231b = q44Var2;
        this.f12232c = q44Var3;
        this.f12233d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* synthetic */ Object b() {
        return new ls(((qm0) this.f12230a).a(), (ScheduledExecutorService) this.f12231b.b(), new ns(), (au2) this.f12233d.b());
    }
}
