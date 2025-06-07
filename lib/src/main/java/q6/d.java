package q6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f26311b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f26312a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f26311b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f26311b;
                if (dVar == null) {
                    dVar = new d();
                    f26311b = dVar;
                }
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f26312a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f26312a);
        }
        return setUnmodifiableSet;
    }
}
