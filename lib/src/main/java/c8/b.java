package c8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f5056a;

    public b(String... strArr) {
        this.f5056a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // c8.a
    public boolean c(String str) {
        return this.f5056a.contains(str);
    }
}
