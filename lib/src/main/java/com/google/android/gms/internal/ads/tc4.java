package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class tc4 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f15777a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f15778b = new AudioTimestamp();

    /* renamed from: c, reason: collision with root package name */
    private long f15779c;

    /* renamed from: d, reason: collision with root package name */
    private long f15780d;

    /* renamed from: e, reason: collision with root package name */
    private long f15781e;

    public tc4(AudioTrack audioTrack) {
        this.f15777a = audioTrack;
    }

    public final long a() {
        return this.f15781e;
    }

    public final long b() {
        return this.f15778b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f15777a.getTimestamp(this.f15778b);
        if (timestamp) {
            long j10 = this.f15778b.framePosition;
            if (this.f15780d > j10) {
                this.f15779c++;
            }
            this.f15780d = j10;
            this.f15781e = j10 + (this.f15779c << 32);
        }
        return timestamp;
    }
}
