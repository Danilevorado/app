package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class iy1 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nr2 f10216a;

    iy1(jy1 jy1Var, nr2 nr2Var) {
        this.f10216a = nr2Var;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        ze0.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f10216a.a((SQLiteDatabase) obj);
        } catch (Exception e5) {
            ze0.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e5.getMessage())));
        }
    }
}
