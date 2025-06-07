package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
class p implements Spannable {

    /* renamed from: m, reason: collision with root package name */
    private boolean f2657m = false;

    /* renamed from: n, reason: collision with root package name */
    private Spannable f2658n;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return false;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.p.b
        boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedText;
        }
    }

    p(Spannable spannable) {
        this.f2658n = spannable;
    }

    p(CharSequence charSequence) {
        this.f2658n = new SpannableString(charSequence);
    }

    private void a() {
        Spannable spannable = this.f2658n;
        if (!this.f2657m && c().a(spannable)) {
            this.f2658n = new SpannableString(spannable);
        }
        this.f2657m = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f2658n;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f2658n.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f2658n);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f2658n);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2658n.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2658n.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2658n.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f2658n.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2658n.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f2658n.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f2658n.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f2658n.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f2658n.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2658n.toString();
    }
}
