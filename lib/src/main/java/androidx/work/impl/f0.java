package androidx.work.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class f0 extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    private final Context f4150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(9, 10);
        rb.h.e(context, "context");
        this.f4150c = context;
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        h1.m.c(this.f4150c, gVar);
        h1.h.c(this.f4150c, gVar);
    }
}
