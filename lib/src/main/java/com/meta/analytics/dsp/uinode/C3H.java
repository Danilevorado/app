package com.meta.analytics.dsp.uinode;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.facebook.ads.redexgen.X.3H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3H extends C03856k {
    @Override // com.meta.analytics.dsp.uinode.C03143o
    public Object A00(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10);
    }

    @Override // com.meta.analytics.dsp.uinode.C03143o
    public Object A01(int i10, int i11, boolean z10, int i12) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10);
    }

    @Override // com.meta.analytics.dsp.uinode.C03143o
    public final void A03(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.meta.analytics.dsp.uinode.C03143o
    public final void A04(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}
