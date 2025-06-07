package k3;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ck;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ze0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    private final l30 f24794a;

    /* renamed from: b, reason: collision with root package name */
    private final g4 f24795b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f24796c;

    /* renamed from: d, reason: collision with root package name */
    private final d3.w f24797d;

    /* renamed from: e, reason: collision with root package name */
    final u f24798e;

    /* renamed from: f, reason: collision with root package name */
    private a f24799f;

    /* renamed from: g, reason: collision with root package name */
    private d3.c f24800g;

    /* renamed from: h, reason: collision with root package name */
    private d3.g[] f24801h;

    /* renamed from: i, reason: collision with root package name */
    private e3.c f24802i;

    /* renamed from: j, reason: collision with root package name */
    private q0 f24803j;

    /* renamed from: k, reason: collision with root package name */
    private d3.x f24804k;

    /* renamed from: l, reason: collision with root package name */
    private String f24805l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewGroup f24806m;

    /* renamed from: n, reason: collision with root package name */
    private int f24807n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f24808o;

    /* renamed from: p, reason: collision with root package name */
    private d3.o f24809p;

    public x2(ViewGroup viewGroup, int i10) {
        this(viewGroup, null, false, g4.f24647a, null, i10);
    }

    public x2(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, int i10) {
        this(viewGroup, attributeSet, z10, g4.f24647a, null, i10);
    }

    x2(ViewGroup viewGroup, AttributeSet attributeSet, boolean z10, g4 g4Var, q0 q0Var, int i10) {
        h4 h4VarY;
        this.f24794a = new l30();
        this.f24797d = new d3.w();
        this.f24798e = new v2(this);
        this.f24806m = viewGroup;
        this.f24795b = g4Var;
        this.f24803j = null;
        this.f24796c = new AtomicBoolean(false);
        this.f24807n = i10;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                p4 p4Var = new p4(context, attributeSet);
                this.f24801h = p4Var.b(z10);
                this.f24805l = p4Var.a();
                if (viewGroup.isInEditMode()) {
                    se0 se0VarB = t.b();
                    d3.g gVar = this.f24801h[0];
                    int i11 = this.f24807n;
                    if (gVar.equals(d3.g.f22845q)) {
                        h4VarY = h4.y();
                    } else {
                        h4 h4Var = new h4(context, gVar);
                        h4Var.f24660v = b(i11);
                        h4VarY = h4Var;
                    }
                    se0VarB.o(viewGroup, h4VarY, "Ads by Google");
                }
            } catch (IllegalArgumentException e5) {
                t.b().n(viewGroup, new h4(context, d3.g.f22837i), e5.getMessage(), e5.getMessage());
            }
        }
    }

    private static h4 a(Context context, d3.g[] gVarArr, int i10) {
        for (d3.g gVar : gVarArr) {
            if (gVar.equals(d3.g.f22845q)) {
                return h4.y();
            }
        }
        h4 h4Var = new h4(context, gVarArr);
        h4Var.f24660v = b(i10);
        return h4Var;
    }

    private static boolean b(int i10) {
        return i10 == 1;
    }

    public final d3.c c() {
        return this.f24800g;
    }

    public final d3.g d() {
        h4 h4VarH;
        try {
            q0 q0Var = this.f24803j;
            if (q0Var != null && (h4VarH = q0Var.h()) != null) {
                return d3.z.c(h4VarH.f24655q, h4VarH.f24652n, h4VarH.f24651m);
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        d3.g[] gVarArr = this.f24801h;
        if (gVarArr != null) {
            return gVarArr[0];
        }
        return null;
    }

    public final d3.o e() {
        return this.f24809p;
    }

    public final d3.u f() {
        j2 j2VarK = null;
        try {
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                j2VarK = q0Var.k();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        return d3.u.d(j2VarK);
    }

    public final d3.w h() {
        return this.f24797d;
    }

    public final m2 i() {
        q0 q0Var = this.f24803j;
        if (q0Var != null) {
            try {
                return q0Var.l();
            } catch (RemoteException e5) {
                ze0.i("#007 Could not call remote method.", e5);
            }
        }
        return null;
    }

    public final String j() {
        q0 q0Var;
        if (this.f24805l == null && (q0Var = this.f24803j) != null) {
            try {
                this.f24805l = q0Var.r();
            } catch (RemoteException e5) {
                ze0.i("#007 Could not call remote method.", e5);
            }
        }
        return this.f24805l;
    }

    public final void k() {
        try {
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                q0Var.A();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    final /* synthetic */ void l(l4.a aVar) {
        this.f24806m.addView((View) l4.b.L0(aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[Catch: RemoteException -> 0x00da, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00da, blocks: (B:26:0x009d, B:28:0x00a3, B:30:0x00b1, B:32:0x00c3, B:33:0x00ce), top: B:48:0x009d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(k3.t2 r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.x2.m(k3.t2):void");
    }

    public final void n() {
        try {
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                q0Var.o0();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void o() {
        try {
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                q0Var.O();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void p(a aVar) {
        try {
            this.f24799f = aVar;
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                q0Var.h3(aVar != null ? new v(aVar) : null);
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void q(d3.c cVar) {
        this.f24800g = cVar;
        this.f24798e.r(cVar);
    }

    public final void r(d3.g... gVarArr) {
        if (this.f24801h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        s(gVarArr);
    }

    public final void s(d3.g... gVarArr) {
        this.f24801h = gVarArr;
        try {
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                q0Var.B1(a(this.f24806m.getContext(), this.f24801h, this.f24807n));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        this.f24806m.requestLayout();
    }

    public final void t(String str) {
        if (this.f24805l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f24805l = str;
    }

    public final void u(e3.c cVar) {
        try {
            this.f24802i = cVar;
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                q0Var.C5(cVar != null ? new ck(cVar) : null);
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void v(d3.o oVar) {
        try {
            this.f24809p = oVar;
            q0 q0Var = this.f24803j;
            if (q0Var != null) {
                q0Var.U2(new p3(oVar));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }
}
