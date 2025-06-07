package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9I extends QS {
    public int A00;
    public boolean A01;
    public final AbstractC04358s<C9H> A02;
    public final AbstractC04358s<AnonymousClass98> A03;
    public final AbstractC04358s<O8> A04;
    public final AbstractC04358s<AnonymousClass93> A05;
    public final AbstractC04358s<C0769Mr> A06;
    public final AbstractC04358s<C0757Mf> A07;
    public final AbstractC04358s<C0752Ma> A08;
    public final AbstractC04358s<MU> A09;
    public final AbstractC04358s<C0746Lu> A0A;
    public final SA A0B;
    public final NX A0C;
    public final MV A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C9I(C1073Yn c1073Yn, J2 j22, SA sa2, List<C2P> list, String str) {
        super(c1073Yn, j22, sa2, list, str, !sa2.A0h(), new QR(c1073Yn, sa2));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                this.A00.A0a();
            }
        };
        this.A0D = mv;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s32 = new S3(this);
        this.A03 = s32;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra2 = new RA(this);
        this.A05 = ra2;
        C0859Qd c0859Qd = new C0859Qd(this);
        this.A02 = c0859Qd;
        C0858Qc c0858Qc = new C0858Qc(this);
        this.A06 = c0858Qc;
        C0856Qa c0856Qa = new C0856Qa(this);
        this.A09 = c0856Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s92 = new S9(this);
        this.A08 = s92;
        NX nx = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0791Nn c0791Nn) {
                C9I c9i = this.A00;
                c9i.A00 = c9i.A0B.getDuration();
            }
        };
        this.A0C = nx;
        this.A01 = false;
        this.A0B = sa2;
        sa2.getEventBus().A03(mv, ra2, s72, rh, s32, c0859Qd, c0858Qc, c0856Qa, qv, nx, s92);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C9I(C1073Yn c1073Yn, J2 j22, SA sa2, List<C2P> list, String str, Bundle bundle, Map<String, String> map) {
        super(c1073Yn, j22, sa2, list, str, !sa2.A0h(), bundle, map, new QR(c1073Yn, sa2));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                this.A00.A0a();
            }
        };
        this.A0D = mv;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s32 = new S3(this);
        this.A03 = s32;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra2 = new RA(this);
        this.A05 = ra2;
        C0859Qd c0859Qd = new C0859Qd(this);
        this.A02 = c0859Qd;
        C0858Qc c0858Qc = new C0858Qc(this);
        this.A06 = c0858Qc;
        C0856Qa c0856Qa = new C0856Qa(this);
        this.A09 = c0856Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s92 = new S9(this);
        this.A08 = s92;
        this.A0C = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0791Nn c0791Nn) {
                C9I c9i = this.A00;
                c9i.A00 = c9i.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = sa2;
        sa2.getEventBus().A03(mv, ra2, s72, rh, s32, c0859Qd, c0858Qc, c0856Qa, qv, s92);
    }

    public C9I(C1073Yn c1073Yn, J2 j22, SA sa2, String str) {
        this(c1073Yn, j22, sa2, new ArrayList(), str);
    }

    public C9I(C1073Yn c1073Yn, J2 j22, SA sa2, String str, Bundle bundle) {
        this(c1073Yn, j22, sa2, new ArrayList(), str, bundle, null);
    }

    public C9I(C1073Yn c1073Yn, J2 j22, SA sa2, String str, Map<String, String> extraParams) {
        this(c1073Yn, j22, sa2, new ArrayList(), str, null, extraParams);
    }

    public final void A0i() {
        S8 s82 = new S8(this);
        if (this.A0B.A0l()) {
            ExecutorC0734Li.A00(s82);
        } else {
            this.A0B.getStateHandler().post(s82);
        }
    }
}
