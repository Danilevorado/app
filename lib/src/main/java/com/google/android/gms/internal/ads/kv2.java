package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class kv2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11251a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f11252b;

    /* renamed from: c, reason: collision with root package name */
    private final iv2 f11253c;

    /* renamed from: d, reason: collision with root package name */
    private float f11254d;

    /* renamed from: e, reason: collision with root package name */
    private final tv2 f11255e;

    public kv2(Handler handler, Context context, iv2 iv2Var, tv2 tv2Var) {
        super(handler);
        this.f11251a = context;
        this.f11252b = (AudioManager) context.getSystemService("audio");
        this.f11253c = iv2Var;
        this.f11255e = tv2Var;
    }

    private final float c() {
        int streamVolume = this.f11252b.getStreamVolume(3);
        int streamMaxVolume = this.f11252b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f5 = streamVolume / streamMaxVolume;
        if (f5 > 1.0f) {
            return 1.0f;
        }
        return f5;
    }

    private final void d() {
        this.f11255e.d(this.f11254d);
    }

    public final void a() {
        this.f11254d = c();
        d();
        this.f11251a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f11251a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (fC != this.f11254d) {
            this.f11254d = fC;
            d();
        }
    }
}
