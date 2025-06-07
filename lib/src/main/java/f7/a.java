package f7;

import g7.b;
import g7.d;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23657a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f23658b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f23659c;

    static {
        String canonicalName = b.class.getCanonicalName();
        Objects.requireNonNull(canonicalName, "null cannot be cast to non-null type kotlin.String");
        f23658b = canonicalName;
        String canonicalName2 = d.class.getCanonicalName();
        Objects.requireNonNull(canonicalName2, "null cannot be cast to non-null type kotlin.String");
        f23659c = canonicalName2;
    }

    private a() {
    }

    public final String a() {
        return f23658b;
    }

    public final String b() {
        return f23659c;
    }
}
