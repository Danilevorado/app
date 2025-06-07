package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ii0 {

    /* renamed from: a, reason: collision with root package name */
    private long f9757a;

    public final long a(ByteBuffer byteBuffer) {
        fc fcVar;
        ec ecVar;
        long j10 = this.f9757a;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new ac(new hi0(byteBufferDuplicate), ki0.f11072c).g().iterator();
            while (true) {
                fcVar = null;
                if (!it.hasNext()) {
                    ecVar = null;
                    break;
                }
                cc ccVar = (cc) it.next();
                if (ccVar instanceof ec) {
                    ecVar = (ec) ccVar;
                    break;
                }
            }
            Iterator it2 = ecVar.g().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                cc ccVar2 = (cc) it2.next();
                if (ccVar2 instanceof fc) {
                    fcVar = (fc) ccVar2;
                    break;
                }
            }
            long jI = (fcVar.i() * 1000) / fcVar.j();
            this.f9757a = jI;
            return jI;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
