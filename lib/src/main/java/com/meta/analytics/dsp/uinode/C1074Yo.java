package com.meta.analytics.dsp.uinode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Yo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1074Yo implements InterfaceC03826g {
    public final Map<String, Set<String>> A00 = new HashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC03826g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean A8x(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r0 = r1.A00     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L16
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            monitor-exit(r1)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1074Yo.A8x(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03826g
    public final synchronized void A4H(String str) {
        this.A00.remove(str);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03826g
    public final synchronized void AFq(String str, String str2) {
        Set<String> hashSet = this.A00.get(str2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.A00.put(str2, hashSet);
        }
        hashSet.add(str);
    }
}
