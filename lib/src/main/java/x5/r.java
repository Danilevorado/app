package x5;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class r extends s {

    /* renamed from: m, reason: collision with root package name */
    private final List f28334m;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f28334m = list;
    }
}
