package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class r92 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f14698a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14699b;

    public r92(bb3 bb3Var, Context context) {
        this.f14698a = bb3Var;
        this.f14699b = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f14698a.g(new Callable() { // from class: com.google.android.gms.internal.ads.q92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14204a.c();
            }
        });
    }

    final /* synthetic */ s92 c() {
        int i10;
        AudioManager audioManager = (AudioManager) this.f14699b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = -1;
        if (((Boolean) k3.w.c().b(ir.f10064q9)).booleanValue()) {
            i10 = j3.t.s().i(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = -1;
        }
        return new s92(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i10, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), j3.t.t().a(), j3.t.t().e());
    }
}
