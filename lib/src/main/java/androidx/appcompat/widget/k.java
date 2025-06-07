package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.q0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f1267b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static k f1268c;

    /* renamed from: a, reason: collision with root package name */
    private q0 f1269a;

    class a implements q0.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f1270a = {f.e.R, f.e.P, f.e.f23336a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1271b = {f.e.f23350o, f.e.B, f.e.f23355t, f.e.f23351p, f.e.f23352q, f.e.f23354s, f.e.f23353r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f1272c = {f.e.O, f.e.Q, f.e.f23346k, f.e.K, f.e.L, f.e.M, f.e.N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f1273d = {f.e.f23358w, f.e.f23344i, f.e.f23357v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f1274e = {f.e.J, f.e.S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f1275f = {f.e.f23338c, f.e.f23342g, f.e.f23339d, f.e.f23343h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = v0.c(context, f.a.f23307t);
            return new ColorStateList(new int[][]{v0.f1386b, v0.f1389e, v0.f1387c, v0.f1393i}, new int[]{v0.b(context, f.a.f23305r), androidx.core.graphics.a.f(iC, i10), androidx.core.graphics.a.f(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, v0.c(context, f.a.f23304q));
        }

        private ColorStateList j(Context context) {
            return h(context, v0.c(context, f.a.f23305r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = f.a.f23309v;
            ColorStateList colorStateListE = v0.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = v0.f1386b;
                iArr2[0] = v0.b(context, i10);
                iArr[1] = v0.f1390f;
                iArr2[1] = v0.c(context, f.a.f23306s);
                iArr[2] = v0.f1393i;
                iArr2[2] = v0.c(context, i10);
            } else {
                iArr[0] = v0.f1386b;
                iArr2[0] = colorStateListE.getColorForState(iArr[0], 0);
                iArr[1] = v0.f1390f;
                iArr2[1] = v0.c(context, f.a.f23306s);
                iArr[2] = v0.f1393i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(q0 q0Var, Context context, int i10) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableJ = q0Var.j(context, f.e.F);
            Drawable drawableJ2 = q0Var.j(context, f.e.G);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (i0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f1267b;
            }
            drawable.setColorFilter(k.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.q0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k.a()
                int[] r1 = r6.f1270a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = f.a.f23308u
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f1272c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = f.a.f23306s
                goto L14
            L22:
                int[] r1 = r6.f1273d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = f.e.f23356u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = f.e.f23347l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = androidx.appcompat.widget.i0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = androidx.appcompat.widget.v0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.q0.f
        public PorterDuff.Mode b(int i10) {
            if (i10 == f.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0.f
        public Drawable c(q0 q0Var, Context context, int i10) {
            int i11;
            if (i10 == f.e.f23345j) {
                return new LayerDrawable(new Drawable[]{q0Var.j(context, f.e.f23344i), q0Var.j(context, f.e.f23346k)});
            }
            if (i10 == f.e.f23360y) {
                i11 = f.d.f23329g;
            } else if (i10 == f.e.f23359x) {
                i11 = f.d.f23330h;
            } else {
                if (i10 != f.e.f23361z) {
                    return null;
                }
                i11 = f.d.f23331i;
            }
            return l(q0Var, context, i11);
        }

        @Override // androidx.appcompat.widget.q0.f
        public ColorStateList d(Context context, int i10) {
            if (i10 == f.e.f23348m) {
                return g.a.a(context, f.c.f23319e);
            }
            if (i10 == f.e.I) {
                return g.a.a(context, f.c.f23322h);
            }
            if (i10 == f.e.H) {
                return k(context);
            }
            if (i10 == f.e.f23341f) {
                return j(context);
            }
            if (i10 == f.e.f23337b) {
                return g(context);
            }
            if (i10 == f.e.f23340e) {
                return i(context);
            }
            if (i10 == f.e.D || i10 == f.e.E) {
                return g.a.a(context, f.c.f23321g);
            }
            if (f(this.f1271b, i10)) {
                return v0.e(context, f.a.f23308u);
            }
            if (f(this.f1274e, i10)) {
                return g.a.a(context, f.c.f23318d);
            }
            if (f(this.f1275f, i10)) {
                return g.a.a(context, f.c.f23317c);
            }
            if (i10 == f.e.A) {
                return g.a.a(context, f.c.f23320f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0.f
        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iC;
            if (i10 == f.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = f.a.f23308u;
                m(drawableFindDrawableByLayerId2, v0.c(context, i11), k.f1267b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), v0.c(context, i11), k.f1267b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iC = v0.c(context, f.a.f23306s);
            } else {
                if (i10 != f.e.f23360y && i10 != f.e.f23359x && i10 != f.e.f23361z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), v0.b(context, f.a.f23308u), k.f1267b);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i12 = f.a.f23306s;
                m(drawableFindDrawableByLayerId3, v0.c(context, i12), k.f1267b);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iC = v0.c(context, i12);
            }
            m(drawableFindDrawableByLayerId, iC, k.f1267b);
            return true;
        }
    }

    public static synchronized k b() {
        if (f1268c == null) {
            h();
        }
        return f1268c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return q0.l(i10, mode);
    }

    public static synchronized void h() {
        if (f1268c == null) {
            k kVar = new k();
            f1268c = kVar;
            kVar.f1269a = q0.h();
            f1268c.f1269a.u(new a());
        }
    }

    static void i(Drawable drawable, x0 x0Var, int[] iArr) {
        q0.w(drawable, x0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1269a.j(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1269a.k(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f1269a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1269a.s(context);
    }
}
