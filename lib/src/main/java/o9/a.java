package o9;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f25815a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25816b;

    private a() {
        this.f25815a = Collections.emptyList();
        this.f25816b = Collections.emptyList();
    }

    a(List list, List list2) {
        this.f25815a = list;
        this.f25816b = list2;
    }

    public static a a() {
        return new a();
    }

    public List b() {
        return this.f25815a;
    }
}
