package com.blikoon.qrcodescanner.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import l1.a;
import l1.b;
import l1.d;
import l1.e;
import l1.g;

/* loaded from: classes.dex */
public final class QrCodeFinderView extends RelativeLayout {

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f5314x = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: m, reason: collision with root package name */
    private Context f5315m;

    /* renamed from: n, reason: collision with root package name */
    private Paint f5316n;

    /* renamed from: o, reason: collision with root package name */
    private int f5317o;

    /* renamed from: p, reason: collision with root package name */
    private int f5318p;

    /* renamed from: q, reason: collision with root package name */
    private int f5319q;

    /* renamed from: r, reason: collision with root package name */
    private int f5320r;

    /* renamed from: s, reason: collision with root package name */
    private int f5321s;

    /* renamed from: t, reason: collision with root package name */
    private Rect f5322t;

    /* renamed from: u, reason: collision with root package name */
    private int f5323u;

    /* renamed from: v, reason: collision with root package name */
    private int f5324v;

    /* renamed from: w, reason: collision with root package name */
    private int f5325w;

    public QrCodeFinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QrCodeFinderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5315m = context;
        this.f5316n = new Paint();
        Resources resources = getResources();
        this.f5318p = resources.getColor(a.f25016c);
        this.f5319q = resources.getColor(a.f25014a);
        this.f5320r = resources.getColor(a.f25015b);
        this.f5321s = resources.getColor(a.f25017d);
        this.f5323u = 1;
        this.f5324v = 8;
        this.f5325w = 40;
        this.f5317o = 0;
        e(context);
    }

    private void a(Canvas canvas, Rect rect) {
        this.f5316n.setColor(this.f5320r);
        this.f5316n.setAlpha(255);
        this.f5316n.setStyle(Paint.Style.FILL);
        this.f5316n.setStrokeWidth(this.f5324v);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        float f5 = i10;
        float f10 = i11;
        canvas.drawRect(f5, f10, this.f5325w + i10, this.f5324v + i11, this.f5316n);
        canvas.drawRect(f5, f10, this.f5324v + i10, this.f5325w + i11, this.f5316n);
        float f11 = i12;
        canvas.drawRect(i12 - this.f5325w, f10, f11, this.f5324v + i11, this.f5316n);
        canvas.drawRect(i12 - this.f5324v, f10, f11, i11 + this.f5325w, this.f5316n);
        float f12 = i13;
        canvas.drawRect(f5, i13 - this.f5325w, this.f5324v + i10, f12, this.f5316n);
        canvas.drawRect(f5, i13 - this.f5324v, i10 + this.f5325w, f12, this.f5316n);
        canvas.drawRect(i12 - this.f5325w, i13 - this.f5324v, f11, f12, this.f5316n);
        canvas.drawRect(i12 - this.f5324v, i13 - this.f5325w, f11, f12, this.f5316n);
    }

    private void b(Canvas canvas, Rect rect) {
        this.f5316n.setColor(this.f5319q);
        canvas.drawRect(rect.left + this.f5325w, rect.top, rect.right - r1, r0 + this.f5323u, this.f5316n);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = this.f5325w;
        canvas.drawRect(i10, i11 + i12, i10 + this.f5323u, rect.bottom - i12, this.f5316n);
        int i13 = rect.right;
        float f5 = i13 - this.f5323u;
        int i14 = rect.top;
        int i15 = this.f5325w;
        canvas.drawRect(f5, i14 + i15, i13, rect.bottom - i15, this.f5316n);
        canvas.drawRect(rect.left + this.f5325w, r0 - this.f5323u, rect.right - r1, rect.bottom, this.f5316n);
    }

    private void c(Canvas canvas, Rect rect) {
        this.f5316n.setColor(this.f5320r);
        Paint paint = this.f5316n;
        int[] iArr = f5314x;
        paint.setAlpha(iArr[this.f5317o]);
        this.f5317o = (this.f5317o + 1) % iArr.length;
        int iHeight = (rect.height() / 2) + rect.top;
        canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, this.f5316n);
    }

    private void d(Canvas canvas, Rect rect) throws Resources.NotFoundException {
        this.f5316n.setColor(this.f5321s);
        this.f5316n.setTextSize(getResources().getDimension(b.f25018a));
        String string = getResources().getString(g.f25038b);
        Paint.FontMetrics fontMetrics = this.f5316n.getFontMetrics();
        float f5 = fontMetrics.bottom;
        canvas.drawText(string, ((o1.b.b(this.f5315m) - (this.f5316n.getTextSize() * string.length())) / 2.0f) + (this.f5315m.getResources().getDisplayMetrics().density * 55.0f), rect.bottom + 40 + (((f5 - fontMetrics.top) / 2.0f) - f5), this.f5316n);
    }

    private void e(Context context) {
        if (isInEditMode()) {
            return;
        }
        setWillNotDraw(false);
        FrameLayout frameLayout = (FrameLayout) ((RelativeLayout) LayoutInflater.from(context).inflate(e.f25035b, this)).findViewById(d.f25025e);
        this.f5322t = new Rect();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        Rect rect = this.f5322t;
        int iB = o1.b.b(context);
        int i10 = layoutParams.width;
        rect.left = (iB - i10) / 2;
        Rect rect2 = this.f5322t;
        int i11 = layoutParams.topMargin;
        rect2.top = i11;
        rect2.right = rect2.left + i10;
        rect2.bottom = i11 + layoutParams.height;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) throws Resources.NotFoundException {
        Rect rect;
        if (isInEditMode() || (rect = this.f5322t) == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f5316n.setColor(this.f5318p);
        float f5 = width;
        canvas.drawRect(0.0f, 0.0f, f5, rect.top, this.f5316n);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f5316n);
        canvas.drawRect(rect.right + 1, rect.top, f5, rect.bottom + 1, this.f5316n);
        canvas.drawRect(0.0f, rect.bottom + 1, f5, height, this.f5316n);
        b(canvas, rect);
        a(canvas, rect);
        d(canvas, rect);
        c(canvas, rect);
        postInvalidateDelayed(100L, rect.left, rect.top, rect.right, rect.bottom);
    }
}
