package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;

    /* renamed from: t, reason: collision with root package name */
    f[] f3398t;

    /* renamed from: u, reason: collision with root package name */
    i f3399u;

    /* renamed from: v, reason: collision with root package name */
    i f3400v;

    /* renamed from: w, reason: collision with root package name */
    private int f3401w;

    /* renamed from: x, reason: collision with root package name */
    private int f3402x;

    /* renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f3403y;

    /* renamed from: s, reason: collision with root package name */
    private int f3397s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f3404z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f3406a;

        /* renamed from: b, reason: collision with root package name */
        int f3407b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3408c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3409d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3410e;

        /* renamed from: f, reason: collision with root package name */
        int[] f3411f;

        b() {
            c();
        }

        void a() {
            this.f3407b = this.f3408c ? StaggeredGridLayoutManager.this.f3399u.i() : StaggeredGridLayoutManager.this.f3399u.m();
        }

        void b(int i10) {
            this.f3407b = this.f3408c ? StaggeredGridLayoutManager.this.f3399u.i() - i10 : StaggeredGridLayoutManager.this.f3399u.m() + i10;
        }

        void c() {
            this.f3406a = -1;
            this.f3407b = Integer.MIN_VALUE;
            this.f3408c = false;
            this.f3409d = false;
            this.f3410e = false;
            int[] iArr = this.f3411f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3411f;
            if (iArr == null || iArr.length < length) {
                this.f3411f = new int[StaggeredGridLayoutManager.this.f3398t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3411f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        f f3413e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3414f;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int e() {
            f fVar = this.f3413e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3435e;
        }

        public boolean f() {
            return this.f3414f;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f3415a;

        /* renamed from: b, reason: collision with root package name */
        List f3416b;

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0051a();

            /* renamed from: m, reason: collision with root package name */
            int f3417m;

            /* renamed from: n, reason: collision with root package name */
            int f3418n;

            /* renamed from: o, reason: collision with root package name */
            int[] f3419o;

            /* renamed from: p, reason: collision with root package name */
            boolean f3420p;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C0051a implements Parcelable.Creator {
                C0051a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f3417m = parcel.readInt();
                this.f3418n = parcel.readInt();
                this.f3420p = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f3419o = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f3419o;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3417m + ", mGapDir=" + this.f3418n + ", mHasUnwantedGapAfter=" + this.f3420p + ", mGapPerSpan=" + Arrays.toString(this.f3419o) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f3417m);
                parcel.writeInt(this.f3418n);
                parcel.writeInt(this.f3420p ? 1 : 0);
                int[] iArr = this.f3419o;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3419o);
                }
            }
        }

        d() {
        }

        private int i(int i10) {
            if (this.f3416b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f3416b.remove(aVarF);
            }
            int size = this.f3416b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((a) this.f3416b.get(i11)).f3417m >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f3416b.get(i11);
            this.f3416b.remove(i11);
            return aVar.f3417m;
        }

        private void l(int i10, int i11) {
            List list = this.f3416b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3416b.get(size);
                int i12 = aVar.f3417m;
                if (i12 >= i10) {
                    aVar.f3417m = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f3416b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3416b.get(size);
                int i13 = aVar.f3417m;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f3416b.remove(size);
                    } else {
                        aVar.f3417m = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f3416b == null) {
                this.f3416b = new ArrayList();
            }
            int size = this.f3416b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f3416b.get(i10);
                if (aVar2.f3417m == aVar.f3417m) {
                    this.f3416b.remove(i10);
                }
                if (aVar2.f3417m >= aVar.f3417m) {
                    this.f3416b.add(i10, aVar);
                    return;
                }
            }
            this.f3416b.add(aVar);
        }

        void b() {
            int[] iArr = this.f3415a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3416b = null;
        }

        void c(int i10) {
            int[] iArr = this.f3415a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f3415a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3415a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3415a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List list = this.f3416b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f3416b.get(size)).f3417m >= i10) {
                        this.f3416b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List list = this.f3416b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f3416b.get(i13);
                int i14 = aVar.f3417m;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f3418n == i12 || (z10 && aVar.f3420p))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f3416b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f3416b.get(size);
                if (aVar.f3417m == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f3415a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f3415a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f3415a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3415a.length;
            }
            int i12 = i11 + 1;
            Arrays.fill(this.f3415a, i10, i12, -1);
            return i12;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f3415a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3415a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f3415a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f3415a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f3415a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f3415a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f3415a[i10] = fVar.f3435e;
        }

        int o(int i10) {
            int length = this.f3415a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: m, reason: collision with root package name */
        int f3421m;

        /* renamed from: n, reason: collision with root package name */
        int f3422n;

        /* renamed from: o, reason: collision with root package name */
        int f3423o;

        /* renamed from: p, reason: collision with root package name */
        int[] f3424p;

        /* renamed from: q, reason: collision with root package name */
        int f3425q;

        /* renamed from: r, reason: collision with root package name */
        int[] f3426r;

        /* renamed from: s, reason: collision with root package name */
        List f3427s;

        /* renamed from: t, reason: collision with root package name */
        boolean f3428t;

        /* renamed from: u, reason: collision with root package name */
        boolean f3429u;

        /* renamed from: v, reason: collision with root package name */
        boolean f3430v;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f3421m = parcel.readInt();
            this.f3422n = parcel.readInt();
            int i10 = parcel.readInt();
            this.f3423o = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f3424p = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f3425q = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f3426r = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3428t = parcel.readInt() == 1;
            this.f3429u = parcel.readInt() == 1;
            this.f3430v = parcel.readInt() == 1;
            this.f3427s = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f3423o = eVar.f3423o;
            this.f3421m = eVar.f3421m;
            this.f3422n = eVar.f3422n;
            this.f3424p = eVar.f3424p;
            this.f3425q = eVar.f3425q;
            this.f3426r = eVar.f3426r;
            this.f3428t = eVar.f3428t;
            this.f3429u = eVar.f3429u;
            this.f3430v = eVar.f3430v;
            this.f3427s = eVar.f3427s;
        }

        void a() {
            this.f3424p = null;
            this.f3423o = 0;
            this.f3421m = -1;
            this.f3422n = -1;
        }

        void b() {
            this.f3424p = null;
            this.f3423o = 0;
            this.f3425q = 0;
            this.f3426r = null;
            this.f3427s = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3421m);
            parcel.writeInt(this.f3422n);
            parcel.writeInt(this.f3423o);
            if (this.f3423o > 0) {
                parcel.writeIntArray(this.f3424p);
            }
            parcel.writeInt(this.f3425q);
            if (this.f3425q > 0) {
                parcel.writeIntArray(this.f3426r);
            }
            parcel.writeInt(this.f3428t ? 1 : 0);
            parcel.writeInt(this.f3429u ? 1 : 0);
            parcel.writeInt(this.f3430v ? 1 : 0);
            parcel.writeList(this.f3427s);
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f3431a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f3432b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f3433c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f3434d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f3435e;

        f(int i10) {
            this.f3435e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f3413e = this;
            this.f3431a.add(view);
            this.f3433c = Integer.MIN_VALUE;
            if (this.f3431a.size() == 1) {
                this.f3432b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3434d += StaggeredGridLayoutManager.this.f3399u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f3399u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f3399u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f3433c = iL;
                    this.f3432b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList arrayList = this.f3431a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f3433c = StaggeredGridLayoutManager.this.f3399u.d(view);
            if (cVarN.f3414f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f3418n == 1) {
                this.f3433c += aVarF.a(this.f3435e);
            }
        }

        void d() {
            d.a aVarF;
            View view = (View) this.f3431a.get(0);
            c cVarN = n(view);
            this.f3432b = StaggeredGridLayoutManager.this.f3399u.g(view);
            if (cVarN.f3414f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f3418n == -1) {
                this.f3432b -= aVarF.a(this.f3435e);
            }
        }

        void e() {
            this.f3431a.clear();
            q();
            this.f3434d = 0;
        }

        public int f() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f3404z) {
                size = this.f3431a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f3431a.size();
            }
            return i(size, size2, true);
        }

        public int g() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f3404z) {
                size = 0;
                size2 = this.f3431a.size();
            } else {
                size = this.f3431a.size() - 1;
                size2 = -1;
            }
            return i(size, size2, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f3399u.m();
            int i12 = StaggeredGridLayoutManager.this.f3399u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f3431a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f3399u.g(view);
                int iD = StaggeredGridLayoutManager.this.f3399u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (z11 || iG < iM || iD > i12) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f3434d;
        }

        int k() {
            int i10 = this.f3433c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3433c;
        }

        int l(int i10) {
            int i11 = this.f3433c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3431a.size() == 0) {
                return i10;
            }
            c();
            return this.f3433c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3431a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f3431a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3404z && staggeredGridLayoutManager.h0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3404z && staggeredGridLayoutManager2.h0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3431a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = (View) this.f3431a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3404z && staggeredGridLayoutManager3.h0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3404z && staggeredGridLayoutManager4.h0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f3432b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3432b;
        }

        int p(int i10) {
            int i11 = this.f3432b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3431a.size() == 0) {
                return i10;
            }
            d();
            return this.f3432b;
        }

        void q() {
            this.f3432b = Integer.MIN_VALUE;
            this.f3433c = Integer.MIN_VALUE;
        }

        void r(int i10) {
            int i11 = this.f3432b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3432b = i11 + i10;
            }
            int i12 = this.f3433c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3433c = i12 + i10;
            }
        }

        void s() {
            int size = this.f3431a.size();
            View view = (View) this.f3431a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f3413e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f3434d -= StaggeredGridLayoutManager.this.f3399u.e(view);
            }
            if (size == 1) {
                this.f3432b = Integer.MIN_VALUE;
            }
            this.f3433c = Integer.MIN_VALUE;
        }

        void t() {
            View view = (View) this.f3431a.remove(0);
            c cVarN = n(view);
            cVarN.f3413e = null;
            if (this.f3431a.size() == 0) {
                this.f3433c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3434d -= StaggeredGridLayoutManager.this.f3399u.e(view);
            }
            this.f3432b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f3413e = this;
            this.f3431a.add(0, view);
            this.f3432b = Integer.MIN_VALUE;
            if (this.f3431a.size() == 1) {
                this.f3433c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f3434d += StaggeredGridLayoutManager.this.f3399u.e(view);
            }
        }

        void v(int i10) {
            this.f3432b = i10;
            this.f3433c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.o.d dVarI0 = RecyclerView.o.i0(context, attributeSet, i10, i11);
        H2(dVarI0.f3358a);
        J2(dVarI0.f3359b);
        I2(dVarI0.f3360c);
        this.f3403y = new androidx.recyclerview.widget.f();
        a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.f3555e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3551a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f3559i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f3552b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f3555e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f3557g
        L14:
            r2.B2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f3556f
        L1a:
            r2.C2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f3555e
            if (r0 != r1) goto L37
            int r0 = r4.f3556f
            int r1 = r2.m2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f3557g
            int r4 = r4.f3552b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f3557g
            int r0 = r2.n2(r0)
            int r1 = r4.f3557g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f3556f
            int r4 = r4.f3552b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    private void B2(RecyclerView.v vVar, int i10) {
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            View viewI = I(iJ);
            if (this.f3399u.g(viewI) < i10 || this.f3399u.q(viewI) < i10) {
                return;
            }
            c cVar = (c) viewI.getLayoutParams();
            if (cVar.f3414f) {
                for (int i11 = 0; i11 < this.f3397s; i11++) {
                    if (this.f3398t[i11].f3431a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3397s; i12++) {
                    this.f3398t[i12].s();
                }
            } else if (cVar.f3413e.f3431a.size() == 1) {
                return;
            } else {
                cVar.f3413e.s();
            }
            m1(viewI, vVar);
        }
    }

    private void C2(RecyclerView.v vVar, int i10) {
        while (J() > 0) {
            View viewI = I(0);
            if (this.f3399u.d(viewI) > i10 || this.f3399u.p(viewI) > i10) {
                return;
            }
            c cVar = (c) viewI.getLayoutParams();
            if (cVar.f3414f) {
                for (int i11 = 0; i11 < this.f3397s; i11++) {
                    if (this.f3398t[i11].f3431a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f3397s; i12++) {
                    this.f3398t[i12].t();
                }
            } else if (cVar.f3413e.f3431a.size() == 1) {
                return;
            } else {
                cVar.f3413e.t();
            }
            m1(viewI, vVar);
        }
    }

    private void D2() {
        if (this.f3400v.k() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int iJ = J();
        for (int i10 = 0; i10 < iJ; i10++) {
            View viewI = I(i10);
            float fE = this.f3400v.e(viewI);
            if (fE >= fMax) {
                if (((c) viewI.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f3397s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f3402x;
        int iRound = Math.round(fMax * this.f3397s);
        if (this.f3400v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f3400v.n());
        }
        P2(iRound);
        if (this.f3402x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iJ; i12++) {
            View viewI2 = I(i12);
            c cVar = (c) viewI2.getLayoutParams();
            if (!cVar.f3414f) {
                if (t2() && this.f3401w == 1) {
                    int i13 = this.f3397s;
                    int i14 = cVar.f3413e.f3435e;
                    viewI2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f3402x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f3413e.f3435e;
                    int i16 = this.f3401w;
                    int i17 = (this.f3402x * i15) - (i15 * i11);
                    if (i16 == 1) {
                        viewI2.offsetLeftAndRight(i17);
                    } else {
                        viewI2.offsetTopAndBottom(i17);
                    }
                }
            }
        }
    }

    private void E2() {
        this.A = (this.f3401w == 1 || !t2()) ? this.f3404z : !this.f3404z;
    }

    private void G2(int i10) {
        androidx.recyclerview.widget.f fVar = this.f3403y;
        fVar.f3555e = i10;
        fVar.f3554d = this.A != (i10 == -1) ? -1 : 1;
    }

    private void K2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3397s; i12++) {
            if (!this.f3398t[i12].f3431a.isEmpty()) {
                Q2(this.f3398t[i12], i10, i11);
            }
        }
    }

    private boolean L2(RecyclerView.a0 a0Var, b bVar) {
        boolean z10 = this.G;
        int iB = a0Var.b();
        bVar.f3406a = z10 ? g2(iB) : c2(iB);
        bVar.f3407b = Integer.MIN_VALUE;
        return true;
    }

    private void M1(View view) {
        for (int i10 = this.f3397s - 1; i10 >= 0; i10--) {
            this.f3398t[i10].a(view);
        }
    }

    private void N1(b bVar) {
        boolean z10;
        e eVar = this.I;
        int i10 = eVar.f3423o;
        if (i10 > 0) {
            if (i10 == this.f3397s) {
                for (int i11 = 0; i11 < this.f3397s; i11++) {
                    this.f3398t[i11].e();
                    e eVar2 = this.I;
                    int i12 = eVar2.f3424p[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f3429u ? this.f3399u.i() : this.f3399u.m();
                    }
                    this.f3398t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f3421m = eVar3.f3422n;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f3430v;
        I2(eVar4.f3428t);
        E2();
        e eVar5 = this.I;
        int i13 = eVar5.f3421m;
        if (i13 != -1) {
            this.C = i13;
            z10 = eVar5.f3429u;
        } else {
            z10 = this.A;
        }
        bVar.f3408c = z10;
        if (eVar5.f3425q > 1) {
            d dVar = this.E;
            dVar.f3415a = eVar5.f3426r;
            dVar.f3416b = eVar5.f3427s;
        }
    }

    private void O2(int i10, RecyclerView.a0 a0Var) {
        int iN;
        int iN2;
        int iC;
        androidx.recyclerview.widget.f fVar = this.f3403y;
        boolean z10 = false;
        fVar.f3552b = 0;
        fVar.f3553c = i10;
        if (!x0() || (iC = a0Var.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.A == (iC < i10)) {
                iN = this.f3399u.n();
                iN2 = 0;
            } else {
                iN2 = this.f3399u.n();
                iN = 0;
            }
        }
        if (M()) {
            this.f3403y.f3556f = this.f3399u.m() - iN2;
            this.f3403y.f3557g = this.f3399u.i() + iN;
        } else {
            this.f3403y.f3557g = this.f3399u.h() + iN;
            this.f3403y.f3556f = -iN2;
        }
        androidx.recyclerview.widget.f fVar2 = this.f3403y;
        fVar2.f3558h = false;
        fVar2.f3551a = true;
        if (this.f3399u.k() == 0 && this.f3399u.h() == 0) {
            z10 = true;
        }
        fVar2.f3559i = z10;
    }

    private void Q1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f3555e == 1) {
            if (cVar.f3414f) {
                M1(view);
                return;
            } else {
                cVar.f3413e.a(view);
                return;
            }
        }
        if (cVar.f3414f) {
            z2(view);
        } else {
            cVar.f3413e.u(view);
        }
    }

    private void Q2(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ > i11) {
                return;
            }
        } else if (fVar.k() - iJ < i11) {
            return;
        }
        this.B.set(fVar.f3435e, false);
    }

    private int R1(int i10) {
        if (J() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < j2()) != this.A ? -1 : 1;
    }

    private int R2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean T1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.f3399u.i()) {
                ArrayList arrayList = fVar.f3431a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f3414f;
            }
        } else if (fVar.o() > this.f3399u.m()) {
            return !fVar.n((View) fVar.f3431a.get(0)).f3414f;
        }
        return false;
    }

    private int U1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.a(a0Var, this.f3399u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int V1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.b(a0Var, this.f3399u, e2(!this.N), d2(!this.N), this, this.N, this.A);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.c(a0Var, this.f3399u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int X1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f3401w == 1) ? 1 : Integer.MIN_VALUE : this.f3401w == 0 ? 1 : Integer.MIN_VALUE : this.f3401w == 1 ? -1 : Integer.MIN_VALUE : this.f3401w == 0 ? -1 : Integer.MIN_VALUE : (this.f3401w != 1 && t2()) ? -1 : 1 : (this.f3401w != 1 && t2()) ? 1 : -1;
    }

    private d.a Y1(int i10) {
        d.a aVar = new d.a();
        aVar.f3419o = new int[this.f3397s];
        for (int i11 = 0; i11 < this.f3397s; i11++) {
            aVar.f3419o[i11] = i10 - this.f3398t[i11].l(i10);
        }
        return aVar;
    }

    private d.a Z1(int i10) {
        d.a aVar = new d.a();
        aVar.f3419o = new int[this.f3397s];
        for (int i11 = 0; i11 < this.f3397s; i11++) {
            aVar.f3419o[i11] = this.f3398t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void a2() {
        this.f3399u = i.b(this, this.f3401w);
        this.f3400v = i.b(this, 1 - this.f3401w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int b2(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar, RecyclerView.a0 a0Var) {
        f fVarP2;
        int iE;
        int i10;
        int iE2;
        int iE3;
        RecyclerView.o oVar;
        View view;
        int i11;
        int i12;
        boolean z10;
        ?? r92 = 0;
        this.B.set(0, this.f3397s, true);
        int i13 = this.f3403y.f3559i ? fVar.f3555e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar.f3555e == 1 ? fVar.f3557g + fVar.f3552b : fVar.f3556f - fVar.f3552b;
        K2(fVar.f3555e, i13);
        int i14 = this.A ? this.f3399u.i() : this.f3399u.m();
        boolean z11 = false;
        while (fVar.a(a0Var) && (this.f3403y.f3559i || !this.B.isEmpty())) {
            View viewB = fVar.b(vVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.E.g(iA);
            boolean z12 = iG == -1 ? true : r92;
            if (z12) {
                fVarP2 = cVar.f3414f ? this.f3398t[r92] : p2(fVar);
                this.E.n(iA, fVarP2);
            } else {
                fVarP2 = this.f3398t[iG];
            }
            f fVar2 = fVarP2;
            cVar.f3413e = fVar2;
            if (fVar.f3555e == 1) {
                d(viewB);
            } else {
                e(viewB, r92);
            }
            v2(viewB, cVar, r92);
            if (fVar.f3555e == 1) {
                int iL2 = cVar.f3414f ? l2(i14) : fVar2.l(i14);
                int iE4 = this.f3399u.e(viewB) + iL2;
                if (z12 && cVar.f3414f) {
                    d.a aVarY1 = Y1(iL2);
                    aVarY1.f3418n = -1;
                    aVarY1.f3417m = iA;
                    this.E.a(aVarY1);
                }
                i10 = iE4;
                iE = iL2;
            } else {
                int iO2 = cVar.f3414f ? o2(i14) : fVar2.p(i14);
                iE = iO2 - this.f3399u.e(viewB);
                if (z12 && cVar.f3414f) {
                    d.a aVarZ1 = Z1(iO2);
                    aVarZ1.f3418n = 1;
                    aVarZ1.f3417m = iA;
                    this.E.a(aVarZ1);
                }
                i10 = iO2;
            }
            if (cVar.f3414f && fVar.f3554d == -1) {
                if (z12) {
                    this.M = true;
                } else {
                    if (!(fVar.f3555e == 1 ? O1() : P1())) {
                        d.a aVarF = this.E.f(iA);
                        if (aVarF != null) {
                            aVarF.f3420p = true;
                        }
                        this.M = true;
                    }
                }
            }
            Q1(viewB, cVar, fVar);
            if (t2() && this.f3401w == 1) {
                int i15 = cVar.f3414f ? this.f3400v.i() : this.f3400v.i() - (((this.f3397s - 1) - fVar2.f3435e) * this.f3402x);
                iE3 = i15;
                iE2 = i15 - this.f3400v.e(viewB);
            } else {
                int iM = cVar.f3414f ? this.f3400v.m() : (fVar2.f3435e * this.f3402x) + this.f3400v.m();
                iE2 = iM;
                iE3 = this.f3400v.e(viewB) + iM;
            }
            if (this.f3401w == 1) {
                oVar = this;
                view = viewB;
                i11 = iE2;
                iE2 = iE;
                i12 = iE3;
            } else {
                oVar = this;
                view = viewB;
                i11 = iE;
                i12 = i10;
                i10 = iE3;
            }
            oVar.z0(view, i11, iE2, i12, i10);
            if (cVar.f3414f) {
                K2(this.f3403y.f3555e, i13);
            } else {
                Q2(fVar2, this.f3403y.f3555e, i13);
            }
            A2(vVar, this.f3403y);
            if (!this.f3403y.f3558h || !viewB.hasFocusable()) {
                z10 = false;
            } else if (cVar.f3414f) {
                this.B.clear();
                z10 = false;
            } else {
                z10 = false;
                this.B.set(fVar2.f3435e, false);
            }
            r92 = z10;
            z11 = true;
        }
        int i16 = r92;
        if (!z11) {
            A2(vVar, this.f3403y);
        }
        int iM2 = this.f3403y.f3555e == -1 ? this.f3399u.m() - o2(this.f3399u.m()) : l2(this.f3399u.i()) - this.f3399u.i();
        return iM2 > 0 ? Math.min(fVar.f3552b, iM2) : i16;
    }

    private int c2(int i10) {
        int iJ = J();
        for (int i11 = 0; i11 < iJ; i11++) {
            int iH0 = h0(I(i11));
            if (iH0 >= 0 && iH0 < i10) {
                return iH0;
            }
        }
        return 0;
    }

    private int g2(int i10) {
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            int iH0 = h0(I(iJ));
            if (iH0 >= 0 && iH0 < i10) {
                return iH0;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10;
        int iL2 = l2(Integer.MIN_VALUE);
        if (iL2 != Integer.MIN_VALUE && (i10 = this.f3399u.i() - iL2) > 0) {
            int i11 = i10 - (-F2(-i10, vVar, a0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f3399u.r(i11);
        }
    }

    private void i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int iM;
        int iO2 = o2(Integer.MAX_VALUE);
        if (iO2 != Integer.MAX_VALUE && (iM = iO2 - this.f3399u.m()) > 0) {
            int iF2 = iM - F2(iM, vVar, a0Var);
            if (!z10 || iF2 <= 0) {
                return;
            }
            this.f3399u.r(-iF2);
        }
    }

    private int l2(int i10) {
        int iL = this.f3398t[0].l(i10);
        for (int i11 = 1; i11 < this.f3397s; i11++) {
            int iL2 = this.f3398t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int m2(int i10) {
        int iP = this.f3398t[0].p(i10);
        for (int i11 = 1; i11 < this.f3397s; i11++) {
            int iP2 = this.f3398t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int n2(int i10) {
        int iL = this.f3398t[0].l(i10);
        for (int i11 = 1; i11 < this.f3397s; i11++) {
            int iL2 = this.f3398t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int o2(int i10) {
        int iP = this.f3398t[0].p(i10);
        for (int i11 = 1; i11 < this.f3397s; i11++) {
            int iP2 = this.f3398t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f p2(androidx.recyclerview.widget.f fVar) {
        int i10;
        int i11;
        int i12 = -1;
        if (x2(fVar.f3555e)) {
            i10 = this.f3397s - 1;
            i11 = -1;
        } else {
            i10 = 0;
            i12 = this.f3397s;
            i11 = 1;
        }
        f fVar2 = null;
        if (fVar.f3555e == 1) {
            int i13 = Integer.MAX_VALUE;
            int iM = this.f3399u.m();
            while (i10 != i12) {
                f fVar3 = this.f3398t[i10];
                int iL = fVar3.l(iM);
                if (iL < i13) {
                    fVar2 = fVar3;
                    i13 = iL;
                }
                i10 += i11;
            }
            return fVar2;
        }
        int i14 = Integer.MIN_VALUE;
        int i15 = this.f3399u.i();
        while (i10 != i12) {
            f fVar4 = this.f3398t[i10];
            int iP = fVar4.p(i15);
            if (iP > i14) {
                fVar2 = fVar4;
                i14 = iP;
            }
            i10 += i11;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.k2()
            goto Ld
        L9:
            int r0 = r6.j2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.j2()
            goto L51
        L4d:
            int r7 = r6.k2()
        L51:
            if (r3 > r7) goto L56
            r6.t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(int, int, int):void");
    }

    private void u2(View view, int i10, int i11, boolean z10) {
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iR2 = R2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iR22 = R2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? H1(view, iR2, iR22, cVar) : F1(view, iR2, iR22, cVar)) {
            view.measure(iR2, iR22);
        }
    }

    private void v2(View view, c cVar, boolean z10) {
        int iK;
        int iK2;
        if (cVar.f3414f) {
            if (this.f3401w != 1) {
                u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
            iK = this.J;
        } else {
            if (this.f3401w != 1) {
                iK = RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                iK2 = RecyclerView.o.K(this.f3402x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                u2(view, iK, iK2, z10);
            }
            iK = RecyclerView.o.K(this.f3402x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        iK2 = RecyclerView.o.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        u2(view, iK, iK2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean x2(int i10) {
        if (this.f3401w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == t2();
    }

    private void z2(View view) {
        for (int i10 = this.f3397s - 1; i10 >= 0; i10--) {
            this.f3398t[i10].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C0(int i10) {
        super.C0(i10);
        for (int i11 = 0; i11 < this.f3397s; i11++) {
            this.f3398t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i10, int i11) {
        int iN;
        int iN2;
        int iE0 = e0() + f0();
        int iG0 = g0() + d0();
        if (this.f3401w == 1) {
            iN2 = RecyclerView.o.n(i11, rect.height() + iG0, b0());
            iN = RecyclerView.o.n(i10, (this.f3402x * this.f3397s) + iE0, c0());
        } else {
            iN = RecyclerView.o.n(i10, rect.width() + iE0, c0());
            iN2 = RecyclerView.o.n(i11, (this.f3402x * this.f3397s) + iG0, b0());
        }
        B1(iN, iN2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.f3401w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D0(int i10) {
        super.D0(i10);
        for (int i11 = 0; i11 < this.f3397s; i11++) {
            this.f3398t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int F2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        y2(i10, a0Var);
        int iB2 = b2(vVar, this.f3403y, a0Var);
        if (this.f3403y.f3552b >= iB2) {
            i10 = i10 < 0 ? -iB2 : iB2;
        }
        this.f3399u.r(-i10);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.f3403y;
        fVar.f3552b = 0;
        A2(vVar, fVar);
        return i10;
    }

    public void H2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i10 == this.f3401w) {
            return;
        }
        this.f3401w = i10;
        i iVar = this.f3399u;
        this.f3399u = this.f3400v;
        this.f3400v = iVar;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        o1(this.P);
        for (int i10 = 0; i10 < this.f3397s; i10++) {
            this.f3398t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    public void I2(boolean z10) {
        g(null);
        e eVar = this.I;
        if (eVar != null && eVar.f3428t != z10) {
            eVar.f3428t = z10;
        }
        this.f3404z = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View viewB;
        View viewM;
        if (J() == 0 || (viewB = B(view)) == null) {
            return null;
        }
        E2();
        int iX1 = X1(i10);
        if (iX1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewB.getLayoutParams();
        boolean z10 = cVar.f3414f;
        f fVar = cVar.f3413e;
        int iK2 = iX1 == 1 ? k2() : j2();
        O2(iK2, a0Var);
        G2(iX1);
        androidx.recyclerview.widget.f fVar2 = this.f3403y;
        fVar2.f3553c = fVar2.f3554d + iK2;
        fVar2.f3552b = (int) (this.f3399u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f3403y;
        fVar3.f3558h = true;
        fVar3.f3551a = false;
        b2(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!z10 && (viewM = fVar.m(iK2, iX1)) != null && viewM != viewB) {
            return viewM;
        }
        if (x2(iX1)) {
            for (int i11 = this.f3397s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f3398t[i11].m(iK2, iX1);
                if (viewM2 != null && viewM2 != viewB) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3397s; i12++) {
                View viewM3 = this.f3398t[i12].m(iK2, iX1);
                if (viewM3 != null && viewM3 != viewB) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f3404z ^ true) == (iX1 == -1);
        if (!z10) {
            View viewC = C(z11 ? fVar.f() : fVar.g());
            if (viewC != null && viewC != viewB) {
                return viewC;
            }
        }
        if (x2(iX1)) {
            for (int i13 = this.f3397s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f3435e) {
                    f[] fVarArr = this.f3398t;
                    View viewC2 = C(z11 ? fVarArr[i13].f() : fVarArr[i13].g());
                    if (viewC2 != null && viewC2 != viewB) {
                        return viewC2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3397s; i14++) {
                f[] fVarArr2 = this.f3398t;
                View viewC3 = C(z11 ? fVarArr2[i14].f() : fVarArr2[i14].g());
                if (viewC3 != null && viewC3 != viewB) {
                    return viewC3;
                }
            }
        }
        return null;
    }

    public void J2(int i10) {
        g(null);
        if (i10 != this.f3397s) {
            s2();
            this.f3397s = i10;
            this.B = new BitSet(this.f3397s);
            this.f3398t = new f[this.f3397s];
            for (int i11 = 0; i11 < this.f3397s; i11++) {
                this.f3398t[i11] = new f(i11);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View viewE2 = e2(false);
            View viewD2 = d2(false);
            if (viewE2 == null || viewD2 == null) {
                return;
            }
            int iH0 = h0(viewE2);
            int iH02 = h0(viewD2);
            if (iH0 < iH02) {
                accessibilityEvent.setFromIndex(iH0);
                accessibilityEvent.setToIndex(iH02);
            } else {
                accessibilityEvent.setFromIndex(iH02);
                accessibilityEvent.setToIndex(iH0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.I == null;
    }

    boolean M2(RecyclerView.a0 a0Var, b bVar) {
        int i10;
        int iM;
        int iG;
        if (!a0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < a0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f3421m == -1 || eVar.f3423o < 1) {
                    View viewC = C(this.C);
                    if (viewC != null) {
                        bVar.f3406a = this.A ? k2() : j2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3408c) {
                                iM = this.f3399u.i() - this.D;
                                iG = this.f3399u.d(viewC);
                            } else {
                                iM = this.f3399u.m() + this.D;
                                iG = this.f3399u.g(viewC);
                            }
                            bVar.f3407b = iM - iG;
                            return true;
                        }
                        if (this.f3399u.e(viewC) > this.f3399u.n()) {
                            bVar.f3407b = bVar.f3408c ? this.f3399u.i() : this.f3399u.m();
                            return true;
                        }
                        int iG2 = this.f3399u.g(viewC) - this.f3399u.m();
                        if (iG2 < 0) {
                            bVar.f3407b = -iG2;
                            return true;
                        }
                        int i11 = this.f3399u.i() - this.f3399u.d(viewC);
                        if (i11 < 0) {
                            bVar.f3407b = i11;
                            return true;
                        }
                        bVar.f3407b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.C;
                        bVar.f3406a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f3408c = R1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f3409d = true;
                    }
                } else {
                    bVar.f3407b = Integer.MIN_VALUE;
                    bVar.f3406a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f3401w == 1 ? this.f3397s : super.N(vVar, a0Var);
    }

    void N2(RecyclerView.a0 a0Var, b bVar) {
        if (M2(a0Var, bVar) || L2(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f3406a = 0;
    }

    boolean O1() {
        int iL = this.f3398t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3397s; i10++) {
            if (this.f3398t[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.d dVar) {
        int iE;
        int i10;
        int iE2;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f3401w == 0) {
            iE = cVar.e();
            i10 = cVar.f3414f ? this.f3397s : 1;
            iE2 = -1;
            i11 = -1;
        } else {
            iE = -1;
            i10 = -1;
            iE2 = cVar.e();
            i11 = cVar.f3414f ? this.f3397s : 1;
        }
        dVar.a0(d.c.a(iE, i10, iE2, i11, false, false));
    }

    boolean P1() {
        int iP = this.f3398t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3397s; i10++) {
            if (this.f3398t[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void P2(int i10) {
        this.f3402x = i10 / this.f3397s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3400v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    boolean S1() {
        int iJ2;
        int iK2;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            iJ2 = k2();
            iK2 = j2();
        } else {
            iJ2 = j2();
            iK2 = k2();
        }
        if (iJ2 == 0 && r2() != null) {
            this.E.b();
        } else {
            if (!this.M) {
                return false;
            }
            int i10 = this.A ? -1 : 1;
            int i11 = iK2 + 1;
            d.a aVarE = this.E.e(iJ2, i11, i10, true);
            if (aVarE == null) {
                this.M = false;
                this.E.d(i11);
                return false;
            }
            d.a aVarE2 = this.E.e(iJ2, aVarE.f3417m, i10 * (-1), true);
            if (aVarE2 == null) {
                this.E.d(aVarE.f3417m);
            } else {
                this.E.d(aVarE2.f3417m + 1);
            }
        }
        u1();
        t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        q2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        q2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        w2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i10) {
        int iR1 = R1(i10);
        PointF pointF = new PointF();
        if (iR1 == 0) {
            return null;
        }
        if (this.f3401w == 0) {
            pointF.x = iR1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iR1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f3428t = this.f3404z;
        eVar.f3429u = this.G;
        eVar.f3430v = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f3415a) == null) {
            eVar.f3425q = 0;
        } else {
            eVar.f3426r = iArr;
            eVar.f3425q = iArr.length;
            eVar.f3427s = dVar.f3416b;
        }
        if (J() > 0) {
            eVar.f3421m = this.G ? k2() : j2();
            eVar.f3422n = f2();
            int i10 = this.f3397s;
            eVar.f3423o = i10;
            eVar.f3424p = new int[i10];
            for (int i11 = 0; i11 < this.f3397s; i11++) {
                if (this.G) {
                    iP = this.f3398t[i11].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f3399u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f3398t[i11].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f3399u.m();
                        iP -= iM;
                    }
                }
                eVar.f3424p[i11] = iP;
            }
        } else {
            eVar.f3421m = -1;
            eVar.f3422n = -1;
            eVar.f3423o = 0;
        }
        return eVar;
    }

    View d2(boolean z10) {
        int iM = this.f3399u.m();
        int i10 = this.f3399u.i();
        View view = null;
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            View viewI = I(iJ);
            int iG = this.f3399u.g(viewI);
            int iD = this.f3399u.d(viewI);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewI;
                }
                if (view == null) {
                    view = viewI;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(int i10) {
        if (i10 == 0) {
            S1();
        }
    }

    View e2(boolean z10) {
        int iM = this.f3399u.m();
        int i10 = this.f3399u.i();
        int iJ = J();
        View view = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            View viewI = I(i11);
            int iG = this.f3399u.g(viewI);
            if (this.f3399u.d(viewI) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewI;
                }
                if (view == null) {
                    view = viewI;
                }
            }
        }
        return view;
    }

    int f2() {
        View viewD2 = this.A ? d2(true) : e2(true);
        if (viewD2 == null) {
            return -1;
        }
        return h0(viewD2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f3401w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f3401w == 0 ? this.f3397s : super.k0(vVar, a0Var);
    }

    int k2() {
        int iJ = J();
        if (iJ == 0) {
            return 0;
        }
        return h0(I(iJ - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f3401w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int iL;
        int iP;
        if (this.f3401w != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        y2(i10, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f3397s) {
            this.O = new int[this.f3397s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3397s; i13++) {
            androidx.recyclerview.widget.f fVar = this.f3403y;
            if (fVar.f3554d == -1) {
                iL = fVar.f3556f;
                iP = this.f3398t[i13].p(iL);
            } else {
                iL = this.f3398t[i13].l(fVar.f3557g);
                iP = this.f3403y.f3557g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f3403y.a(a0Var); i15++) {
            cVar.a(this.f3403y.f3553c, this.O[i15]);
            androidx.recyclerview.widget.f fVar2 = this.f3403y;
            fVar2.f3553c += fVar2.f3554d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View r2() {
        /*
            r12 = this;
            int r0 = r12.J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3397s
            r2.<init>(r3)
            int r3 = r12.f3397s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3401w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.t2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3413e
            int r9 = r9.f3435e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3413e
            boolean r9 = r12.T1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3413e
            int r9 = r9.f3435e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3414f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.i r10 = r12.f3399u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f3399u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.i r10 = r12.f3399u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f3399u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3413e
            int r8 = r8.f3435e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3413e
            int r9 = r9.f3435e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return this.F != 0;
    }

    public void s2() {
        this.E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    boolean t2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return F2(i10, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i10) {
        e eVar = this.I;
        if (eVar != null && eVar.f3421m != i10) {
            eVar.a();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return F2(i10, vVar, a0Var);
    }

    void y2(int i10, RecyclerView.a0 a0Var) {
        int i11;
        int iJ2;
        if (i10 > 0) {
            iJ2 = k2();
            i11 = 1;
        } else {
            i11 = -1;
            iJ2 = j2();
        }
        this.f3403y.f3551a = true;
        O2(iJ2, a0Var);
        G2(i11);
        androidx.recyclerview.widget.f fVar = this.f3403y;
        fVar.f3553c = iJ2 + fVar.f3554d;
        fVar.f3552b = Math.abs(i10);
    }
}
