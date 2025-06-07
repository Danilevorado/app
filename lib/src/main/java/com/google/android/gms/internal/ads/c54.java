package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class c54 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f6780a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e54 f6781b;

    public c54(e54 e54Var, Handler handler) {
        this.f6781b = e54Var;
        this.f6780a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.f6780a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.b54
            @Override // java.lang.Runnable
            public final void run() {
                c54 c54Var = this.f6344m;
                e54.c(c54Var.f6781b, i10);
            }
        });
    }
}
