package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class D2 {
    public static String[] A0I = {"F0jWKjQTCy62z5RMZ8LXaJxAHVXVw03", "jefijzmMiLSAGWVfBYlCHQnNu7WiK65", "5NKy3uod9nHosUme2DvPYxtYVEy", "OBCuuRHFU9olC8zTnYpCIYDmocSOdWsL", "GchpYIdYbHeAJ5Ou", "h9yGOulo4c92iX", "0WO8HWLEfGPVrZyS", "YTVxkuYMC8IrkJuZM8HCcFhUbHlAsN8p"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public byte[] A0B;
    public final C4 A0E;
    public final I0 A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0649Hu> A0D = new SparseArray<>();
    public final SparseArray<C0648Ht> A0C = new SparseArray<>();
    public D1 A06 = new D1();
    public D1 A07 = new D1();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.D2.A06(byte[], int, int):void");
    }

    public D2(C4 c42, boolean z10, boolean z11) {
        this.A0E = c42;
        this.A0G = z10;
        this.A0H = z11;
        byte[] bArr = new byte[128];
        this.A0B = bArr;
        this.A0F = new I0(bArr, 0, 0);
        A01();
    }

    private void A00(int i10) {
        boolean z10 = this.A0A;
        this.A0E.AFS(this.A05, z10 ? 1 : 0, (int) (this.A02 - this.A04), i10, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    public final void A02(long j10, int i10) {
        boolean z10 = false;
        if (this.A01 == 9 || (this.A0H && this.A07.A00(this.A06))) {
            boolean z11 = this.A09;
            String[] strArr = A0I;
            if (strArr[0].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0I[2] = "rg9RD6QhDdRr";
            if (z11) {
                A00(i10 + ((int) (j10 - this.A02)));
            }
            this.A04 = this.A02;
            this.A05 = this.A03;
            this.A0A = false;
            this.A09 = true;
        }
        boolean z12 = this.A0A;
        int i11 = this.A01;
        if (i11 == 5 || (this.A0G && i11 == 1 && this.A07.A05())) {
            z10 = true;
        }
        this.A0A = z12 | z10;
    }

    public final void A03(long j10, int i10, long j11) {
        this.A01 = i10;
        this.A03 = j11;
        this.A02 = j10;
        if (!this.A0G || i10 != 1) {
            if (!this.A0H) {
                return;
            }
            if (i10 != 5 && i10 != 1 && i10 != 2) {
                return;
            }
        }
        D1 d12 = this.A06;
        D1 newSliceHeader = this.A07;
        this.A06 = newSliceHeader;
        this.A07 = d12;
        d12.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(C0648Ht c0648Ht) {
        this.A0C.append(c0648Ht.A00, c0648Ht);
    }

    public final void A05(C0649Hu c0649Hu) {
        this.A0D.append(c0649Hu.A05, c0649Hu);
    }

    public final boolean A07() {
        return this.A0H;
    }
}
