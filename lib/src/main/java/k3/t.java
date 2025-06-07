package k3;

import com.google.android.gms.internal.ads.a70;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.se0;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    private static final t f24750f = new t();

    /* renamed from: a, reason: collision with root package name */
    private final se0 f24751a;

    /* renamed from: b, reason: collision with root package name */
    private final r f24752b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24753c;

    /* renamed from: d, reason: collision with root package name */
    private final ff0 f24754d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f24755e;

    protected t() throws NoSuchAlgorithmException {
        se0 se0Var = new se0();
        r rVar = new r(new b4(), new z3(), new e3(), new ow(), new gb0(), new a70(), new pw());
        String strF = se0.f();
        ff0 ff0Var = new ff0(0, 231004000, true, false, false);
        Random random = new Random();
        this.f24751a = se0Var;
        this.f24752b = rVar;
        this.f24753c = strF;
        this.f24754d = ff0Var;
        this.f24755e = random;
    }

    public static r a() {
        return f24750f.f24752b;
    }

    public static se0 b() {
        return f24750f.f24751a;
    }

    public static ff0 c() {
        return f24750f.f24754d;
    }

    public static String d() {
        return f24750f.f24753c;
    }

    public static Random e() {
        return f24750f.f24755e;
    }
}
