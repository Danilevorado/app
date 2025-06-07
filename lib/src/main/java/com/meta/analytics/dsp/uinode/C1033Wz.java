package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1033Wz implements InterfaceC0537Cy {
    public static byte[] A06;
    public static String[] A07 = {"3GVDuA8wFVUyMgpUpbIewfrR9H99KrEk", "JlICi14zqaUcthBIG11pWTw91wh2yVCw", "SCc1nWfYKQsHAUfYf8T5wZndFViKre8j", "glAeXwJzdtWksZ9B0aFClAzpFAfPstjY", "", "MoUOfVVsEVomZ5Pq9PB", "UtG2kZW99inEJ5Gw9pPEuhVI3SuCWANI", "WpnQHVSEOc3lam6iocwMhSGypVEKzNDF"};
    public int A00;
    public int A01;
    public long A02;
    public C4 A03;
    public boolean A04;
    public final C0654Hz A05 = new C0654Hz(10);

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[3].charAt(3) == 'p') {
                throw new RuntimeException();
            }
            A07[3] = "8BWuaIrledIbOr1Vvmzlm7GxjPqtlOKX";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
            i13++;
        }
    }

    public static void A01() {
        A06 = new byte[]{121, 84, 78, 94, 92, 79, 89, 84, 83, 90, 29, 84, 83, 75, 92, 81, 84, 89, 29, 116, 121, 14, 29, 73, 92, 90, 22, 59, 108, 13, 58, 62, 59, 58, 45, 43, 58, 58, 38, 35, 41, 43, 62, 35, 37, 36, 101, 35, 46, 121};
    }

    static {
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (51 != r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (51 != r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r8.A05.A0Z(3);
        r8.A01 = r8.A05.A0D() + 10;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4R(com.meta.analytics.dsp.uinode.C0654Hz r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1033Wz.A4R(com.facebook.ads.redexgen.X.Hz):void");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void A4p(InterfaceC0513Bu interfaceC0513Bu, DC dc2) {
        dc2.A05();
        C4 c4AGi = interfaceC0513Bu.AGi(dc2.A03(), 4);
        this.A03 = c4AGi;
        c4AGi.A5n(Format.A0B(dc2.A04(), A00(35, 15, 124), null, -1, null));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void ADs() {
        int i10;
        if (!this.A04 || (i10 = this.A01) == 0 || this.A00 != i10) {
            return;
        }
        this.A03.AFS(this.A02, 1, i10, 0, null);
        this.A04 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void ADt(long j10, boolean z10) {
        if (!z10) {
            return;
        }
        this.A04 = true;
        this.A02 = j10;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0537Cy
    public final void AFg() {
        this.A04 = false;
    }
}
