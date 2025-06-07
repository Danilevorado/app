package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.e;

/* loaded from: classes.dex */
class d implements e.d {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f2572b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f2573a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f2573a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f2572b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.d
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.c.a(this.f2573a, sbB.toString());
    }
}
