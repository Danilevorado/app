package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class oy implements l3.c0 {

    /* renamed from: a, reason: collision with root package name */
    boolean f13452a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13453b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k3.a f13454c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f13455d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f13456e;

    oy(qy qyVar, boolean z10, k3.a aVar, Map map, Map map2) {
        this.f13453b = z10;
        this.f13454c = aVar;
        this.f13455d = map;
        this.f13456e = map2;
    }

    @Override // l3.c0
    public final void K(int i10) {
    }

    @Override // l3.c0
    public final void a(boolean z10) {
        if (this.f13452a) {
            return;
        }
        if (z10 && this.f13453b) {
            ((f91) this.f13454c).r();
        }
        this.f13452a = true;
        this.f13455d.put((String) this.f13456e.get("event_id"), Boolean.valueOf(z10));
        ((p00) this.f13454c).c("openIntentAsync", this.f13455d);
    }
}
