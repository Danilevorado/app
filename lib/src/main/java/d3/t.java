package d3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class t {

    /* renamed from: e, reason: collision with root package name */
    public static final List f22869e = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f22870a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22871b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22872c;

    /* renamed from: d, reason: collision with root package name */
    private final List f22873d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f22874a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f22875b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f22876c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List f22877d = new ArrayList();

        public t a() {
            return new t(this.f22874a, this.f22875b, this.f22876c, this.f22877d, null);
        }
    }

    /* synthetic */ t(int i10, int i11, String str, List list, f0 f0Var) {
        this.f22870a = i10;
        this.f22871b = i11;
        this.f22872c = str;
        this.f22873d = list;
    }

    public String a() {
        String str = this.f22872c;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f22870a;
    }

    public int c() {
        return this.f22871b;
    }

    public List d() {
        return new ArrayList(this.f22873d);
    }
}
