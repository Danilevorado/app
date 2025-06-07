package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZA implements InterfaceC02721y {
    public static byte[] A03;
    public C03625m A00;
    public C1073Yn A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public ZA(C03625m c03625m, C1073Yn c1073Yn, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c03625m;
        this.A01 = c1073Yn;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02721y
    public final void ABR(C0679Jb c0679Jb) {
        KK.A00(new ZD(this, c0679Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02721y
    public final void ACP(List<C1191bK> list) {
        C03786c manager = new C03786c(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1191bK c1191bK : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1191bK.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1191bK.A0E().A0G() != null) {
                    manager.A0b(new C03766a(c1191bK.A0E().A0G().getUrl(), c1191bK.A0E().A0G().getHeight(), c1191bK.A0E().A0G().getWidth(), c1191bK.A0G(), A02(0, 6, 2)));
                }
                if (c1191bK.A0E().A0F() != null) {
                    manager.A0b(new C03766a(c1191bK.A0E().A0F().getUrl(), c1191bK.A0E().A0F().getHeight(), c1191bK.A0E().A0F().getWidth(), c1191bK.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1191bK.A0E().A0d())) {
                    manager.A0a(new C6Y(c1191bK.A0E().A0d(), c1191bK.A0G(), A02(0, 6, 2), c1191bK.A0E().A0A()));
                }
            }
        }
        manager.A0W(new ZB(this, list), new C6V(firstRequestId, A02(0, 6, 2)));
    }
}
