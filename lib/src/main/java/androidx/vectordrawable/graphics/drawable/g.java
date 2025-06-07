package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {

    /* renamed from: w, reason: collision with root package name */
    static final PorterDuff.Mode f3916w = PorterDuff.Mode.SRC_IN;

    /* renamed from: n, reason: collision with root package name */
    private h f3917n;

    /* renamed from: o, reason: collision with root package name */
    private PorterDuffColorFilter f3918o;

    /* renamed from: p, reason: collision with root package name */
    private ColorFilter f3919p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3920q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3921r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable.ConstantState f3922s;

    /* renamed from: t, reason: collision with root package name */
    private final float[] f3923t;

    /* renamed from: u, reason: collision with root package name */
    private final Matrix f3924u;

    /* renamed from: v, reason: collision with root package name */
    private final Rect f3925v;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3952b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3951a = androidx.core.graphics.d.d(string2);
            }
            this.f3953c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3891d);
                f(typedArrayK, xmlPullParser);
                typedArrayK.recycle();
            }
        }
    }

    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f3926e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f3927f;

        /* renamed from: g, reason: collision with root package name */
        float f3928g;

        /* renamed from: h, reason: collision with root package name */
        androidx.core.content.res.d f3929h;

        /* renamed from: i, reason: collision with root package name */
        float f3930i;

        /* renamed from: j, reason: collision with root package name */
        float f3931j;

        /* renamed from: k, reason: collision with root package name */
        float f3932k;

        /* renamed from: l, reason: collision with root package name */
        float f3933l;

        /* renamed from: m, reason: collision with root package name */
        float f3934m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f3935n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f3936o;

        /* renamed from: p, reason: collision with root package name */
        float f3937p;

        c() {
            this.f3928g = 0.0f;
            this.f3930i = 1.0f;
            this.f3931j = 1.0f;
            this.f3932k = 0.0f;
            this.f3933l = 1.0f;
            this.f3934m = 0.0f;
            this.f3935n = Paint.Cap.BUTT;
            this.f3936o = Paint.Join.MITER;
            this.f3937p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f3928g = 0.0f;
            this.f3930i = 1.0f;
            this.f3931j = 1.0f;
            this.f3932k = 0.0f;
            this.f3933l = 1.0f;
            this.f3934m = 0.0f;
            this.f3935n = Paint.Cap.BUTT;
            this.f3936o = Paint.Join.MITER;
            this.f3937p = 4.0f;
            this.f3926e = cVar.f3926e;
            this.f3927f = cVar.f3927f;
            this.f3928g = cVar.f3928g;
            this.f3930i = cVar.f3930i;
            this.f3929h = cVar.f3929h;
            this.f3953c = cVar.f3953c;
            this.f3931j = cVar.f3931j;
            this.f3932k = cVar.f3932k;
            this.f3933l = cVar.f3933l;
            this.f3934m = cVar.f3934m;
            this.f3935n = cVar.f3935n;
            this.f3936o = cVar.f3936o;
            this.f3937p = cVar.f3937p;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3926e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3952b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3951a = androidx.core.graphics.d.d(string2);
                }
                this.f3929h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f3931j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f3931j);
                this.f3935n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3935n);
                this.f3936o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3936o);
                this.f3937p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3937p);
                this.f3927f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f3930i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3930i);
                this.f3928g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f3928g);
                this.f3933l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3933l);
                this.f3934m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3934m);
                this.f3932k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f3932k);
                this.f3953c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f3953c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f3929h.i() || this.f3927f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f3927f.j(iArr) | this.f3929h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3890c);
            h(typedArrayK, xmlPullParser, theme);
            typedArrayK.recycle();
        }

        float getFillAlpha() {
            return this.f3931j;
        }

        int getFillColor() {
            return this.f3929h.e();
        }

        float getStrokeAlpha() {
            return this.f3930i;
        }

        int getStrokeColor() {
            return this.f3927f.e();
        }

        float getStrokeWidth() {
            return this.f3928g;
        }

        float getTrimPathEnd() {
            return this.f3933l;
        }

        float getTrimPathOffset() {
            return this.f3934m;
        }

        float getTrimPathStart() {
            return this.f3932k;
        }

        void setFillAlpha(float f5) {
            this.f3931j = f5;
        }

        void setFillColor(int i10) {
            this.f3929h.k(i10);
        }

        void setStrokeAlpha(float f5) {
            this.f3930i = f5;
        }

        void setStrokeColor(int i10) {
            this.f3927f.k(i10);
        }

        void setStrokeWidth(float f5) {
            this.f3928g = f5;
        }

        void setTrimPathEnd(float f5) {
            this.f3933l = f5;
        }

        void setTrimPathOffset(float f5) {
            this.f3934m = f5;
        }

        void setTrimPathStart(float f5) {
            this.f3932k = f5;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f3938a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f3939b;

        /* renamed from: c, reason: collision with root package name */
        float f3940c;

        /* renamed from: d, reason: collision with root package name */
        private float f3941d;

        /* renamed from: e, reason: collision with root package name */
        private float f3942e;

        /* renamed from: f, reason: collision with root package name */
        private float f3943f;

        /* renamed from: g, reason: collision with root package name */
        private float f3944g;

        /* renamed from: h, reason: collision with root package name */
        private float f3945h;

        /* renamed from: i, reason: collision with root package name */
        private float f3946i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f3947j;

        /* renamed from: k, reason: collision with root package name */
        int f3948k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f3949l;

        /* renamed from: m, reason: collision with root package name */
        private String f3950m;

        public d() {
            super();
            this.f3938a = new Matrix();
            this.f3939b = new ArrayList();
            this.f3940c = 0.0f;
            this.f3941d = 0.0f;
            this.f3942e = 0.0f;
            this.f3943f = 1.0f;
            this.f3944g = 1.0f;
            this.f3945h = 0.0f;
            this.f3946i = 0.0f;
            this.f3947j = new Matrix();
            this.f3950m = null;
        }

        public d(d dVar, q.a aVar) {
            f bVar;
            super();
            this.f3938a = new Matrix();
            this.f3939b = new ArrayList();
            this.f3940c = 0.0f;
            this.f3941d = 0.0f;
            this.f3942e = 0.0f;
            this.f3943f = 1.0f;
            this.f3944g = 1.0f;
            this.f3945h = 0.0f;
            this.f3946i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3947j = matrix;
            this.f3950m = null;
            this.f3940c = dVar.f3940c;
            this.f3941d = dVar.f3941d;
            this.f3942e = dVar.f3942e;
            this.f3943f = dVar.f3943f;
            this.f3944g = dVar.f3944g;
            this.f3945h = dVar.f3945h;
            this.f3946i = dVar.f3946i;
            this.f3949l = dVar.f3949l;
            String str = dVar.f3950m;
            this.f3950m = str;
            this.f3948k = dVar.f3948k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3947j);
            ArrayList arrayList = dVar.f3939b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f3939b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f3939b.add(bVar);
                    Object obj2 = bVar.f3952b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f3947j.reset();
            this.f3947j.postTranslate(-this.f3941d, -this.f3942e);
            this.f3947j.postScale(this.f3943f, this.f3944g);
            this.f3947j.postRotate(this.f3940c, 0.0f, 0.0f);
            this.f3947j.postTranslate(this.f3945h + this.f3941d, this.f3946i + this.f3942e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3949l = null;
            this.f3940c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f3940c);
            this.f3941d = typedArray.getFloat(1, this.f3941d);
            this.f3942e = typedArray.getFloat(2, this.f3942e);
            this.f3943f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f3943f);
            this.f3944g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f3944g);
            this.f3945h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f3945h);
            this.f3946i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f3946i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3950m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f3939b.size(); i10++) {
                if (((e) this.f3939b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f3939b.size(); i10++) {
                zB |= ((e) this.f3939b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3889b);
            e(typedArrayK, xmlPullParser);
            typedArrayK.recycle();
        }

        public String getGroupName() {
            return this.f3950m;
        }

        public Matrix getLocalMatrix() {
            return this.f3947j;
        }

        public float getPivotX() {
            return this.f3941d;
        }

        public float getPivotY() {
            return this.f3942e;
        }

        public float getRotation() {
            return this.f3940c;
        }

        public float getScaleX() {
            return this.f3943f;
        }

        public float getScaleY() {
            return this.f3944g;
        }

        public float getTranslateX() {
            return this.f3945h;
        }

        public float getTranslateY() {
            return this.f3946i;
        }

        public void setPivotX(float f5) {
            if (f5 != this.f3941d) {
                this.f3941d = f5;
                d();
            }
        }

        public void setPivotY(float f5) {
            if (f5 != this.f3942e) {
                this.f3942e = f5;
                d();
            }
        }

        public void setRotation(float f5) {
            if (f5 != this.f3940c) {
                this.f3940c = f5;
                d();
            }
        }

        public void setScaleX(float f5) {
            if (f5 != this.f3943f) {
                this.f3943f = f5;
                d();
            }
        }

        public void setScaleY(float f5) {
            if (f5 != this.f3944g) {
                this.f3944g = f5;
                d();
            }
        }

        public void setTranslateX(float f5) {
            if (f5 != this.f3945h) {
                this.f3945h = f5;
                d();
            }
        }

        public void setTranslateY(float f5) {
            if (f5 != this.f3946i) {
                this.f3946i = f5;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected d.b[] f3951a;

        /* renamed from: b, reason: collision with root package name */
        String f3952b;

        /* renamed from: c, reason: collision with root package name */
        int f3953c;

        /* renamed from: d, reason: collision with root package name */
        int f3954d;

        public f() {
            super();
            this.f3951a = null;
            this.f3953c = 0;
        }

        public f(f fVar) {
            super();
            this.f3951a = null;
            this.f3953c = 0;
            this.f3952b = fVar.f3952b;
            this.f3954d = fVar.f3954d;
            this.f3951a = androidx.core.graphics.d.f(fVar.f3951a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f3951a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f3951a;
        }

        public String getPathName() {
            return this.f3952b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (androidx.core.graphics.d.b(this.f3951a, bVarArr)) {
                androidx.core.graphics.d.j(this.f3951a, bVarArr);
            } else {
                this.f3951a = androidx.core.graphics.d.f(bVarArr);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g, reason: collision with other inner class name */
    private static class C0063g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f3955q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f3956a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f3957b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f3958c;

        /* renamed from: d, reason: collision with root package name */
        Paint f3959d;

        /* renamed from: e, reason: collision with root package name */
        Paint f3960e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f3961f;

        /* renamed from: g, reason: collision with root package name */
        private int f3962g;

        /* renamed from: h, reason: collision with root package name */
        final d f3963h;

        /* renamed from: i, reason: collision with root package name */
        float f3964i;

        /* renamed from: j, reason: collision with root package name */
        float f3965j;

        /* renamed from: k, reason: collision with root package name */
        float f3966k;

        /* renamed from: l, reason: collision with root package name */
        float f3967l;

        /* renamed from: m, reason: collision with root package name */
        int f3968m;

        /* renamed from: n, reason: collision with root package name */
        String f3969n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f3970o;

        /* renamed from: p, reason: collision with root package name */
        final q.a f3971p;

        public C0063g() {
            this.f3958c = new Matrix();
            this.f3964i = 0.0f;
            this.f3965j = 0.0f;
            this.f3966k = 0.0f;
            this.f3967l = 0.0f;
            this.f3968m = 255;
            this.f3969n = null;
            this.f3970o = null;
            this.f3971p = new q.a();
            this.f3963h = new d();
            this.f3956a = new Path();
            this.f3957b = new Path();
        }

        public C0063g(C0063g c0063g) {
            this.f3958c = new Matrix();
            this.f3964i = 0.0f;
            this.f3965j = 0.0f;
            this.f3966k = 0.0f;
            this.f3967l = 0.0f;
            this.f3968m = 255;
            this.f3969n = null;
            this.f3970o = null;
            q.a aVar = new q.a();
            this.f3971p = aVar;
            this.f3963h = new d(c0063g.f3963h, aVar);
            this.f3956a = new Path(c0063g.f3956a);
            this.f3957b = new Path(c0063g.f3957b);
            this.f3964i = c0063g.f3964i;
            this.f3965j = c0063g.f3965j;
            this.f3966k = c0063g.f3966k;
            this.f3967l = c0063g.f3967l;
            this.f3962g = c0063g.f3962g;
            this.f3968m = c0063g.f3968m;
            this.f3969n = c0063g.f3969n;
            String str = c0063g.f3969n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3970o = c0063g.f3970o;
        }

        private static float a(float f5, float f10, float f11, float f12) {
            return (f5 * f12) - (f10 * f11);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f3938a.set(matrix);
            dVar.f3938a.preConcat(dVar.f3947j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f3939b.size(); i12++) {
                e eVar = (e) dVar.f3939b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f3938a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f5 = i10 / this.f3966k;
            float f10 = i11 / this.f3967l;
            float fMin = Math.min(f5, f10);
            Matrix matrix = dVar.f3938a;
            this.f3958c.set(matrix);
            this.f3958c.postScale(f5, f10);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f3956a);
            Path path = this.f3956a;
            this.f3957b.reset();
            if (fVar.c()) {
                this.f3957b.setFillType(fVar.f3953c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3957b.addPath(path, this.f3958c);
                canvas.clipPath(this.f3957b);
                return;
            }
            c cVar = (c) fVar;
            float f11 = cVar.f3932k;
            if (f11 != 0.0f || cVar.f3933l != 1.0f) {
                float f12 = cVar.f3934m;
                float f13 = (f11 + f12) % 1.0f;
                float f14 = (cVar.f3933l + f12) % 1.0f;
                if (this.f3961f == null) {
                    this.f3961f = new PathMeasure();
                }
                this.f3961f.setPath(this.f3956a, false);
                float length = this.f3961f.getLength();
                float f15 = f13 * length;
                float f16 = f14 * length;
                path.reset();
                if (f15 > f16) {
                    this.f3961f.getSegment(f15, length, path, true);
                    this.f3961f.getSegment(0.0f, f16, path, true);
                } else {
                    this.f3961f.getSegment(f15, f16, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3957b.addPath(path, this.f3958c);
            if (cVar.f3929h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f3929h;
                if (this.f3960e == null) {
                    Paint paint = new Paint(1);
                    this.f3960e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3960e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f3958c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f3931j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f3931j));
                }
                paint2.setColorFilter(colorFilter);
                this.f3957b.setFillType(cVar.f3953c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3957b, paint2);
            }
            if (cVar.f3927f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f3927f;
                if (this.f3959d == null) {
                    Paint paint3 = new Paint(1);
                    this.f3959d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3959d;
                Paint.Join join = cVar.f3936o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f3935n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f3937p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f3958c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f3930i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f3930i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f3928g * fMin * fE);
                canvas.drawPath(this.f3957b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f3963h, f3955q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f3970o == null) {
                this.f3970o = Boolean.valueOf(this.f3963h.a());
            }
            return this.f3970o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3963h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3968m;
        }

        public void setAlpha(float f5) {
            setRootAlpha((int) (f5 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f3968m = i10;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f3972a;

        /* renamed from: b, reason: collision with root package name */
        C0063g f3973b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f3974c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f3975d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3976e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f3977f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f3978g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f3979h;

        /* renamed from: i, reason: collision with root package name */
        int f3980i;

        /* renamed from: j, reason: collision with root package name */
        boolean f3981j;

        /* renamed from: k, reason: collision with root package name */
        boolean f3982k;

        /* renamed from: l, reason: collision with root package name */
        Paint f3983l;

        public h() {
            this.f3974c = null;
            this.f3975d = g.f3916w;
            this.f3973b = new C0063g();
        }

        public h(h hVar) {
            this.f3974c = null;
            this.f3975d = g.f3916w;
            if (hVar != null) {
                this.f3972a = hVar.f3972a;
                C0063g c0063g = new C0063g(hVar.f3973b);
                this.f3973b = c0063g;
                if (hVar.f3973b.f3960e != null) {
                    c0063g.f3960e = new Paint(hVar.f3973b.f3960e);
                }
                if (hVar.f3973b.f3959d != null) {
                    this.f3973b.f3959d = new Paint(hVar.f3973b.f3959d);
                }
                this.f3974c = hVar.f3974c;
                this.f3975d = hVar.f3975d;
                this.f3976e = hVar.f3976e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f3977f.getWidth() && i11 == this.f3977f.getHeight();
        }

        public boolean b() {
            return !this.f3982k && this.f3978g == this.f3974c && this.f3979h == this.f3975d && this.f3981j == this.f3976e && this.f3980i == this.f3973b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f3977f == null || !a(i10, i11)) {
                this.f3977f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f3982k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3977f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3983l == null) {
                Paint paint = new Paint();
                this.f3983l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3983l.setAlpha(this.f3973b.getRootAlpha());
            this.f3983l.setColorFilter(colorFilter);
            return this.f3983l;
        }

        public boolean f() {
            return this.f3973b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3973b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3972a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f3973b.g(iArr);
            this.f3982k |= zG;
            return zG;
        }

        public void i() {
            this.f3978g = this.f3974c;
            this.f3979h = this.f3975d;
            this.f3980i = this.f3973b.getRootAlpha();
            this.f3981j = this.f3976e;
            this.f3982k = false;
        }

        public void j(int i10, int i11) {
            this.f3977f.eraseColor(0);
            this.f3973b.b(new Canvas(this.f3977f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f3984a;

        public i(Drawable.ConstantState constantState) {
            this.f3984a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3984a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3984a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f3915m = (VectorDrawable) this.f3984a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f3915m = (VectorDrawable) this.f3984a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f3915m = (VectorDrawable) this.f3984a.newDrawable(resources, theme);
            return gVar;
        }
    }

    g() {
        this.f3921r = true;
        this.f3923t = new float[9];
        this.f3924u = new Matrix();
        this.f3925v = new Rect();
        this.f3917n = new h();
    }

    g(h hVar) {
        this.f3921r = true;
        this.f3923t = new float[9];
        this.f3924u = new Matrix();
        this.f3925v = new Rect();
        this.f3917n = hVar;
        this.f3918o = j(this.f3918o, hVar.f3974c, hVar.f3975d);
    }

    static int a(int i10, float f5) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f5)) << 24);
    }

    public static g b(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f3915m = androidx.core.content.res.h.e(resources, i10, theme);
            gVar.f3922s = new i(gVar.f3915m.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e5) {
            Log.e("VectorDrawableCompat", "parser error", e5);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        b bVar;
        h hVar = this.f3917n;
        C0063g c0063g = hVar.f3973b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0063g.f3963h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3939b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0063g.f3971p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3939b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        c0063g.f3971p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3939b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0063g.f3971p.put(dVar2.getGroupName(), dVar2);
                    }
                    i10 = hVar.f3972a;
                    i11 = dVar2.f3948k;
                    hVar.f3972a = i11 | i10;
                }
                i10 = hVar.f3972a;
                i11 = bVar.f3954d;
                hVar.f3972a = i11 | i10;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f3917n;
        C0063g c0063g = hVar.f3973b;
        hVar.f3975d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f3974c = colorStateListC;
        }
        hVar.f3976e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3976e);
        c0063g.f3966k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, c0063g.f3966k);
        float f5 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, c0063g.f3967l);
        c0063g.f3967l = f5;
        if (c0063g.f3966k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0063g.f3964i = typedArray.getDimension(3, c0063g.f3964i);
        float dimension = typedArray.getDimension(2, c0063g.f3965j);
        c0063g.f3965j = dimension;
        if (c0063g.f3964i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0063g.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, c0063g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0063g.f3969n = string;
            c0063g.f3971p.put(string, c0063g);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3915m;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f3917n.f3973b.f3971p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3925v);
        if (this.f3925v.width() <= 0 || this.f3925v.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3919p;
        if (colorFilter == null) {
            colorFilter = this.f3918o;
        }
        canvas.getMatrix(this.f3924u);
        this.f3924u.getValues(this.f3923t);
        float fAbs = Math.abs(this.f3923t[0]);
        float fAbs2 = Math.abs(this.f3923t[4]);
        float fAbs3 = Math.abs(this.f3923t[1]);
        float fAbs4 = Math.abs(this.f3923t[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f3925v.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f3925v.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f3925v;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f3925v.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f3925v.offsetTo(0, 0);
        this.f3917n.c(iMin, iMin2);
        if (!this.f3921r) {
            this.f3917n.j(iMin, iMin2);
        } else if (!this.f3917n.b()) {
            this.f3917n.j(iMin, iMin2);
            this.f3917n.i();
        }
        this.f3917n.d(canvas, colorFilter, this.f3925v);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3915m;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3917n.f3973b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3917n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3915m;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3919p;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3915m != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3915m.getConstantState());
        }
        this.f3917n.f3972a = getChangingConfigurations();
        return this.f3917n;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3917n.f3973b.f3965j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3917n.f3973b.f3964i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z10) {
        this.f3921r = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3917n;
        hVar.f3973b = new C0063g();
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3888a);
        i(typedArrayK, xmlPullParser, theme);
        typedArrayK.recycle();
        hVar.f3972a = getChangingConfigurations();
        hVar.f3982k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3918o = j(this.f3918o, hVar.f3974c, hVar.f3975d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3915m;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3917n.f3976e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f3917n) != null && (hVar.g() || ((colorStateList = this.f3917n.f3974c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3920q && super.mutate() == this) {
            this.f3917n = new h(this.f3917n);
            this.f3920q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f3917n;
        ColorStateList colorStateList = hVar.f3974c;
        if (colorStateList != null && (mode = hVar.f3975d) != null) {
            this.f3918o = j(this.f3918o, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f3917n.f3973b.getRootAlpha() != i10) {
            this.f3917n.f3973b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f3917n.f3976e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3919p = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f5, float f10) {
        super.setHotspot(f5, f10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3917n;
        if (hVar.f3974c != colorStateList) {
            hVar.f3974c = colorStateList;
            this.f3918o = j(this.f3918o, colorStateList, hVar.f3975d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f3917n;
        if (hVar.f3975d != mode) {
            hVar.f3975d = mode;
            this.f3918o = j(this.f3918o, hVar.f3974c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
