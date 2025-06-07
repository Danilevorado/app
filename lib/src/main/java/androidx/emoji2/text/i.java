package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* renamed from: n, reason: collision with root package name */
    private final g f2627n;

    /* renamed from: m, reason: collision with root package name */
    private final Paint.FontMetricsInt f2626m = new Paint.FontMetricsInt();

    /* renamed from: o, reason: collision with root package name */
    private short f2628o = -1;

    /* renamed from: p, reason: collision with root package name */
    private short f2629p = -1;

    /* renamed from: q, reason: collision with root package name */
    private float f2630q = 1.0f;

    i(g gVar) {
        androidx.core.util.h.g(gVar, "metadata cannot be null");
        this.f2627n = gVar;
    }

    public final g a() {
        return this.f2627n;
    }

    final int b() {
        return this.f2628o;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2626m);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2626m;
        this.f2630q = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f2627n.e();
        this.f2629p = (short) (this.f2627n.e() * this.f2630q);
        short sI = (short) (this.f2627n.i() * this.f2630q);
        this.f2628o = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2626m;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
