package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* loaded from: classes.dex */
final class hk4 implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pk4 f9167a;

    hk4(ik4 ik4Var, pk4 pk4Var) {
        this.f9167a = pk4Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f9167a.t();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f9167a.t();
    }
}
