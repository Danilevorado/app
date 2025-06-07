package m2;

import java.security.MessageDigest;
import r1.f;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final a f25184b = new a();

    private a() {
    }

    public static a c() {
        return f25184b;
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
