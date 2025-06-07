package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f1442a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f1443b;

    c(int i10, CharSequence charSequence) {
        this.f1442a = i10;
        this.f1443b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String strA = a(this.f1443b);
        String strA2 = a(charSequence);
        return (strA == null && strA2 == null) || (strA != null && strA.equals(strA2));
    }

    int b() {
        return this.f1442a;
    }

    CharSequence c() {
        return this.f1443b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1442a == cVar.f1442a && d(cVar.f1443b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1442a), a(this.f1443b)});
    }
}
