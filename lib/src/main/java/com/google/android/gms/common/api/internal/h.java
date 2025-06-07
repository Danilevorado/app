package com.google.android.gms.common.api.internal;

import c4.c;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class h implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f5747a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f5748b;

    h(j jVar, BasePendingResult basePendingResult) {
        this.f5748b = jVar;
        this.f5747a = basePendingResult;
    }

    @Override // c4.c.a
    public final void a(Status status) {
        this.f5748b.f5754a.remove(this.f5747a);
    }
}
