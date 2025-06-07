package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class uv extends dj implements wv {
    uv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final void b2(jv jvVar) {
        Parcel parcelC = C();
        fj.f(parcelC, jvVar);
        L0(1, parcelC);
    }
}
