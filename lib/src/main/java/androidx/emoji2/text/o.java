package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: r, reason: collision with root package name */
    private static Paint f2656r;

    public o(g gVar) {
        super(gVar);
    }

    private static Paint c() {
        if (f2656r == null) {
            TextPaint textPaint = new TextPaint();
            f2656r = textPaint;
            textPaint.setColor(e.b().c());
            f2656r.setStyle(Paint.Style.FILL);
        }
        return f2656r;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f5, int i12, int i13, int i14, Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f5, i12, f5 + b(), i14, c());
        }
        a().a(canvas, f5, i13, paint);
    }
}
