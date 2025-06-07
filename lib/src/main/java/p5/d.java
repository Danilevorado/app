package p5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;
import c5.k;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f25928a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f25929b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f25930c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25932e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25933f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25934g;

    /* renamed from: h, reason: collision with root package name */
    public final float f25935h;

    /* renamed from: i, reason: collision with root package name */
    public final float f25936i;

    /* renamed from: j, reason: collision with root package name */
    public final float f25937j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f25938k;

    /* renamed from: l, reason: collision with root package name */
    public final float f25939l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f25940m;

    /* renamed from: n, reason: collision with root package name */
    private float f25941n;

    /* renamed from: o, reason: collision with root package name */
    private final int f25942o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25943p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f25944q;

    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f25945a;

        a(f fVar) {
            this.f25945a = fVar;
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: h */
        public void f(int i10) {
            d.this.f25943p = true;
            this.f25945a.a(i10);
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f25944q = Typeface.create(typeface, dVar.f25932e);
            d.this.f25943p = true;
            this.f25945a.b(d.this.f25944q, false);
        }
    }

    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f25947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f25948b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f25949c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f25947a = context;
            this.f25948b = textPaint;
            this.f25949c = fVar;
        }

        @Override // p5.f
        public void a(int i10) {
            this.f25949c.a(i10);
        }

        @Override // p5.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f25947a, this.f25948b, typeface);
            this.f25949c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.J4);
        l(typedArrayObtainStyledAttributes.getDimension(k.K4, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, k.N4));
        this.f25928a = c.a(context, typedArrayObtainStyledAttributes, k.O4);
        this.f25929b = c.a(context, typedArrayObtainStyledAttributes, k.P4);
        this.f25932e = typedArrayObtainStyledAttributes.getInt(k.M4, 0);
        this.f25933f = typedArrayObtainStyledAttributes.getInt(k.L4, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, k.V4, k.U4);
        this.f25942o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f25931d = typedArrayObtainStyledAttributes.getString(iE);
        this.f25934g = typedArrayObtainStyledAttributes.getBoolean(k.W4, false);
        this.f25930c = c.a(context, typedArrayObtainStyledAttributes, k.Q4);
        this.f25935h = typedArrayObtainStyledAttributes.getFloat(k.R4, 0.0f);
        this.f25936i = typedArrayObtainStyledAttributes.getFloat(k.S4, 0.0f);
        this.f25937j = typedArrayObtainStyledAttributes.getFloat(k.T4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f4923n3);
        int i11 = k.f4930o3;
        this.f25938k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f25939l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f25944q == null && (str = this.f25931d) != null) {
            this.f25944q = Typeface.create(str, this.f25932e);
        }
        if (this.f25944q == null) {
            int i10 = this.f25933f;
            this.f25944q = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f25944q = Typeface.create(this.f25944q, this.f25932e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f25942o;
        return (i10 != 0 ? h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f25944q;
    }

    public Typeface f(Context context) {
        if (this.f25943p) {
            return this.f25944q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = h.g(context, this.f25942o);
                this.f25944q = typefaceG;
                if (typefaceG != null) {
                    this.f25944q = Typeface.create(typefaceG, this.f25932e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e5) {
                Log.d("TextAppearance", "Error loading font " + this.f25931d, e5);
            }
        }
        d();
        this.f25943p = true;
        return this.f25944q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f25942o;
        if (i10 == 0) {
            this.f25943p = true;
        }
        if (this.f25943p) {
            fVar.b(this.f25944q, true);
            return;
        }
        try {
            h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f25943p = true;
            fVar.a(1);
        } catch (Exception e5) {
            Log.d("TextAppearance", "Error loading font " + this.f25931d, e5);
            this.f25943p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f25940m;
    }

    public float j() {
        return this.f25941n;
    }

    public void k(ColorStateList colorStateList) {
        this.f25940m = colorStateList;
    }

    public void l(float f5) {
        this.f25941n = f5;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f25940m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f5 = this.f25937j;
        float f10 = this.f25935h;
        float f11 = this.f25936i;
        ColorStateList colorStateList2 = this.f25930c;
        textPaint.setShadowLayer(f5, f10, f11, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = g.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f25932e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f25941n);
        if (this.f25938k) {
            textPaint.setLetterSpacing(this.f25939l);
        }
    }
}
