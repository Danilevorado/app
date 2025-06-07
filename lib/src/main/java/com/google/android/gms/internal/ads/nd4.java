package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class nd4 extends AudioTrack.StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qd4 f12589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ od4 f12590b;

    nd4(od4 od4Var, qd4 qd4Var) {
        this.f12590b = od4Var;
        this.f12589a = qd4Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        if (audioTrack.equals(this.f12590b.f13165c.f14271r)) {
            qd4 qd4Var = this.f12590b.f13165c;
            if (qd4Var.f14267n == null || !qd4Var.N) {
                return;
            }
            qd4Var.f14267n.b();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f12590b.f13165c.f14271r)) {
            qd4 qd4Var = this.f12590b.f13165c;
            if (qd4Var.f14267n == null || !qd4Var.N) {
                return;
            }
            qd4Var.f14267n.b();
        }
    }
}
