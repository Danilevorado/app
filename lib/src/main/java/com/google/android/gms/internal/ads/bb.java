package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class bb implements na {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6411a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final z9 f6412b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue f6413c;

    /* renamed from: d, reason: collision with root package name */
    private final ea f6414d;

    bb(z9 z9Var, BlockingQueue blockingQueue, ea eaVar) {
        this.f6414d = eaVar;
        this.f6412b = z9Var;
        this.f6413c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.na
    public final synchronized void a(oa oaVar) {
        String strO = oaVar.o();
        List list = (List) this.f6411a.remove(strO);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (ab.f6029b) {
            ab.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strO);
        }
        oa oaVar2 = (oa) list.remove(0);
        this.f6411a.put(strO, list);
        oaVar2.z(this);
        try {
            this.f6413c.put(oaVar2);
        } catch (InterruptedException e5) {
            ab.b("Couldn't add request to queue. %s", e5.toString());
            Thread.currentThread().interrupt();
            this.f6412b.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.na
    public final void b(oa oaVar, ua uaVar) {
        List list;
        w9 w9Var = uaVar.f16246b;
        if (w9Var == null || w9Var.a(System.currentTimeMillis())) {
            a(oaVar);
            return;
        }
        String strO = oaVar.o();
        synchronized (this) {
            list = (List) this.f6411a.remove(strO);
        }
        if (list != null) {
            if (ab.f6029b) {
                ab.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strO);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6414d.b((oa) it.next(), uaVar, null);
            }
        }
    }

    final synchronized boolean c(oa oaVar) {
        String strO = oaVar.o();
        if (!this.f6411a.containsKey(strO)) {
            this.f6411a.put(strO, null);
            oaVar.z(this);
            if (ab.f6029b) {
                ab.a("new request, sending to network %s", strO);
            }
            return false;
        }
        List arrayList = (List) this.f6411a.get(strO);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        oaVar.r("waiting-for-response");
        arrayList.add(oaVar);
        this.f6411a.put(strO, arrayList);
        if (ab.f6029b) {
            ab.a("Request for cacheKey=%s is in flight, putting on hold.", strO);
        }
        return true;
    }
}
