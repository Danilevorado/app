package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0998Vn implements InterfaceC0624Gu {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC0622Gs A02;
    public final InterfaceC0624Gu A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final long ADl(C0628Gy c0628Gy) throws IOException {
        long jADl = this.A03.ADl(c0628Gy);
        this.A00 = jADl;
        if (jADl == 0) {
            return 0L;
        }
        if (c0628Gy.A02 == -1 && this.A00 != -1) {
            c0628Gy = new C0628Gy(c0628Gy.A04, c0628Gy.A01, c0628Gy.A03, this.A00, c0628Gy.A05, c0628Gy.A00);
        }
        this.A01 = true;
        this.A02.ADn(c0628Gy);
        return this.A00;
    }

    public C0998Vn(InterfaceC0624Gu interfaceC0624Gu, InterfaceC0622Gs interfaceC0622Gs) {
        this.A03 = (InterfaceC0624Gu) AbstractC0629Ha.A01(interfaceC0624Gu);
        this.A02 = (InterfaceC0622Gs) AbstractC0629Ha.A01(interfaceC0622Gs);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final Uri A8E() {
        return this.A03.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th) {
            boolean z10 = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z10) {
                    this.A01 = false;
                    InterfaceC0622Gs interfaceC0622Gs = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC0622Gs.close();
                    }
                }
                throw th;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int i12 = this.A03.read(bArr, i10, i11);
        if (i12 > 0) {
            this.A02.write(bArr, i10, i12);
            long j10 = this.A00;
            if (j10 != -1) {
                this.A00 = j10 - i12;
            }
        }
        return i12;
    }
}
