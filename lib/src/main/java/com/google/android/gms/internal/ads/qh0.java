package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class qh0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f14312a;

    /* renamed from: b, reason: collision with root package name */
    private final ph0 f14313b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14314c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14315d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14316e;

    /* renamed from: f, reason: collision with root package name */
    private float f14317f = 1.0f;

    public qh0(Context context, ph0 ph0Var) {
        this.f14312a = (AudioManager) context.getSystemService("audio");
        this.f14313b = ph0Var;
    }

    private final void f() {
        boolean z10 = false;
        if (!this.f14315d || this.f14316e || this.f14317f <= 0.0f) {
            if (!this.f14314c) {
                return;
            }
            AudioManager audioManager = this.f14312a;
            if (audioManager != null) {
                if (audioManager.abandonAudioFocus(this) == 0) {
                    z10 = true;
                }
                this.f14314c = z10;
            }
        } else {
            if (this.f14314c) {
                return;
            }
            AudioManager audioManager2 = this.f14312a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z10 = true;
                }
                this.f14314c = z10;
            }
        }
        this.f14313b.m();
    }

    public final float a() {
        float f5 = this.f14316e ? 0.0f : this.f14317f;
        if (this.f14314c) {
            return f5;
        }
        return 0.0f;
    }

    public final void b() {
        this.f14315d = true;
        f();
    }

    public final void c() {
        this.f14315d = false;
        f();
    }

    public final void d(boolean z10) {
        this.f14316e = z10;
        f();
    }

    public final void e(float f5) {
        this.f14317f = f5;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f14314c = i10 > 0;
        this.f14313b.m();
    }
}
