package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class f {

    /* renamed from: b, reason: collision with root package name */
    int f3552b;

    /* renamed from: c, reason: collision with root package name */
    int f3553c;

    /* renamed from: d, reason: collision with root package name */
    int f3554d;

    /* renamed from: e, reason: collision with root package name */
    int f3555e;

    /* renamed from: h, reason: collision with root package name */
    boolean f3558h;

    /* renamed from: i, reason: collision with root package name */
    boolean f3559i;

    /* renamed from: a, reason: collision with root package name */
    boolean f3551a = true;

    /* renamed from: f, reason: collision with root package name */
    int f3556f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f3557g = 0;

    f() {
    }

    boolean a(RecyclerView.a0 a0Var) {
        int i10 = this.f3553c;
        return i10 >= 0 && i10 < a0Var.b();
    }

    View b(RecyclerView.v vVar) {
        View viewO = vVar.o(this.f3553c);
        this.f3553c += this.f3554d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3552b + ", mCurrentPosition=" + this.f3553c + ", mItemDirection=" + this.f3554d + ", mLayoutDirection=" + this.f3555e + ", mStartLine=" + this.f3556f + ", mEndLine=" + this.f3557g + '}';
    }
}
