package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s, reason: collision with root package name */
    int f3204s;

    /* renamed from: t, reason: collision with root package name */
    private c f3205t;

    /* renamed from: u, reason: collision with root package name */
    i f3206u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3207v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3208w;

    /* renamed from: x, reason: collision with root package name */
    boolean f3209x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f3210y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f3211z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        i f3212a;

        /* renamed from: b, reason: collision with root package name */
        int f3213b;

        /* renamed from: c, reason: collision with root package name */
        int f3214c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3215d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3216e;

        a() {
            e();
        }

        void a() {
            this.f3214c = this.f3215d ? this.f3212a.i() : this.f3212a.m();
        }

        public void b(View view, int i10) {
            this.f3214c = this.f3215d ? this.f3212a.d(view) + this.f3212a.o() : this.f3212a.g(view);
            this.f3213b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f3212a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f3213b = i10;
            if (this.f3215d) {
                int i11 = (this.f3212a.i() - iO) - this.f3212a.d(view);
                this.f3214c = this.f3212a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f3214c - this.f3212a.e(view);
                    int iM = this.f3212a.m();
                    int iMin = iE - (iM + Math.min(this.f3212a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f3214c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f3212a.g(view);
            int iM2 = iG - this.f3212a.m();
            this.f3214c = iG;
            if (iM2 > 0) {
                int i12 = (this.f3212a.i() - Math.min(0, (this.f3212a.i() - iO) - this.f3212a.d(view))) - (iG + this.f3212a.e(view));
                if (i12 < 0) {
                    this.f3214c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        void e() {
            this.f3213b = -1;
            this.f3214c = Integer.MIN_VALUE;
            this.f3215d = false;
            this.f3216e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3213b + ", mCoordinate=" + this.f3214c + ", mLayoutFromEnd=" + this.f3215d + ", mValid=" + this.f3216e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3217a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3218b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3219c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3220d;

        protected b() {
        }

        void a() {
            this.f3217a = 0;
            this.f3218b = false;
            this.f3219c = false;
            this.f3220d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f3222b;

        /* renamed from: c, reason: collision with root package name */
        int f3223c;

        /* renamed from: d, reason: collision with root package name */
        int f3224d;

        /* renamed from: e, reason: collision with root package name */
        int f3225e;

        /* renamed from: f, reason: collision with root package name */
        int f3226f;

        /* renamed from: g, reason: collision with root package name */
        int f3227g;

        /* renamed from: k, reason: collision with root package name */
        int f3231k;

        /* renamed from: m, reason: collision with root package name */
        boolean f3233m;

        /* renamed from: a, reason: collision with root package name */
        boolean f3221a = true;

        /* renamed from: h, reason: collision with root package name */
        int f3228h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f3229i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f3230j = false;

        /* renamed from: l, reason: collision with root package name */
        List f3232l = null;

        c() {
        }

        private View e() {
            int size = this.f3232l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.d0) this.f3232l.get(i10)).f3305a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f3224d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            this.f3224d = viewF == null ? -1 : ((RecyclerView.p) viewF.getLayoutParams()).a();
        }

        boolean c(RecyclerView.a0 a0Var) {
            int i10 = this.f3224d;
            return i10 >= 0 && i10 < a0Var.b();
        }

        View d(RecyclerView.v vVar) {
            if (this.f3232l != null) {
                return e();
            }
            View viewO = vVar.o(this.f3224d);
            this.f3224d += this.f3225e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f3232l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.d0) this.f3232l.get(i11)).f3305a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (iA = (pVar.a() - this.f3224d) * this.f3225e) >= 0 && iA < i10) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: m, reason: collision with root package name */
        int f3234m;

        /* renamed from: n, reason: collision with root package name */
        int f3235n;

        /* renamed from: o, reason: collision with root package name */
        boolean f3236o;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f3234m = parcel.readInt();
            this.f3235n = parcel.readInt();
            this.f3236o = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f3234m = dVar.f3234m;
            this.f3235n = dVar.f3235n;
            this.f3236o = dVar.f3236o;
        }

        boolean a() {
            return this.f3234m >= 0;
        }

        void b() {
            this.f3234m = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3234m);
            parcel.writeInt(this.f3235n);
            parcel.writeInt(this.f3236o ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f3204s = 1;
        this.f3208w = false;
        this.f3209x = false;
        this.f3210y = false;
        this.f3211z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        C2(i10);
        D2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3204s = 1;
        this.f3208w = false;
        this.f3209x = false;
        this.f3210y = false;
        this.f3211z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d dVarI0 = RecyclerView.o.i0(context, attributeSet, i10, i11);
        C2(dVarI0.f3358a);
        D2(dVarI0.f3360c);
        E2(dVarI0.f3361d);
    }

    private void A2() {
        this.f3209x = (this.f3204s == 1 || !q2()) ? this.f3208w : !this.f3208w;
    }

    private boolean F2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (J() == 0) {
            return false;
        }
        View viewV = V();
        if (viewV != null && aVar.d(viewV, a0Var)) {
            aVar.c(viewV, h0(viewV));
            return true;
        }
        if (this.f3207v != this.f3210y) {
            return false;
        }
        View viewI2 = aVar.f3215d ? i2(vVar, a0Var) : j2(vVar, a0Var);
        if (viewI2 == null) {
            return false;
        }
        aVar.b(viewI2, h0(viewI2));
        if (!a0Var.e() && L1()) {
            if (this.f3206u.g(viewI2) >= this.f3206u.i() || this.f3206u.d(viewI2) < this.f3206u.m()) {
                aVar.f3214c = aVar.f3215d ? this.f3206u.i() : this.f3206u.m();
            }
        }
        return true;
    }

    private boolean G2(RecyclerView.a0 a0Var, a aVar) {
        int i10;
        if (!a0Var.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < a0Var.b()) {
                aVar.f3213b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z10 = this.D.f3236o;
                    aVar.f3215d = z10;
                    aVar.f3214c = z10 ? this.f3206u.i() - this.D.f3235n : this.f3206u.m() + this.D.f3235n;
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z11 = this.f3209x;
                    aVar.f3215d = z11;
                    aVar.f3214c = z11 ? this.f3206u.i() - this.B : this.f3206u.m() + this.B;
                    return true;
                }
                View viewC = C(this.A);
                if (viewC == null) {
                    if (J() > 0) {
                        aVar.f3215d = (this.A < h0(I(0))) == this.f3209x;
                    }
                    aVar.a();
                } else {
                    if (this.f3206u.e(viewC) > this.f3206u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f3206u.g(viewC) - this.f3206u.m() < 0) {
                        aVar.f3214c = this.f3206u.m();
                        aVar.f3215d = false;
                        return true;
                    }
                    if (this.f3206u.i() - this.f3206u.d(viewC) < 0) {
                        aVar.f3214c = this.f3206u.i();
                        aVar.f3215d = true;
                        return true;
                    }
                    aVar.f3214c = aVar.f3215d ? this.f3206u.d(viewC) + this.f3206u.o() : this.f3206u.g(viewC);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (G2(a0Var, aVar) || F2(vVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f3213b = this.f3210y ? a0Var.b() - 1 : 0;
    }

    private void I2(int i10, int i11, boolean z10, RecyclerView.a0 a0Var) {
        int iM;
        this.f3205t.f3233m = z2();
        this.f3205t.f3226f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f3205t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f3228h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f3229i = iMax;
        if (z11) {
            cVar.f3228h = i12 + this.f3206u.j();
            View viewM2 = m2();
            c cVar2 = this.f3205t;
            cVar2.f3225e = this.f3209x ? -1 : 1;
            int iH0 = h0(viewM2);
            c cVar3 = this.f3205t;
            cVar2.f3224d = iH0 + cVar3.f3225e;
            cVar3.f3222b = this.f3206u.d(viewM2);
            iM = this.f3206u.d(viewM2) - this.f3206u.i();
        } else {
            View viewN2 = n2();
            this.f3205t.f3228h += this.f3206u.m();
            c cVar4 = this.f3205t;
            cVar4.f3225e = this.f3209x ? 1 : -1;
            int iH02 = h0(viewN2);
            c cVar5 = this.f3205t;
            cVar4.f3224d = iH02 + cVar5.f3225e;
            cVar5.f3222b = this.f3206u.g(viewN2);
            iM = (-this.f3206u.g(viewN2)) + this.f3206u.m();
        }
        c cVar6 = this.f3205t;
        cVar6.f3223c = i11;
        if (z10) {
            cVar6.f3223c = i11 - iM;
        }
        cVar6.f3227g = iM;
    }

    private void J2(int i10, int i11) {
        this.f3205t.f3223c = this.f3206u.i() - i11;
        c cVar = this.f3205t;
        cVar.f3225e = this.f3209x ? -1 : 1;
        cVar.f3224d = i10;
        cVar.f3226f = 1;
        cVar.f3222b = i11;
        cVar.f3227g = Integer.MIN_VALUE;
    }

    private void K2(a aVar) {
        J2(aVar.f3213b, aVar.f3214c);
    }

    private void L2(int i10, int i11) {
        this.f3205t.f3223c = i11 - this.f3206u.m();
        c cVar = this.f3205t;
        cVar.f3224d = i10;
        cVar.f3225e = this.f3209x ? 1 : -1;
        cVar.f3226f = -1;
        cVar.f3222b = i11;
        cVar.f3227g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f3213b, aVar.f3214c);
    }

    private int O1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.a(a0Var, this.f3206u, Y1(!this.f3211z, true), X1(!this.f3211z, true), this, this.f3211z);
    }

    private int P1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.b(a0Var, this.f3206u, Y1(!this.f3211z, true), X1(!this.f3211z, true), this, this.f3211z, this.f3209x);
    }

    private int Q1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.c(a0Var, this.f3206u, Y1(!this.f3211z, true), X1(!this.f3211z, true), this, this.f3211z);
    }

    private View V1() {
        return d2(0, J());
    }

    private View W1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, 0, J(), a0Var.b());
    }

    private View a2() {
        return d2(J() - 1, -1);
    }

    private View b2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, J() - 1, -1, a0Var.b());
    }

    private View f2() {
        return this.f3209x ? V1() : a2();
    }

    private View g2() {
        return this.f3209x ? a2() : V1();
    }

    private View i2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f3209x ? W1(vVar, a0Var) : b2(vVar, a0Var);
    }

    private View j2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f3209x ? b2(vVar, a0Var) : W1(vVar, a0Var);
    }

    private int k2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i11;
        int i12 = this.f3206u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -B2(-i12, vVar, a0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f3206u.i() - i14) <= 0) {
            return i13;
        }
        this.f3206u.r(i11);
        return i11 + i13;
    }

    private int l2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int iM;
        int iM2 = i10 - this.f3206u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -B2(iM2, vVar, a0Var);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f3206u.m()) <= 0) {
            return i11;
        }
        this.f3206u.r(-iM);
        return i11 - iM;
    }

    private View m2() {
        return I(this.f3209x ? 0 : J() - 1);
    }

    private View n2() {
        return I(this.f3209x ? J() - 1 : 0);
    }

    private void t2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11) {
        if (!a0Var.g() || J() == 0 || a0Var.e() || !L1()) {
            return;
        }
        List listK = vVar.k();
        int size = listK.size();
        int iH0 = h0(I(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) listK.get(i14);
            if (!d0Var.v()) {
                char c10 = (d0Var.m() < iH0) != this.f3209x ? (char) 65535 : (char) 1;
                int iE = this.f3206u.e(d0Var.f3305a);
                if (c10 == 65535) {
                    i12 += iE;
                } else {
                    i13 += iE;
                }
            }
        }
        this.f3205t.f3232l = listK;
        if (i12 > 0) {
            L2(h0(n2()), i10);
            c cVar = this.f3205t;
            cVar.f3228h = i12;
            cVar.f3223c = 0;
            cVar.a();
            U1(vVar, this.f3205t, a0Var, false);
        }
        if (i13 > 0) {
            J2(h0(m2()), i11);
            c cVar2 = this.f3205t;
            cVar2.f3228h = i13;
            cVar2.f3223c = 0;
            cVar2.a();
            U1(vVar, this.f3205t, a0Var, false);
        }
        this.f3205t.f3232l = null;
    }

    private void v2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f3221a || cVar.f3233m) {
            return;
        }
        int i10 = cVar.f3227g;
        int i11 = cVar.f3229i;
        if (cVar.f3226f == -1) {
            x2(vVar, i10, i11);
        } else {
            y2(vVar, i10, i11);
        }
    }

    private void w2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                n1(i10, vVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                n1(i12, vVar);
            }
        }
    }

    private void x2(RecyclerView.v vVar, int i10, int i11) {
        int iJ = J();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f3206u.h() - i10) + i11;
        if (this.f3209x) {
            for (int i12 = 0; i12 < iJ; i12++) {
                View viewI = I(i12);
                if (this.f3206u.g(viewI) < iH || this.f3206u.q(viewI) < iH) {
                    w2(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iJ - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewI2 = I(i14);
            if (this.f3206u.g(viewI2) < iH || this.f3206u.q(viewI2) < iH) {
                w2(vVar, i13, i14);
                return;
            }
        }
    }

    private void y2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iJ = J();
        if (!this.f3209x) {
            for (int i13 = 0; i13 < iJ; i13++) {
                View viewI = I(i13);
                if (this.f3206u.d(viewI) > i12 || this.f3206u.p(viewI) > i12) {
                    w2(vVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iJ - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewI2 = I(i15);
            if (this.f3206u.d(viewI2) > i12 || this.f3206u.p(viewI2) > i12) {
                w2(vVar, i14, i15);
                return;
            }
        }
    }

    int B2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        T1();
        this.f3205t.f3221a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        I2(i11, iAbs, true, a0Var);
        c cVar = this.f3205t;
        int iU1 = cVar.f3227g + U1(vVar, cVar, a0Var, false);
        if (iU1 < 0) {
            return 0;
        }
        if (iAbs > iU1) {
            i10 = i11 * iU1;
        }
        this.f3206u.r(-i10);
        this.f3205t.f3231k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View C(int i10) {
        int iJ = J();
        if (iJ == 0) {
            return null;
        }
        int iH0 = i10 - h0(I(0));
        if (iH0 >= 0 && iH0 < iJ) {
            View viewI = I(iH0);
            if (h0(viewI) == i10) {
                return viewI;
            }
        }
        return super.C(i10);
    }

    public void C2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        g(null);
        if (i10 != this.f3204s || this.f3206u == null) {
            i iVarB = i.b(this, i10);
            this.f3206u = iVarB;
            this.E.f3212a = iVarB;
            this.f3204s = i10;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z10) {
        g(null);
        if (z10 == this.f3208w) {
            return;
        }
        this.f3208w = z10;
        t1();
    }

    public void E2(boolean z10) {
        g(null);
        if (this.f3210y == z10) {
            return;
        }
        this.f3210y = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        if (this.C) {
            k1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int iR1;
        A2();
        if (J() == 0 || (iR1 = R1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(iR1, (int) (this.f3206u.n() * 0.33333334f), false, a0Var);
        c cVar = this.f3205t;
        cVar.f3227g = Integer.MIN_VALUE;
        cVar.f3221a = false;
        U1(vVar, cVar, a0Var, true);
        View viewG2 = iR1 == -1 ? g2() : f2();
        View viewN2 = iR1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewG2;
        }
        if (viewG2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && this.f3207v == this.f3210y;
    }

    protected void M1(RecyclerView.a0 a0Var, int[] iArr) {
        int i10;
        int iO2 = o2(a0Var);
        if (this.f3205t.f3226f == -1) {
            i10 = 0;
        } else {
            i10 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i10;
    }

    void N1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f3224d;
        if (i10 < 0 || i10 >= a0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f3227g));
    }

    int R1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f3204s == 1) ? 1 : Integer.MIN_VALUE : this.f3204s == 0 ? 1 : Integer.MIN_VALUE : this.f3204s == 1 ? -1 : Integer.MIN_VALUE : this.f3204s == 0 ? -1 : Integer.MIN_VALUE : (this.f3204s != 1 && q2()) ? -1 : 1 : (this.f3204s != 1 && q2()) ? 1 : -1;
    }

    c S1() {
        return new c();
    }

    void T1() {
        if (this.f3205t == null) {
            this.f3205t = S1();
        }
    }

    int U1(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10 = cVar.f3223c;
        int i11 = cVar.f3227g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f3227g = i11 + i10;
            }
            v2(vVar, cVar);
        }
        int i12 = cVar.f3223c + cVar.f3228h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f3233m && i12 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            s2(vVar, a0Var, cVar, bVar);
            if (!bVar.f3218b) {
                cVar.f3222b += bVar.f3217a * cVar.f3226f;
                if (!bVar.f3219c || cVar.f3232l != null || !a0Var.e()) {
                    int i13 = cVar.f3223c;
                    int i14 = bVar.f3217a;
                    cVar.f3223c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f3227g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f3217a;
                    cVar.f3227g = i16;
                    int i17 = cVar.f3223c;
                    if (i17 < 0) {
                        cVar.f3227g = i16 + i17;
                    }
                    v2(vVar, cVar);
                }
                if (z10 && bVar.f3220d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f3223c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iK2;
        int i14;
        View viewC;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            k1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f3234m;
        }
        T1();
        this.f3205t.f3221a = false;
        A2();
        View viewV = V();
        a aVar = this.E;
        if (!aVar.f3216e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f3215d = this.f3209x ^ this.f3210y;
            H2(vVar, a0Var, aVar2);
            this.E.f3216e = true;
        } else if (viewV != null && (this.f3206u.g(viewV) >= this.f3206u.i() || this.f3206u.d(viewV) <= this.f3206u.m())) {
            this.E.c(viewV, h0(viewV));
        }
        c cVar = this.f3205t;
        cVar.f3226f = cVar.f3231k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f3206u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.f3206u.j();
        if (a0Var.e() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewC = C(i14)) != null) {
            if (this.f3209x) {
                i15 = this.f3206u.i() - this.f3206u.d(viewC);
                iG = this.B;
            } else {
                iG = this.f3206u.g(viewC) - this.f3206u.m();
                i15 = this.B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f3215d ? !this.f3209x : this.f3209x) {
            i16 = 1;
        }
        u2(vVar, a0Var, aVar3, i16);
        w(vVar);
        this.f3205t.f3233m = z2();
        this.f3205t.f3230j = a0Var.e();
        this.f3205t.f3229i = 0;
        a aVar4 = this.E;
        if (aVar4.f3215d) {
            M2(aVar4);
            c cVar2 = this.f3205t;
            cVar2.f3228h = iMax;
            U1(vVar, cVar2, a0Var, false);
            c cVar3 = this.f3205t;
            i11 = cVar3.f3222b;
            int i18 = cVar3.f3224d;
            int i19 = cVar3.f3223c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            K2(this.E);
            c cVar4 = this.f3205t;
            cVar4.f3228h = iMax2;
            cVar4.f3224d += cVar4.f3225e;
            U1(vVar, cVar4, a0Var, false);
            c cVar5 = this.f3205t;
            i10 = cVar5.f3222b;
            int i20 = cVar5.f3223c;
            if (i20 > 0) {
                L2(i18, i11);
                c cVar6 = this.f3205t;
                cVar6.f3228h = i20;
                U1(vVar, cVar6, a0Var, false);
                i11 = this.f3205t.f3222b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f3205t;
            cVar7.f3228h = iMax2;
            U1(vVar, cVar7, a0Var, false);
            c cVar8 = this.f3205t;
            i10 = cVar8.f3222b;
            int i21 = cVar8.f3224d;
            int i22 = cVar8.f3223c;
            if (i22 > 0) {
                iMax += i22;
            }
            M2(this.E);
            c cVar9 = this.f3205t;
            cVar9.f3228h = iMax;
            cVar9.f3224d += cVar9.f3225e;
            U1(vVar, cVar9, a0Var, false);
            c cVar10 = this.f3205t;
            i11 = cVar10.f3222b;
            int i23 = cVar10.f3223c;
            if (i23 > 0) {
                J2(i21, i10);
                c cVar11 = this.f3205t;
                cVar11.f3228h = i23;
                U1(vVar, cVar11, a0Var, false);
                i10 = this.f3205t.f3222b;
            }
        }
        if (J() > 0) {
            if (this.f3209x ^ this.f3210y) {
                int iK22 = k2(i10, vVar, a0Var, true);
                i12 = i11 + iK22;
                i13 = i10 + iK22;
                iK2 = l2(i12, vVar, a0Var, false);
            } else {
                int iL2 = l2(i11, vVar, a0Var, true);
                i12 = i11 + iL2;
                i13 = i10 + iL2;
                iK2 = k2(i13, vVar, a0Var, false);
            }
            i11 = i12 + iK2;
            i10 = i13 + iK2;
        }
        t2(vVar, a0Var, i11, i10);
        if (a0Var.e()) {
            this.E.e();
        } else {
            this.f3206u.s();
        }
        this.f3207v = this.f3210y;
    }

    View X1(boolean z10, boolean z11) {
        int iJ;
        int iJ2;
        if (this.f3209x) {
            iJ = 0;
            iJ2 = J();
        } else {
            iJ = J() - 1;
            iJ2 = -1;
        }
        return e2(iJ, iJ2, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    View Y1(boolean z10, boolean z11) {
        int iJ;
        int iJ2;
        if (this.f3209x) {
            iJ = J() - 1;
            iJ2 = -1;
        } else {
            iJ = 0;
            iJ2 = J();
        }
        return e2(iJ, iJ2, z10, z11);
    }

    public int Z1() {
        View viewE2 = e2(0, J(), false, true);
        if (viewE2 == null) {
            return -1;
        }
        return h0(viewE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i10) {
        if (J() == 0) {
            return null;
        }
        int i11 = (i10 < h0(I(0))) != this.f3209x ? -1 : 1;
        return this.f3204s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            t1();
        }
    }

    public int c2() {
        View viewE2 = e2(J() - 1, -1, false, true);
        if (viewE2 == null) {
            return -1;
        }
        return h0(viewE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z10 = this.f3207v ^ this.f3209x;
            dVar.f3236o = z10;
            if (z10) {
                View viewM2 = m2();
                dVar.f3235n = this.f3206u.i() - this.f3206u.d(viewM2);
                dVar.f3234m = h0(viewM2);
            } else {
                View viewN2 = n2();
                dVar.f3234m = h0(viewN2);
                dVar.f3235n = this.f3206u.g(viewN2) - this.f3206u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View d2(int i10, int i11) {
        int i12;
        int i13;
        T1();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return I(i10);
        }
        if (this.f3206u.g(I(i10)) < this.f3206u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return (this.f3204s == 0 ? this.f3342e : this.f3343f).a(i10, i11, i12, i13);
    }

    View e2(int i10, int i11, boolean z10, boolean z11) {
        T1();
        return (this.f3204s == 0 ? this.f3342e : this.f3343f).a(i10, i11, z10 ? 24579 : 320, z11 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    View h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11, int i12) {
        T1();
        int iM = this.f3206u.m();
        int i13 = this.f3206u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewI = I(i10);
            int iH0 = h0(viewI);
            if (iH0 >= 0 && iH0 < i12) {
                if (((RecyclerView.p) viewI.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewI;
                    }
                } else {
                    if (this.f3206u.g(viewI) < i13 && this.f3206u.d(viewI) >= iM) {
                        return viewI;
                    }
                    if (view == null) {
                        view = viewI;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f3204s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f3204s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.f3204s != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        T1();
        I2(i10 > 0 ? 1 : -1, Math.abs(i10), true, a0Var);
        N1(a0Var, this.f3205t, cVar);
    }

    protected int o2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.f3206u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i10, RecyclerView.o.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            A2();
            z10 = this.f3209x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z10 = dVar2.f3236o;
            i11 = dVar2.f3234m;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public int p2() {
        return this.f3204s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    protected boolean q2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public boolean r2() {
        return this.f3211z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return true;
    }

    void s2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int iE0;
        int iF;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.f3218b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        if (cVar.f3232l == null) {
            if (this.f3209x == (cVar.f3226f == -1)) {
                d(viewD);
            } else {
                e(viewD, 0);
            }
        } else {
            if (this.f3209x == (cVar.f3226f == -1)) {
                b(viewD);
            } else {
                c(viewD, 0);
            }
        }
        A0(viewD, 0, 0);
        bVar.f3217a = this.f3206u.e(viewD);
        if (this.f3204s == 1) {
            if (q2()) {
                iF = o0() - f0();
                iE0 = iF - this.f3206u.f(viewD);
            } else {
                iE0 = e0();
                iF = this.f3206u.f(viewD) + iE0;
            }
            int i13 = cVar.f3226f;
            int i14 = cVar.f3222b;
            if (i13 == -1) {
                i12 = i14;
                i11 = iF;
                i10 = i14 - bVar.f3217a;
            } else {
                i10 = i14;
                i11 = iF;
                i12 = bVar.f3217a + i14;
            }
        } else {
            int iG0 = g0();
            int iF2 = this.f3206u.f(viewD) + iG0;
            int i15 = cVar.f3226f;
            int i16 = cVar.f3222b;
            if (i15 == -1) {
                i11 = i16;
                i10 = iG0;
                i12 = iF2;
                iE0 = i16 - bVar.f3217a;
            } else {
                i10 = iG0;
                i11 = bVar.f3217a + i16;
                i12 = iF2;
                iE0 = i16;
            }
        }
        z0(viewD, iE0, i10, i11, i12);
        if (pVar.c() || pVar.b()) {
            bVar.f3219c = true;
        }
        bVar.f3220d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3204s == 1) {
            return 0;
        }
        return B2(i10, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i10) {
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3204s == 0) {
            return 0;
        }
        return B2(i10, vVar, a0Var);
    }

    boolean z2() {
        return this.f3206u.k() == 0 && this.f3206u.h() == 0;
    }
}
