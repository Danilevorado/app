package com.meta.analytics.dsp.uinode;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: assets/audience_network.dex */
public final class I6 extends BufferedOutputStream {
    public boolean A00;

    public I6(OutputStream outputStream) {
        super(outputStream);
    }

    public I6(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public final void A00(OutputStream outputStream) {
        AbstractC0629Ha.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.A00 = true;
        Throwable e5 = null;
        try {
            flush();
        } catch (Throwable th) {
            e5 = th;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e5 == null) {
                e5 = thrown;
            }
        }
        if (e5 != null) {
            IF.A0Y(e5);
            throw null;
        }
    }
}
