package u2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f27603c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f27604a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27605b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f27606a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f27607b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f27606a, Collections.unmodifiableList(this.f27607b));
        }

        public a b(List list) {
            this.f27607b = list;
            return this;
        }

        public a c(String str) {
            this.f27606a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f27604a = str;
        this.f27605b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f27605b;
    }

    public String b() {
        return this.f27604a;
    }
}
