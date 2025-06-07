package com.meta.analytics.dsp.uinode;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0797Nt extends View {
    public static byte[] A09;
    public static String[] A0A = {"Nbc6Jmo5XxwoSf0WsC4pNUwvbxxmeuzU", "Es2t6BS2", "WUgCzt6qD3CB9cjx4HsVq0Jqaz41VBuo", "hkZRo5NTzxOFCAK6tj2hPIlun6a", "TTjuir0T4YhatH37Odlm7BF", "mNho4RFDELoa", "9llBB27OMv3OwRnb05oM", "XnRgJ28VorNH"};
    public static final int A0B;
    public float A00;
    public ObjectAnimator A01;
    public Bitmap A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final RectF A07;
    public final RectF A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{0, 2, 31, 23, 2, 21, 3, 3};
    }

    static {
        A01();
        A0B = (int) (LD.A02 * 5.0f);
    }

    public C0797Nt(C1073Yn c1073Yn) {
        super(c1073Yn);
        float f5 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A03 = f5;
        this.A00 = 0.0f;
        this.A01 = null;
        this.A07 = new RectF();
        this.A08 = new RectF();
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f5);
        Paint paint2 = new Paint(1);
        this.A05 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f5);
        this.A06 = new Paint(1);
    }

    public final void A02(int i10, int i11, int i12) {
        this.A04.setColor(i10);
        this.A05.setColor(i11);
        this.A06.setColorFilter(new PorterDuffColorFilter(AbstractC02892p.A01(i11, i12), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        ObjectAnimator objectAnimator = this.A01;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            if (A0A[4].length() == 15) {
                throw new RuntimeException();
            }
            A0A[0] = "vMfsJaJNlQJ6eTU2cMKDLU2YSzRmfzEH";
            this.A01 = null;
        }
    }

    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A07, 0.0f, 360.0f, false, this.A04);
        canvas.drawArc(this.A07, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A05);
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight()), this.A08, this.A06);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i11), getDefaultSize(getSuggestedMinimumWidth(), i10));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.A07;
        float f5 = (this.A03 / 2.0f) + 0.0f;
        int min = getPaddingLeft();
        float f10 = f5 + min;
        float f11 = (this.A03 / 2.0f) + 0.0f;
        int min2 = getPaddingTop();
        float f12 = f11 + min2;
        float f13 = iMin - (this.A03 / 2.0f);
        int min3 = getPaddingRight();
        float f14 = f13 - min3;
        float f15 = iMin - (this.A03 / 2.0f);
        int min4 = getPaddingBottom();
        rectF.set(f10, f12, f14, f15 - min4);
        RectF rectF2 = this.A08;
        float f16 = this.A07.left;
        int i12 = A0B;
        rectF2.set(f16 + i12, this.A07.top + i12, this.A07.right - i12, this.A07.bottom - i12);
    }

    public void setImage(EnumC0748Lw enumC0748Lw) {
        this.A02 = enumC0748Lw == null ? null : AbstractC0749Lx.A01(enumC0748Lw);
        invalidate();
    }

    public void setProgress(float f5) {
        this.A00 = Math.min(f5, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f5) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, A00(0, 8, 32), f5);
        this.A01 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(400L);
        this.A01.setInterpolator(new LinearInterpolator());
        this.A01.start();
    }
}
