package s5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final s5.c f26960m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    d f26961a;

    /* renamed from: b, reason: collision with root package name */
    d f26962b;

    /* renamed from: c, reason: collision with root package name */
    d f26963c;

    /* renamed from: d, reason: collision with root package name */
    d f26964d;

    /* renamed from: e, reason: collision with root package name */
    s5.c f26965e;

    /* renamed from: f, reason: collision with root package name */
    s5.c f26966f;

    /* renamed from: g, reason: collision with root package name */
    s5.c f26967g;

    /* renamed from: h, reason: collision with root package name */
    s5.c f26968h;

    /* renamed from: i, reason: collision with root package name */
    f f26969i;

    /* renamed from: j, reason: collision with root package name */
    f f26970j;

    /* renamed from: k, reason: collision with root package name */
    f f26971k;

    /* renamed from: l, reason: collision with root package name */
    f f26972l;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f26973a;

        /* renamed from: b, reason: collision with root package name */
        private d f26974b;

        /* renamed from: c, reason: collision with root package name */
        private d f26975c;

        /* renamed from: d, reason: collision with root package name */
        private d f26976d;

        /* renamed from: e, reason: collision with root package name */
        private s5.c f26977e;

        /* renamed from: f, reason: collision with root package name */
        private s5.c f26978f;

        /* renamed from: g, reason: collision with root package name */
        private s5.c f26979g;

        /* renamed from: h, reason: collision with root package name */
        private s5.c f26980h;

        /* renamed from: i, reason: collision with root package name */
        private f f26981i;

        /* renamed from: j, reason: collision with root package name */
        private f f26982j;

        /* renamed from: k, reason: collision with root package name */
        private f f26983k;

        /* renamed from: l, reason: collision with root package name */
        private f f26984l;

        public b() {
            this.f26973a = h.b();
            this.f26974b = h.b();
            this.f26975c = h.b();
            this.f26976d = h.b();
            this.f26977e = new s5.a(0.0f);
            this.f26978f = new s5.a(0.0f);
            this.f26979g = new s5.a(0.0f);
            this.f26980h = new s5.a(0.0f);
            this.f26981i = h.c();
            this.f26982j = h.c();
            this.f26983k = h.c();
            this.f26984l = h.c();
        }

        public b(k kVar) {
            this.f26973a = h.b();
            this.f26974b = h.b();
            this.f26975c = h.b();
            this.f26976d = h.b();
            this.f26977e = new s5.a(0.0f);
            this.f26978f = new s5.a(0.0f);
            this.f26979g = new s5.a(0.0f);
            this.f26980h = new s5.a(0.0f);
            this.f26981i = h.c();
            this.f26982j = h.c();
            this.f26983k = h.c();
            this.f26984l = h.c();
            this.f26973a = kVar.f26961a;
            this.f26974b = kVar.f26962b;
            this.f26975c = kVar.f26963c;
            this.f26976d = kVar.f26964d;
            this.f26977e = kVar.f26965e;
            this.f26978f = kVar.f26966f;
            this.f26979g = kVar.f26967g;
            this.f26980h = kVar.f26968h;
            this.f26981i = kVar.f26969i;
            this.f26982j = kVar.f26970j;
            this.f26983k = kVar.f26971k;
            this.f26984l = kVar.f26972l;
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f26959a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f26918a;
            }
            return -1.0f;
        }

        public b A(float f5) {
            this.f26977e = new s5.a(f5);
            return this;
        }

        public b B(s5.c cVar) {
            this.f26977e = cVar;
            return this;
        }

        public b C(int i10, s5.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(d dVar) {
            this.f26974b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f5) {
            this.f26978f = new s5.a(f5);
            return this;
        }

        public b F(s5.c cVar) {
            this.f26978f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f5) {
            return A(f5).E(f5).w(f5).s(f5);
        }

        public b p(s5.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, s5.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f26976d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f5) {
            this.f26980h = new s5.a(f5);
            return this;
        }

        public b t(s5.c cVar) {
            this.f26980h = cVar;
            return this;
        }

        public b u(int i10, s5.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f26975c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f5) {
            this.f26979g = new s5.a(f5);
            return this;
        }

        public b x(s5.c cVar) {
            this.f26979g = cVar;
            return this;
        }

        public b y(int i10, s5.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(d dVar) {
            this.f26973a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }
    }

    public interface c {
        s5.c a(s5.c cVar);
    }

    public k() {
        this.f26961a = h.b();
        this.f26962b = h.b();
        this.f26963c = h.b();
        this.f26964d = h.b();
        this.f26965e = new s5.a(0.0f);
        this.f26966f = new s5.a(0.0f);
        this.f26967g = new s5.a(0.0f);
        this.f26968h = new s5.a(0.0f);
        this.f26969i = h.c();
        this.f26970j = h.c();
        this.f26971k = h.c();
        this.f26972l = h.c();
    }

    private k(b bVar) {
        this.f26961a = bVar.f26973a;
        this.f26962b = bVar.f26974b;
        this.f26963c = bVar.f26975c;
        this.f26964d = bVar.f26976d;
        this.f26965e = bVar.f26977e;
        this.f26966f = bVar.f26978f;
        this.f26967g = bVar.f26979g;
        this.f26968h = bVar.f26980h;
        this.f26969i = bVar.f26981i;
        this.f26970j = bVar.f26982j;
        this.f26971k = bVar.f26983k;
        this.f26972l = bVar.f26984l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new s5.a(i12));
    }

    private static b d(Context context, int i10, int i11, s5.c cVar) throws Resources.NotFoundException {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, c5.k.f4846d4);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(c5.k.f4854e4, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(c5.k.f4876h4, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(c5.k.f4884i4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(c5.k.f4868g4, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(c5.k.f4861f4, i12);
            s5.c cVarM = m(typedArrayObtainStyledAttributes, c5.k.f4892j4, cVar);
            s5.c cVarM2 = m(typedArrayObtainStyledAttributes, c5.k.f4916m4, cVarM);
            s5.c cVarM3 = m(typedArrayObtainStyledAttributes, c5.k.f4924n4, cVarM);
            s5.c cVarM4 = m(typedArrayObtainStyledAttributes, c5.k.f4908l4, cVarM);
            return new b().y(i13, cVarM2).C(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, c5.k.f4900k4, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new s5.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, s5.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c5.k.f4899k3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c5.k.f4907l3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(c5.k.f4915m3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static s5.c m(TypedArray typedArray, int i10, s5.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i11 = typedValuePeekValue.type;
        return i11 == 5 ? new s5.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f26971k;
    }

    public d i() {
        return this.f26964d;
    }

    public s5.c j() {
        return this.f26968h;
    }

    public d k() {
        return this.f26963c;
    }

    public s5.c l() {
        return this.f26967g;
    }

    public f n() {
        return this.f26972l;
    }

    public f o() {
        return this.f26970j;
    }

    public f p() {
        return this.f26969i;
    }

    public d q() {
        return this.f26961a;
    }

    public s5.c r() {
        return this.f26965e;
    }

    public d s() {
        return this.f26962b;
    }

    public s5.c t() {
        return this.f26966f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f26972l.getClass().equals(f.class) && this.f26970j.getClass().equals(f.class) && this.f26969i.getClass().equals(f.class) && this.f26971k.getClass().equals(f.class);
        float fA = this.f26965e.a(rectF);
        return z10 && ((this.f26966f.a(rectF) > fA ? 1 : (this.f26966f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f26968h.a(rectF) > fA ? 1 : (this.f26968h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f26967g.a(rectF) > fA ? 1 : (this.f26967g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f26962b instanceof j) && (this.f26961a instanceof j) && (this.f26963c instanceof j) && (this.f26964d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f5) {
        return v().o(f5).m();
    }

    public k x(s5.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}
