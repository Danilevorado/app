package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f25823t = {R.attr.colorBackground};

    /* renamed from: u, reason: collision with root package name */
    private static final d f25824u;

    /* renamed from: m, reason: collision with root package name */
    private boolean f25825m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25826n;

    /* renamed from: o, reason: collision with root package name */
    int f25827o;

    /* renamed from: p, reason: collision with root package name */
    int f25828p;

    /* renamed from: q, reason: collision with root package name */
    final Rect f25829q;

    /* renamed from: r, reason: collision with root package name */
    final Rect f25830r;

    /* renamed from: s, reason: collision with root package name */
    private final c f25831s;

    /* renamed from: p.a$a, reason: collision with other inner class name */
    class C0171a implements c {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f25832a;

        C0171a() {
        }

        @Override // p.c
        public View a() {
            return a.this;
        }

        @Override // p.c
        public void b(int i10, int i11, int i12, int i13) {
            a.this.f25830r.set(i10, i11, i12, i13);
            a aVar = a.this;
            Rect rect = aVar.f25829q;
            a.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // p.c
        public void c(Drawable drawable) {
            this.f25832a = drawable;
            a.this.setBackgroundDrawable(drawable);
        }

        @Override // p.c
        public boolean d() {
            return a.this.getPreventCornerOverlap();
        }

        @Override // p.c
        public boolean e() {
            return a.this.getUseCompatPadding();
        }

        @Override // p.c
        public Drawable f() {
            return this.f25832a;
        }
    }

    static {
        b bVar = new b();
        f25824u = bVar;
        bVar.g();
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o.a.f25667a);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        Resources resources;
        int i11;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f25829q = rect;
        this.f25830r = new Rect();
        C0171a c0171a = new C0171a();
        this.f25831s = c0171a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.d.f25671a, i10, o.c.f25670a);
        int i12 = o.d.f25674d;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f25823t);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = o.b.f25669b;
            } else {
                resources = getResources();
                i11 = o.b.f25668a;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(o.d.f25675e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(o.d.f25676f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(o.d.f25677g, 0.0f);
        this.f25825m = typedArrayObtainStyledAttributes.getBoolean(o.d.f25679i, false);
        this.f25826n = typedArrayObtainStyledAttributes.getBoolean(o.d.f25678h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.d.f25680j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.d.f25682l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.d.f25684n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.d.f25683m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.d.f25681k, dimensionPixelSize);
        float f5 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f25827o = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.d.f25672b, 0);
        this.f25828p = typedArrayObtainStyledAttributes.getDimensionPixelSize(o.d.f25673c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f25824u.c(c0171a, context, colorStateList, dimension, dimension2, f5);
    }

    public ColorStateList getCardBackgroundColor() {
        return f25824u.b(this.f25831s);
    }

    public float getCardElevation() {
        return f25824u.i(this.f25831s);
    }

    public int getContentPaddingBottom() {
        return this.f25829q.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f25829q.left;
    }

    public int getContentPaddingRight() {
        return this.f25829q.right;
    }

    public int getContentPaddingTop() {
        return this.f25829q.top;
    }

    public float getMaxCardElevation() {
        return f25824u.j(this.f25831s);
    }

    public boolean getPreventCornerOverlap() {
        return this.f25826n;
    }

    public float getRadius() {
        return f25824u.e(this.f25831s);
    }

    public boolean getUseCompatPadding() {
        return this.f25825m;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(f25824u instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.h(this.f25831s)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.d(this.f25831s)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f25824u.a(this.f25831s, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f25824u.a(this.f25831s, colorStateList);
    }

    public void setCardElevation(float f5) {
        f25824u.k(this.f25831s, f5);
    }

    public void setMaxCardElevation(float f5) {
        f25824u.l(this.f25831s, f5);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f25828p = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f25827o = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f25826n) {
            this.f25826n = z10;
            f25824u.n(this.f25831s);
        }
    }

    public void setRadius(float f5) {
        f25824u.m(this.f25831s, f5);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f25825m != z10) {
            this.f25825m = z10;
            f25824u.f(this.f25831s);
        }
    }
}
