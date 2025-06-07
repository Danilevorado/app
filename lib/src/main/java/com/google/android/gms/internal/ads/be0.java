package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class be0 {

    /* renamed from: a, reason: collision with root package name */
    private long f6436a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f6437b = -1;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ce0 f6438c;

    public be0(ce0 ce0Var) {
        this.f6438c = ce0Var;
    }

    public final long a() {
        return this.f6437b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f6436a);
        bundle.putLong("tclose", this.f6437b);
        return bundle;
    }

    public final void c() {
        this.f6437b = this.f6438c.f6884a.b();
    }

    public final void d() {
        this.f6436a = this.f6438c.f6884a.b();
    }
}
