package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public abstract class HQ {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:37:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:43:0x00ae */
    public static long A00(C0628Gy c0628Gy, long j10, long j11, InterfaceC0624Gu interfaceC0624Gu, byte[] bArr, I3 i32, int i10, HP hp) throws InterruptedException, IOException {
        InterfaceC0624Gu interfaceC0624Gu2;
        while (true) {
            if (i32 != null) {
                i32.A01(i10);
            }
            try {
                break;
            } catch (I2 unused) {
            } finally {
                IF.A0W(interfaceC0624Gu2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0628Gy c0628Gy2 = new C0628Gy(c0628Gy.A04, c0628Gy.A06, j10, (c0628Gy.A03 + j10) - c0628Gy.A01, -1L, c0628Gy.A05, c0628Gy.A00 | 2);
        long jADl = interfaceC0624Gu2.ADl(c0628Gy2);
        if (hp.A01 == -1 && jADl != -1) {
            hp.A01 = c0628Gy2.A01 + jADl;
        }
        long j12 = 0;
        while (true) {
            if (j12 == j11) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int i11 = interfaceC0624Gu2.read(bArr, 0, j11 != -1 ? (int) Math.min(bArr.length, j11 - j12) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (i11 != -1) {
                j12 += i11;
                hp.A02 += i11;
            } else if (hp.A01 == -1) {
                hp.A01 = c0628Gy2.A01 + j12;
            }
        }
        return j12;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0628Gy c0628Gy) {
        if (c0628Gy.A05 != null) {
            return c0628Gy.A05;
        }
        Uri uri = c0628Gy.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0628Gy c0628Gy, HK hk, C0995Vk c0995Vk, byte[] bArr, I3 i32, int i10, HP hp, AtomicBoolean atomicBoolean, boolean z10) throws InterruptedException, IOException {
        long start;
        HP hp2 = hp;
        AbstractC0629Ha.A01(c0995Vk);
        AbstractC0629Ha.A01(bArr);
        if (hp2 != null) {
            A04(c0628Gy, hk, hp2);
        } else {
            hp2 = new HP();
        }
        String strA02 = A02(c0628Gy);
        long j10 = c0628Gy.A01;
        long start2 = c0628Gy.A02;
        if (start2 != -1) {
            start = c0628Gy.A02;
        } else {
            start = hk.A6W(strA02);
        }
        while (true) {
            long j11 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long jA6G = hk.A6G(strA02, j10, start != -1 ? start : Long.MAX_VALUE);
                    if (jA6G <= 0) {
                        long j12 = -jA6G;
                        jA6G = j12;
                        if (A00(c0628Gy, j10, j12, c0995Vk, bArr, i32, i10, hp2) < jA6G) {
                            if (!z10 || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j10 += jA6G;
                    if (start != -1) {
                        j11 = jA6G;
                    }
                    start -= j11;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0628Gy c0628Gy, HK hk, HP hp) {
        long left;
        String strA02 = A02(c0628Gy);
        long j10 = c0628Gy.A01;
        if (c0628Gy.A02 != -1) {
            left = c0628Gy.A02;
        } else {
            left = hk.A6W(strA02);
        }
        hp.A01 = left;
        hp.A00 = 0L;
        hp.A02 = 0L;
        while (left != 0) {
            long jA6G = hk.A6G(strA02, j10, left != -1 ? left : Long.MAX_VALUE);
            if (jA6G > 0) {
                hp.A00 += jA6G;
            } else {
                jA6G = -jA6G;
                if (jA6G == Long.MAX_VALUE) {
                    return;
                }
            }
            j10 += jA6G;
            if (left == -1) {
                jA6G = 0;
            }
            left -= jA6G;
        }
    }

    public static void A05(HK hk, String str) {
        Iterator<HO> it = hk.A6H(str).iterator();
        while (it.hasNext()) {
            try {
                hk.AF9(it.next());
            } catch (HI unused) {
            }
        }
    }
}
