package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import d3.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class sq1 extends k3.e2 {

    /* renamed from: m, reason: collision with root package name */
    final Map f15531m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Context f15532n;

    /* renamed from: o, reason: collision with root package name */
    private final gq1 f15533o;

    /* renamed from: p, reason: collision with root package name */
    private final bb3 f15534p;

    /* renamed from: q, reason: collision with root package name */
    private final tq1 f15535q;

    /* renamed from: r, reason: collision with root package name */
    private xp1 f15536r;

    sq1(Context context, gq1 gq1Var, tq1 tq1Var, bb3 bb3Var) {
        this.f15532n = context;
        this.f15533o = gq1Var;
        this.f15534p = bb3Var;
        this.f15535q = tq1Var;
    }

    private static d3.f S5() {
        return new f.a().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String T5(Object obj) {
        d3.u uVarC;
        k3.j2 j2VarF;
        if (obj instanceof d3.l) {
            uVarC = ((d3.l) obj).f();
        } else if (obj instanceof f3.a) {
            uVarC = ((f3.a) obj).a();
        } else if (obj instanceof n3.a) {
            uVarC = ((n3.a) obj).a();
        } else if (obj instanceof u3.c) {
            uVarC = ((u3.c) obj).a();
        } else if (obj instanceof v3.a) {
            uVarC = ((v3.a) obj).a();
        } else {
            if (!(obj instanceof AdView)) {
                if (obj instanceof r3.c) {
                    uVarC = ((r3.c) obj).c();
                }
                return "";
            }
            uVarC = ((AdView) obj).getResponseInfo();
        }
        if (uVarC == null || (j2VarF = uVarC.f()) == null) {
            return "";
        }
        try {
            return j2VarF.g();
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void U5(String str, String str2) {
        try {
            qa3.q(this.f15536r.b(str), new qq1(this, str2), this.f15534p);
        } catch (NullPointerException e5) {
            j3.t.q().u(e5, "OutOfContextTester.setAdAsOutOfContext");
            this.f15533o.h(str2);
        }
    }

    private final synchronized void V5(String str, String str2) {
        try {
            qa3.q(this.f15536r.b(str), new rq1(this, str2), this.f15534p);
        } catch (NullPointerException e5) {
            j3.t.q().u(e5, "OutOfContextTester.setAdAsShown");
            this.f15533o.h(str2);
        }
    }

    public final void O5(xp1 xp1Var) {
        this.f15536r = xp1Var;
    }

    protected final synchronized void P5(String str, Object obj, String str2) {
        this.f15531m.put(str, obj);
        U5(T5(obj), str2);
    }

    @Override // k3.f2
    public final void Q4(String str, l4.a aVar, l4.a aVar2) {
        Context context = (Context) l4.b.L0(aVar);
        ViewGroup viewGroup = (ViewGroup) l4.b.L0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.f15531m.get(str);
        if (obj != null) {
            this.f15531m.remove(str);
        }
        if (obj instanceof AdView) {
            tq1.a(context, viewGroup, (AdView) obj);
        } else if (obj instanceof r3.c) {
            tq1.b(context, viewGroup, (r3.c) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void Q5(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sq1.Q5(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void R5(String str, String str2) {
        Activity activityD = this.f15533o.d();
        if (activityD == null) {
            return;
        }
        Object obj = this.f15531m.get(str);
        if (obj == null) {
            return;
        }
        zq zqVar = ir.I8;
        if (!((Boolean) k3.w.c().b(zqVar)).booleanValue() || (obj instanceof f3.a) || (obj instanceof n3.a) || (obj instanceof u3.c) || (obj instanceof v3.a)) {
            this.f15531m.remove(str);
        }
        V5(T5(obj), str2);
        if (obj instanceof f3.a) {
            ((f3.a) obj).c(activityD);
            return;
        }
        if (obj instanceof n3.a) {
            ((n3.a) obj).e(activityD);
            return;
        }
        if (obj instanceof u3.c) {
            ((u3.c) obj).c(activityD, new d3.p() { // from class: com.google.android.gms.internal.ads.hq1
                @Override // d3.p
                public final void a(u3.b bVar) {
                }
            });
            return;
        }
        if (obj instanceof v3.a) {
            ((v3.a) obj).c(activityD, new d3.p() { // from class: com.google.android.gms.internal.ads.iq1
                @Override // d3.p
                public final void a(u3.b bVar) {
                }
            });
            return;
        }
        if (((Boolean) k3.w.c().b(zqVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof r3.c))) {
            Intent intent = new Intent();
            intent.setClassName(this.f15532n, "com.google.android.gms.ads.OutOfContextTestingActivity");
            intent.putExtra("adUnit", str);
            j3.t.r();
            m3.b2.o(this.f15532n, intent);
        }
    }
}
