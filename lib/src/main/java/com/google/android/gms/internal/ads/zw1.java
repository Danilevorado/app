package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class zw1 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nr2 f18784a;

    zw1(ax1 ax1Var, nr2 nr2Var) {
        this.f18784a = nr2Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        ze0.d("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f18784a.a((SQLiteDatabase) obj);
        } catch (Exception e5) {
            ze0.d("Error executing function on offline signal database: ".concat(String.valueOf(e5.getMessage())));
        }
    }
}
