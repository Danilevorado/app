package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class ik4 {

    /* renamed from: a, reason: collision with root package name */
    private final Spatializer f9780a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9781b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f9782c;

    /* renamed from: d, reason: collision with root package name */
    private Spatializer.OnSpatializerStateChangedListener f9783d;

    private ik4(Spatializer spatializer) {
        this.f9780a = spatializer;
        this.f9781b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static ik4 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new ik4(audioManager.getSpatializer());
    }

    public final void b(pk4 pk4Var, Looper looper) {
        if (this.f9783d == null && this.f9782c == null) {
            this.f9783d = new hk4(this, pk4Var);
            final Handler handler = new Handler(looper);
            this.f9782c = handler;
            this.f9780a.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.gk4
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f9783d);
        }
    }

    public final void c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f9783d;
        if (onSpatializerStateChangedListener == null || this.f9782c == null) {
            return;
        }
        this.f9780a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.f9782c;
        int i10 = sv2.f15560a;
        handler.removeCallbacksAndMessages(null);
        this.f9782c = null;
        this.f9783d = null;
    }

    public final boolean d(u74 u74Var, k9 k9Var) throws IllegalArgumentException {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(sv2.n(("audio/eac3-joc".equals(k9Var.f10898l) && k9Var.f10911y == 16) ? 12 : k9Var.f10911y));
        int i10 = k9Var.f10912z;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return this.f9780a.canBeSpatialized(u74Var.a().f16178a, channelMask.build());
    }

    public final boolean e() {
        return this.f9780a.isAvailable();
    }

    public final boolean f() {
        return this.f9780a.isEnabled();
    }

    public final boolean g() {
        return this.f9781b;
    }
}
