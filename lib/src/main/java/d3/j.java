package d3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.oe0;
import com.google.android.gms.internal.ads.ze0;
import k3.x2;

/* loaded from: classes.dex */
public abstract class j extends ViewGroup {

    /* renamed from: m, reason: collision with root package name */
    protected final x2 f22861m;

    protected j(Context context, int i10) {
        super(context);
        this.f22861m = new x2(this, i10);
    }

    protected j(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f22861m = new x2(this, attributeSet, false, i10);
    }

    public void a() {
        ir.a(getContext());
        if (((Boolean) at.f6232e.e()).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.f10141x9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: d3.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar = this.f22826m;
                        try {
                            jVar.f22861m.k();
                        } catch (IllegalStateException e5) {
                            b80.c(jVar.getContext()).a(e5, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f22861m.k();
    }

    public void b(final f fVar) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ir.a(getContext());
        if (((Boolean) at.f6233f.e()).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.A9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: d3.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar = this.f22815m;
                        try {
                            jVar.f22861m.m(fVar.f22835a);
                        } catch (IllegalStateException e5) {
                            b80.c(jVar.getContext()).a(e5, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f22861m.m(fVar.f22835a);
    }

    public void c() {
        ir.a(getContext());
        if (((Boolean) at.f6234g.e()).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.f10152y9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: d3.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar = this.f22825m;
                        try {
                            jVar.f22861m.n();
                        } catch (IllegalStateException e5) {
                            b80.c(jVar.getContext()).a(e5, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f22861m.n();
    }

    public void d() {
        ir.a(getContext());
        if (((Boolean) at.f6235h.e()).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.f10130w9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: d3.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar = this.f22827m;
                        try {
                            jVar.f22861m.o();
                        } catch (IllegalStateException e5) {
                            b80.c(jVar.getContext()).a(e5, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f22861m.o();
    }

    public c getAdListener() {
        return this.f22861m.c();
    }

    public g getAdSize() {
        return this.f22861m.d();
    }

    public String getAdUnitId() {
        return this.f22861m.j();
    }

    public o getOnPaidEventListener() {
        return this.f22861m.e();
    }

    public u getResponseInfo() {
        return this.f22861m.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        g adSize;
        int iB;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e5) {
                ze0.e("Unable to retrieve ad size.", e5);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iD = adSize.d(context);
                iB = adSize.b(context);
                measuredWidth = iD;
            } else {
                iB = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            measuredWidth = childAt.getMeasuredWidth();
            iB = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(iB, getSuggestedMinimumHeight()), i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        this.f22861m.q(cVar);
        if (cVar == 0) {
            this.f22861m.p(null);
            return;
        }
        if (cVar instanceof k3.a) {
            this.f22861m.p((k3.a) cVar);
        }
        if (cVar instanceof e3.c) {
            this.f22861m.u((e3.c) cVar);
        }
    }

    public void setAdSize(g gVar) {
        this.f22861m.r(gVar);
    }

    public void setAdUnitId(String str) {
        this.f22861m.t(str);
    }

    public void setOnPaidEventListener(o oVar) {
        this.f22861m.v(oVar);
    }
}
