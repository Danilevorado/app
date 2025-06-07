package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FR extends AbstractC1157am {
    public static byte[] A03;
    public long A00;
    public View A01;
    public EQ A02;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{60, 57, 46, 41, 42, 37, 37, 46, 57, 20, 57, 46, 45, 57, 46, 56, 35, 20, 63, 34, 38, 46, 4, 15, 6, 14, 9, 56, 23, 6, 21, 6, 10, 20, 3, 20, 109, 122, 122, 103, 122, 40, Byte.MAX_VALUE, 96, 97, 100, 109, 40, 120, 105, 122, 123, 97, 102, 111, 40, 107, 96, 105, 97, 102, 109, 108, 40, 105, 108, 123, 40, 74, 105, 102, 102, 109, 122};
    }

    public FR(EQ eq, C02681u c02681u) {
        super(eq, c02681u);
        this.A00 = 10000L;
        this.A02 = eq;
    }

    private C1160ap A01(Runnable runnable) {
        return new C1160ap(this, runnable);
    }

    private List<JSONObject> A04(C02691v c02691v) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = c02691v.A03();
        if (jSONObjectA03.has(A03(22, 12, 107))) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(r1).optInt(A03(3, 19, 71), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 81));
                if (adsArray.length() > 0) {
                    for (int i10 = 0; i10 < adsArray.length(); i10++) {
                        arrayList.add((JSONObject) adsArray.get(i10));
                    }
                }
            } catch (JSONException unused) {
                String strA03 = A03(36, 38, 4);
                this.A02.A0E().A4t(C0679Jb.A01(AdErrorType.UNKNOWN_ERROR, strA03).A03().getErrorCode(), strA03);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(C1194bN c1194bN, JSONObject jSONObject, C8T c8t) {
        this.A0C = false;
        C1159ao c1159ao = new C1159ao(this, c1194bN, LJ.A02(jSONObject, A03(34, 2, 108)));
        A0F().postDelayed(c1159ao, c8t.A05());
        c1194bN.A0J(this.A02, this.A08, this.A07.A08, A01(c1159ao), jSONObject, c8t);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0M() {
        if (this.A01 != null) {
            this.A02.A0E().A3y();
            this.A06.A0E(this.A01);
        } else {
            this.A02.A0E().A3z();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0O(InterfaceC02370p interfaceC02370p, C8S c8s, C8Q c8q, final C02691v c02691v) throws JSONException {
        this.A02.A0E().A3s();
        final C1194bN c1194bN = (C1194bN) interfaceC02370p;
        final List<JSONObject> listA04 = A04(c02691v);
        A06(c1194bN, listA04.get(0), c02691v.A01());
        if (listA04.size() > 1) {
            A0F().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.1w
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0X(c1194bN, listA04, c02691v);
                }
            }, this.A00);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0R(String str) {
        this.A02.A0E().A3x(str != null);
        super.A0R(str);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0V(boolean z10) {
        super.A0V(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0X(C1194bN c1194bN, List list, C02691v c02691v) {
        A06(c1194bN, (JSONObject) list.get(1), c02691v.A01());
    }
}
