package n;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f25414a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f25415b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f25416c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f25417d;

    /* renamed from: n.a$a, reason: collision with other inner class name */
    public static final class C0163a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f25418a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f25419b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f25420c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f25421d;

        public a a() {
            return new a(this.f25418a, this.f25419b, this.f25420c, this.f25421d);
        }

        public C0163a b(int i10) {
            this.f25418a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f25414a = num;
        this.f25415b = num2;
        this.f25416c = num3;
        this.f25417d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f25414a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f25415b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f25416c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f25417d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
