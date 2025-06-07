package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j extends j2.a {

    /* renamed from: a0, reason: collision with root package name */
    protected static final j2.f f5391a0 = (j2.f) ((j2.f) ((j2.f) new j2.f().f(t1.j.f27215c)).Z(g.LOW)).g0(true);
    private final Context M;
    private final k N;
    private final Class O;
    private final b P;
    private final d Q;
    private l R;
    private Object S;
    private List T;
    private j U;
    private j V;
    private Float W;
    private boolean X = true;
    private boolean Y;
    private boolean Z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5392a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5393b;

        static {
            int[] iArr = new int[g.values().length];
            f5393b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5393b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5393b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5393b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5392a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5392a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5392a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5392a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5392a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5392a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5392a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5392a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected j(b bVar, k kVar, Class cls, Context context) {
        this.P = bVar;
        this.N = kVar;
        this.O = cls;
        this.M = context;
        this.R = kVar.p(cls);
        this.Q = bVar.i();
        t0(kVar.n());
        a(kVar.o());
    }

    private j B0(Object obj) {
        if (G()) {
            return clone().B0(obj);
        }
        this.S = obj;
        this.Y = true;
        return (j) c0();
    }

    private j2.c C0(Object obj, k2.h hVar, j2.e eVar, j2.a aVar, j2.d dVar, l lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.M;
        d dVar2 = this.Q;
        return j2.h.y(context, dVar2, obj, this.S, this.O, aVar, i10, i11, gVar, hVar, eVar, this.T, dVar, dVar2.f(), lVar.b(), executor);
    }

    private j2.c o0(k2.h hVar, j2.e eVar, j2.a aVar, Executor executor) {
        return p0(new Object(), hVar, eVar, null, this.R, aVar.y(), aVar.v(), aVar.u(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j2.c p0(Object obj, k2.h hVar, j2.e eVar, j2.d dVar, l lVar, g gVar, int i10, int i11, j2.a aVar, Executor executor) {
        j2.d dVar2;
        j2.d bVar;
        if (this.V != null) {
            bVar = new j2.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        j2.c cVarQ0 = q0(obj, hVar, eVar, bVar, lVar, gVar, i10, i11, aVar, executor);
        if (dVar2 == null) {
            return cVarQ0;
        }
        int iV = this.V.v();
        int iU = this.V.u();
        if (n2.l.s(i10, i11) && !this.V.P()) {
            iV = aVar.v();
            iU = aVar.u();
        }
        j jVar = this.V;
        j2.b bVar2 = dVar2;
        bVar2.p(cVarQ0, jVar.p0(obj, hVar, eVar, bVar2, jVar.R, jVar.y(), iV, iU, this.V, executor));
        return bVar2;
    }

    private j2.c q0(Object obj, k2.h hVar, j2.e eVar, j2.d dVar, l lVar, g gVar, int i10, int i11, j2.a aVar, Executor executor) {
        j jVar = this.U;
        if (jVar == null) {
            if (this.W == null) {
                return C0(obj, hVar, eVar, aVar, dVar, lVar, gVar, i10, i11, executor);
            }
            j2.i iVar = new j2.i(obj, dVar);
            iVar.o(C0(obj, hVar, eVar, aVar, iVar, lVar, gVar, i10, i11, executor), C0(obj, hVar, eVar, aVar.clone().f0(this.W.floatValue()), iVar, lVar, s0(gVar), i10, i11, executor));
            return iVar;
        }
        if (this.Z) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l lVar2 = jVar.X ? lVar : jVar.R;
        g gVarY = jVar.I() ? this.U.y() : s0(gVar);
        int iV = this.U.v();
        int iU = this.U.u();
        if (n2.l.s(i10, i11) && !this.U.P()) {
            iV = aVar.v();
            iU = aVar.u();
        }
        j2.i iVar2 = new j2.i(obj, dVar);
        j2.c cVarC0 = C0(obj, hVar, eVar, aVar, iVar2, lVar, gVar, i10, i11, executor);
        this.Z = true;
        j jVar2 = this.U;
        j2.c cVarP0 = jVar2.p0(obj, hVar, eVar, iVar2, lVar2, gVarY, iV, iU, jVar2, executor);
        this.Z = false;
        iVar2.o(cVarC0, cVarP0);
        return iVar2;
    }

    private g s0(g gVar) {
        int i10 = a.f5393b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + y());
    }

    private void t0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m0((j2.e) it.next());
        }
    }

    private k2.h v0(k2.h hVar, j2.e eVar, j2.a aVar, Executor executor) {
        n2.k.d(hVar);
        if (!this.Y) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        j2.c cVarO0 = o0(hVar, eVar, aVar, executor);
        j2.c cVarE = hVar.e();
        if (cVarO0.i(cVarE) && !y0(aVar, cVarE)) {
            if (!((j2.c) n2.k.d(cVarE)).isRunning()) {
                cVarE.h();
            }
            return hVar;
        }
        this.N.m(hVar);
        hVar.h(cVarO0);
        this.N.w(hVar, cVarO0);
        return hVar;
    }

    private boolean y0(j2.a aVar, j2.c cVar) {
        return !aVar.H() && cVar.j();
    }

    public j A0(Object obj) {
        return B0(obj);
    }

    public j m0(j2.e eVar) {
        if (G()) {
            return clone().m0(eVar);
        }
        if (eVar != null) {
            if (this.T == null) {
                this.T = new ArrayList();
            }
            this.T.add(eVar);
        }
        return (j) c0();
    }

    @Override // j2.a
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public j a(j2.a aVar) {
        n2.k.d(aVar);
        return (j) super.a(aVar);
    }

    @Override // j2.a
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public j clone() {
        j jVar = (j) super.clone();
        jVar.R = jVar.R.clone();
        if (jVar.T != null) {
            jVar.T = new ArrayList(jVar.T);
        }
        j jVar2 = jVar.U;
        if (jVar2 != null) {
            jVar.U = jVar2.clone();
        }
        j jVar3 = jVar.V;
        if (jVar3 != null) {
            jVar.V = jVar3.clone();
        }
        return jVar;
    }

    public k2.h u0(k2.h hVar) {
        return w0(hVar, null, n2.e.b());
    }

    k2.h w0(k2.h hVar, j2.e eVar, Executor executor) {
        return v0(hVar, eVar, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k2.i x0(android.widget.ImageView r4) {
        /*
            r3 = this;
            n2.l.a()
            n2.k.d(r4)
            boolean r0 = r3.O()
            if (r0 != 0) goto L43
            boolean r0 = r3.M()
            if (r0 == 0) goto L43
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L43
            int[] r0 = com.bumptech.glide.j.a.f5392a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3a;
                case 2: goto L31;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L28;
                case 6: goto L31;
                default: goto L27;
            }
        L27:
            goto L43
        L28:
            j2.a r0 = r3.clone()
            j2.a r0 = r0.T()
            goto L44
        L31:
            j2.a r0 = r3.clone()
            j2.a r0 = r0.S()
            goto L44
        L3a:
            j2.a r0 = r3.clone()
            j2.a r0 = r0.R()
            goto L44
        L43:
            r0 = r3
        L44:
            com.bumptech.glide.d r1 = r3.Q
            java.lang.Class r2 = r3.O
            k2.i r4 = r1.a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = n2.e.b()
            k2.h r4 = r3.v0(r4, r1, r0, r2)
            k2.i r4 = (k2.i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.x0(android.widget.ImageView):k2.i");
    }

    public j z0(Uri uri) {
        return B0(uri);
    }
}
