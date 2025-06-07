package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes.dex */
final class b1 implements GoogleApiClient.c {

    /* renamed from: m, reason: collision with root package name */
    public final int f5650m;

    /* renamed from: n, reason: collision with root package name */
    public final GoogleApiClient f5651n;

    /* renamed from: o, reason: collision with root package name */
    public final GoogleApiClient.c f5652o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ c1 f5653p;

    public b1(c1 c1Var, int i10, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        this.f5653p = c1Var;
        this.f5650m = i10;
        this.f5651n = googleApiClient;
        this.f5652o = cVar;
    }

    @Override // d4.g
    public final void w0(b4.b bVar) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(bVar)));
        this.f5653p.s(bVar, this.f5650m);
    }
}
