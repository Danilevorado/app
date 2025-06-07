package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
final class gg0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f8708m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ pg0 f8709n;

    gg0(pg0 pg0Var, MediaPlayer mediaPlayer) {
        this.f8709n = pg0Var;
        this.f8708m = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pg0.L(this.f8709n, this.f8708m);
        pg0 pg0Var = this.f8709n;
        if (pg0Var.B != null) {
            pg0Var.B.e();
        }
    }
}
