package m2;

import java.security.MessageDigest;
import n2.k;
import r1.f;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f25185b;

    public b(Object obj) {
        this.f25185b = k.d(obj);
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f25185b.toString().getBytes(f.f26444a));
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f25185b.equals(((b) obj).f25185b);
        }
        return false;
    }

    @Override // r1.f
    public int hashCode() {
        return this.f25185b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f25185b + '}';
    }
}
