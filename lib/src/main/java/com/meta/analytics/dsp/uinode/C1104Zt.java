package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1104Zt implements InterfaceC03243z {
    public final /* synthetic */ C0560Ef A00;
    public final /* synthetic */ C03203u A01;

    public C1104Zt(C0560Ef c0560Ef, C03203u c03203u) {
        this.A00 = c0560Ef;
        this.A01 = c03203u;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03243z
    public final Object A4W(int i10) {
        C03183s compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03243z
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

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03243z
    public final Object A5i(int i10) {
        C03183s compatInfo = this.A01.A01(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03243z
    public final boolean ADx(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
