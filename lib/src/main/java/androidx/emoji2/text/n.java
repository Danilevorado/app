package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n extends SpannableStringBuilder {

    /* renamed from: m, reason: collision with root package name */
    private final Class f2652m;

    /* renamed from: n, reason: collision with root package name */
    private final List f2653n;

    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: m, reason: collision with root package name */
        final Object f2654m;

        /* renamed from: n, reason: collision with root package name */
        private final AtomicInteger f2655n = new AtomicInteger(0);

        a(Object obj) {
            this.f2654m = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof i;
        }

        final void a() {
            this.f2655n.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2654m).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f2654m).beforeTextChanged(charSequence, i10, i11, i12);
        }

        final void c() {
            this.f2655n.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f2655n.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2654m).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f2655n.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = i10 > i11 ? 0 : i10;
                    if (i12 > i13) {
                        i14 = i16;
                        i15 = 0;
                    } else {
                        i15 = i12;
                        i14 = i16;
                    }
                } else {
                    i14 = i10;
                    i15 = i12;
                }
                ((SpanWatcher) this.f2654m).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f2655n.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2654m).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f2654m).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    n(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2653n = new ArrayList();
        androidx.core.util.h.g(cls, "watcherClass cannot be null");
        this.f2652m = cls;
    }

    n(Class cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f2653n = new ArrayList();
        androidx.core.util.h.g(cls, "watcherClass cannot be null");
        this.f2652m = cls;
    }

    private void b() {
        for (int i10 = 0; i10 < this.f2653n.size(); i10++) {
            ((a) this.f2653n.get(i10)).a();
        }
    }

    public static n c(Class cls, CharSequence charSequence) {
        return new n(cls, charSequence);
    }

    private void e() {
        for (int i10 = 0; i10 < this.f2653n.size(); i10++) {
            ((a) this.f2653n.get(i10)).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i10 = 0; i10 < this.f2653n.size(); i10++) {
            a aVar = (a) this.f2653n.get(i10);
            if (aVar.f2654m == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class cls) {
        return this.f2652m == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i10 = 0; i10 < this.f2653n.size(); i10++) {
            ((a) this.f2653n.get(i10)).c();
        }
    }

    public void a() {
        b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            objArr[i12] = aVarArr[i12].f2654m;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f2653n.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        b();
        super.replace(i10, i11, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        b();
        super.replace(i10, i11, charSequence, i12, i13);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f2653n.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return new n(this.f2652m, this, i10, i11);
    }
}
