package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.40, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass40 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3y] */
    public static C3y A00(final InterfaceC03243z interfaceC03243z) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3y
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
                return (AccessibilityNodeInfo) interfaceC03243z.A4W(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
                return interfaceC03243z.A5h(str, i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i10) {
                return (AccessibilityNodeInfo) interfaceC03243z.A5i(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i10, int i11, Bundle bundle) {
                return interfaceC03243z.ADx(i10, i11, bundle);
            }
        };
    }
}
