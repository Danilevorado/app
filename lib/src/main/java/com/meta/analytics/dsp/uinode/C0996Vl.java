package com.meta.analytics.dsp.uinode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.ads.redexgen.X.Vl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0996Vl implements InterfaceC0622Gs {
    public long A00;
    public long A01;
    public C0628Gy A02;
    public I6 A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final HK A09;
    public final boolean A0A;

    public C0996Vl(HK hk, long j10) {
        this(hk, j10, 20480, true);
    }

    public C0996Vl(HK hk, long j10, int i10, boolean z10) {
        this.A09 = (HK) AbstractC0629Ha.A01(hk);
        this.A08 = j10;
        this.A07 = i10;
        this.A0A = z10;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.A0A) {
                this.A05.getFD().sync();
            }
            IF.A0X(this.A06);
            this.A06 = null;
            File fileToCommit = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A4N(fileToCommit);
            } else {
                fileToCommit.delete();
            }
        } catch (Throwable th) {
            IF.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A4N(file);
            } else {
                file.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long maxLength;
        if (this.A02.A02 == -1) {
            maxLength = this.A08;
        } else {
            maxLength = Math.min(this.A02.A02 - this.A00, this.A08);
        }
        this.A04 = this.A09.AGT(this.A02.A05, this.A00 + this.A02.A01, maxLength);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A04);
        this.A05 = fileOutputStream;
        if (this.A07 > 0) {
            I6 i62 = this.A03;
            if (i62 == null) {
                this.A03 = new I6(this.A05, this.A07);
            } else {
                i62.A00(fileOutputStream);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A01 = 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0622Gs
    public final void ADn(C0628Gy c0628Gy) throws IOException {
        if (c0628Gy.A02 == -1 && !c0628Gy.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0628Gy;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e5) {
            throw new C0997Vm(e5);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0622Gs
    public final void close() throws IOException {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e5) {
            throw new C0997Vm(e5);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0622Gs
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A02 == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.A01 == this.A08) {
                    A00();
                    A01();
                }
                int bytesWritten = i11 - i12;
                int iMin = (int) Math.min(bytesWritten, this.A08 - this.A01);
                int bytesWritten2 = i10 + i12;
                this.A06.write(bArr, bytesWritten2, iMin);
                i12 += iMin;
                this.A01 += iMin;
                this.A00 += iMin;
            } catch (IOException e5) {
                throw new C0997Vm(e5);
            }
        }
    }
}
