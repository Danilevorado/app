package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class fh0 {

    /* renamed from: b, reason: collision with root package name */
    private long f8283b;

    /* renamed from: a, reason: collision with root package name */
    private final long f8282a = TimeUnit.MILLISECONDS.toNanos(((Long) k3.w.c().b(ir.D)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f8284c = true;

    fh0() {
    }

    public final void a(SurfaceTexture surfaceTexture, final qg0 qg0Var) {
        if (qg0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f8284c || Math.abs(timestamp - this.f8283b) >= this.f8282a) {
            this.f8284c = false;
            this.f8283b = timestamp;
            m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eh0
                @Override // java.lang.Runnable
                public final void run() {
                    qg0Var.k();
                }
            });
        }
    }

    public final void b() {
        this.f8284c = true;
    }
}
