package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.view.w;
import com.google.android.material.internal.i;
import p5.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f21015t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f21016u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private p5.a E;
    private p5.a F;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f21017a;

    /* renamed from: a0, reason: collision with root package name */
    private float f21018a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21019b;

    /* renamed from: b0, reason: collision with root package name */
    private float f21020b0;

    /* renamed from: c, reason: collision with root package name */
    private float f21021c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f21022c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21023d;

    /* renamed from: d0, reason: collision with root package name */
    private float f21024d0;

    /* renamed from: e, reason: collision with root package name */
    private float f21025e;

    /* renamed from: e0, reason: collision with root package name */
    private float f21026e0;

    /* renamed from: f, reason: collision with root package name */
    private float f21027f;

    /* renamed from: f0, reason: collision with root package name */
    private float f21028f0;

    /* renamed from: g, reason: collision with root package name */
    private int f21029g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f21030g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f21031h;

    /* renamed from: h0, reason: collision with root package name */
    private float f21032h0;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f21033i;

    /* renamed from: i0, reason: collision with root package name */
    private float f21034i0;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f21035j;

    /* renamed from: j0, reason: collision with root package name */
    private float f21036j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f21038k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f21040l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f21042m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f21044n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f21045o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f21046o0;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f21047p;

    /* renamed from: q, reason: collision with root package name */
    private int f21049q;

    /* renamed from: r, reason: collision with root package name */
    private float f21051r;

    /* renamed from: s, reason: collision with root package name */
    private float f21053s;

    /* renamed from: t, reason: collision with root package name */
    private float f21055t;

    /* renamed from: u, reason: collision with root package name */
    private float f21056u;

    /* renamed from: v, reason: collision with root package name */
    private float f21057v;

    /* renamed from: w, reason: collision with root package name */
    private float f21058w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f21059x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f21060y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f21061z;

    /* renamed from: k, reason: collision with root package name */
    private int f21037k = 16;

    /* renamed from: l, reason: collision with root package name */
    private int f21039l = 16;

    /* renamed from: m, reason: collision with root package name */
    private float f21041m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f21043n = 15.0f;
    private boolean J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f21048p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f21050q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f21052r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f21054s0 = i.f21069n;

    class a implements a.InterfaceC0173a {
        a() {
        }

        @Override // p5.a.InterfaceC0173a
        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f21017a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f21033i = new Rect();
        this.f21031h = new Rect();
        this.f21035j = new RectF();
        this.f21027f = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f21041m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f21034i0);
    }

    private void B(float f5) {
        if (this.f21023d) {
            this.f21035j.set(f5 < this.f21027f ? this.f21031h : this.f21033i);
            return;
        }
        this.f21035j.left = G(this.f21031h.left, this.f21033i.left, f5, this.X);
        this.f21035j.top = G(this.f21051r, this.f21053s, f5, this.X);
        this.f21035j.right = G(this.f21031h.right, this.f21033i.right, f5, this.X);
        this.f21035j.bottom = G(this.f21031h.bottom, this.f21033i.bottom, f5, this.X);
    }

    private static boolean C(float f5, float f10) {
        return Math.abs(f5 - f10) < 1.0E-5f;
    }

    private boolean D() {
        return w.B(this.f21017a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? androidx.core.text.e.f2353d : androidx.core.text.e.f2352c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f5, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return d5.a.a(f5, f10, f11);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean M(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f5) {
        this.f21042m0 = f5;
        w.f0(this.f21017a);
    }

    private boolean U(Typeface typeface) {
        p5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f21061z == typeface) {
            return false;
        }
        this.f21061z = typeface;
        Typeface typefaceB = p5.g.b(this.f21017a.getContext().getResources().getConfiguration(), typeface);
        this.f21060y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f21061z;
        }
        this.f21059x = typefaceB;
        return true;
    }

    private void Y(float f5) {
        this.f21044n0 = f5;
        w.f0(this.f21017a);
    }

    private static int a(int i10, int i11, float f5) {
        float f10 = 1.0f - f5;
        return Color.argb(Math.round((Color.alpha(i10) * f10) + (Color.alpha(i11) * f5)), Math.round((Color.red(i10) * f10) + (Color.red(i11) * f5)), Math.round((Color.green(i10) * f10) + (Color.green(i11) * f5)), Math.round((Color.blue(i10) * f10) + (Color.blue(i11) * f5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(boolean r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.b.b(boolean):void");
    }

    private void c() {
        g(this.f21021c);
    }

    private boolean c0(Typeface typeface) {
        p5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceB = p5.g.b(this.f21017a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.C;
        }
        this.A = typefaceB;
        return true;
    }

    private float d(float f5) {
        float f10 = this.f21027f;
        return f5 <= f10 ? d5.a.b(1.0f, 0.0f, this.f21025e, f10, f5) : d5.a.b(0.0f, 1.0f, f10, 1.0f, f5);
    }

    private float e() {
        float f5 = this.f21025e;
        return f5 + ((1.0f - f5) * 0.5f);
    }

    private void e0(float f5) {
        h(f5);
        boolean z10 = f21015t0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        w.f0(this.f21017a);
    }

    private boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.J ? F(charSequence, zD) : zD;
    }

    private void g(float f5) {
        float f10;
        B(f5);
        if (!this.f21023d) {
            this.f21057v = G(this.f21055t, this.f21056u, f5, this.X);
            this.f21058w = G(this.f21051r, this.f21053s, f5, this.X);
            e0(f5);
            f10 = f5;
        } else if (f5 < this.f21027f) {
            this.f21057v = this.f21055t;
            this.f21058w = this.f21051r;
            e0(0.0f);
            f10 = 0.0f;
        } else {
            this.f21057v = this.f21056u;
            this.f21058w = this.f21053s - Math.max(0, this.f21029g);
            e0(1.0f);
            f10 = 1.0f;
        }
        TimeInterpolator timeInterpolator = d5.a.f22932b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f5, timeInterpolator));
        Y(G(1.0f, 0.0f, f5, timeInterpolator));
        if (this.f21047p != this.f21045o) {
            this.V.setColor(a(v(), t(), f10));
        } else {
            this.V.setColor(t());
        }
        float f11 = this.f21032h0;
        float f12 = this.f21034i0;
        if (f11 != f12) {
            this.V.setLetterSpacing(G(f12, f11, f5, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f11);
        }
        this.P = G(this.f21024d0, this.Z, f5, null);
        this.Q = G(this.f21026e0, this.f21018a0, f5, null);
        this.R = G(this.f21028f0, this.f21020b0, f5, null);
        int iA = a(u(this.f21030g0), u(this.f21022c0), f5);
        this.S = iA;
        this.V.setShadowLayer(this.P, this.Q, this.R, iA);
        if (this.f21023d) {
            this.V.setAlpha((int) (d(f5) * this.V.getAlpha()));
        }
        w.f0(this.f21017a);
    }

    private void h(float f5) {
        i(f5, false);
    }

    private void i(float f5, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        if (this.G == null) {
            return;
        }
        float fWidth = this.f21033i.width();
        float fWidth2 = this.f21031h.width();
        if (C(f5, 1.0f)) {
            f10 = this.f21043n;
            f11 = this.f21032h0;
            this.N = 1.0f;
            Typeface typeface = this.D;
            Typeface typeface2 = this.f21059x;
            if (typeface != typeface2) {
                this.D = typeface2;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            float f12 = this.f21041m;
            float f13 = this.f21034i0;
            Typeface typeface3 = this.D;
            Typeface typeface4 = this.A;
            if (typeface3 != typeface4) {
                this.D = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (C(f5, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.f21041m, this.f21043n, f5, this.Y) / this.f21041m;
            }
            float f14 = this.f21043n / this.f21041m;
            fWidth = (!z10 && fWidth2 * f14 > fWidth) ? Math.min(fWidth / f14, fWidth2) : fWidth2;
            f10 = f12;
            f11 = f13;
            z12 = z11;
        }
        if (fWidth > 0.0f) {
            z12 = ((this.O > f10 ? 1 : (this.O == f10 ? 0 : -1)) != 0) || ((this.f21036j0 > f11 ? 1 : (this.f21036j0 == f11 ? 0 : -1)) != 0) || this.U || z12;
            this.O = f10;
            this.f21036j0 = f11;
            this.U = false;
        }
        if (this.H == null || z12) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.D);
            this.V.setLetterSpacing(this.f21036j0);
            this.V.setLinearText(this.N != 1.0f);
            this.I = f(this.G);
            StaticLayout staticLayoutK = k(k0() ? this.f21048p0 : 1, fWidth, this.I);
            this.f21038k0 = staticLayoutK;
            this.H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private StaticLayout k(int i10, float f5, boolean z10) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = i.b(this.G, this.V, (int) f5).d(TextUtils.TruncateAt.END).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f21050q0, this.f21052r0).e(this.f21054s0).a();
        } catch (i.a e5) {
            Log.e("CollapsingTextHelper", e5.getCause().getMessage(), e5);
            staticLayoutA = null;
        }
        return (StaticLayout) androidx.core.util.h.f(staticLayoutA);
    }

    private boolean k0() {
        return this.f21048p0 > 1 && (!this.I || this.f21023d) && !this.K;
    }

    private void m(Canvas canvas, float f5, float f10) {
        int alpha = this.V.getAlpha();
        canvas.translate(f5, f10);
        float f11 = alpha;
        this.V.setAlpha((int) (this.f21044n0 * f11));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint = this.V;
            textPaint.setShadowLayer(this.P, this.Q, this.R, i5.a.a(this.S, textPaint.getAlpha()));
        }
        this.f21038k0.draw(canvas);
        this.V.setAlpha((int) (this.f21042m0 * f11));
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, i5.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f21038k0.getLineBaseline(0);
        CharSequence charSequence = this.f21046o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f21023d) {
            return;
        }
        String strTrim = this.f21046o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f21038k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.V);
    }

    private void n() {
        if (this.L != null || this.f21031h.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f21038k0.getWidth();
        int height = this.f21038k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f21038k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f21040l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? this.f21033i.left : this.f21033i.right - this.f21040l0 : this.I ? this.f21033i.right - this.f21040l0 : this.f21033i.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f21040l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? rectF.left + this.f21040l0 : this.f21033i.right : this.I ? this.f21033i.right : rectF.left + this.f21040l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f21045o);
    }

    private Layout.Alignment y() {
        int iB = androidx.core.view.e.b(this.f21037k, this.I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f21043n);
        textPaint.setTypeface(this.f21059x);
        textPaint.setLetterSpacing(this.f21032h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f21047p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f21045o) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f21061z;
            if (typeface != null) {
                this.f21060y = p5.g.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = p5.g.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f21060y;
            if (typeface3 == null) {
                typeface3 = this.f21061z;
            }
            this.f21059x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            L(true);
        }
    }

    void J() {
        this.f21019b = this.f21033i.width() > 0 && this.f21033i.height() > 0 && this.f21031h.width() > 0 && this.f21031h.height() > 0;
    }

    public void K() {
        L(false);
    }

    public void L(boolean z10) {
        if ((this.f21017a.getHeight() <= 0 || this.f21017a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (M(this.f21033i, i10, i11, i12, i13)) {
            return;
        }
        this.f21033i.set(i10, i11, i12, i13);
        this.U = true;
        J();
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        p5.d dVar = new p5.d(this.f21017a.getContext(), i10);
        if (dVar.i() != null) {
            this.f21047p = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f21043n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f25930c;
        if (colorStateList != null) {
            this.f21022c0 = colorStateList;
        }
        this.f21018a0 = dVar.f25935h;
        this.f21020b0 = dVar.f25936i;
        this.Z = dVar.f25937j;
        this.f21032h0 = dVar.f25939l;
        p5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new p5.a(new a(), dVar.e());
        dVar.h(this.f21017a.getContext(), this.F);
        K();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f21047p != colorStateList) {
            this.f21047p = colorStateList;
            K();
        }
    }

    public void S(int i10) {
        if (this.f21039l != i10) {
            this.f21039l = i10;
            K();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            K();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (M(this.f21031h, i10, i11, i12, i13)) {
            return;
        }
        this.f21031h.set(i10, i11, i12, i13);
        this.U = true;
        J();
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f5) {
        if (this.f21034i0 != f5) {
            this.f21034i0 = f5;
            K();
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f21045o != colorStateList) {
            this.f21045o = colorStateList;
            K();
        }
    }

    public void a0(int i10) {
        if (this.f21037k != i10) {
            this.f21037k = i10;
            K();
        }
    }

    public void b0(float f5) {
        if (this.f21041m != f5) {
            this.f21041m = f5;
            K();
        }
    }

    public void d0(float f5) {
        float fA = a0.a.a(f5, 0.0f, 1.0f);
        if (fA != this.f21021c) {
            this.f21021c = fA;
            c();
        }
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        K();
    }

    public final boolean g0(int[] iArr) {
        this.T = iArr;
        if (!E()) {
            return false;
        }
        K();
        return true;
    }

    public void h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            K();
        }
    }

    public void i0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        K();
    }

    public void j0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zC0 = c0(typeface);
        if (zU || zC0) {
            K();
        }
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.H == null || !this.f21019b) {
            return;
        }
        this.V.setTextSize(this.O);
        float f5 = this.f21057v;
        float f10 = this.f21058w;
        boolean z10 = this.K && this.L != null;
        float f11 = this.N;
        if (f11 != 1.0f && !this.f21023d) {
            canvas.scale(f11, f11, f5, f10);
        }
        if (z10) {
            canvas.drawBitmap(this.L, f5, f10, this.M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!k0() || (this.f21023d && this.f21021c <= this.f21027f)) {
            canvas.translate(f5, f10);
            this.f21038k0.draw(canvas);
        } else {
            m(canvas, this.f21057v - this.f21038k0.getLineStart(0), f10);
        }
        canvas.restoreToCount(iSave);
    }

    public void o(RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = r(i10, i11);
        rectF.top = this.f21033i.top;
        rectF.right = s(rectF, i10, i11);
        rectF.bottom = this.f21033i.top + q();
    }

    public ColorStateList p() {
        return this.f21047p;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public int t() {
        return u(this.f21047p);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.f21021c;
    }
}
