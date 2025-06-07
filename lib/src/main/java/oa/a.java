package oa;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f25821b = new a();

    /* renamed from: a, reason: collision with root package name */
    private List f25822a = new ArrayList();

    public static a b() {
        return f25821b;
    }

    public boolean a() {
        boolean z10;
        while (true) {
            for (y8.a aVar : this.f25822a) {
                z10 = z10 && aVar.a();
            }
            return z10;
        }
    }
}
