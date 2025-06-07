package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* loaded from: classes.dex */
public final class re4 implements gf4 {

    /* renamed from: b, reason: collision with root package name */
    private final z33 f14760b;

    /* renamed from: c, reason: collision with root package name */
    private final z33 f14761c;

    public re4(int i10, boolean z10) {
        pe4 pe4Var = new pe4(i10);
        qe4 qe4Var = new qe4(i10);
        this.f14760b = pe4Var;
        this.f14761c = qe4Var;
    }

    static /* synthetic */ HandlerThread a(int i10) {
        return new HandlerThread(te4.o(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread b(int i10) {
        return new HandlerThread(te4.o(i10, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final te4 c(ff4 ff4Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ff4Var.f8268a.f11014a;
        te4 te4Var = null;
        try {
            int i10 = sv2.f15560a;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                te4 te4Var2 = new te4(mediaCodecCreateByCodecName, a(((pe4) this.f14760b).f13748m), b(((qe4) this.f14761c).f14291m), false, null);
                try {
                    Trace.endSection();
                    te4.n(te4Var2, ff4Var.f8269b, ff4Var.f8271d, null, 0);
                    return te4Var2;
                } catch (Exception e5) {
                    e = e5;
                    te4Var = te4Var2;
                    if (te4Var != null) {
                        te4Var.l();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
    }
}
