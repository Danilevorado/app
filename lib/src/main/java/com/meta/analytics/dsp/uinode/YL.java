package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YL implements InterfaceC04027h {
    public static YL A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public C0W A00;
    public InterfaceC03826g A01;
    public C7g A02;
    public InterfaceC04137w A03;
    public C04198c A04;
    public JE A05;
    public InterfaceC0638Hj A06;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A09;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i14 = bArrCopyOfRange[i13] - i12;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A09;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i13] = (byte) (i14 - 98);
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A07() {
        A08 = new byte[]{-62, -11, -55, -10, -13, -62, -63, -62, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized void A0C(C1072Ym c1072Ym) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1072Ym);
        InterfaceC0638Hj interfaceC0638HjA05 = A05(c1072Ym, this.A03, A03(c1072Ym));
        this.A06 = interfaceC0638HjA05;
        A09(c1072Ym, A00(c1072Ym, interfaceC0638HjA05));
        A0A(c1072Ym, this.A06);
        A0B(c1072Ym, this.A06);
        InterfaceC0638Hj interfaceC0638Hj = this.A06;
        if (interfaceC0638Hj != null) {
            interfaceC0638Hj.A5m();
        }
    }

    static {
        A07();
    }

    public static AnonymousClass66 A00(C1072Ym c1072Ym, InterfaceC0638Hj interfaceC0638Hj) {
        if (!C0662Ih.A1P(c1072Ym) || interfaceC0638Hj == null) {
            return null;
        }
        return AnonymousClass67.A00().A00(interfaceC0638Hj);
    }

    public static InterfaceC04137w A01(C1072Ym c1072Ym) {
        return AbstractC04147x.A00().A00(c1072Ym, new YS());
    }

    public static synchronized YL A02() {
        if (A07 == null) {
            A07 = new YL();
        }
        return A07;
    }

    public static RK A03(C1072Ym c1072Ym) {
        if (!C0662Ih.A1L(c1072Ym)) {
            return null;
        }
        return C0884Rc.A01(c1072Ym);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0638Hj A86() {
        return this.A06;
    }

    public static InterfaceC0638Hj A05(C1072Ym c1072Ym, InterfaceC04137w interfaceC04137w, RK rk) {
        if (C0662Ih.A2E(c1072Ym) && rk != null && !ProcessUtils.isRemoteRenderingProcess()) {
            return AbstractC0907Rz.A00().A00(c1072Ym, interfaceC04137w, rk, K9.A04(c1072Ym), new YM(new K1(c1072Ym, A06(0, 0, 122), null, EnumC0683Jg.A07, 0, new C0688Jl(), LW.A01(C0662Ih.A0J(c1072Ym)), null, null, new C1144aZ()), c1072Ym), C0905Rx.A00().A00());
        }
        return null;
    }

    public static void A08() {
        String strA06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        AbstractC0692Jp.A05(A06(32, 28, 77), strA06, A06(0, 8, 46));
    }

    public static void A09(C1072Ym c1072Ym, AnonymousClass66 anonymousClass66) {
        if (!C0662Ih.A1P(c1072Ym) || anonymousClass66 == null) {
            return;
        }
        AnonymousClass64.A00().A00(anonymousClass66, c1072Ym);
    }

    public static void A0A(C1072Ym c1072Ym, InterfaceC0638Hj interfaceC0638Hj) {
        if (!C0662Ih.A0h(c1072Ym) || interfaceC0638Hj == null) {
            return;
        }
        new C6R(c1072Ym, interfaceC0638Hj, new C6S(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1072Ym c1072Ym, InterfaceC0638Hj interfaceC0638Hj) {
        if (interfaceC0638Hj == null) {
            return;
        }
        AbstractC0665Il.A00(c1072Ym, interfaceC0638Hj);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final J2 A5u(C1072Ym c1072Ym) {
        return VQ.A01(c1072Ym);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized C7g A6A(C04017f c04017f) {
        if (this.A02 == null) {
            this.A02 = new YN(this);
        }
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized InterfaceC03826g A6L() {
        if (this.A01 == null) {
            this.A01 = new C1074Yo();
        }
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized InterfaceC04137w A6j(C04017f c04017f) {
        if (this.A03 == null) {
            this.A03 = A01(c04017f.A01());
        }
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized AnonymousClass89 A6l(C04017f c04017f) {
        return new C1061Yb(c04017f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized InterfaceC04037i A6v(C04017f c04017f) {
        return new EO(this, c04017f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized C0W A77(C04017f c04017f) {
        if (!C0662Ih.A0v(c04017f)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0X.A00().A00(new YQ(c04017f));
        }
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized C7k A7q(C04017f c04017f) {
        return new YO(c04017f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final C1072Ym A7r(Context context) {
        C1072Ym sdkContext = AbstractC04007e.A00();
        if (sdkContext == null) {
            C1072Ym sdkContext2 = new C1072Ym(context, this);
            AbstractC04007e.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized JE A7s(C1072Ym c1072Ym) {
        if (this.A05 == null) {
            this.A05 = new VY(c1072Ym);
        }
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC04027h
    public final synchronized C04198c A7y() {
        if (this.A04 == null) {
            this.A04 = new C04198c();
            A08();
        }
        return this.A04;
    }
}
