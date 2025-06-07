package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class fd4 {

    /* renamed from: a, reason: collision with root package name */
    public final k9 f8235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8238d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8239e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8240f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8241g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8242h;

    /* renamed from: i, reason: collision with root package name */
    public final wi1 f8243i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8244j = false;

    public fd4(k9 k9Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, wi1 wi1Var, boolean z10) {
        this.f8235a = k9Var;
        this.f8236b = i10;
        this.f8237c = i11;
        this.f8238d = i12;
        this.f8239e = i13;
        this.f8240f = i14;
        this.f8241g = i15;
        this.f8242h = i16;
        this.f8243i = wi1Var;
    }

    public final long a(long j10) {
        return (j10 * 1000000) / this.f8239e;
    }

    public final AudioTrack b(boolean z10, u74 u74Var, int i10) throws UnsupportedOperationException, oc4 {
        AudioTrack audioTrack;
        try {
            int i11 = sv2.f15560a;
            if (i11 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(u74Var.a().f16178a).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f8239e).setChannelMask(this.f8240f).setEncoding(this.f8241g).build()).setTransferMode(1).setBufferSizeInBytes(this.f8242h).setSessionId(i10).setOffloadedPlayback(this.f8237c == 1).build();
            } else if (i11 < 21) {
                int i12 = u74Var.f16222a;
                audioTrack = i10 == 0 ? new AudioTrack(3, this.f8239e, this.f8240f, this.f8241g, this.f8242h, 1) : new AudioTrack(3, this.f8239e, this.f8240f, this.f8241g, this.f8242h, 1, i10);
            } else {
                audioTrack = new AudioTrack(u74Var.a().f16178a, new AudioFormat.Builder().setSampleRate(this.f8239e).setChannelMask(this.f8240f).setEncoding(this.f8241g).build(), this.f8242h, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new oc4(state, this.f8239e, this.f8240f, this.f8242h, this.f8235a, c(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e5) {
            throw new oc4(0, this.f8239e, this.f8240f, this.f8242h, this.f8235a, c(), e5);
        }
    }

    public final boolean c() {
        return this.f8237c == 1;
    }
}
