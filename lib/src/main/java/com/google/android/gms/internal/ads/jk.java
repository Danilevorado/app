package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class jk implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ View f10542m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ nk f10543n;

    jk(nk nkVar, View view) {
        this.f10543n = nkVar;
        this.f10542m = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10543n.c(this.f10542m);
    }
}
