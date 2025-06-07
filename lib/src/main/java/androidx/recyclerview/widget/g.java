package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class g extends RecyclerView.z {

    /* renamed from: k, reason: collision with root package name */
    protected PointF f3562k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f3563l;

    /* renamed from: n, reason: collision with root package name */
    private float f3565n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f3560i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f3561j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f3564m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f3566o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f3567p = 0;

    public g(Context context) {
        this.f3563l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f3564m) {
            this.f3565n = v(this.f3563l);
            this.f3564m = true;
        }
        return this.f3565n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f3562k;
        if (pointF != null) {
            float f5 = pointF.y;
            if (f5 != 0.0f) {
                return f5 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.z.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f3562k = pointFA;
        this.f3566o = (int) (pointFA.x * 10000.0f);
        this.f3567p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f3566o * 1.2f), (int) (this.f3567p * 1.2f), (int) (x(10000) * 1.2f), this.f3560i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void l(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f3566o = y(this.f3566o, i10);
        int iY = y(this.f3567p, i11);
        this.f3567p = iY;
        if (this.f3566o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void n() {
        this.f3567p = 0;
        this.f3566o = 0;
        this.f3562k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f3561j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int t(View view, int i10) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.k()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.Q(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, oVarE.T(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, oVarE.e0(), oVarE.o0() - oVarE.f0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.l()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.U(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, oVarE.O(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, oVarE.g0(), oVarE.W() - oVarE.d0(), i10);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    protected int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f3562k;
        if (pointF != null) {
            float f5 = pointF.x;
            if (f5 != 0.0f) {
                return f5 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
