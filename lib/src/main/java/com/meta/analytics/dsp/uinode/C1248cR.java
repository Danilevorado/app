package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1248cR {
    public static String[] A0C = {"YcCIPLCDTe1wGTKdO7xqYhpFwQzvmXtt", "FfIdHaSVTal814YVh5tJNVr21T0wsSAo", "HLDls6wic6LzndIKtUvgWnGJ4QMP07cO", "ccYpD8PuArRKO9YkPTuVfhIh5pDN1br2", "LFFD576NBTVByEN649EglQB81U0zBBuc", "sO5gz1O188I9hNkbLLxzl8j4JWiDgVKK", "Hord6YvHX1lmSPmhXyMRW660HCYjcXOm", "5HbQDpK1pfSpB47EOovGOWVGJlrw1BSl"};
    public InterfaceC1252cV A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final SU A05;
    public final InterfaceC1258cc A06;
    public final C1250cT A07;
    public final HB A08;
    public final Runnable A09;
    public final List<Rect> A0A;
    public final List<DspViewableNode> A0B;

    public C1248cR(InterfaceC1258cc interfaceC1258cc, SU su, HB hb2, C1250cT c1250cT, Handler handler) {
        this(interfaceC1258cc, su, hb2, c1250cT, handler, 100);
    }

    public C1248cR(InterfaceC1258cc interfaceC1258cc, SU su, HB hb2, C1250cT c1250cT, Handler handler, int i10) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0B = new ArrayList();
        this.A0A = new ArrayList();
        this.A01 = false;
        this.A06 = interfaceC1258cc;
        this.A05 = su;
        this.A08 = hb2;
        this.A07 = c1250cT;
        this.A04 = handler;
        this.A09 = new RunnableC1249cS(this, i10, new Exception());
    }

    private void A03(long j10) {
        if (this.A0B.isEmpty()) {
            this.A06.A8O(this.A0A);
            this.A08.A41(j10, this.A0A);
            this.A08.A5Z();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j10) {
        this.A06.A8O(this.A0A);
        this.A08.A41(j10, this.A0A);
        if (this.A0B.isEmpty()) {
            this.A07.A03(this.A0B);
            Iterator<DspViewableNode> it = this.A0B.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    DspViewableNode next = it.next();
                    C1256ca c1256caA00 = this.A07.A00(next);
                    Iterator<Rect> it2 = this.A0A.iterator();
                    while (it2.hasNext()) {
                        if (next.A8N(this.A03, this.A02, it2.next()) && c1256caA00 != C1256ca.A08) {
                            HB hb2 = this.A08;
                            Rect containerRect = this.A03;
                            Rect rect = this.A02;
                            if (A0C[0].charAt(21) != 'h') {
                                break loop0;
                            }
                            A0C[6] = "BhrT0c14O8Thrmtg3HRzOfRcpCyh5HNl";
                            hb2.A3V(c1256caA00, containerRect, rect);
                        }
                    }
                } else {
                    this.A08.A5Z();
                    InterfaceC1252cV interfaceC1252cV = this.A00;
                    if (interfaceC1252cV != null) {
                        interfaceC1252cV.AD2();
                    }
                    this.A0B.clear();
                    String[] strArr = A0C;
                    if (strArr[1].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr2 = A0C;
                        strArr2[1] = "lmQ3TWUKEycrXTOUs6diKoA3HcDn9Pdd";
                        strArr2[3] = "T2sieqBmgvCwHjMtYcExspPM2F3LyLlD";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException();
    }

    public final void A07() {
        InterfaceC1252cV interfaceC1252cV = this.A00;
        if (interfaceC1252cV != null) {
            interfaceC1252cV.AD2();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A09);
            A03(this.A05.AAY());
        }
        this.A01 = false;
        if (A0C[0].charAt(21) != 'h') {
            throw new RuntimeException();
        }
        A0C[0] = "Da2exFZBguRvp8OTbNDxEhbqIKaEOHIs";
    }

    public final void A08() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A09);
        }
    }

    public final void A09(cX cXVar) {
        this.A08.AGH(cXVar);
    }

    public final void A0A(InterfaceC1252cV interfaceC1252cV) {
        this.A00 = interfaceC1252cV;
    }
}
