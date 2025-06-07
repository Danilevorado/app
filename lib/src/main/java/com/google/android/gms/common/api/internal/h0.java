package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;

/* loaded from: classes.dex */
final class h0 implements a.InterfaceC0094a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f5749a;

    h0(c cVar) {
        this.f5749a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0094a
    public final void a(boolean z10) {
        c cVar = this.f5749a;
        cVar.f5667z.sendMessage(cVar.f5667z.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
