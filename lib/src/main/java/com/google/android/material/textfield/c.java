package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
class c extends s5.g {
    private final Paint L;
    private final RectF M;

    c(s5.k kVar) {
        super(kVar == null ? new s5.k() : kVar);
        this.L = new Paint(1);
        k0();
        this.M = new RectF();
    }

    private void k0() {
        this.L.setStyle(Paint.Style.FILL_AND_STROKE);
        this.L.setColor(-1);
        this.L.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    boolean g0() {
        return !this.M.isEmpty();
    }

    void h0() {
        i0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void i0(float f5, float f10, float f11, float f12) {
        RectF rectF = this.M;
        if (f5 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f5, f10, f11, f12);
        invalidateSelf();
    }

    void j0(RectF rectF) {
        i0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // s5.g
    protected void r(Canvas canvas) {
        if (this.M.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.M);
        } else {
            canvas.clipRect(this.M, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }
}
