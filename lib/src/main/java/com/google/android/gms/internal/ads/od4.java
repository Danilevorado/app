package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class od4 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f13163a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AudioTrack.StreamEventCallback f13164b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ qd4 f13165c;

    public od4(qd4 qd4Var) {
        this.f13165c = qd4Var;
        this.f13164b = new nd4(this, qd4Var);
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f13163a;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.md4
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f13164b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13164b);
        this.f13163a.removeCallbacksAndMessages(null);
    }
}
