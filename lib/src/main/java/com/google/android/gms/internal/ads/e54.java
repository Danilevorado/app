package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
final class e54 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f7638a;

    /* renamed from: b, reason: collision with root package name */
    private final c54 f7639b;

    /* renamed from: c, reason: collision with root package name */
    private d54 f7640c;

    /* renamed from: d, reason: collision with root package name */
    private int f7641d;

    /* renamed from: e, reason: collision with root package name */
    private float f7642e = 1.0f;

    public e54(Context context, Handler handler, d54 d54Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f7638a = audioManager;
        this.f7640c = d54Var;
        this.f7639b = new c54(this, handler);
        this.f7641d = 0;
    }

    static /* bridge */ /* synthetic */ void c(e54 e54Var, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                e54Var.g(3);
                return;
            } else {
                e54Var.f(0);
                e54Var.g(2);
                return;
            }
        }
        if (i10 == -1) {
            e54Var.f(-1);
            e54Var.e();
        } else if (i10 == 1) {
            e54Var.g(1);
            e54Var.f(1);
        } else {
            ad2.e("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private final void e() {
        if (this.f7641d == 0) {
            return;
        }
        if (sv2.f15560a < 26) {
            this.f7638a.abandonAudioFocus(this.f7639b);
        }
        g(0);
    }

    private final void f(int i10) {
        d54 d54Var = this.f7640c;
        if (d54Var != null) {
            f74 f74Var = (f74) d54Var;
            boolean zV = f74Var.f8165m.v();
            f74Var.f8165m.q0(zV, i10, j74.d0(zV, i10));
        }
    }

    private final void g(int i10) {
        if (this.f7641d == i10) {
            return;
        }
        this.f7641d = i10;
        float f5 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f7642e == f5) {
            return;
        }
        this.f7642e = f5;
        d54 d54Var = this.f7640c;
        if (d54Var != null) {
            ((f74) d54Var).f8165m.n0();
        }
    }

    public final float a() {
        return this.f7642e;
    }

    public final int b(boolean z10, int i10) {
        e();
        return z10 ? 1 : -1;
    }

    public final void d() {
        this.f7640c = null;
        e();
    }
}
