package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class c implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f2341a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f2342b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2343c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2344d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f2345e;

        /* renamed from: androidx.core.text.c$a$a, reason: collision with other inner class name */
        public static class C0031a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f2346a;

            /* renamed from: c, reason: collision with root package name */
            private int f2348c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f2349d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f2347b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0031a(TextPaint textPaint) {
                this.f2346a = textPaint;
            }

            public a a() {
                return new a(this.f2346a, this.f2347b, this.f2348c, this.f2349d);
            }

            public C0031a b(int i10) {
                this.f2348c = i10;
                return this;
            }

            public C0031a c(int i10) {
                this.f2349d = i10;
                return this;
            }

            public C0031a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2347b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f2341a = params.getTextPaint();
            this.f2342b = params.getTextDirection();
            this.f2343c = params.getBreakStrategy();
            this.f2344d = params.getHyphenationFrequency();
            this.f2345e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f2345e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f2341a = textPaint;
            this.f2342b = textDirectionHeuristic;
            this.f2343c = i10;
            this.f2344d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f2343c != aVar.b() || this.f2344d != aVar.c() || this.f2341a.getTextSize() != aVar.e().getTextSize() || this.f2341a.getTextScaleX() != aVar.e().getTextScaleX() || this.f2341a.getTextSkewX() != aVar.e().getTextSkewX() || this.f2341a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f2341a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f2341a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f2341a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f2341a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f2341a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2341a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f2343c;
        }

        public int c() {
            return this.f2344d;
        }

        public TextDirectionHeuristic d() {
            return this.f2342b;
        }

        public TextPaint e() {
            return this.f2341a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f2342b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? androidx.core.util.c.b(Float.valueOf(this.f2341a.getTextSize()), Float.valueOf(this.f2341a.getTextScaleX()), Float.valueOf(this.f2341a.getTextSkewX()), Float.valueOf(this.f2341a.getLetterSpacing()), Integer.valueOf(this.f2341a.getFlags()), this.f2341a.getTextLocales(), this.f2341a.getTypeface(), Boolean.valueOf(this.f2341a.isElegantTextHeight()), this.f2342b, Integer.valueOf(this.f2343c), Integer.valueOf(this.f2344d)) : androidx.core.util.c.b(Float.valueOf(this.f2341a.getTextSize()), Float.valueOf(this.f2341a.getTextScaleX()), Float.valueOf(this.f2341a.getTextSkewX()), Float.valueOf(this.f2341a.getLetterSpacing()), Integer.valueOf(this.f2341a.getFlags()), this.f2341a.getTextLocale(), this.f2341a.getTypeface(), Boolean.valueOf(this.f2341a.isElegantTextHeight()), this.f2342b, Integer.valueOf(this.f2343c), Integer.valueOf(this.f2344d));
        }

        public String toString() {
            StringBuilder sb2;
            Object textLocale;
            StringBuilder sb3 = new StringBuilder("{");
            sb3.append("textSize=" + this.f2341a.getTextSize());
            sb3.append(", textScaleX=" + this.f2341a.getTextScaleX());
            sb3.append(", textSkewX=" + this.f2341a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(", letterSpacing=" + this.f2341a.getLetterSpacing());
            sb3.append(", elegantTextHeight=" + this.f2341a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocale = this.f2341a.getTextLocales();
            } else {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocale = this.f2341a.getTextLocale();
            }
            sb2.append(textLocale);
            sb3.append(sb2.toString());
            sb3.append(", typeface=" + this.f2341a.getTypeface());
            if (i10 >= 26) {
                sb3.append(", variationSettings=" + this.f2341a.getFontVariationSettings());
            }
            sb3.append(", textDir=" + this.f2342b);
            sb3.append(", breakStrategy=" + this.f2343c);
            sb3.append(", hyphenationFrequency=" + this.f2344d);
            sb3.append("}");
            return sb3.toString();
        }
    }
}
