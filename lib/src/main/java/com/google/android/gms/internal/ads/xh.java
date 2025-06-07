package com.google.android.gms.internal.ads;

import h3.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class xh extends ui {
    public xh(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "Nh+w10G1n7Da4ABjUIxN+bi57DvusNUcn9VqpF1GXimOuh+Booa8zjDH+Fzh+CdP", "2aR451s+WavC28PZAI1OicYdxdf9H8e1m2qQ6Vd7HNY=", xcVar, i10, 24);
    }

    private final void c() throws ExecutionException, InterruptedException, TimeoutException {
        h3.a aVarH = this.f16342b.h();
        if (aVarH == null) {
            return;
        }
        try {
            a.C0142a c0142aB = aVarH.b();
            String strA = c0142aB.a();
            int i10 = hh.f9137b;
            if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strA);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strA = ke.a(bArr, true);
            }
            if (strA != null) {
                synchronized (this.f16345e) {
                    this.f16345e.u0(strA);
                    this.f16345e.t0(c0142aB.b());
                    this.f16345e.X(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f16342b.q()) {
            c();
            return;
        }
        synchronized (this.f16345e) {
            this.f16345e.u0((String) this.f16346f.invoke(null, this.f16342b.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.ui
    public final Void b() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f16342b.r()) {
            super.b();
            return null;
        }
        if (this.f16342b.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
