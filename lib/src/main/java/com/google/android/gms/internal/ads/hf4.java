package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface hf4 {
    ByteBuffer C(int i10);

    int a();

    void b(int i10, long j10);

    void c(int i10);

    void c0(Bundle bundle);

    MediaFormat d();

    void e(int i10, int i11, int i12, long j10, int i13);

    void f(int i10, boolean z10);

    void g(int i10, int i11, n44 n44Var, long j10, int i12);

    void h(Surface surface);

    void i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void l();

    boolean r();

    ByteBuffer w(int i10);
}
