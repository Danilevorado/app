package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
final class ry1 extends TimerTask {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AlertDialog f15007m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Timer f15008n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ l3.r f15009o;

    ry1(AlertDialog alertDialog, Timer timer, l3.r rVar) {
        this.f15007m = alertDialog;
        this.f15008n = timer;
        this.f15009o = rVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f15007m.dismiss();
        this.f15008n.cancel();
        l3.r rVar = this.f15009o;
        if (rVar != null) {
            rVar.b();
        }
    }
}
