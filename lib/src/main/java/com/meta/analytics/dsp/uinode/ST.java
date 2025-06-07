package com.meta.analytics.dsp.uinode;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ST extends AbstractC03274c<SN> {
    public static String[] A0H = {"U2dBX20JaeRgS8KUkn4U", "4wbYdEjd6EY1wYpAHERmBQ5UbLFk3rIE", "poCzv8x7tLJqIV5ZIWq", "9iyDRDGf0xWQ70I4mtfqA0IQycZfZ47C", "v2glKkwlOEfR0MfsI3TqmdNecXONmhZ3", "6XdF3RdtkhprEZiVEVCq65KOMzsBziM7", "2OiOSmaAlP7OTnmHwLOjTjXlL7jeDPuL", "nkMLdycTxYcJ5galJfvG8bjM9rVBse8i"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MB A04;
    public MC A05;
    public String A06;
    public List<C0845Pp> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1176b5 A0A;
    public final C03786c A0B;
    public final C1073Yn A0C;
    public final J2 A0D;
    public final C0732Lg A0E;
    public final C0909Sb A0F;
    public final RE A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public ST(C1073Yn c1073Yn, List<C0845Pp> list, AbstractC1176b5 abstractC1176b5, J2 j22, C03786c c03786c, RE re, C0732Lg c0732Lg, MC mc, String str, int i10, int i11, int i12, int i13, C0909Sb c0909Sb, MB mb2) {
        this.A0C = c1073Yn;
        this.A0D = j22;
        this.A0B = c03786c;
        this.A0G = re;
        this.A0E = c0732Lg;
        this.A05 = mc;
        this.A0A = abstractC1176b5;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = c0909Sb;
        this.A04 = mb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03274c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SN A0C(ViewGroup viewGroup, int i10) {
        return new SN(AbstractC0827Ox.A00(new OO(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0H(this.A04).A0K(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A0y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03274c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(SN sn, int i10) {
        sn.A0j(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            sn.AFr();
            String[] strArr = A0H;
            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            A0H[1] = "f5MkbcX2dFxcVTBDK6f4VKhLC7wzzoeI";
            this.A08 = true;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03274c
    public final int A0E() {
        return this.A07.size();
    }
}
