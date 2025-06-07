package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes.dex */
public final class ff4 {

    /* renamed from: a, reason: collision with root package name */
    public final kf4 f8268a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f8269b;

    /* renamed from: c, reason: collision with root package name */
    public final k9 f8270c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f8271d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f8272e = null;

    private ff4(kf4 kf4Var, MediaFormat mediaFormat, k9 k9Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f8268a = kf4Var;
        this.f8269b = mediaFormat;
        this.f8270c = k9Var;
        this.f8271d = surface;
    }

    public static ff4 a(kf4 kf4Var, MediaFormat mediaFormat, k9 k9Var, MediaCrypto mediaCrypto) {
        return new ff4(kf4Var, mediaFormat, k9Var, null, null, 0);
    }

    public static ff4 b(kf4 kf4Var, MediaFormat mediaFormat, k9 k9Var, Surface surface, MediaCrypto mediaCrypto) {
        return new ff4(kf4Var, mediaFormat, k9Var, surface, null, 0);
    }
}
