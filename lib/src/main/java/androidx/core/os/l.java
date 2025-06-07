package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f2269a;

    l(Object obj) {
        this.f2269a = (LocaleList) obj;
    }

    @Override // androidx.core.os.k
    public String a() {
        return this.f2269a.toLanguageTags();
    }

    @Override // androidx.core.os.k
    public Object b() {
        return this.f2269a;
    }

    public boolean equals(Object obj) {
        return this.f2269a.equals(((k) obj).b());
    }

    @Override // androidx.core.os.k
    public Locale get(int i10) {
        return this.f2269a.get(i10);
    }

    public int hashCode() {
        return this.f2269a.hashCode();
    }

    @Override // androidx.core.os.k
    public boolean isEmpty() {
        return this.f2269a.isEmpty();
    }

    @Override // androidx.core.os.k
    public int size() {
        return this.f2269a.size();
    }

    public String toString() {
        return this.f2269a.toString();
    }
}
