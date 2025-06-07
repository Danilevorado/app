package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class kh extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lh f11042a;

    kh(lh lhVar) {
        this.f11042a = lhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f11042a.f();
    }
}
