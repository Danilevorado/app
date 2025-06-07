package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class lp2 implements o11 {

    /* renamed from: m, reason: collision with root package name */
    private final HashSet f11714m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final Context f11715n;

    /* renamed from: o, reason: collision with root package name */
    private final me0 f11716o;

    public lp2(Context context, me0 me0Var) {
        this.f11715n = context;
        this.f11716o = me0Var;
    }

    public final Bundle a() {
        return this.f11716o.l(this.f11715n, this);
    }

    public final synchronized void b(HashSet hashSet) {
        this.f11714m.clear();
        this.f11714m.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final synchronized void u(k3.w2 w2Var) {
        if (w2Var.f24788m != 3) {
            this.f11716o.j(this.f11714m);
        }
    }
}
