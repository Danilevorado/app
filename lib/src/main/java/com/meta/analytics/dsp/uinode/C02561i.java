package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02561i {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    public C03786c A00;
    public EnumC0790Nm A01 = EnumC0790Nm.A06;
    public ArrayList<PB> A02 = new ArrayList<>();
    public final C1F A03;
    public final InterfaceC02551h A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -59, -54, -61, -53, -48, -63, -46, -61, -44, -61, -49, -43, -42, -37, -44, -36, -31, -40, -41, -76, -41, -73, -44, -25, -44, -75, -24, -31, -41, -33, -40, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0J(C1073Yn c1073Yn, EnumSet<CacheFlag> enumSet) {
        if (A0E() == KB.A04) {
            C1174b3 c1174b3 = (C1174b3) this.A03;
            AbstractC1176b5 abstractC1176b5A0u = c1174b3.A0u();
            if (A0C(c1073Yn, abstractC1176b5A0u) || abstractC1176b5A0u == null) {
                return;
            }
            this.A04.AES();
            A0A(c1073Yn, enumSet, c1174b3, abstractC1176b5A0u, 0, this.A04);
            return;
        }
        if (A0C(c1073Yn, (AbstractC1176b5) this.A03)) {
            return;
        }
        this.A04.AES();
        if (A0E() == KB.A0C) {
            A08(c1073Yn, (FU) this.A03);
        } else {
            A09(c1073Yn, enumSet, (FU) this.A03, -1, this.A04);
        }
    }

    static {
        A06();
    }

    public C02561i(C1073Yn c1073Yn, C02691v c02691v, InterfaceC02551h interfaceC02551h, String str) {
        JSONObject dataObject = c02691v.A03();
        this.A03 = A01(c1073Yn, c02691v, str, dataObject);
        this.A04 = interfaceC02551h;
    }

    private AdError A00(C1073Yn c1073Yn, AbstractC1176b5 abstractC1176b5) {
        if (abstractC1176b5 == null || abstractC1176b5.A14().isEmpty()) {
            c1073Yn.A07().A9a(A04(62, 3, 18), C8A.A0Z, new C8B(A04(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1F A01(C1073Yn c1073Yn, C02691v c02691v, String str, JSONObject jSONObject) {
        C1F c1fA02 = null;
        if (jSONObject.has(A04(65, 12, 2))) {
            try {
                c1fA02 = C1174b3.A03(jSONObject, c1073Yn, true);
                c1fA02.A0e(true);
                c1fA02.A0b(A04(96, 12, 17));
            } catch (JSONException unused) {
            }
        }
        if (c1fA02 == null) {
            c1fA02 = FU.A02(jSONObject, c1073Yn);
        }
        c1fA02.A0a(str);
        C8T c8tA01 = c02691v.A01();
        if (c8tA01 != null) {
            c1fA02.A0W(c8tA01.A06());
        }
        return c1fA02;
    }

    private C03786c A03(C1073Yn c1073Yn) {
        C03786c c03786c = this.A00;
        return c03786c != null ? c03786c : new C03786c(c1073Yn);
    }

    private void A08(C1073Yn c1073Yn, FU fu) {
        C02501c playableData = fu.A0x().A0D().A06();
        A0B(playableData != null ? playableData.A0A() : EnumC0790Nm.A06);
        C1165au c1165au = new C1165au(this);
        C03786c c03786c = new C03786c(c1073Yn);
        boolean z10 = C0662Ih.A1n(c1073Yn) && AnonymousClass62.A0A(fu.A0V());
        if (z10) {
            AnonymousClass62 unifiedAssetsLoader = new AnonymousClass62(c03786c, fu.A0V(), fu.A0P(), fu.A0S(), z10, new C1164at(this));
            c03786c.A0d(new JA(fu.A12(), c1073Yn.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC02661s.A02(c1073Yn, fu, true, c1165au);
    }

    /* JADX WARN: Incorrect condition in loop: B:28:0x0155 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(com.meta.analytics.dsp.uinode.C1073Yn r25, java.util.EnumSet<com.facebook.ads.CacheFlag> r26, com.meta.analytics.dsp.uinode.AbstractC1176b5 r27, int r28, com.meta.analytics.dsp.uinode.InterfaceC02551h r29) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C02561i.A09(com.facebook.ads.redexgen.X.Yn, java.util.EnumSet, com.facebook.ads.redexgen.X.b5, int, com.facebook.ads.redexgen.X.1h):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1073Yn c1073Yn, EnumSet<CacheFlag> enumSet, C1174b3 c1174b3, AbstractC1176b5 abstractC1176b5, int i10, InterfaceC02551h interfaceC02551h) {
        A09(c1073Yn, enumSet, abstractC1176b5, i10, new C1170az(this, c1073Yn, abstractC1176b5, c1174b3, i10, interfaceC02551h, enumSet));
    }

    private void A0B(EnumC0790Nm enumC0790Nm) {
        this.A01 = enumC0790Nm;
    }

    private boolean A0C(C1073Yn c1073Yn, AbstractC1176b5 abstractC1176b5) {
        AdError adErrorA00 = A00(c1073Yn, abstractC1176b5);
        if (adErrorA00 != null) {
            InterfaceC02551h interfaceC02551h = this.A04;
            String[] strArr = A06;
            if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "Dm6wm58uJ8qXwjtNx8Vtzbsb5Jkw9mit";
            strArr2[0] = "fLwuuFNg4tiwPdo6hP9t6x3v5l5Hcavg";
            interfaceC02551h.AAe(adErrorA00);
            return true;
        }
        return false;
    }

    public final C1F A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        return com.meta.analytics.dsp.uinode.KB.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        return com.meta.analytics.dsp.uinode.KB.A0B;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.meta.analytics.dsp.uinode.KB A0E() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.1F r0 = r4.A03
            boolean r0 = r0.A0j()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.KB r0 = com.meta.analytics.dsp.uinode.KB.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.1F r3 = r4.A03
            com.facebook.ads.redexgen.X.b5 r3 = (com.meta.analytics.dsp.uinode.AbstractC1176b5) r3
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L50
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            java.lang.String r1 = "f4kXngrP8CD5dz"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.A0m()
            if (r0 == 0) goto L31
            com.facebook.ads.redexgen.X.KB r0 = com.meta.analytics.dsp.uinode.KB.A06
            return r0
        L31:
            java.util.List r0 = r3.A14()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L5e
            com.facebook.ads.redexgen.X.KB r3 = com.meta.analytics.dsp.uinode.KB.A0A
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L56
        L50:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L56:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            java.lang.String r1 = "ny"
            r0 = 3
            r2[r0] = r1
            return r3
        L5e:
            com.facebook.ads.redexgen.X.1G r0 = r3.A0x()
            com.facebook.ads.redexgen.X.1J r0 = r0.A0D()
            com.facebook.ads.redexgen.X.1c r0 = r0.A06()
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.KB r3 = com.meta.analytics.dsp.uinode.KB.A0C
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            java.lang.String r1 = "JH"
            r0 = 3
            r2[r0] = r1
            return r3
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8e:
            boolean r3 = r4.A0L(r3)
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C02561i.A06
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 32
            if (r1 == r0) goto Lb0
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            java.lang.String r1 = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto Lba
        Lad:
            com.facebook.ads.redexgen.X.KB r0 = com.meta.analytics.dsp.uinode.KB.A0D
            return r0
        Lb0:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C02561i.A06
            java.lang.String r1 = "ySAy4b6nQ"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lba
            goto Lad
        Lba:
            com.facebook.ads.redexgen.X.KB r0 = com.meta.analytics.dsp.uinode.KB.A0B
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C02561i.A0E():com.facebook.ads.redexgen.X.KB");
    }

    public final EnumC0790Nm A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A0j()) {
            return ((C1174b3) this.A03).A0y();
        }
        return ((AbstractC1176b5) this.A03).A12();
    }

    public final void A0H() {
        this.A04.AGm();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0Y(rewardData);
        this.A03.A0c(str);
        if (A0D().A0j()) {
            intent.putExtra(A04(77, 19, 19), this.A03);
        }
        intent.putExtra(A04(48, 14, 94), this.A03);
    }

    public final boolean A0K() {
        return this.A03.A0g();
    }

    public final boolean A0L(AbstractC1176b5 abstractC1176b5) {
        return !TextUtils.isEmpty(abstractC1176b5.A0x().A0D().A08());
    }
}
