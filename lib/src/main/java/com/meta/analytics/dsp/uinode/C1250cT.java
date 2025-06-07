package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1250cT {
    public final Map<DspViewableNode, C1256ca> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized C1256ca A00(DspViewableNode dspViewableNode) {
        C1256ca c1256ca = this.A00.get(dspViewableNode);
        if (c1256ca != null) {
            return c1256ca;
        }
        return C1256ca.A08;
    }

    public final synchronized void A01(DspViewableNode dspViewableNode) {
        this.A00.remove(dspViewableNode);
    }

    public final synchronized void A02(DspViewableNode dspViewableNode, C1256ca c1256ca) {
        this.A00.put(dspViewableNode, c1256ca);
    }

    public final synchronized void A03(Collection<DspViewableNode> collection) {
        Iterator<DspViewableNode> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
