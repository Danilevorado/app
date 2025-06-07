package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1105Zu implements InterfaceC03223w {
    public final /* synthetic */ C0561Eg A00;
    public final /* synthetic */ C03203u A01;

    public C1105Zu(C0561Eg c0561Eg, C03203u c03203u) {
        this.A00 = c0561Eg;
        this.A01 = c03203u;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03223w
    public final Object A4W(int i10) {
        C03183s compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03223w
    public final List<Object> A5h(String str, int i10) {
        List<C03183s> listA03 = this.A01.A03(str, i10);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(listA03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03223w
    public final boolean ADx(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
