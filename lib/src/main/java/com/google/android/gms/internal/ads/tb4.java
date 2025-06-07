package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tb4 implements l94, ub4 {
    private sb4 A;
    private sb4 B;
    private sb4 C;
    private k9 D;
    private k9 E;
    private k9 F;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private boolean L;

    /* renamed from: m, reason: collision with root package name */
    private final Context f15759m;

    /* renamed from: n, reason: collision with root package name */
    private final vb4 f15760n;

    /* renamed from: o, reason: collision with root package name */
    private final PlaybackSession f15761o;

    /* renamed from: u, reason: collision with root package name */
    private String f15767u;

    /* renamed from: v, reason: collision with root package name */
    private PlaybackMetrics.Builder f15768v;

    /* renamed from: w, reason: collision with root package name */
    private int f15769w;

    /* renamed from: z, reason: collision with root package name */
    private qj0 f15772z;

    /* renamed from: q, reason: collision with root package name */
    private final g01 f15763q = new g01();

    /* renamed from: r, reason: collision with root package name */
    private final ey0 f15764r = new ey0();

    /* renamed from: t, reason: collision with root package name */
    private final HashMap f15766t = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    private final HashMap f15765s = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    private final long f15762p = SystemClock.elapsedRealtime();

    /* renamed from: x, reason: collision with root package name */
    private int f15770x = 0;

    /* renamed from: y, reason: collision with root package name */
    private int f15771y = 0;

    private tb4(Context context, PlaybackSession playbackSession) {
        this.f15759m = context.getApplicationContext();
        this.f15761o = playbackSession;
        rb4 rb4Var = new rb4(rb4.f14729h);
        this.f15760n = rb4Var;
        rb4Var.c(this);
    }

    public static tb4 m(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new tb4(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int r(int i10) {
        switch (sv2.p(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void s() {
        PlaybackMetrics.Builder builder = this.f15768v;
        if (builder != null && this.L) {
            builder.setAudioUnderrunCount(this.K);
            this.f15768v.setVideoFramesDropped(this.I);
            this.f15768v.setVideoFramesPlayed(this.J);
            Long l10 = (Long) this.f15765s.get(this.f15767u);
            this.f15768v.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f15766t.get(this.f15767u);
            this.f15768v.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f15768v.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f15761o.reportPlaybackMetrics(this.f15768v.build());
        }
        this.f15768v = null;
        this.f15767u = null;
        this.K = 0;
        this.I = 0;
        this.J = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.L = false;
    }

    private final void t(long j10, k9 k9Var, int i10) {
        if (sv2.b(this.E, k9Var)) {
            return;
        }
        int i11 = this.E == null ? 1 : 0;
        this.E = k9Var;
        x(0, j10, k9Var, i11);
    }

    private final void u(long j10, k9 k9Var, int i10) {
        if (sv2.b(this.F, k9Var)) {
            return;
        }
        int i11 = this.F == null ? 1 : 0;
        this.F = k9Var;
        x(2, j10, k9Var, i11);
    }

    private final void v(h11 h11Var, hh4 hh4Var) {
        int iA;
        PlaybackMetrics.Builder builder = this.f15768v;
        if (hh4Var == null || (iA = h11Var.a(hh4Var.f10401a)) == -1) {
            return;
        }
        int i10 = 0;
        h11Var.d(iA, this.f15764r, false);
        h11Var.e(this.f15764r.f8041c, this.f15763q, 0L);
        ew ewVar = this.f15763q.f8531b.f16553b;
        if (ewVar != null) {
            int iT = sv2.t(ewVar.f8000a);
            i10 = iT != 0 ? iT != 1 ? iT != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        g01 g01Var = this.f15763q;
        if (g01Var.f8541l != -9223372036854775807L && !g01Var.f8539j && !g01Var.f8536g && !g01Var.b()) {
            builder.setMediaDurationMillis(sv2.y(this.f15763q.f8541l));
        }
        builder.setPlaybackType(true != this.f15763q.b() ? 1 : 2);
        this.L = true;
    }

    private final void w(long j10, k9 k9Var, int i10) {
        if (sv2.b(this.D, k9Var)) {
            return;
        }
        int i11 = this.D == null ? 1 : 0;
        this.D = k9Var;
        x(1, j10, k9Var, i11);
    }

    private final void x(int i10, long j10, k9 k9Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f15762p);
        if (k9Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = k9Var.f10897k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = k9Var.f10898l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = k9Var.f10895i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = k9Var.f10894h;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = k9Var.f10903q;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = k9Var.f10904r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = k9Var.f10911y;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = k9Var.f10912z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = k9Var.f10889c;
            if (str4 != null) {
                int i17 = sv2.f15560a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f5 = k9Var.f10905s;
            if (f5 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f5);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.L = true;
        this.f15761o.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean y(sb4 sb4Var) {
        return sb4Var != null && sb4Var.f15187c.equals(this.f15760n.f());
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void a(j94 j94Var, int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a9  */
    @Override // com.google.android.gms.internal.ads.l94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.google.android.gms.internal.ads.au0 r21, com.google.android.gms.internal.ads.k94 r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tb4.b(com.google.android.gms.internal.ads.au0, com.google.android.gms.internal.ads.k94):void");
    }

    @Override // com.google.android.gms.internal.ads.ub4
    public final void c(j94 j94Var, String str, boolean z10) {
        hh4 hh4Var = j94Var.f10389d;
        if ((hh4Var == null || !hh4Var.b()) && str.equals(this.f15767u)) {
            s();
        }
        this.f15765s.remove(str);
        this.f15766t.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void d(j94 j94Var, vh1 vh1Var) {
        sb4 sb4Var = this.A;
        if (sb4Var != null) {
            k9 k9Var = sb4Var.f15185a;
            if (k9Var.f10904r == -1) {
                i7 i7VarB = k9Var.b();
                i7VarB.x(vh1Var.f16697a);
                i7VarB.f(vh1Var.f16698b);
                this.A = new sb4(i7VarB.y(), 0, sb4Var.f15187c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void e(j94 j94Var, int i10, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void f(j94 j94Var, int i10, long j10, long j11) {
        hh4 hh4Var = j94Var.f10389d;
        if (hh4Var != null) {
            String strA = this.f15760n.a(j94Var.f10387b, hh4Var);
            Long l10 = (Long) this.f15766t.get(strA);
            Long l11 = (Long) this.f15765s.get(strA);
            this.f15766t.put(strA, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f15765s.put(strA, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void g(j94 j94Var, k9 k9Var, h54 h54Var) {
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void h(j94 j94Var, zs0 zs0Var, zs0 zs0Var2, int i10) {
        if (i10 == 1) {
            this.G = true;
            i10 = 1;
        }
        this.f15769w = i10;
    }

    @Override // com.google.android.gms.internal.ads.ub4
    public final void i(j94 j94Var, String str) {
        hh4 hh4Var = j94Var.f10389d;
        if (hh4Var == null || !hh4Var.b()) {
            s();
            this.f15767u = str;
            this.f15768v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-rc02");
            v(j94Var.f10387b, j94Var.f10389d);
        }
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void j(j94 j94Var, xg4 xg4Var, dh4 dh4Var, IOException iOException, boolean z10) {
    }

    public final LogSessionId k() {
        return this.f15761o.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void l(j94 j94Var, g54 g54Var) {
        this.I += g54Var.f8621g;
        this.J += g54Var.f8619e;
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void n(j94 j94Var, qj0 qj0Var) {
        this.f15772z = qj0Var;
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void o(j94 j94Var, k9 k9Var, h54 h54Var) {
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final void p(j94 j94Var, dh4 dh4Var) {
        hh4 hh4Var = j94Var.f10389d;
        if (hh4Var == null) {
            return;
        }
        k9 k9Var = dh4Var.f7319b;
        Objects.requireNonNull(k9Var);
        sb4 sb4Var = new sb4(k9Var, 0, this.f15760n.a(j94Var.f10387b, hh4Var));
        int i10 = dh4Var.f7318a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.B = sb4Var;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.C = sb4Var;
                return;
            }
        }
        this.A = sb4Var;
    }

    @Override // com.google.android.gms.internal.ads.l94
    public final /* synthetic */ void q(j94 j94Var, Object obj, long j10) {
    }
}
