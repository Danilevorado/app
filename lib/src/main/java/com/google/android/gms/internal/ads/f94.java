package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class f94 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8191a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f8192b;

    /* renamed from: c, reason: collision with root package name */
    private final b94 f8193c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f8194d;

    /* renamed from: e, reason: collision with root package name */
    private e94 f8195e;

    /* renamed from: f, reason: collision with root package name */
    private int f8196f;

    /* renamed from: g, reason: collision with root package name */
    private int f8197g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8198h;

    public f94(Context context, Handler handler, b94 b94Var) {
        Context applicationContext = context.getApplicationContext();
        this.f8191a = applicationContext;
        this.f8192b = handler;
        this.f8193c = b94Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        gt1.b(audioManager);
        this.f8194d = audioManager;
        this.f8196f = 3;
        this.f8197g = g(audioManager, 3);
        this.f8198h = i(audioManager, this.f8196f);
        e94 e94Var = new e94(this, null);
        try {
            applicationContext.registerReceiver(e94Var, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f8195e = e94Var;
        } catch (RuntimeException e5) {
            ad2.f("StreamVolumeManager", "Error registering stream volume receiver", e5);
        }
    }

    private static int g(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e5) {
            ad2.f("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e5);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        final int iG = g(this.f8194d, this.f8196f);
        final boolean zI = i(this.f8194d, this.f8196f);
        if (this.f8197g == iG && this.f8198h == zI) {
            return;
        }
        this.f8197g = iG;
        this.f8198h = zI;
        x92 x92Var = ((f74) this.f8193c).f8165m.f10357k;
        x92Var.d(30, new u62() { // from class: com.google.android.gms.internal.ads.a74
            @Override // com.google.android.gms.internal.ads.u62
            public final void a(Object obj) {
                ((xq0) obj).C0(iG, zI);
            }
        });
        x92Var.c();
    }

    private static boolean i(AudioManager audioManager, int i10) {
        return sv2.f15560a >= 23 ? audioManager.isStreamMute(i10) : g(audioManager, i10) == 0;
    }

    public final int a() {
        return this.f8194d.getStreamMaxVolume(this.f8196f);
    }

    public final int b() {
        if (sv2.f15560a >= 28) {
            return this.f8194d.getStreamMinVolume(this.f8196f);
        }
        return 0;
    }

    public final void e() {
        e94 e94Var = this.f8195e;
        if (e94Var != null) {
            try {
                this.f8191a.unregisterReceiver(e94Var);
            } catch (RuntimeException e5) {
                ad2.f("StreamVolumeManager", "Error unregistering stream volume receiver", e5);
            }
            this.f8195e = null;
        }
    }

    public final void f(int i10) {
        if (this.f8196f == 3) {
            return;
        }
        this.f8196f = 3;
        h();
        f74 f74Var = (f74) this.f8193c;
        final al4 al4VarI0 = j74.i0(f74Var.f8165m.f10371y);
        if (al4VarI0.equals(f74Var.f8165m.f10340a0)) {
            return;
        }
        f74Var.f8165m.f10340a0 = al4VarI0;
        x92 x92Var = f74Var.f8165m.f10357k;
        x92Var.d(29, new u62() { // from class: com.google.android.gms.internal.ads.b74
            @Override // com.google.android.gms.internal.ads.u62
            public final void a(Object obj) {
                ((xq0) obj).I0(al4VarI0);
            }
        });
        x92Var.c();
    }
}
