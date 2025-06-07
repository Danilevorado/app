package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0764Mm {
    public int A00;
    public EnumC0748Lw A01;
    public InterfaceC0768Mq A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C1073Yn A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public C0764Mm(C1073Yn c1073Yn, InterfaceC0768Mq interfaceC0768Mq) {
        this.A0C = c1073Yn;
        this.A02 = interfaceC0768Mq;
    }

    public final C0764Mm A0D(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C0764Mm A0E(EnumC0748Lw enumC0748Lw) {
        this.A01 = enumC0748Lw;
        return this;
    }

    public final C0764Mm A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final C0764Mm A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final C0764Mm A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final C0764Mm A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final C0764Mm A0J(boolean z10) {
        this.A09 = z10;
        return this;
    }

    public final C0764Mm A0K(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final C0764Mm A0L(boolean z10) {
        this.A0B = z10;
        return this;
    }

    public final C0765Mn A0M() {
        return new C0765Mn(this, null);
    }
}
