package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class w5 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x5 f19383a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w5(x5 x5Var, Handler handler) {
        super(null);
        this.f19383a = x5Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f19383a.e();
    }
}
