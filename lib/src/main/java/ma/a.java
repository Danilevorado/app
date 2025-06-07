package ma;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f25392a;

    /* renamed from: b, reason: collision with root package name */
    private String f25393b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC0162a f25394c;

    /* renamed from: d, reason: collision with root package name */
    private ga.b f25395d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25396e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25397f;

    /* renamed from: ma.a$a, reason: collision with other inner class name */
    public enum EnumC0162a {
        PushMessageSource,
        InAppSource
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25401a;

        static {
            int[] iArr = new int[ga.a.values().length];
            f25401a = iArr;
            try {
                iArr[ga.a.IN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25401a[ga.a.RICH_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    a(ga.b bVar) {
        EnumC0162a enumC0162a;
        String simpleName = a.class.getSimpleName();
        this.f25392a = simpleName;
        this.f25395d = bVar;
        q9.b bVarB = bVar.b();
        this.f25396e = this.f25395d.e();
        if (bVarB == null) {
            k9.h.l(simpleName, "resource is empty");
            return;
        }
        this.f25397f = bVarB.v();
        this.f25396e = this.f25395d.e();
        int i10 = b.f25401a[this.f25395d.c().ordinal()];
        if (i10 == 1) {
            this.f25393b = bVarB.l();
            enumC0162a = EnumC0162a.InAppSource;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f25393b = bVarB.l();
            enumC0162a = EnumC0162a.PushMessageSource;
        }
        this.f25394c = enumC0162a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25393b.equals(aVar.f25393b) && this.f25394c == aVar.f25394c;
    }

    public int hashCode() {
        return (this.f25393b.hashCode() * 31) + this.f25394c.hashCode();
    }

    public String toString() {
        return "RichMedia{content='" + this.f25393b + "', resourceType=" + this.f25394c + '}';
    }
}
