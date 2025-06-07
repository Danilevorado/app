package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class C8 extends AbstractC1049Xp<C5, AbstractC0510Br, C0594Fp> implements WL {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract InterfaceC0593Fo A0b(byte[] bArr, int i10, boolean z10) throws C0594Fp;

    public C8(String str) throws IllegalStateException {
        super(new C5[2], new AbstractC0510Br[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6Q] */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1049Xp
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C6Q A0V() {
        return new AbstractC0510Br(this) { // from class: com.facebook.ads.redexgen.X.6Q
            public final C8 A00;

            {
                this.A00 = this;
            }

            @Override // com.meta.analytics.dsp.uinode.AbstractC0510Br
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1049Xp
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C0594Fp A0W(C5 c52, AbstractC0510Br abstractC0510Br, boolean z10) {
        try {
            ByteBuffer inputData = c52.A01;
            abstractC0510Br.A09(((C1051Xr) c52).A00, A0b(inputData.array(), inputData.limit(), z10), c52.A00);
            abstractC0510Br.A01(Integer.MIN_VALUE);
            return null;
        } catch (C0594Fp e5) {
            return e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1049Xp
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0594Fp A0X(Throwable th) {
        return new C0594Fp(A0I(0, 23, 36), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1049Xp
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C5 A0T() {
        return new C5();
    }

    public final void A0c(AbstractC0510Br abstractC0510Br) {
        super.A0a(abstractC0510Br);
    }

    @Override // com.meta.analytics.dsp.uinode.WL
    public final void AGB(long j10) {
    }
}
