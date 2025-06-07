package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* loaded from: classes.dex */
final class sm4 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: r, reason: collision with root package name */
    private static final sm4 f15330r = new sm4();

    /* renamed from: m, reason: collision with root package name */
    public volatile long f15331m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f15332n;

    /* renamed from: o, reason: collision with root package name */
    private final HandlerThread f15333o;

    /* renamed from: p, reason: collision with root package name */
    private Choreographer f15334p;

    /* renamed from: q, reason: collision with root package name */
    private int f15335q;

    private sm4() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f15333o = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f15332n = handler;
        handler.sendEmptyMessage(0);
    }

    public static sm4 a() {
        return f15330r;
    }

    public final void b() {
        this.f15332n.sendEmptyMessage(1);
    }

    public final void c() {
        this.f15332n.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f15331m = j10;
        Choreographer choreographer = this.f15334p;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f15334p = Choreographer.getInstance();
            } catch (RuntimeException e5) {
                ad2.f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e5);
            }
            return true;
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f15334p;
            if (choreographer != null) {
                int i11 = this.f15335q + 1;
                this.f15335q = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f15334p;
        if (choreographer2 != null) {
            int i12 = this.f15335q - 1;
            this.f15335q = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f15331m = -9223372036854775807L;
            }
        }
        return true;
    }
}
