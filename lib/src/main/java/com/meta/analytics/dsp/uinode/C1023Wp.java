package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1023Wp implements D6 {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ C1022Wo A04;
    public final C0653Hy A03 = new C0653Hy(new byte[5]);
    public final SparseArray<DD> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A4R(C0654Hz c0654Hz) {
        IB ib2;
        DD ddA4j;
        if (c0654Hz.A0E() != 2) {
            return;
        }
        if (this.A04.A05 == 1 || this.A04.A05 == 2 || this.A04.A01 == 1) {
            ib2 = (IB) this.A04.A0B.get(0);
        } else {
            ib2 = new IB(((IB) this.A04.A0B.get(0)).A03());
            this.A04.A0B.add(ib2);
        }
        c0654Hz.A0Z(2);
        int iA0I = c0654Hz.A0I();
        int i10 = 5;
        c0654Hz.A0Z(5);
        c0654Hz.A0a(this.A03, 2);
        int i11 = 4;
        this.A03.A08(4);
        int i12 = 12;
        c0654Hz.A0Z(this.A03.A04(12));
        int i13 = 21;
        if (this.A04.A05 == 2 && this.A04.A03 == null) {
            DA da2 = new DA(21, null, null, new byte[0]);
            C1022Wo c1022Wo = this.A04;
            c1022Wo.A03 = c1022Wo.A09.A4j(21, da2);
            this.A04.A03.A8q(ib2, this.A04.A02, new DC(iA0I, 21, 8192));
        }
        this.A01.clear();
        this.A02.clear();
        int iA04 = c0654Hz.A04();
        while (true) {
            if (iA04 <= 0) {
                int size = this.A02.size();
                for (int i14 = 0; i14 < size; i14++) {
                    int iKeyAt = this.A02.keyAt(i14);
                    this.A04.A07.put(iKeyAt, true);
                    DD ddValueAt = this.A01.valueAt(i14);
                    if (ddValueAt != null) {
                        C1022Wo c1022Wo2 = this.A04;
                        String[] strArr = A05;
                        if (strArr[5].length() != strArr[4].length()) {
                            A05[0] = "prZScD3eoAfWT6wNb9RUJeZXyBQ1ma5M";
                            if (ddValueAt != c1022Wo2.A03) {
                                ddValueAt.A8q(ib2, this.A04.A02, new DC(iA0I, iKeyAt, 8192));
                            }
                            this.A04.A06.put(this.A02.valueAt(i14), ddValueAt);
                        }
                    }
                }
                if (this.A04.A05 == 2) {
                    if (this.A04.A04) {
                        return;
                    }
                    this.A04.A02.A5Y();
                    this.A04.A01 = 0;
                    this.A04.A04 = true;
                    return;
                }
                this.A04.A06.remove(this.A00);
                C1022Wo c1022Wo3 = this.A04;
                c1022Wo3.A01 = c1022Wo3.A05 != 1 ? this.A04.A01 - 1 : 0;
                if (this.A04.A01 == 0) {
                    this.A04.A02.A5Y();
                    this.A04.A04 = true;
                    return;
                }
                return;
            }
            c0654Hz.A0a(this.A03, i10);
            int iA042 = this.A03.A04(8);
            this.A03.A08(3);
            int iA043 = this.A03.A04(13);
            this.A03.A08(i11);
            int iA044 = this.A03.A04(i12);
            DA daA00 = A00(c0654Hz, iA044);
            if (iA042 == 6) {
                iA042 = daA00.A00;
            }
            iA04 -= iA044 + 5;
            int i15 = this.A04.A05 == 2 ? iA042 : iA043;
            if (!this.A04.A07.get(i15)) {
                if (this.A04.A05 == 2 && iA042 == i13) {
                    C1022Wo c1022Wo4 = this.A04;
                    String[] strArr2 = A05;
                    if (strArr2[2].length() == strArr2[3].length()) {
                        break;
                    }
                    A05[0] = "McoDKrxcl9g055s4tJZatQwjzcY0TxoH";
                    ddA4j = c1022Wo4.A03;
                } else {
                    ddA4j = this.A04.A09.A4j(iA042, daA00);
                }
                if (this.A04.A05 != 2 || iA043 < this.A02.get(i15, 8192)) {
                    this.A02.put(i15, iA043);
                    this.A01.put(i15, ddA4j);
                }
            }
            i10 = 5;
            i11 = 4;
            i12 = 12;
            i13 = 21;
        }
        throw new RuntimeException();
    }

    public C1023Wp(C1022Wo c1022Wo, int i10) {
        this.A04 = c1022Wo;
        this.A00 = i10;
    }

    private DA A00(C0654Hz c0654Hz, int i10) {
        int iA06 = c0654Hz.A06();
        int i11 = iA06 + i10;
        int i12 = -1;
        String language = null;
        ArrayList arrayList = null;
        while (c0654Hz.A06() < i11) {
            int descriptorsStartPosition = c0654Hz.A0E();
            int positionOfNextDescriptor = c0654Hz.A06() + c0654Hz.A0E();
            if (descriptorsStartPosition == 5) {
                long jA0M = c0654Hz.A0M();
                if (jA0M != C1022Wo.A0F) {
                    long formatIdentifier = C1022Wo.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (jA0M == formatIdentifier) {
                        i12 = 135;
                    } else if (jA0M == C1022Wo.A0H) {
                        i12 = 36;
                    }
                } else {
                    i12 = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                i12 = 129;
            } else if (descriptorsStartPosition == 122) {
                i12 = 135;
            } else if (descriptorsStartPosition == 123) {
                i12 = 138;
            } else if (descriptorsStartPosition == 10) {
                language = c0654Hz.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                i12 = 89;
                arrayList = new ArrayList();
                while (c0654Hz.A06() < positionOfNextDescriptor) {
                    String strTrim = c0654Hz.A0S(3).trim();
                    int iA0E = c0654Hz.A0E();
                    byte[] bArr = new byte[4];
                    c0654Hz.A0c(bArr, 0, 4);
                    arrayList.add(new D9(strTrim, iA0E, bArr));
                }
            }
            c0654Hz.A0Z(positionOfNextDescriptor - c0654Hz.A06());
        }
        c0654Hz.A0Y(i11);
        return new DA(i12, language, arrayList, Arrays.copyOfRange(c0654Hz.A00, iA06, i11));
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib2, InterfaceC0513Bu interfaceC0513Bu, DC dc2) {
    }
}
